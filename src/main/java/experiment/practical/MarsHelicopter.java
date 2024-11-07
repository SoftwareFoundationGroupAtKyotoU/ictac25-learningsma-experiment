package experiment.practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.sat4j.specs.TimeoutException;

import automata.sfa.SFAMove;
import theory.ProductAlgebra;
import theory.cartesian.CartesianProduct;
import theory.intervals.BoundedIntegerSolver;
import theory.intervals.IntPred;
import theory.intervals.RealPred;
import utilities.Pair;

import learning.symbolicmealy.SymbolicMealyAutomatonLearner;
import learning.symbolicmealy.SymbolicMealyAutomatonOracle;
import symbolicmealy.SMAInputMove;
import symbolicmealy.SymbolicMealyAutomaton;
import theory.intervals.DoublePred;
import theory.intervals.BoundedDoubleSolver;

/**
 * This class represents a Mars Helicopter from
 * <a href=
 * "https://www.mathworks.com/help/sps/ug/mars-helicopter-system.html"></a>.
 * It contains methods to create and learn a symbolic mealy automaton for the
 * Mars Helicopter.
 * The automaton represents the helicopter's control system based on temperature,
 * state of charge (SOC), altitude, and pre-flight status.
 */
public class MarsHelicopter {
  private static Double minTemperature = -274.0;
  private static Double maxTemperature = 10000.0;
  private static Double minSOC = 0.0;
  private static Double maxSOC = 1.0 + Math.ulp(1.0);
  private static Double minAltitude = 0.0;
  private static Double maxAltitude = 100000.0;
  private static BoundedDoubleSolver tempartureBA = new BoundedDoubleSolver(minTemperature, maxTemperature);
  private static BoundedDoubleSolver socBA = new BoundedDoubleSolver(minSOC, maxSOC);
  private static BoundedDoubleSolver altitudeBA = new BoundedDoubleSolver(minAltitude, maxAltitude);
  private static BoundedIntegerSolver prepFlightBA = new BoundedIntegerSolver(0, 1);
  private static ProductAlgebra<RealPred, Double, RealPred, Double> prodBA = new ProductAlgebra<>(tempartureBA, socBA);
  private static ProductAlgebra<RealPred, Double, CartesianProduct<RealPred, RealPred>, Pair<Double, Double>> tripleBA = new ProductAlgebra<>(
      altitudeBA,prodBA);
  private static ProductAlgebra<IntPred, Integer, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>, Pair<Double, Pair<Double, Double>>> quadBA = new ProductAlgebra<>(
     prepFlightBA, tripleBA);

  public static void main(String[] args) {
    try {
      SymbolicMealyAutomaton<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>, Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> marsHelicopter = getMarsHelicopterAutomaton();
      marsHelicopter.createDotFile("marsHelicopter", "./");
      SymbolicMealyAutomatonLearner<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>, Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> ell = new SymbolicMealyAutomatonLearner<>(
          true);
      SymbolicMealyAutomatonOracle<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>, Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> oracle = new SymbolicMealyAutomatonOracle<>(
          marsHelicopter, quadBA);
      SymbolicMealyAutomaton<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>, Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> learned = ell
          .learn(oracle, quadBA);
      learned.createDotFile("learnedMarsHelicopter", "./");

    } catch (TimeoutException e) {
      e.printStackTrace();
    }
  }

