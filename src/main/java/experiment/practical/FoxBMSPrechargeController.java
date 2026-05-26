package experiment.practical;

import java.io.PrintStream;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.sat4j.specs.TimeoutException;

import automata.sfa.SFAMove;
import experiment.BenchmarkLog;
import learning.symbolicmealy.Oracle;
import learning.symbolicmealy.SymbolicMealyAutomatonLearner;
import learning.symbolicmealy.SymbolicMealyAutomatonOracle;
import symbolicmealy.SMAInputMove;
import symbolicmealy.SymbolicMealyAutomaton;
import theory.BooleanAlgebra;
import theory.ProductAlgebra;
import theory.cartesian.CartesianProduct;
import theory.intervals.BoundedIntegerSolver;
import theory.intervals.IntPred;
import utilities.Pair;

/**
 * A hand-crafted symbolic Mealy abstraction of the foxBMS 2 precharge/charge
 * entry logic.
 *
 * This is not a line-by-line model of foxBMS 2. It is a compact white-box
 * abstraction intended as a LearningSMA practical benchmark.
 *
 * Compared with the larger version of this benchmark, this version uses a
 * compact 3-dimensional symbolic input domain:
 *
 *   (cmd, currentAbs_mA, voltageDiff_mV)
 *
 * where:
 *
 *   cmd = 0: no request
 *   cmd = 1: initialization request
 *   cmd = 2: standby request
 *   cmd = 3: normal/discharge request
 *   cmd = 4: charge request
 *   cmd = 5: fatal/error event
 *
 * The two numeric dimensions are interpreted according to the current mode:
 *
 *   PRECHARGE:
 *     currentAbs_mA  = absolute precharge current
 *     voltageDiff_mV = absolute DC-link/string voltage difference
 *
 *   NORMAL:
 *     currentAbs_mA  = average string current
 *     voltageDiff_mV = next-string voltage difference
 *
 *   OPENING:
 *     currentAbs_mA  = absolute string current through the contactor
 *
 * This keeps the relevant foxBMS-style numeric thresholds while avoiding an
 * unnecessarily large product alphabet:
 *
 *   - precharge current threshold:      50 mA
 *   - precharge voltage threshold:    1000 mV
 *   - next-string voltage threshold:  3000 mV
 *   - average string current limit:  20000 mA
 *   - main contactor break current:   3500 mA
 */
public class FoxBMSPrechargeController {
  private static final long START_NANOS = System.nanoTime();

  private static final int CMD_NONE = 0;
  private static final int CMD_INIT = 1;
  private static final int CMD_STANDBY = 2;
  private static final int CMD_NORMAL = 3;
  private static final int CMD_CHARGE = 4;
  private static final int CMD_ERROR = 5;

  private static final int PRECHARGE_CURRENT_THRESHOLD_MA = 50;
  private static final int PRECHARGE_VOLTAGE_THRESHOLD_MV = 1000;
  private static final int NEXT_STRING_VOLTAGE_LIMIT_MV = 3000;
  private static final int AVERAGE_STRING_CURRENT_LIMIT_MA = 20000;
  private static final int MAIN_CONTACTOR_BREAK_CURRENT_MA = 3500;

  private static final int U = 1;      // Uninitialized
  private static final int I = 2;      // Initializing
  private static final int D = 3;      // Idle
  private static final int S = 4;      // Standby

  private static final int PM_N = 5;   // Precharge: close minus, target NORMAL
  private static final int PP_N = 6;   // Precharge: close precharge, target NORMAL
  private static final int PL_N = 7;   // Precharge: monitor/close plus, target NORMAL

  private static final int PM_C = 8;   // Precharge: close minus, target CHARGE
  private static final int PP_C = 9;   // Precharge: close precharge, target CHARGE
  private static final int PL_C = 10;  // Precharge: monitor/close plus, target CHARGE

  private static final int N = 11;     // Normal/discharge mode
  private static final int C = 12;     // Charge mode
  private static final int OS = 13;    // Opening contactors toward Standby
  private static final int OE = 14;    // Opening contactors toward Error
  private static final int E = 15;     // Error

  private static final BooleanAlgebra<IntPred, Integer> cmdBA =
      new BoundedIntegerSolver(0, 5);
  private static final BooleanAlgebra<IntPred, Integer> currentBA =
      new BoundedIntegerSolver(0, null);
  private static final BooleanAlgebra<IntPred, Integer> voltageBA =
      new BoundedIntegerSolver(0, null);

  private static final ProductAlgebra<IntPred, Integer, IntPred, Integer> currentVoltageBA =
      new ProductAlgebra<IntPred, Integer, IntPred, Integer>(currentBA, voltageBA);

