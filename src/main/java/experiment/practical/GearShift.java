package experiment.practical;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.sat4j.specs.TimeoutException;

import experiment.BenchmarkLog;
import learning.symbolicmealy.SymbolicMealyAutomatonLearner;
import learning.symbolicmealy.SymbolicMealyAutomatonOracle;
import symbolicmealy.SMAInputMove;
import symbolicmealy.SymbolicMealyAutomaton;


import automata.sfa.SFAMove;
import theory.BooleanAlgebra;
import theory.ProductAlgebra;
import theory.cartesian.CartesianProduct;
import theory.intervals.BoundedDoubleSolver;
import theory.intervals.DoublePred;
import theory.intervals.RealPred;
import utilities.Pair;

public class GearShift {
  private static final long START_NANOS = System.nanoTime();

  private static BooleanAlgebra<RealPred, Double> throttleBA = new BoundedDoubleSolver(0.0, 100.0);
  private static BooleanAlgebra<RealPred, Double> speedBA = new BoundedDoubleSolver(0.0, null);
  private static ProductAlgebra<RealPred, Double, RealPred, Double> prodBA = new ProductAlgebra<>(throttleBA, speedBA);
  private static Double[][] interpUp = {
      { 0.0, 10.0, 30.0, 50.0 },
      { 25.0, 10.0, 30.0, 50.0 },
      { 35.0, 15.0, 30.0, 50.0 },
      { 50.0, 23.0, 41.0, 60.0 },
      { 90.0, 40.0, 70.0, 100.0 },
      { 100.0, 40.0, 70.0, 100.0 }
  };
  private static Double[][] interpDown = {
      { 0.0, 0.0, 5.0, 20.0, 35.0 },
      { 5.0, 0.0, 5.0, 20.0, 35.0 },
      { 40.0, 0.0, 5.0, 25.0, 40.0 },
      { 50.0, 0.0, 5.0, 30.0, 50.0 },
      { 90.0, 0.0, 30.0, 50.0, 80.0 },
      { 100.0, 0.0, 30.0, 50.0, 80.0 }
  };

  // ---- property-gated defaults ----

  private static boolean diagnosticsEnabled() {
    return "true".equalsIgnoreCase(System.getProperty("sma.diag", "false"));
  }

  private static synchronized void diag(String category, String message) {
    if (!diagnosticsEnabled()) return;
    System.out.println("[SMA_DIAG][" + category + "] elapsed_ms=" + elapsedMillis() + " " + message);
  }

  private static long elapsedMillis() {
    return (System.nanoTime() - START_NANOS) / 1000000L;
  }

  private static long elapsedMillisSince(long startNanos) {
    return (System.nanoTime() - startNanos) / 1000000L;
  }

  // ---- main ----

  public static void main(String[] args) {
    boolean smokeMode = args.length > 0 && "--smoke".equals(args[0]);
    try {
      if (smokeMode) {
        smokeTest();
        return;
      }

      boolean learnerDebug = BenchmarkLog.learnerDebugEnabled();
      boolean captureTableStats = BenchmarkLog.captureTableStatsEnabled();
      boolean effectiveLearnerDebug = learnerDebug || captureTableStats;

      diag("PHASE", "target-construct-start");
      SymbolicMealyAutomaton<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String> gearShift = getGearShiftAutomaton();
      diag("PHASE", "target-construct-done states=" + gearShift.stateCount() + " transitions=" + gearShift.transitionCount());

      diag("PHASE", "target-dot-start file=gearShift.dot");
      boolean dotCreated = gearShift.createDotFile("gearShift", "./");
      diag("PHASE", "target-dot-done success=" + dotCreated);

      SymbolicMealyAutomatonOracle<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String> oracle =
          new SymbolicMealyAutomatonOracle<>(gearShift, prodBA);
      oracle = BenchmarkLog.wrap(oracle);

      diag("PHASE", "learner-create-start effective=" + effectiveLearnerDebug);
      SymbolicMealyAutomatonLearner<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String> learner =
          new SymbolicMealyAutomatonLearner<>(effectiveLearnerDebug);
      diag("PHASE", "learner-create-done");

      diag("PHASE", "learner-start");
      long learnStart = System.nanoTime();
      PrintStream origOut = System.out;
      BenchmarkLog.LearnerDebugPrintStream learnerOut =
          captureTableStats ? new BenchmarkLog.LearnerDebugPrintStream(origOut, learnerDebug) : null;
      SymbolicMealyAutomaton<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String> learned;
      try {
        if (learnerOut != null) System.setOut(learnerOut);
        learned = learner.learn(oracle, prodBA);
      } finally {
        if (learnerOut != null) { learnerOut.flush(); System.setOut(origOut); }
      }
      diag("PHASE", "learner-done duration_ms=" + elapsedMillisSince(learnStart)
          + " states=" + learned.stateCount() + " transitions=" + learned.transitionCount());
      BenchmarkLog.printSummary(oracle, learnerOut);

      diag("PHASE", "learned-dot-start file=learnedGearShift.dot");
      boolean learnedDotCreated = learned.createDotFile("learnedGearShift", "./");
      diag("PHASE", "learned-dot-done success=" + learnedDotCreated);
    } catch (TimeoutException e) {
      if (!smokeMode) diag("ERROR", "timeout_exception message=" + safeMessage(e));
      e.printStackTrace();
    } finally {
      if (!smokeMode) diag("PHASE", "run-finished");
    }
  }

