package experiment.practical;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.sat4j.specs.TimeoutException;

import automata.sfa.SFAMove;
import experiment.BenchmarkLog;
import learning.symbolicmealy.SymbolicMealyAutomatonLearner;
import learning.symbolicmealy.SymbolicMealyAutomatonOracle;
import symbolicmealy.SMAInputMove;
import symbolicmealy.SymbolicMealyAutomaton;
import theory.ProductAlgebra;
import theory.cartesian.CartesianProduct;
import theory.intervals.BoundedDoubleSolver;
import theory.intervals.BoundedIntegerSolver;
import theory.intervals.DoublePred;
import theory.intervals.IntPred;
import theory.intervals.RealPred;
import utilities.Pair;

/**
 * A compact symbolic Mealy abstraction of the Mars Helicopter control system
 * based on temperature, state of charge (SOC), altitude, and pre-flight
 * status.
 *
 * Learning debug defaults to OFF for performance. Set <code>sma.learner.debug
 * =true</code> to enable verbose learner output.
 */
public class MarsHelicopter {
  private static final long START_NANOS = System.nanoTime();

  private static final Double minTemperature = -274.0;
  private static final Double minSOC = 0.0;
  private static final Double maxSOC = 1.0 + Math.ulp(1.0);
  private static final Double minAltitude = 0.0;
  private static final BoundedDoubleSolver tempartureBA = new BoundedDoubleSolver(minTemperature, null);
  private static final BoundedDoubleSolver socBA = new BoundedDoubleSolver(minSOC, maxSOC);
  private static final BoundedDoubleSolver altitudeBA = new BoundedDoubleSolver(minAltitude, null);
  private static final BoundedIntegerSolver prepFlightBA = new BoundedIntegerSolver(0, 1);
  private static final ProductAlgebra<RealPred, Double, RealPred, Double> prodBA = new ProductAlgebra<>(tempartureBA, socBA);
  private static final ProductAlgebra<RealPred, Double, CartesianProduct<RealPred, RealPred>, Pair<Double, Double>> tripleBA = new ProductAlgebra<>(altitudeBA, prodBA);
  private static final ProductAlgebra<IntPred, Integer, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>, Pair<Double, Pair<Double, Double>>> quadBA = new ProductAlgebra<>(prepFlightBA, tripleBA);

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
      SymbolicMealyAutomaton<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>,
          Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> marsHelicopter = getMarsHelicopterAutomaton();
      diag("PHASE", "target-construct-done states=" + marsHelicopter.stateCount() + " transitions=" + marsHelicopter.transitionCount());

      diag("PHASE", "target-dot-start file=marsHelicopter.dot");
      boolean dotCreated = marsHelicopter.createDotFile("marsHelicopter", "./");
      diag("PHASE", "target-dot-done success=" + dotCreated);

      SymbolicMealyAutomatonOracle<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>,
          Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> oracle =
          new SymbolicMealyAutomatonOracle<>(marsHelicopter, quadBA);
      oracle = BenchmarkLog.wrap(oracle);

      diag("PHASE", "learner-create-start effective=" + effectiveLearnerDebug);
      SymbolicMealyAutomatonLearner<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>,
          Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> learner =
          new SymbolicMealyAutomatonLearner<>(effectiveLearnerDebug);
      diag("PHASE", "learner-create-done");

      diag("PHASE", "learner-start");
      long learnStart = System.nanoTime();
      PrintStream origOut = System.out;
      BenchmarkLog.LearnerDebugPrintStream learnerOut =
          captureTableStats ? new BenchmarkLog.LearnerDebugPrintStream(origOut, learnerDebug) : null;
      SymbolicMealyAutomaton<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>,
          Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> learned;
      try {
        if (learnerOut != null) System.setOut(learnerOut);
        learned = learner.learn(oracle, quadBA);
      } finally {
        if (learnerOut != null) { learnerOut.flush(); System.setOut(origOut); }
      }
      diag("PHASE", "learner-done duration_ms=" + elapsedMillisSince(learnStart)
          + " states=" + learned.stateCount() + " transitions=" + learned.transitionCount());
      BenchmarkLog.printSummary(oracle, learnerOut);

      diag("PHASE", "learned-dot-start file=learnedMarsHelicopter.dot");
      boolean learnedDotCreated = learned.createDotFile("learnedMarsHelicopter", "./");
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

  @SuppressWarnings("unchecked")
  private static void smokeTest() throws TimeoutException {
    SymbolicMealyAutomaton<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>,
        Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> mh = getMarsHelicopterAutomaton();
    mh.createDotFile("marsHelicopter", "./");

    List<Pair<Integer, Pair<Double, Pair<Double, Double>>>> inputs = Arrays.asList(
        input(0, 15.0, 0.3, minAltitude),
        input(1, 15.0, 0.5, minAltitude),
        input(1, 15.0, 0.5, minAltitude),
        input(0, 15.0, 0.3, 0.5));
    List<String> expected = Arrays.asList("nan", "heater", "fly,altitudeRef", "fly");

    List<String> actual = mh.outputSeq(inputs, quadBA);
    if (!expected.equals(actual)) {
      throw new IllegalStateException("Unexpected smoke-test outputs: " + actual);
    }

    System.out.println("MarsHelicopter smoke test passed: " + mh.stateCount() + " states, " + mh.transitionCount() + " transitions");
  }