  private static final ProductAlgebra<
      IntPred,
      Integer,
      CartesianProduct<IntPred, IntPred>,
      Pair<Integer, Integer>> inputBA =
          new ProductAlgebra<
              IntPred,
              Integer,
              CartesianProduct<IntPred, IntPred>,
              Pair<Integer, Integer>>(cmdBA, currentVoltageBA);

  public static void main(String[] args) {
    DiagnosticSampler sampler = null;
    boolean smokeMode = args.length > 0 && "--smoke".equals(args[0]);
    try {
      if (smokeMode) {
        smokeTest();
        return;
      }

      diag("PHASE", "run-start java_version=" + System.getProperty("java.version")
          + " diag_interval_ms=" + diagnosticIntervalMs()
          + " output_period=" + diagnosticOutputPeriod()
          + " learner_debug=" + BenchmarkLog.learnerDebugEnabled()
          + " table_stats=" + BenchmarkLog.captureTableStatsEnabled()
          + " max_heap_mib=" + mib(Runtime.getRuntime().maxMemory()));

      if (diagnosticsEnabled()) {
        sampler = new DiagnosticSampler(diagnosticIntervalMs());
        sampler.start();
      }

      diag("PHASE", "target-construct-start");
      SymbolicMealyAutomaton<
          CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
          Pair<Integer, Pair<Integer, Integer>>,
          String> foxBMS = getFoxBMSPrechargeControllerAutomaton();
      diag("PHASE", "target-construct-done states=" + foxBMS.stateCount()
          + " transitions=" + foxBMS.transitionCount());

      diag("PHASE", "target-dot-start file=foxBMSPrechargeController.dot");
      boolean targetDotCreated = foxBMS.createDotFile("foxBMSPrechargeController", "./");
      diag("PHASE", "target-dot-done success=" + targetDotCreated);

      diag("PHASE", "oracle-create-start");
      SymbolicMealyAutomatonOracle<
          CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
          Pair<Integer, Pair<Integer, Integer>>,
          String> baseOracle =
              new SymbolicMealyAutomatonOracle<
                  CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
                  Pair<Integer, Pair<Integer, Integer>>,
                  String>(foxBMS, inputBA);
      Oracle<
          CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
          Pair<Integer, Pair<Integer, Integer>>,
          String> oracle =
              diagnosticsEnabled()
                  ? new DiagnosticOracle<
                      CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
                      Pair<Integer, Pair<Integer, Integer>>,
                      String>(baseOracle, diagnosticOutputPeriod())
                  : baseOracle;
      oracle = BenchmarkLog.wrap(oracle);
      diag("PHASE", "oracle-create-done diagnostics=" + diagnosticsEnabled());

      boolean learnerDebug = BenchmarkLog.learnerDebugEnabled();
      boolean captureTableStats = BenchmarkLog.captureTableStatsEnabled();
      boolean effectiveLearnerDebug = learnerDebug || captureTableStats;
      diag("PHASE", "learner-create-start debug_output=" + learnerDebug
          + " capture_table_stats=" + captureTableStats
          + " effective_debug_output=" + effectiveLearnerDebug);
      SymbolicMealyAutomatonLearner<
          CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
          Pair<Integer, Pair<Integer, Integer>>,
          String> learner =
              new SymbolicMealyAutomatonLearner<
                  CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
                  Pair<Integer, Pair<Integer, Integer>>,
                  String>(effectiveLearnerDebug);
      diag("PHASE", "learner-create-done");

      diag("PHASE", "learner-start");
      long learnStart = System.nanoTime();
      PrintStream originalOut = System.out;
      BenchmarkLog.LearnerDebugPrintStream learnerOut =
          captureTableStats ? new BenchmarkLog.LearnerDebugPrintStream(originalOut, learnerDebug) : null;
      SymbolicMealyAutomaton<
          CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
          Pair<Integer, Pair<Integer, Integer>>,
          String> learned;
      try {
        if (learnerOut != null) {
          System.setOut(learnerOut);
        }
        learned = learner.learn(oracle, inputBA);
      } finally {
        if (learnerOut != null) {
          learnerOut.flush();
          System.setOut(originalOut);
        }
      }
      diag("PHASE", "learner-done duration_ms=" + elapsedMillisSince(learnStart)
          + " states=" + learned.stateCount()
          + " transitions=" + learned.transitionCount());
      diag("PHASE", "oracle-summary equiv_queries=" + oracle.getNumEquivalence()
          + " output_queries=" + oracle.getNumOutput());
      BenchmarkLog.printSummary(oracle, learnerOut);

      diag("PHASE", "learned-dot-start file=learnedFoxBMSPrechargeController.dot");
      boolean learnedDotCreated = learned.createDotFile("learnedFoxBMSPrechargeController", "./");
      diag("PHASE", "learned-dot-done success=" + learnedDotCreated);
    } catch (TimeoutException e) {
      if (!smokeMode) {
        diag("ERROR", "timeout_exception message=" + safeMessage(e));
      }
      e.printStackTrace();
    } finally {
      if (sampler != null) {
        sampler.stopAndJoin();
      }
      if (!smokeMode) {
        diag("PHASE", "run-finished");
      }
    }
  }

