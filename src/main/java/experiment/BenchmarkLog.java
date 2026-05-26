package experiment;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;

import learning.symbolicmealy.Oracle;
import learning.symbolicmealy.SymbolicMealyAutomatonOracle;
import org.sat4j.specs.TimeoutException;
import symbolicmealy.SymbolicMealyAutomaton;
import theory.BooleanAlgebra;

public final class BenchmarkLog {
  private BenchmarkLog() {
  }

  public static boolean learnerDebugEnabled() {
    return "true".equalsIgnoreCase(System.getProperty("sma.learner.debug", "false"));
  }

  public static boolean captureTableStatsEnabled() {
    return !"false".equalsIgnoreCase(System.getProperty("sma.table.stats", "true"));
  }

  public static <P, S, T> SymbolicMealyAutomatonOracle<P, S, T> wrap(
      SymbolicMealyAutomatonOracle<P, S, T> oracle) {
    return new TracedSymbolicMealyAutomatonOracle<>(oracle);
  }

  public static <P, S, T> Oracle<P, S, T> wrap(Oracle<P, S, T> oracle) {
    return new TracedOracle<>(oracle);
  }

  public static int getMaxCexLenFromOracle(Oracle<?, ?, ?> oracle) {
    if (oracle instanceof TracedCounterexamples) {
      return ((TracedCounterexamples) oracle).getMaxCexLen();
    }
    return -1;
  }

  public static void printSummary(Oracle<?, ?, ?> oracle, LearnerDebugPrintStream learnerOut) {
    System.out.println("# equiv: " + oracle.getNumEquivalence());
    System.out.println("# output: " + oracle.getNumOutput());
    int mSize = getMaxCexLenFromOracle(oracle);
    System.out.println("|m|: " + (mSize >= 0 ? mSize : "unknown"));
    ObservationTableStats stats = learnerOut == null ? null : learnerOut.getLatestStats();
    if (stats != null && stats.available()) {
      System.out.println("|R|: " + stats.rSize);
      System.out.println("|E|: " + stats.eSize);
      System.out.println("|SigmaE|: " + stats.sigmaESize);
    } else {
      System.out.println("|R|: unknown");
      System.out.println("|E|: unknown");
      System.out.println("|SigmaE|: unknown");
    }
  }

  private interface TracedCounterexamples {
    int getMaxCexLen();
  }

  private static final class TracedSymbolicMealyAutomatonOracle<P, S, T>
      extends SymbolicMealyAutomatonOracle<P, S, T> implements TracedCounterexamples {
    private final SymbolicMealyAutomatonOracle<P, S, T> delegate;
    private int maxCexLen = -1;

    TracedSymbolicMealyAutomatonOracle(SymbolicMealyAutomatonOracle<P, S, T> delegate) {
      super(toLearn(delegate), booleanAlgebra(delegate));
      this.delegate = delegate;
    }

    @Override
    public List<S> checkEquivalenceImpl(SymbolicMealyAutomaton<P, S, T> hypothesis)
        throws TimeoutException {
      return trace(delegate.checkEquivalence(hypothesis));
    }

    @Override
    public List<T> checkOutputImpl(List<S> input) throws TimeoutException {
      return delegate.checkOutput(input);
    }

    @Override
    public int getMaxCexLen() {
      return maxCexLen;
    }

    private List<S> trace(List<S> counterexample) {
      if (counterexample != null) {
        int len = counterexample.size();
        if (len > maxCexLen || maxCexLen < 0) {
          maxCexLen = len;
        }
      }
      return counterexample;
    }
  }

  private static final class TracedOracle<P, S, T> extends Oracle<P, S, T>
      implements TracedCounterexamples {
    private final Oracle<P, S, T> delegate;
    private int maxCexLen = -1;

    TracedOracle(Oracle<P, S, T> delegate) {
      this.delegate = delegate;
    }

    @Override
    protected List<S> checkEquivalenceImpl(SymbolicMealyAutomaton<P, S, T> hypothesis)
        throws TimeoutException {
      List<S> counterexample = delegate.checkEquivalence(hypothesis);
      if (counterexample != null) {
        int len = counterexample.size();
        if (len > maxCexLen || maxCexLen < 0) {
          maxCexLen = len;
        }
      }
      return counterexample;
    }

    @Override
    protected List<T> checkOutputImpl(List<S> input) throws TimeoutException {
      return delegate.checkOutput(input);
    }

    @Override
    public int getMaxCexLen() {
      return maxCexLen;
    }
  }