  private static Pair<Integer, Pair<Double, Pair<Double, Double>>> input(int preFlight, double temp, double soc, double alt) {
    return new Pair<>(preFlight, new Pair<>(alt, new Pair<>(temp, soc)));
  }

  // ---- getMarsHelicopterAutomaton() ----

  private static SymbolicMealyAutomaton<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>,
      Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> getMarsHelicopterAutomaton() throws TimeoutException {
    Integer init = 1;
    List<SFAMove<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>,
        Pair<Integer, Pair<Double, Pair<Double, Double>>>>> trans = new ArrayList<>();

    // make the transition from 1 to 1
    CartesianProduct<RealPred, RealPred> ts1to1m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(-15.0, null), new DoublePred(0.4 + Math.ulp(0.4), maxSOC))));
    CartesianProduct<RealPred, RealPred> ts1to1m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(-15.0, null), new DoublePred(minSOC, 0.4 + Math.ulp(0.4)))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa1to1m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts1to1m1)));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa1to1m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts1to1m2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap1to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0), tsa1to1m1), new Pair<>(new IntPred(0, 1), tsa1to1m2)));
    tsap1to1.normalize(prepFlightBA, tripleBA);
    trans.add(new SMAInputMove<>(1, 1, tsap1to1, "nan"));

    // make the transition from 1 to 2
    CartesianProduct<RealPred, RealPred> ts1to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, -15.0), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa1to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts1to2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap1to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0, 1), tsa1to2)));
    trans.add(new SMAInputMove<>(1, 2, tsap1to2, "heater"));

    // make the transition from 1 to 3
    CartesianProduct<RealPred, RealPred> ts1to3 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(-15.0, null), new DoublePred(0.4 + Math.ulp(0.4), maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa1to3 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts1to3)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap1to3 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(1), tsa1to3)));
    trans.add(new SMAInputMove<>(1, 3, tsap1to3, "heater"));

    // make the transition from 2 to 2
    CartesianProduct<RealPred, RealPred> ts2to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, -10.0 + Math.ulp(-10.0)), new DoublePred(0.2, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa2to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts2to2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap2to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0, 1), tsa2to2)));
    trans.add(new SMAInputMove<>(2, 2, tsap2to2, "heater"));

    // make the transition from 2 to 1
    CartesianProduct<RealPred, RealPred> ts2to1m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(-10.0 + Math.ulp(-10.0), null), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, RealPred> ts2to1m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, -10.0 + Math.ulp(-10.0)), new DoublePred(minSOC, 0.2))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa2to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts2to1m1),
            new Pair<>(new DoublePred(minAltitude, null), ts2to1m2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap2to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0, 1), tsa2to1)));
    trans.add(new SMAInputMove<>(2, 1, tsap2to1, "nan"));

    // make the transition from 3 to 1
    CartesianProduct<RealPred, RealPred> ts3to1m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, null), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, RealPred> ts3to1m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, null), new DoublePred(minSOC, 0.3))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa3to1m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts3to1m1)));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa3to1m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts3to1m2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap3to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0), tsa3to1m1), new Pair<>(new IntPred(1), tsa3to1m2)));
    trans.add(new SMAInputMove<>(3, 1, tsap3to1, "nan"));

    // make the transition from 3 to 3
    CartesianProduct<RealPred, RealPred> ts3to3 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, 10.0 + Math.ulp(10.0)), new DoublePred(0.3, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa3to3 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts3to3)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap3to3 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(1), tsa3to3)));
    trans.add(new SMAInputMove<>(3, 3, tsap3to3, "heater"));

    // make the transition from 3 to 4
    CartesianProduct<RealPred, RealPred> ts3to4 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(10.0 + Math.ulp(10.0), null), new DoublePred(0.3, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa3to4 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts3to4)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap3to4 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(1), tsa3to4)));
    trans.add(new SMAInputMove<>(3, 4, tsap3to4, "fly,altitudeRef"));

    // make the transition from 4 to 4
    CartesianProduct<RealPred, RealPred> ts4to4 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, null), new DoublePred(0.3, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa4to4 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts4to4)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap4to4 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(1), tsa4to4)));
    trans.add(new SMAInputMove<>(4, 4, tsap4to4, "fly,altitudeRef"));

    // make the transition from 4 to 5
    CartesianProduct<RealPred, RealPred> ts4to5m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, null), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, RealPred> ts4to5m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, null), new DoublePred(minSOC, 0.3))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa4to5m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts4to5m1)));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa4to5m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, null), ts4to5m2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap4to5 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0), tsa4to5m1), new Pair<>(new IntPred(1), tsa4to5m2)));
    trans.add(new SMAInputMove<>(4, 5, tsap4to5, "fly"));

    // make the transition from 5 to 5
    CartesianProduct<RealPred, RealPred> ts5to5 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, null), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa5to5 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(0.1, null), ts5to5)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap5to5 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0, 1), tsa5to5)));
    trans.add(new SMAInputMove<>(5, 5, tsap5to5, "fly"));

    // make the transition from 5 to 1
    CartesianProduct<RealPred, RealPred> ts5to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, null), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa5to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, 0.1), ts5to1)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap5to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0, 1), tsa5to1)));
    trans.add(new SMAInputMove<>(5, 1, tsap5to1, "nan"));

    return SymbolicMealyAutomaton.MkSMA(trans, init, quadBA);
  }
}