  private static boolean diagnosticsEnabled() {
    return "true".equalsIgnoreCase(System.getProperty("sma.diag", "false"));
  }

  private static long diagnosticIntervalMs() {
    long intervalMs = getLongProperty("sma.diag.interval.ms", 5000L);
    return intervalMs > 0L ? intervalMs : 5000L;
  }

  private static int diagnosticOutputPeriod() {
    long period = getLongProperty("sma.diag.output.period", 5000L);
    return period > 0L && period <= Integer.MAX_VALUE ? (int) period : 5000;
  }

  private static long getLongProperty(String name, long defaultValue) {
    String value = System.getProperty(name);
    if (value == null || value.trim().isEmpty()) {
      return defaultValue;
    }
    try {
      return Long.parseLong(value.trim());
    } catch (NumberFormatException e) {
      return defaultValue;
    }
  }

  private static synchronized void diag(String category, String message) {
    if (!diagnosticsEnabled()) {
      return;
    }
    System.out.println("[FOX_DIAG][" + category + "] elapsed_ms=" + elapsedMillis()
        + " " + message);
  }

  private static long elapsedMillis() {
    return elapsedMillisSince(START_NANOS);
  }

  private static long elapsedMillisSince(long startNanos) {
    return (System.nanoTime() - startNanos) / 1000000L;
  }

  private static long mib(long bytes) {
    if (bytes < 0L) {
      return -1L;
    }
    return bytes / (1024L * 1024L);
  }

  private static long currentHeapUsedMib() {
    MemoryUsage heap = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
    return mib(heap.getUsed());
  }

  private static String safeMessage(Throwable throwable) {
    String message = throwable.getMessage();
    return message == null ? throwable.getClass().getName() : sanitize(message);
  }

  private static String sanitize(String value) {
    return value.replace('\n', ' ').replace('\r', ' ');
  }

  private static String decimal(double value) {
    if (Double.isNaN(value) || Double.isInfinite(value)) {
      return "nan";
    }
    return String.format(Locale.ROOT, "%.3f", value);
  }

  private static final class DiagnosticOracle<P, S, T> extends Oracle<P, S, T> {
    private final Oracle<P, S, T> delegate;
    private final int outputPeriod;
    private long equivalenceQueries;
    private long equivalenceTotalNanos;
    private long equivalenceMaxNanos;
    private long outputQueries;
    private long outputTotalNanos;
    private long outputMaxNanos;
    private int outputMaxInputLength;
    private int outputMaxResultLength;
    DiagnosticOracle(Oracle<P, S, T> delegate, int outputPeriod) {
      this.delegate = delegate;
      this.outputPeriod = outputPeriod;
    }

    @Override
    protected List<S> checkEquivalenceImpl(SymbolicMealyAutomaton<P, S, T> hypothesis)
        throws TimeoutException {
      long query = ++equivalenceQueries;
      long start = System.nanoTime();
      diag("EQ", "start query=" + query
          + " hypothesis_states=" + hypothesis.stateCount()
          + " hypothesis_transitions=" + hypothesis.transitionCount()
          + " heap_used_mib=" + currentHeapUsedMib());
      try {
        List<S> counterexample = delegate.checkEquivalence(hypothesis);
        long duration = System.nanoTime() - start;
        equivalenceTotalNanos += duration;
        if (duration > equivalenceMaxNanos) {
          equivalenceMaxNanos = duration;
        }
        diag("EQ", "end query=" + query
            + " duration_ms=" + (duration / 1000000L)
            + " total_ms=" + (equivalenceTotalNanos / 1000000L)
            + " max_ms=" + (equivalenceMaxNanos / 1000000L)
            + " result=" + (counterexample == null ? "equivalent" : "counterexample")
            + " cex_len=" + (counterexample == null ? 0 : counterexample.size())
            + " heap_used_mib=" + currentHeapUsedMib());
        return counterexample;
      } catch (TimeoutException e) {
        diag("EQ", "timeout query=" + query
            + " duration_ms=" + elapsedMillisSince(start)
            + " message=" + safeMessage(e));
        throw e;
      } catch (RuntimeException e) {
        diag("EQ", "runtime_exception query=" + query
            + " duration_ms=" + elapsedMillisSince(start)
            + " type=" + e.getClass().getName()
            + " message=" + safeMessage(e));
        throw e;
      }
    }