  private static <P, S, T> SymbolicMealyAutomaton<P, S, T> toLearn(
      SymbolicMealyAutomatonOracle<P, S, T> oracle) {
    return readField(oracle, "toLearn", SymbolicMealyAutomaton.class);
  }

  private static <P, S> BooleanAlgebra<P, S> booleanAlgebra(
      SymbolicMealyAutomatonOracle<P, S, ?> oracle) {
    return readField(oracle, "ba", BooleanAlgebra.class);
  }

  private static <T> T readField(Object target, String fieldName, Class<?> fieldType) {
    try {
      Field field = target.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      Object value = field.get(target);
      if (!fieldType.isInstance(value)) {
        throw new IllegalStateException("Unexpected field type for " + fieldName);
      }
      @SuppressWarnings("unchecked")
      T typedValue = (T) value;
      return typedValue;
    } catch (ReflectiveOperationException | SecurityException e) {
      throw new IllegalStateException("Unable to inspect oracle field " + fieldName, e);
    }
  }

  private static final class ObservationTableStats {
    private int sSize = -1;
    private int rSize = -1;
    private int sigmaESize = -1;
    private int eSize = -1;

    void update(int sSize, int rSize, int sigmaESize, int eSize) {
      this.sSize = sSize;
      this.rSize = rSize;
      this.sigmaESize = sigmaESize;
      this.eSize = eSize;
    }

    boolean available() {
      return sSize >= 0 && rSize >= 0 && sigmaESize >= 0 && eSize >= 0;
    }
  }

  public static final class LearnerDebugPrintStream extends PrintStream {
    private static final String OBS_TABLE_SECTION = "Obs Table";
    private static final String SECTION_MARKER = "========";

    private final PrintStream delegate;
    private final boolean forwardLearnerDebug;
    private final ObservationTableStats latestStats = new ObservationTableStats();
    private String learnerSection;

    public LearnerDebugPrintStream(PrintStream delegate, boolean forwardLearnerDebug) {
      super(delegate, true);
      this.delegate = delegate;
      this.forwardLearnerDebug = forwardLearnerDebug;
    }

    ObservationTableStats getLatestStats() {
      return latestStats;
    }

    @Override
    public synchronized void println(String value) {
      String section = learnerSection(value);
      if (section != null) {
        learnerSection = section;
        if (forwardLearnerDebug) {
          delegate.println(value);
        }
        return;
      }
      delegate.println(value);
    }

    @Override
    public synchronized void println(Object value) {
      if (OBS_TABLE_SECTION.equals(learnerSection)) {
        captureObservationTableStats(value);
      }
      if (learnerSection == null || forwardLearnerDebug) {
        delegate.println(value);
      }
      learnerSection = null;
    }

    private String learnerSection(String value) {
      if (value == null
          || !value.startsWith(SECTION_MARKER)
          || !value.endsWith(SECTION_MARKER)) {
        return null;
      }
      return value.substring(SECTION_MARKER.length(), value.length() - SECTION_MARKER.length());
    }

    private void captureObservationTableStats(Object value) {
      if (value == null
          || !"learning.symbolicmealy.SymbolicMealyAutomatonLearner$ObsTable"
              .equals(value.getClass().getName())) {
        return;
      }
      try {
        latestStats.update(
            listFieldSize(value, "S"),
            listFieldSize(value, "R"),
            listFieldSize(value, "SigmaE"),
            listFieldSize(value, "E"));
      } catch (ReflectiveOperationException | SecurityException e) {
        // Leave stats unavailable; the summary will report unknown sizes.
      }
    }

    private int listFieldSize(Object target, String fieldName) throws ReflectiveOperationException {
      Field field = target.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      Object value = field.get(target);
      return value instanceof List ? ((List<?>) value).size() : -1;
    }
  }
}