  private static String safeMessage(Throwable t) {
    String msg = t.getMessage();
    return msg == null ? t.getClass().getName() : msg.replace('\n', ' ').replace('\r', ' ');
  }

  // ---- smoke test ----

  private static void smokeTest() throws TimeoutException {
    SymbolicMealyAutomaton<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String> gs = getGearShiftAutomaton();
    gs.createDotFile("gearShift", "./");

    List<Pair<Double, Double>> inputs = Arrays.asList(
        input(50.0, 5.0),
        input(50.0, 25.0),
        input(50.0, 25.0),
        input(50.0, 25.0));
    List<String> expected = Arrays.asList("gear1", "gear1", "gear1", "gear2");

    List<String> actual = gs.outputSeq(inputs, prodBA);
    if (!expected.equals(actual)) {
      throw new IllegalStateException("Unexpected smoke-test outputs: " + actual);
    }

    System.out.println("GearShift smoke test passed: " + gs.stateCount() + " states, " + gs.transitionCount() + " transitions");
  }

  private static Pair<Double, Double> input(double throttle, double speed) {
    return new Pair<>(throttle, speed);
  }

  // ---- getGearShiftAutomaton() ----

  private static SymbolicMealyAutomaton<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String> getGearShiftAutomaton() throws TimeoutException {

    Integer init = 100;
    List<SFAMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>>> trans = new ArrayList<SFAMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>>>();
    // makes the transition <Gear1, SteadyState> -> <Gear1, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG1StoG1S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(null, interpUp[0][1] + Math
            .ulp(
                interpUp[0][1]))),
      new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(null, interpUp[1][1] + Math.ulp(
                interpUp[1][1]))),
      new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(null, interpUp[2][1] + Math.ulp(
                interpUp[2][1]))),
      new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(null, interpUp[3][1] + Math.ulp(
                interpUp[3][1]))),
      new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(null, interpUp[4][1] + Math.ulp(
                interpUp[4][1]))),
      new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(null, interpUp[5][1] + Math
                .ulp(interpUp[5][1])))));
    prdG1StoG1S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(100, 100, prdG1StoG1S, "gear1"));
    // makes the transition <Gear1, SteadyState> -> <Gear1, UpShiting1>
    CartesianProduct<RealPred, RealPred> prdG1StoG1U1 = new CartesianProduct<>(
      Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(interpUp[0][1] + Math.ulp(interpUp[0][1]),null)),
          new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpUp[1][1]+ Math.ulp(interpUp[1][1]),null)),
          new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(interpUp[2][1]+ Math.ulp(
                interpUp[2][1]),null)),
          new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(interpUp[3][1]+ Math.ulp(
                interpUp[3][1]),null)),
          new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(interpUp[4][1]+ Math.ulp(
                interpUp[4][1]),null)),
          new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(interpUp[5][1]+ Math
                .ulp(interpUp[5][1]),null))));
    prdG1StoG1U1.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(100, 101,
        prdG1StoG1U1, "gear1"));
    // makes the transition <Gear1, UpShifting1> -> <Gear1, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG1U1toG1S = new CartesianProduct<>(
      Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(null, interpUp[0][1])),
          new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(null, interpUp[1][1])),
          new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(null, interpUp[2][1])),
          new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(null, interpUp[3][1])),
          new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(null, interpUp[4][1])),
          new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(null, interpUp[5][1]))));
    prdG1U1toG1S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(101, 100,
        prdG1U1toG1S, "gear1"));
    // makes the transition <Gear1, UpShifting1> -> <Gear1, UpShifting2>
    CartesianProduct<RealPred, RealPred> prdG1StoG1U2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(interpUp[0][1], null)),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpUp[1][1], null)),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(interpUp[2][1], null)),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(interpUp[3][1], null)),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(interpUp[4][1], null)),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(interpUp[5][1], null))));
    prdG1StoG1U2.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(101, 102,
        prdG1StoG1U2, "gear1"));
    // makes the transition <Gear1, UpShifting2> -> <Gear1, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG1U2toG1S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(null, interpUp[0][1])),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(null, interpUp[1][1])),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(null, interpUp[2][1])),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(null, interpUp[3][1])),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(null, interpUp[4][1])),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(null, interpUp[5][1]))));
    prdG1U2toG1S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(102, 100,
        prdG1U2toG1S, "gear1"));
    // makes the transition <Gear1, UpShifting2> -> <Gear2, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG1U2toG2S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0],interpUp[1][0]), new DoublePred(interpUp[0][1], null)),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpUp[1][1], null)),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(interpUp[2][1], null)),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(interpUp[3][1], null)),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(interpUp[4][1], null)),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(interpUp[5][1], null))));
    prdG1U2toG2S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(102, 200,
        prdG1U2toG2S, "gear2"));
    // makes the transition <Gear2, SteadyState> -> <Gear2, UpShifting1>
    CartesianProduct<RealPred, RealPred> prdG2StoG2U1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(interpUp[0][2]+ Math.ulp(interpUp[0][2]), null)),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpUp[1][2]+ Math.ulp(interpUp[1][2]), null)),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(interpUp[2][2]+ Math.ulp(
                interpUp[2][2]), null)),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(interpUp[3][2]+ Math.ulp(
                interpUp[3][2]), null)),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(interpUp[4][2]+ Math.ulp(
                interpUp[4][2]), null)),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(interpUp[5][2]+ Math
                .ulp(interpUp[5][2]), null))));
    prdG2StoG2U1.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(200, 201,
        prdG2StoG2U1, "gear2"));
    // makes the transition <Gear2, SteadyState> -> <Gear2, DownShifting1>
    CartesianProduct<RealPred, RealPred> prdG2StoG2D1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(null,interpDown[0][2])),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(null,interpDown[1][2])),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(null,interpDown[2][2])),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(null,interpDown[3][2])),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(null,interpDown[4][2])),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(null,interpDown[5][2]))));
    prdG2StoG2D1.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(200, 210,
        prdG2StoG2D1, "gear2"));
    // makes the transition <Gear2, SteadyState> -> <Gear2, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG2StoG2S = new CartesianProduct<>(
        Arrays.asList(
          new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(interpDown[0][2],interpUp[0][2] + Math.ulp(interpUp[0][2]))),
          new Pair<>(new DoublePred(interpDown[1][0], interpUp[1][0]), new DoublePred(interpDown[1][2],interpUp[0][2] + Math.ulp(interpUp[0][2]))),
          new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpDown[1][2],interpUp[1][2] + Math.ulp(interpUp[1][2]))),
          new Pair<>(new DoublePred(interpUp[2][0], interpDown[2][0]), new DoublePred(interpDown[1][2],interpUp[2][2] + Math.ulp(interpUp[2][2]))),
          new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(interpDown[2][2],interpUp[2][2] + Math.ulp(interpUp[2][2]))),
          new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(interpDown[3][2],interpUp[3][2] + Math.ulp(interpUp[3][2]))),
          new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(interpDown[4][2],interpUp[4][2] + Math.ulp(interpUp[4][2]))),
          new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(interpDown[5][2],interpUp[5][2] + Math.ulp(interpUp[5][2])))));
    prdG2StoG2S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(200, 200,
        prdG2StoG2S, "gear2"));
    // makes the transition <Gear2, DownShifting1> -> <Gear2, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG2D1toG2S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(interpDown[0][2] + Math.ulp(interpDown[1][2]),null)),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(interpDown[1][2]+Math.ulp(interpDown[1][2]),null)),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(interpDown[2][2]+Math.ulp(interpDown[2][2]),null)),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(interpDown[3][2]+Math.ulp(interpDown[3][2]),null)),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(interpDown[4][2]+Math.ulp(interpDown[4][2]),null)),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(interpDown[5][2]+Math.ulp(interpDown[5][2]),null))));
    prdG2D1toG2S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(210, 200,
        prdG2D1toG2S, "gear2"));
    // makes the transition <Gear2, DownShifting1> -> <Gear2, DownShifting2>
    CartesianProduct<RealPred, RealPred> prdG2D1toG2D2 = new CartesianProduct<>(
         Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(null,interpDown[0][2] + Math.ulp(interpDown[0][2]))),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(null,interpDown[1][2] + Math
                .ulp(interpDown[1][2]))),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(null,interpDown[2][2] + Math.ulp(interpDown[2][2]))),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(null,interpDown[3][2] + Math.ulp(interpDown[3][2]))),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(null,interpDown[4][2] + Math.ulp(interpDown[4][2]))),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(null,interpDown[5][2] + Math.ulp(interpDown[5][2])))));
    prdG2D1toG2D2.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(210, 220,
        prdG2D1toG2D2, "gear2"));
    // makes the transition <Gear2, DownShifting2> -> <Gear2, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG2D2toG2S = new CartesianProduct<>(
          Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(interpDown[0][2]+Math.ulp(interpDown[0][2]),null)),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(interpDown[1][2]+Math.ulp(interpDown[1][2]),null)),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(interpDown[2][2]+Math.ulp(interpDown[2][2]),null)),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(interpDown[3][2]+Math.ulp(interpDown[3][2]),null)),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(interpDown[4][2]+Math.ulp(interpDown[4][2]),null)),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(interpDown[5][2]+Math.ulp(interpDown[5][2]),null))));
    prdG2D2toG2S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(220, 200,
        prdG2D2toG2S, "gear2"));
    // makes the transition <Gear2, DonwShifting2> -> <Gear1, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG2D2toG1S = new CartesianProduct<>(
         Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(null,interpDown[0][2] + Math.ulp(interpDown[0][2]))),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(null,interpDown[1][2] + Math
                .ulp(interpDown[1][2]))),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(null,interpDown[2][2] + Math.ulp(interpDown[2][2]))),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(null,interpDown[3][2] + Math.ulp(interpDown[3][2]))),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(null,interpDown[4][2] + Math.ulp(interpDown[4][2]))),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(null,interpDown[5][2] + Math.ulp(interpDown[5][2])))));
    prdG2D2toG1S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(220, 100,
        prdG2D2toG1S, "gear1"));
    // makes the transition <Gear2, UpShifting1> -> <Gear2, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG2U1toG2S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(null,interpUp[0][2])),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(null,interpUp[1][2])),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(null,interpUp[2][2])),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(null,interpUp[3][2])),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(null,interpUp[4][2])),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(null, interpUp[5][2]))));
    prdG2U1toG2S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(201, 200,
        prdG2U1toG2S, "gear2"));
    // makes the transition <Gear2, UpShifting1> -> <Gear2, UpShifting2>
    CartesianProduct<RealPred, RealPred> prdG2U1toG2U2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(interpUp[0][2],null)),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpUp[1][2],null)),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(interpUp[2][2],null)),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(interpUp[3][2],null)),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(interpUp[4][2],null)),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(interpUp[5][2], null))));
    prdG2U1toG2U2.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(201, 202,
        prdG2U1toG2U2, "gear2"));
    // makes the transition <Gear2, UpShifting2> -> <Gear2, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG2U2toG2S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(null,interpUp[0][2])),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(null,interpUp[1][2])),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(null,interpUp[2][2])),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(null,interpUp[3][2])),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(null,interpUp[4][2])),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(null, interpUp[5][2]))));
    prdG2U2toG2S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(202, 200,
        prdG2U2toG2S, "gear2"));
    // makes the transition <Gear2, UpShifting2> -> <Gear3, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG2U2toG3S = new CartesianProduct<>(
      Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(interpUp[0][2],null)),
          new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpUp[1][2],null)),
          new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(interpUp[2][2],null)),
          new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(interpUp[3][2],null)),
          new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(interpUp[4][2],null)),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(interpUp[5][2], null))));
    prdG2U2toG3S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(202, 300,
        prdG2U2toG3S, "gear3"));
    // makes the transition <Gear3, SteadyState> -> <Gear3, UpShifting1>
    CartesianProduct<RealPred, RealPred> prdG3StoG3U1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(interpUp[0][3]+Math.ulp(interpUp[0][3]), null)),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpUp[1][3]+Math.ulp(interpUp[1][3]), null)),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(interpUp[2][3]+Math.ulp(interpUp[2][3]), null)),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(interpUp[3][3]+Math.ulp(interpUp[3][3]), null)),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(interpUp[4][3]+Math.ulp(interpUp[4][3]), null)),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(interpUp[5][3] + Math.ulp(interpUp[5][3]), null))));
    prdG3StoG3U1.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(300, 301,
        prdG3StoG3U1, "gear3"));
    // makes the transition <Gear3, SteadyState> -> <Gear3, DownShifting1>
    CartesianProduct<RealPred, RealPred> prdG3StoG3D1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(null,interpDown[0][3])),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(null,interpDown[1][3])),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(null,interpDown[2][3])),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(null,interpDown[3][3])),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(null,interpDown[4][3])),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(null, interpDown[5][3]))));
    prdG3StoG3D1.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(300, 310,
        prdG3StoG3D1, "gear3"));
    // makes the transition <Gear3, SteadyState> -> <Gear3, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG3StoG3S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(interpDown[0][3],interpUp[0][3] + Math.ulp(interpUp[0][3]))),
            new Pair<>(new DoublePred(interpDown[1][0], interpUp[1][0]), new DoublePred(interpDown[1][3],interpUp[0][3] + Math.ulp(interpUp[0][3]))),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpDown[1][3],interpUp[1][3] + Math.ulp(interpUp[1][3]))),
            new Pair<>(new DoublePred(interpUp[2][0], interpDown[2][0]), new DoublePred(interpDown[1][3],interpUp[2][3] + Math.ulp(interpUp[2][3]))),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(interpDown[2][3],interpUp[2][3]+ Math.ulp(interpUp[2][3]))),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(interpDown[3][3],interpUp[3][3] + Math.ulp(interpUp[3][3]))),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(interpDown[4][3],interpUp[4][3] + Math.ulp(interpUp[4][3]))),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(interpDown[5][3], interpUp[5][3] + Math.ulp(interpUp[5][3])))));
    prdG3StoG3S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(300, 300,
        prdG3StoG3S, "gear3"));
    // makes the transition <Gear3, DownShifting1> -> <Gear3, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG3D1toG3S = new CartesianProduct<>(
      Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(interpDown[0][3]+Math.ulp(interpDown[0][3]),null)),
          new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(interpDown[1][3]+Math.ulp(interpDown[1][3]),null)),
          new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(interpDown[2][3]+Math.ulp(interpDown[2][3]),null)),
          new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(interpDown[3][3]+Math.ulp(interpDown[3][3]),null)),
          new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(interpDown[4][3]+Math.ulp(interpDown[4][3]),null)),
          new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(interpDown[5][3]+Math.ulp(interpDown[5][3]),null))));
    prdG3D1toG3S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(310, 300,
        prdG3D1toG3S, "gear3"));
    // makes the transition <Gear3, DownShifting1> -> <Gear3, DownShifting2>
    CartesianProduct<RealPred, RealPred> prdG3D1toG3D2 = new CartesianProduct<>(
      Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(null, interpDown[0][3] + Math.ulp(interpDown[0][3]))),
          new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(null, interpDown[1][3] + Math.ulp(interpDown[1][3]))),
          new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(null, interpDown[2][3] + Math.ulp(interpDown[2][3]))),
          new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(null, interpDown[3][3] + Math.ulp(interpDown[3][3]))),
          new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(null, interpDown[4][3] + Math.ulp(interpDown[4][3]))),
          new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(null, interpDown[5][3] + Math.ulp(interpDown[5][3])))));
    prdG3D1toG3D2.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(310, 320,
        prdG3D1toG3D2, "gear3"));
    // makes the transition <Gear3, DownShifting2> -> <Gear3, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG3D2toG3S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(interpDown[0][3]+Math.ulp(interpDown[0][3]),null)),
          new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(interpDown[1][3]+Math.ulp(interpDown[1][3]),null)),
          new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(interpDown[2][3]+Math.ulp(interpDown[2][3]),null)),
          new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(interpDown[3][3]+Math.ulp(interpDown[3][3]),null)),
          new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(interpDown[4][3]+Math.ulp(interpDown[4][3]),null)),
          new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(interpDown[5][3]+Math.ulp(interpDown[5][3]),null))));
    prdG3D2toG3S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(320, 300,
        prdG3D2toG3S, "gear3"));
    // makes the transition <Gear3, DownShifting2> -> <Gear2, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG3D2toG2S = new CartesianProduct<>(
       Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(null, interpDown[0][3] + Math.ulp(interpDown[0][3]))),
          new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(null, interpDown[1][3] + Math.ulp(interpDown[1][3]))),
          new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(null, interpDown[2][3] + Math.ulp(interpDown[2][3]))),
          new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(null, interpDown[3][3] + Math.ulp(interpDown[3][3]))),
          new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(null, interpDown[4][3] + Math.ulp(interpDown[4][3]))),
          new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(null, interpDown[5][3] + Math.ulp(interpDown[5][3])))));
    prdG3D2toG2S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(320, 200,
        prdG3D2toG2S, "gear2"));
    // makes the transition <Gear3, UpShifting1> -> <Gear3, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG3U1toG3S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(null,interpUp[0][3])),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(null,interpUp[1][3])),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(null,interpUp[2][3])),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(null,interpUp[3][3])),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(null,interpUp[4][3])),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(null, interpUp[5][3]))));
    prdG3U1toG3S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(301, 300,
        prdG3U1toG3S, "gear3"));
    // makes the transition <Gear3, UpShifting1> -> <Gear3, UpShifting2>
    CartesianProduct<RealPred, RealPred> prdG3U1toG3U2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(interpUp[0][3],null)),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpUp[1][3],null)),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(interpUp[2][3],null)),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(interpUp[3][3],null)),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(interpUp[4][3],null)),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(interpUp[5][3], null))));
    prdG3U1toG3U2.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>,String>(301, 302,
        prdG3U1toG3U2, "gear3"));
    // makes the transition <Gear3, UpShifting2> -> <Gear3, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG3U2toG3S = new CartesianProduct<>(
      Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(null, interpUp[0][3])),
          new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(null, interpUp[1][3])),
          new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(null, interpUp[2][3])),
          new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(null, interpUp[3][3])),
          new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(null, interpUp[4][3])),
          new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(null, interpUp[5][3]))));
    prdG3U2toG3S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(302, 300,
        prdG3U2toG3S, "gear3"));
    // makes the transition <Gear3, UpShifting2> -> <Gear4, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG3U2toG4S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpUp[0][0], interpUp[1][0]), new DoublePred(interpUp[0][3],null)),
            new Pair<>(new DoublePred(interpUp[1][0], interpUp[2][0]), new DoublePred(interpUp[1][3],null)),
            new Pair<>(new DoublePred(interpUp[2][0], interpUp[3][0]), new DoublePred(interpUp[2][3],null)),
            new Pair<>(new DoublePred(interpUp[3][0], interpUp[4][0]), new DoublePred(interpUp[3][3],null)),
            new Pair<>(new DoublePred(interpUp[4][0], interpUp[5][0]), new DoublePred(interpUp[4][3],null)),
            new Pair<>(new DoublePred(interpUp[5][0], null), new DoublePred(interpUp[5][3], null))));
    prdG3U2toG4S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(302, 400,
        prdG3U2toG4S, "gear4"));
    // makes the transition <Gear4, SteadyState> -> <Gear4, DownShifting1>
    CartesianProduct<RealPred, RealPred> prdG4StoG4D1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(null,interpDown[0][4])),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(null,interpDown[1][4])),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(null,interpDown[2][4])),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(null,interpDown[3][4])),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(null,interpDown[4][4])),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(null, interpDown[5][4]))));
    prdG4StoG4D1.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(400, 410,
        prdG4StoG4D1, "gear4"));
    // makes the transition <Gear4, SteadyState> -> <Gear4, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG4StoG4S = new CartesianProduct<>(
      Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0],interpDown[1][0]), new DoublePred(interpDown[0][4],null)),
          new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(interpDown[1][4],null)),
          new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(interpDown[2][4],null)),
          new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(interpDown[3][4],null)),
          new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(interpDown[4][4],null)),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(interpDown[5][4], null))));
    prdG4StoG4S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(400, 400,
        prdG4StoG4S, "gear4"));
    // makes the transition <Gear4, DownShifting1> -> <Gear4, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG4D1toG4S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(interpDown[0][4] + Math.ulp(interpDown[0][4]),null)),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(interpDown[1][4]+ Math.ulp(interpDown[1][4]),null)),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(interpDown[2][4] + Math.ulp(interpDown[2][4]),null)),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(interpDown[3][4] + Math.ulp(interpDown[3][4]),null)),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(interpDown[4][4] + Math.ulp(interpDown[4][4]),null)),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(interpDown[5][4] + Math.ulp(interpDown[5][4]), null))));
    prdG4D1toG4S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(410, 400,
        prdG4D1toG4S, "gear4"));
    // makes the transition <Gear4, DownShifting1> -> <Gear4, DownShifting2>
    CartesianProduct<RealPred, RealPred> prdG4D1toG4D2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(null,interpDown[0][4] + Math.ulp(interpDown[0][4]))),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(null,interpDown[1][4] + Math.ulp(interpDown[1][4]))),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(null,interpDown[2][4] + Math.ulp(interpDown[2][4]))),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(null,interpDown[3][4] + Math.ulp(interpDown[3][4]))),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(null,interpDown[4][4] + Math.ulp(interpDown[4][4]))),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(null, interpDown[5][4] + Math.ulp(interpDown[5][4])))));
    prdG4D1toG4D2.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(410, 420,
        prdG4D1toG4D2, "gear4"));
    // makes the transition <Gear4, DownShifting2> -> <Gear4, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG4D2toG4S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(interpDown[0][4] + Math.ulp(interpDown[0][4]),null)),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(interpDown[1][4]+ Math.ulp(interpDown[1][4]),null)),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(interpDown[2][4] + Math.ulp(interpDown[2][4]),null)),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(interpDown[3][4] + Math.ulp(interpDown[3][4]),null)),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(interpDown[4][4] + Math.ulp(interpDown[4][4]),null)),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(interpDown[5][4] + Math.ulp(interpDown[5][4]), null))));
    prdG4D2toG4S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(420, 400,
        prdG4D2toG4S, "gear4"));
    // makes the transition <Gear4, DownShifting2> -> <Gear3, SteadyState>
    CartesianProduct<RealPred, RealPred> prdG4D2toG3S = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(interpDown[0][0], interpDown[1][0]), new DoublePred(null,interpDown[0][4] + Math.ulp(interpDown[0][4]))),
            new Pair<>(new DoublePred(interpDown[1][0], interpDown[2][0]), new DoublePred(null,interpDown[1][4] + Math.ulp(interpDown[1][4]))),
            new Pair<>(new DoublePred(interpDown[2][0], interpDown[3][0]), new DoublePred(null,interpDown[2][4] + Math.ulp(interpDown[2][4]))),
            new Pair<>(new DoublePred(interpDown[3][0], interpDown[4][0]), new DoublePred(null,interpDown[3][4] + Math.ulp(interpDown[3][4]))),
            new Pair<>(new DoublePred(interpDown[4][0], interpDown[5][0]), new DoublePred(null,interpDown[4][4] + Math.ulp(interpDown[4][4]))),
            new Pair<>(new DoublePred(interpDown[5][0], null), new DoublePred(null, interpDown[5][4] + Math.ulp(interpDown[5][4])))));
    prdG4D2toG3S.normalize(throttleBA, speedBA);
    trans.add(new SMAInputMove<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(420, 300,
        prdG4D2toG3S, "gear3"));
    return SymbolicMealyAutomaton.MkSMA(trans, init, prodBA);
  }

}