    @Override
    protected List<T> checkOutputImpl(List<S> input) throws TimeoutException {
      long query = ++outputQueries;
      long start = System.nanoTime();
      int inputLength = input == null ? 0 : input.size();
      if (inputLength > outputMaxInputLength) {
        outputMaxInputLength = inputLength;
      }
      try {
        List<T> result = delegate.checkOutput(input);
        long duration = System.nanoTime() - start;
        outputTotalNanos += duration;
        if (duration > outputMaxNanos) {
          outputMaxNanos = duration;
        }
        int resultLength = result == null ? 0 : result.size();
        if (resultLength > outputMaxResultLength) {
          outputMaxResultLength = resultLength;
        }
        if (query % outputPeriod == 0L) {
          logOutputSummary(query, inputLength, resultLength);
        }
        return result;
      } catch (TimeoutException e) {
        diag("OQ", "timeout query=" + query
            + " input_len=" + inputLength
            + " duration_ms=" + elapsedMillisSince(start)
            + " message=" + safeMessage(e));
        throw e;
      } catch (RuntimeException e) {
        diag("OQ", "runtime_exception query=" + query
            + " input_len=" + inputLength
            + " duration_ms=" + elapsedMillisSince(start)
            + " type=" + e.getClass().getName()
            + " message=" + safeMessage(e));
        throw e;
      }
    }

    private void logOutputSummary(long query, int lastInputLength, int lastResultLength) {
      long averageMicros = query == 0L ? 0L : outputTotalNanos / query / 1000L;
      diag("OQ", "summary queries=" + query
          + " total_ms=" + (outputTotalNanos / 1000000L)
          + " avg_us=" + averageMicros
          + " max_ms=" + (outputMaxNanos / 1000000L)
          + " max_input_len=" + outputMaxInputLength
          + " max_result_len=" + outputMaxResultLength
          + " last_input_len=" + lastInputLength
          + " last_result_len=" + lastResultLength
          + " heap_used_mib=" + currentHeapUsedMib());
    }
  }

  private static final class DiagnosticSampler implements Runnable {
    private final long intervalMs;
    private final MemoryMXBean memoryBean;
    private final ThreadMXBean threadBean;
    private final java.lang.management.OperatingSystemMXBean osBean;
    private final Thread thread;
    private volatile boolean running;
    private long lastCpuNanos = -1L;
    private long lastWallNanos = -1L;

    DiagnosticSampler(long intervalMs) {
      this.intervalMs = intervalMs;
      this.memoryBean = ManagementFactory.getMemoryMXBean();
      this.threadBean = ManagementFactory.getThreadMXBean();
      this.osBean = ManagementFactory.getOperatingSystemMXBean();
      this.thread = new Thread(this, "foxbms-diagnostic-sampler");
      this.thread.setDaemon(true);
    }

    void start() {
      running = true;
      thread.start();
    }