  private static SymbolicMealyAutomaton<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>, Pair<Integer, Pair<Double, Pair<Double, Double>>>, String> getMarsHelicopterAutomaton()
      throws TimeoutException {
    Integer init = 1;
    List<SFAMove<CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>>, Pair<Integer, Pair<Double, Pair<Double, Double>>>>> trans = new ArrayList<>();
    // make the transition from 1 to 1
    CartesianProduct<RealPred, RealPred> ts1to1m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(-15.0, maxTemperature), new DoublePred(0.4 + Math.ulp(0.4), maxSOC))));
    CartesianProduct<RealPred, RealPred> ts1to1m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(-15.0, maxTemperature), new DoublePred(minSOC, 0.4 + Math.ulp(0.4)))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa1to1m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude), ts1to1m1)));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa1to1m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude),ts1to1m2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap1to1 = new CartesianProduct<>(
            Arrays.asList(new Pair<>(new IntPred(0), tsa1to1m1), new Pair<>(new IntPred(0, 1), tsa1to1m2)));
        tsap1to1.normalize(prepFlightBA, tripleBA);
    trans.add(new SMAInputMove<>(1, 1, tsap1to1, "nan"));

    // make the transition from 1 to 2
    CartesianProduct<RealPred, RealPred> ts1to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minTemperature, -15.0), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>tsa1to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude),ts1to2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap1to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>( new IntPred(0, 1),tsa1to2)));
    trans.add(new SMAInputMove<>(1, 2, tsap1to2, "heater"));

    // make the transition from 1 to 3
    CartesianProduct<RealPred, RealPred> ts1to3 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(-15.0, maxTemperature), new DoublePred(0.4 + Math.ulp(0.4), maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa1to3 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude),ts1to3)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap1to3 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(1),tsa1to3)));
    trans.add(new SMAInputMove<>(1, 3, tsap1to3, "heater"));

    // make the transition from 2 to 2
    CartesianProduct<RealPred, RealPred> ts2to2 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(minTemperature, -10.0 + Math.ulp(-10.0)), new DoublePred(0.2, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa2to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude), ts2to2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap2to2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0, 1),tsa2to2)));
    trans.add(new SMAInputMove<>(2, 2, tsap2to2, "heater"));

    // make the transition from 2 to 1
    CartesianProduct<RealPred, RealPred> ts2to1m1 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(-10.0 + Math.ulp(-10.0), maxTemperature), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, RealPred> ts2to1m2 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(minTemperature, -10.0 + Math.ulp(-10.0)), new DoublePred(minSOC, 0.2))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa2to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude),
            ts2to1m1),
            new Pair<>(new DoublePred(minAltitude, maxAltitude), ts2to1m2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap2to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0, 1),tsa2to1)));
    trans.add(new SMAInputMove<>(2, 1, tsap2to1, "nan"));

    // make the transition from 3 to 1
    CartesianProduct<RealPred, RealPred> ts3to1m1 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(minTemperature, maxTemperature), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, RealPred> ts3to1m2 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(minTemperature, maxTemperature), new DoublePred(minSOC, 0.3))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa3to1m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude), ts3to1m1)));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa3to1m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude), ts3to1m2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap3to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0),tsa3to1m1), new Pair<>(new IntPred(1),tsa3to1m2)));
    trans.add(new SMAInputMove<>(3, 1, tsap3to1, "nan"));

    // make the transition from 3 to 3
    CartesianProduct<RealPred, RealPred> ts3to3 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(minTemperature, 10.0 + Math.ulp(10.0)), new DoublePred(0.3, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa3to3 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude), ts3to3)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap3to3 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(1),tsa3to3)));
    trans.add(new SMAInputMove<>(3, 3, tsap3to3, "heater"));

    // make the transition from 3 to 4
    CartesianProduct<RealPred, RealPred> ts3to4 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(10.0 + Math.ulp(10.0), maxTemperature), new DoublePred(0.3, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa3to4 = new CartesianProduct<>(
        Arrays.asList(new Pair<>( new DoublePred(minAltitude, maxAltitude),ts3to4)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap3to4 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(1),tsa3to4)));
    trans.add(new SMAInputMove<>(3, 4, tsap3to4, "fly,altitudeRef"));

    // make the transition from 4 to 4
    CartesianProduct<RealPred, RealPred> ts4to4 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(minTemperature, maxTemperature), new DoublePred(0.3, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa4to4 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude),ts4to4)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap4to4 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(1),tsa4to4)));
    trans.add(new SMAInputMove<>(4, 4, tsap4to4, "fly,altitudeRef"));

    // make the transition from 4 to 5
    CartesianProduct<RealPred, RealPred> ts4to5m1 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(minTemperature, maxTemperature), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, RealPred> ts4to5m2 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(minTemperature, maxTemperature), new DoublePred(minSOC, 0.3))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa4to5m1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude), ts4to5m1)));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa4to5m2 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, maxAltitude), ts4to5m2)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap4to5 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0),tsa4to5m1), new Pair<>(new IntPred(1),tsa4to5m2)));
    trans.add(new SMAInputMove<>(4, 5, tsap4to5, "fly"));

    // make the transition from 5 to 5
    CartesianProduct<RealPred, RealPred> ts5to5 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(minTemperature, maxTemperature), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa5to5 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(0.1, maxAltitude), ts5to5)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap5to5 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0, 1),tsa5to5)));
    trans.add(new SMAInputMove<>(5, 5, tsap5to5, "fly"));

    // make the transition from 5 to 1
    CartesianProduct<RealPred, RealPred> ts5to1 = new CartesianProduct<>(
        Arrays.asList(
            new Pair<>(new DoublePred(minTemperature, maxTemperature), new DoublePred(minSOC, maxSOC))));
    CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>> tsa5to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new DoublePred(minAltitude, 0.1), ts5to1)));
    CartesianProduct<IntPred, CartesianProduct<RealPred, CartesianProduct<RealPred, RealPred>>> tsap5to1 = new CartesianProduct<>(
        Arrays.asList(new Pair<>(new IntPred(0, 1), tsa5to1)));
    trans.add(new SMAInputMove<>(5, 1, tsap5to1, "nan"));

    return SymbolicMealyAutomaton.MkSMA(trans, init, quadBA);
  }

}
