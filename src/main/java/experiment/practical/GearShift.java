package experiment.practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.sat4j.specs.TimeoutException;

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
  private static BooleanAlgebra<RealPred, Double> throttleBA = new BoundedDoubleSolver(0.0, 100.0);
  private static BooleanAlgebra<RealPred, Double> speedBA = new BoundedDoubleSolver(0.0, 1000000.0);
  private static ProductAlgebra<RealPred, Double, RealPred, Double> prodBA = new ProductAlgebra<>(throttleBA, speedBA);
  private static Double[][] interpUp = {
      { 0.0, 10.0, 30.0, 50.0, 1000000.0 },
      { 25.0, 10.0, 30.0, 50.0, 1000000.0 },
      { 35.0, 15.0, 30.0, 50.0, 1000000.0 },
      { 50.0, 23.0, 41.0, 60.0, 1000000.0 },
      { 90.0, 40.0, 70.0, 100.0, 1000000.0 },
      { 100.0, 40.0, 70.0, 100.0, 1000000.0 }
  };
  private static Double[][] interpDown = {
      { 0.0, 0.0, 5.0, 20.0, 35.0 },
      { 5.0, 0.0, 5.0, 20.0, 35.0 },
      { 40.0, 0.0, 5.0, 25.0, 40.0 },
      { 50.0, 0.0, 5.0, 30.0, 50.0 },
      { 90.0, 0.0, 30.0, 50.0, 80.0 },
      { 100.0, 0.0, 30.0, 50.0, 80.0 }
  };
  public static void main(String[] args) {
    try {
      SymbolicMealyAutomaton<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String> gearShift = getGearShiftAutomaton();
      gearShift.createDotFile("gearShift", "./");
      SymbolicMealyAutomatonOracle<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String> oracle = new SymbolicMealyAutomatonOracle<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(
          gearShift, prodBA);
      SymbolicMealyAutomatonLearner<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String> learner = new SymbolicMealyAutomatonLearner<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String>(
          true);
    SymbolicMealyAutomaton<CartesianProduct<RealPred, RealPred>, Pair<Double, Double>, String> learned = learner.learn(oracle, prodBA);
          learned.createDotFile("learnedGearShift", "./");
    } catch (TimeoutException e) {
      e.printStackTrace();
    }
  }

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