    void stopAndJoin() {
      running = false;
      thread.interrupt();
      try {
        thread.join(1000L);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }

    @Override
    public void run() {
      while (running) {
        sample();
        try {
          Thread.sleep(intervalMs);
        } catch (InterruptedException e) {
          // Re-check running after interruption.
        }
      }
    }

    private void sample() {
      try {
        logMemory();
        logGc();
        logThreads();
      } catch (RuntimeException e) {
        diag("ERROR", "diagnostic_sampler_failed type=" + e.getClass().getName()
            + " message=" + safeMessage(e));
      }
    }

    private void logMemory() {
      MemoryUsage heap = memoryBean.getHeapMemoryUsage();
      MemoryUsage nonHeap = memoryBean.getNonHeapMemoryUsage();
      Runtime runtime = Runtime.getRuntime();
      diag("MEM", "heap_used_mib=" + mib(heap.getUsed())
          + " heap_committed_mib=" + mib(heap.getCommitted())
          + " heap_max_mib=" + mib(heap.getMax())
          + " non_heap_used_mib=" + mib(nonHeap.getUsed())
          + " non_heap_committed_mib=" + mib(nonHeap.getCommitted())
          + " runtime_total_mib=" + mib(runtime.totalMemory())
          + " runtime_free_mib=" + mib(runtime.freeMemory())
          + " runtime_max_mib=" + mib(runtime.maxMemory()));
    }

    private void logGc() {
      StringBuilder builder = new StringBuilder();
      List<GarbageCollectorMXBean> collectors = ManagementFactory.getGarbageCollectorMXBeans();
      for (int i = 0; i < collectors.size(); i++) {
        GarbageCollectorMXBean collector = collectors.get(i);
        if (i > 0) {
          builder.append(';');
        }
        builder.append(sanitize(collector.getName()).replace(' ', '_'))
            .append(":count=").append(collector.getCollectionCount())
            .append(",time_ms=").append(collector.getCollectionTime());
      }
      diag("GC", "collectors=" + builder.toString());
    }

    private void logThreads() {
      String cpuFields = "";
      long now = System.nanoTime();
      if (osBean instanceof com.sun.management.OperatingSystemMXBean) {
        com.sun.management.OperatingSystemMXBean sunOs =
            (com.sun.management.OperatingSystemMXBean) osBean;
        long cpuNanos = sunOs.getProcessCpuTime();
        double cpuCores = Double.NaN;
        if (lastCpuNanos >= 0L && lastWallNanos >= 0L && now > lastWallNanos) {
          cpuCores = ((double) (cpuNanos - lastCpuNanos)) / ((double) (now - lastWallNanos));
        }
        lastCpuNanos = cpuNanos;
        lastWallNanos = now;
        cpuFields = " process_cpu_time_ms=" + (cpuNanos / 1000000L)
            + " process_cpu_cores=" + decimal(cpuCores)
            + " process_cpu_load=" + decimal(sunOs.getProcessCpuLoad());
      }

      diag("THREAD", "live=" + threadBean.getThreadCount()
          + " daemon=" + threadBean.getDaemonThreadCount()
          + " peak=" + threadBean.getPeakThreadCount()
          + " available_processors=" + Runtime.getRuntime().availableProcessors()
          + cpuFields);
      logRelevantStacks();
    }

    private void logRelevantStacks() {
      ThreadInfo[] infos = threadBean.dumpAllThreads(false, false);
      int logged = 0;
      for (ThreadInfo info : infos) {
        if (info == null || "foxbms-diagnostic-sampler".equals(info.getThreadName())) {
          continue;
        }
        StackTraceElement[] stack = info.getStackTrace();
        if (!isRelevantStack(stack)) {
          continue;
        }
        diag("THREAD", "stack thread_id=" + info.getThreadId()
            + " thread_name=" + sanitize(info.getThreadName()).replace(' ', '_')
            + " state=" + info.getThreadState()
            + " frames=" + compactStack(stack, 8));
        logged++;
        if (logged >= 5) {
          break;
        }
      }
    }

    private boolean isRelevantStack(StackTraceElement[] stack) {
      for (StackTraceElement frame : stack) {
        String className = frame.getClassName();
        if (className.startsWith("learning.symbolicmealy")
            || className.startsWith("symbolicmealy")
            || className.startsWith("theory.")
            || className.equals(FoxBMSPrechargeController.class.getName())) {
          return true;
        }
      }
      return false;
    }

    private String compactStack(StackTraceElement[] stack, int maxFrames) {
      StringBuilder builder = new StringBuilder();
      int count = Math.min(stack.length, maxFrames);
      for (int i = 0; i < count; i++) {
        if (i > 0) {
          builder.append("<-");
        }
        StackTraceElement frame = stack[i];
        builder.append(frame.getClassName())
            .append('.')
            .append(frame.getMethodName())
            .append(':')
            .append(frame.getLineNumber());
      }
      if (stack.length > maxFrames) {
        builder.append("<-...");
      }
      return builder.toString();
    }
  }

  private static void smokeTest() throws TimeoutException {
    SymbolicMealyAutomaton<
        CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
        Pair<Integer, Pair<Integer, Integer>>,
        String> foxBMS = getFoxBMSPrechargeControllerAutomaton();
    foxBMS.createDotFile("foxBMSPrechargeController", "./");

    List<Pair<Integer, Pair<Integer, Integer>>> inputs = Arrays.asList(
        input(CMD_INIT, 0, 0),
        input(CMD_NONE, 0, 0),
        input(CMD_STANDBY, 0, 0),
        input(CMD_NONE, 0, 0),
        input(CMD_NORMAL, 0, 0),
        input(CMD_NONE, 0, 0),
        input(CMD_NONE, 0, 0),
        input(CMD_NONE, 0, 0),
        input(CMD_NONE, 0, 0));

    List<String> expected = Arrays.asList(
        "START_INIT",
        "FINISH_INIT",
        "OPEN_CONTACTORS",
        "OPEN_CONTACTORS",
        "START_PRECHARGE_NORMAL",
        "CLOSE_MINUS_CONTACTOR",
        "CLOSE_PRECHARGE_CONTACTOR",
        "CLOSE_PLUS_CONTACTOR",
        "CLOSE_NEXT_STRING");

    List<String> actual = foxBMS.outputSeq(inputs, inputBA);
    if (!expected.equals(actual)) {
      throw new IllegalStateException("Unexpected smoke-test outputs: " + actual);
    }

    System.out.println("FoxBMSPrechargeController smoke test passed: "
        + foxBMS.stateCount() + " states, "
        + foxBMS.transitionCount() + " transitions");
  }

  private static SymbolicMealyAutomaton<
      CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
      Pair<Integer, Pair<Integer, Integer>>,
      String> getFoxBMSPrechargeControllerAutomaton() throws TimeoutException {
    Integer init = U;
    List<SFAMove<
        CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
        Pair<Integer, Pair<Integer, Integer>>>> trans =
            new ArrayList<SFAMove<
                CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
                Pair<Integer, Pair<Integer, Integer>>>>();

    /* U: Uninitialized. */
    add(trans, U, I, cmdIs(CMD_INIT), "START_INIT");
    add(trans, U, U, cmdIsNot(CMD_INIT), "NOOP");

    /* I: Initialization is abstracted as one step. */
    add(trans, I, D, any(), "FINISH_INIT");

    /* D: Idle. */
    add(trans, D, OE, cmdIs(CMD_ERROR), "OPEN_CONTACTORS");
    add(trans, D, OS, cmdIs(CMD_STANDBY), "OPEN_CONTACTORS");
    add(trans, D, D, cmdExcept(CMD_STANDBY, CMD_ERROR), "ENTER_IDLE");

    /* S: Standby. */
    add(trans, S, OE, cmdIs(CMD_ERROR), "OPEN_CONTACTORS");
    add(trans, S, PM_N, cmdIs(CMD_NORMAL), "START_PRECHARGE_NORMAL");
    add(trans, S, PM_C, cmdIs(CMD_CHARGE), "START_PRECHARGE_CHARGE");
    add(trans, S, S, cmdExcept(CMD_NORMAL, CMD_CHARGE, CMD_ERROR), "ENTER_STANDBY");

    /* Precharge path toward NORMAL. */
    addPrechargeToMode(trans, PM_N, PP_N, PL_N, N, "CLOSE_PLUS_CONTACTOR");

    /* Precharge path toward CHARGE. */
    addPrechargeToMode(trans, PM_C, PP_C, PL_C, C, "CLOSE_PLUS_CONTACTOR");

    /* N: Normal/discharge mode. */
    add(trans, N, OE, cmdIs(CMD_ERROR), "OPEN_CONTACTORS");
    add(trans, N, OS, cmdIs(CMD_STANDBY), "OPEN_CONTACTORS");
    add(trans, N, N, normalCanCloseNextString(), "CLOSE_NEXT_STRING");
    add(trans, N, N, normalCannotCloseNextString(), "ENABLE_NORMAL");

    /* C: Charge mode. */
    add(trans, C, OE, cmdIs(CMD_ERROR), "OPEN_CONTACTORS");
    add(trans, C, OS, cmdIs(CMD_STANDBY), "OPEN_CONTACTORS");
    add(trans, C, C, cmdExcept(CMD_STANDBY, CMD_ERROR), "ENABLE_CHARGE");

    /* OS: Opening contactors toward Standby. */
    add(trans, OS, OE, cmdIs(CMD_ERROR), "OPEN_CONTACTORS");
    add(trans, OS, S, openingSafeExceptError(), "OPEN_CONTACTORS");
    add(trans, OS, OS, openingUnsafeExceptError(), "WAIT_CURRENT_DROP");

    /* OE: Opening contactors toward Error. */
    add(trans, OE, E, openingSafe(), "OPEN_CONTACTORS");
    add(trans, OE, OE, openingUnsafe(), "WAIT_CURRENT_DROP");

    /* E: Error. */
    add(trans, E, OS, cmdIs(CMD_STANDBY), "OPEN_CONTACTORS");
    add(trans, E, E, cmdIsNot(CMD_STANDBY), "SIGNAL_ERROR");

    return SymbolicMealyAutomaton.MkSMA(trans, init, inputBA);
  }

  private static void addPrechargeToMode(
      List<SFAMove<
          CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
          Pair<Integer, Pair<Integer, Integer>>>> trans,
      int closeMinusState,
      int closePrechargeState,
      int monitorPrechargeState,
      int targetModeState,
      String modeOutput) throws TimeoutException {
    /* PM_*: close the minus/main-negative contactor. */
    add(trans, closeMinusState, OE, cmdIs(CMD_ERROR), "OPEN_CONTACTORS");
    add(trans, closeMinusState, OS, cmdIs(CMD_STANDBY), "OPEN_CONTACTORS");
    add(trans, closeMinusState, closePrechargeState, cmdExcept(CMD_STANDBY, CMD_ERROR),
        "CLOSE_MINUS_CONTACTOR");

    /* PP_*: close the precharge path. */
    add(trans, closePrechargeState, OE, cmdIs(CMD_ERROR), "OPEN_CONTACTORS");
    add(trans, closePrechargeState, OS, cmdIs(CMD_STANDBY), "OPEN_CONTACTORS");
    add(trans, closePrechargeState, monitorPrechargeState, cmdExcept(CMD_STANDBY, CMD_ERROR),
        "CLOSE_PRECHARGE_CONTACTOR");

    /*
     * PL_*: monitor precharge numerically.  If current and voltage are below the
     * foxBMS-style thresholds, close the plus/main-positive contactor and enter
     * the target mode.  Otherwise, keep waiting in the precharge state.
     */
    add(trans, monitorPrechargeState, OE, cmdIs(CMD_ERROR), "OPEN_CONTACTORS");
    add(trans, monitorPrechargeState, OS, cmdIs(CMD_STANDBY), "OPEN_CONTACTORS");
    add(trans, monitorPrechargeState, targetModeState, prechargeFinished(), modeOutput);
    add(trans, monitorPrechargeState, monitorPrechargeState, prechargeNotFinished(),
        "WAIT_PRECHARGE");
  }

  private static void add(
      List<SFAMove<
          CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
          Pair<Integer, Pair<Integer, Integer>>>> trans,
      int from,
      int to,
      CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> guard,
      String output) {
    trans.add(new SMAInputMove<
        CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>,
        Pair<Integer, Pair<Integer, Integer>>,
        String>(from, to, guard, output));
  }

  /*
   * Guard constructors.
   */

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> any()
      throws TimeoutException {
    return guard(allCmds(), anyCurrent(), anyVoltage());
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> cmdIs(int cmd)
      throws TimeoutException {
    return guard(cmds(cmd), anyCurrent(), anyVoltage());
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> cmdIsNot(int cmd)
      throws TimeoutException {
    return guard(cmdsExcept(cmd), anyCurrent(), anyVoltage());
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> cmdExcept(int... excluded)
      throws TimeoutException {
    return guard(cmdsExcept(excluded), anyCurrent(), anyVoltage());
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> prechargeFinished()
      throws TimeoutException {
    return guard(
        cmdsExcept(CMD_STANDBY, CMD_ERROR),
        range(0, PRECHARGE_CURRENT_THRESHOLD_MA - 1),
        range(0, PRECHARGE_VOLTAGE_THRESHOLD_MV - 1));
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> prechargeNotFinished()
      throws TimeoutException {
    List<Pair<IntPred, CartesianProduct<IntPred, IntPred>>> boxes =
        new ArrayList<Pair<IntPred, CartesianProduct<IntPred, IntPred>>>();

    /*
     * current >= 50
     */
    addBoxes(
        boxes,
        cmdsExcept(CMD_STANDBY, CMD_ERROR),
        rangeFrom(PRECHARGE_CURRENT_THRESHOLD_MA),
        anyVoltage());

    /*
     * current < 50 and voltage >= 1000
     */
    addBoxes(
        boxes,
        cmdsExcept(CMD_STANDBY, CMD_ERROR),
        range(0, PRECHARGE_CURRENT_THRESHOLD_MA - 1),
        rangeFrom(PRECHARGE_VOLTAGE_THRESHOLD_MV));

    return guard(boxes);
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> normalCanCloseNextString()
      throws TimeoutException {
    return guard(
        cmdsExcept(CMD_STANDBY, CMD_ERROR),
        range(0, AVERAGE_STRING_CURRENT_LIMIT_MA),
        range(0, NEXT_STRING_VOLTAGE_LIMIT_MV));
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> normalCannotCloseNextString()
      throws TimeoutException {
    List<Pair<IntPred, CartesianProduct<IntPred, IntPred>>> boxes =
        new ArrayList<Pair<IntPred, CartesianProduct<IntPred, IntPred>>>();

    /*
     * current > 20000
     */
    addBoxes(
        boxes,
        cmdsExcept(CMD_STANDBY, CMD_ERROR),
        rangeFrom(AVERAGE_STRING_CURRENT_LIMIT_MA + 1),
        anyVoltage());

    /*
     * current <= 20000 and voltage > 3000
     */
    addBoxes(
        boxes,
        cmdsExcept(CMD_STANDBY, CMD_ERROR),
        range(0, AVERAGE_STRING_CURRENT_LIMIT_MA),
        rangeFrom(NEXT_STRING_VOLTAGE_LIMIT_MV + 1));

    return guard(boxes);
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> openingSafe()
      throws TimeoutException {
    return guard(
        allCmds(),
        range(0, MAIN_CONTACTOR_BREAK_CURRENT_MA - 1),
        anyVoltage());
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> openingUnsafe()
      throws TimeoutException {
    return guard(
        allCmds(),
        rangeFrom(MAIN_CONTACTOR_BREAK_CURRENT_MA),
        anyVoltage());
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> openingSafeExceptError()
      throws TimeoutException {
    return guard(
        cmdsExcept(CMD_ERROR),
        range(0, MAIN_CONTACTOR_BREAK_CURRENT_MA - 1),
        anyVoltage());
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> openingUnsafeExceptError()
      throws TimeoutException {
    return guard(
        cmdsExcept(CMD_ERROR),
        rangeFrom(MAIN_CONTACTOR_BREAK_CURRENT_MA),
        anyVoltage());
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> guard(
      int[] cmds,
      IntPred current,
      IntPred voltage) throws TimeoutException {
    List<Pair<IntPred, CartesianProduct<IntPred, IntPred>>> boxes =
        new ArrayList<Pair<IntPred, CartesianProduct<IntPred, IntPred>>>();
    addBoxes(boxes, cmds, current, voltage);
    return guard(boxes);
  }

  private static CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> guard(
      List<Pair<IntPred, CartesianProduct<IntPred, IntPred>>> boxes) throws TimeoutException {
    CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>> result =
        new CartesianProduct<IntPred, CartesianProduct<IntPred, IntPred>>(boxes);
    result.normalize(cmdBA, currentVoltageBA);
    return result;
  }

  private static void addBoxes(
      List<Pair<IntPred, CartesianProduct<IntPred, IntPred>>> boxes,
      int[] cmds,
      IntPred current,
      IntPred voltage) throws TimeoutException {
    for (int cmd : cmds) {
      boxes.add(new Pair<IntPred, CartesianProduct<IntPred, IntPred>>(
          eq(cmd),
          currentVoltage(current, voltage)));
    }
  }

  private static CartesianProduct<IntPred, IntPred> currentVoltage(
      IntPred current,
      IntPred voltage) throws TimeoutException {
    CartesianProduct<IntPred, IntPred> result =
        new CartesianProduct<IntPred, IntPred>(
            Arrays.asList(new Pair<IntPred, IntPred>(current, voltage)));
    result.normalize(currentBA, voltageBA);
    return result;
  }

  private static Pair<Integer, Pair<Integer, Integer>> input(
      int cmd,
      int currentAbs,
      int voltageDiff) {
    return new Pair<Integer, Pair<Integer, Integer>>(
        cmd,
        new Pair<Integer, Integer>(currentAbs, voltageDiff));
  }

  private static int[] allCmds() {
    return new int[] { CMD_NONE, CMD_INIT, CMD_STANDBY, CMD_NORMAL, CMD_CHARGE, CMD_ERROR };
  }

  private static int[] cmds(int... cmds) {
    return cmds;
  }

  private static int[] cmdsExcept(int... excluded) {
    List<Integer> kept = new ArrayList<Integer>();
    for (int cmd : allCmds()) {
      boolean isExcluded = false;
      for (int ex : excluded) {
        if (cmd == ex) {
          isExcluded = true;
          break;
        }
      }
      if (!isExcluded) {
        kept.add(cmd);
      }
    }

    int[] result = new int[kept.size()];
    for (int i = 0; i < kept.size(); i++) {
      result[i] = kept.get(i);
    }
    return result;
  }

  private static IntPred eq(int value) {
    return new IntPred(value);
  }

  private static IntPred range(int lower, int upper) {
    return new IntPred(lower, upper);
  }

  private static IntPred rangeFrom(int lower) {
    return new IntPred(lower, null);
  }

  private static IntPred anyCurrent() {
    return rangeFrom(0);
  }

  private static IntPred anyVoltage() {
    return rangeFrom(0);
  }
}
