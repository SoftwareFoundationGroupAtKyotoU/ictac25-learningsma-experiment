package experiment.Random40States20SigmaE20240822005032;
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
import theory.intervals.BoundedIntegerSolver;
import theory.intervals.IntegerSolver;
import theory.intervals.IntPred;
import utilities.Pair;
public class Random40States20SigmaE20240822005032{
public static void main(String[] args){
try{
BooleanAlgebra<IntPred, Integer> ba1 = new BoundedIntegerSolver(0, null);
SymbolicMealyAutomatonLearner<IntPred, Integer, Character> learner = new SymbolicMealyAutomatonLearner<IntPred, Integer, Character>(true);
Integer init = 1;
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.addAll(createTransitionsState1());
trans.addAll(createTransitionsState2());
trans.addAll(createTransitionsState3());
trans.addAll(createTransitionsState4());
trans.addAll(createTransitionsState5());
trans.addAll(createTransitionsState6());
trans.addAll(createTransitionsState7());
trans.addAll(createTransitionsState8());
trans.addAll(createTransitionsState9());
trans.addAll(createTransitionsState10());
trans.addAll(createTransitionsState11());
trans.addAll(createTransitionsState12());
trans.addAll(createTransitionsState13());
trans.addAll(createTransitionsState14());
trans.addAll(createTransitionsState15());
trans.addAll(createTransitionsState16());
trans.addAll(createTransitionsState17());
trans.addAll(createTransitionsState18());
trans.addAll(createTransitionsState19());
trans.addAll(createTransitionsState20());
trans.addAll(createTransitionsState21());
trans.addAll(createTransitionsState22());
trans.addAll(createTransitionsState23());
trans.addAll(createTransitionsState24());
trans.addAll(createTransitionsState25());
trans.addAll(createTransitionsState26());
trans.addAll(createTransitionsState27());
trans.addAll(createTransitionsState28());
trans.addAll(createTransitionsState29());
trans.addAll(createTransitionsState30());
trans.addAll(createTransitionsState31());
trans.addAll(createTransitionsState32());
trans.addAll(createTransitionsState33());
trans.addAll(createTransitionsState34());
trans.addAll(createTransitionsState35());
trans.addAll(createTransitionsState36());
trans.addAll(createTransitionsState37());
trans.addAll(createTransitionsState38());
trans.addAll(createTransitionsState39());
trans.addAll(createTransitionsState40());
SymbolicMealyAutomaton<IntPred, Integer, Character> example1 = SymbolicMealyAutomaton.MkSMA(trans,init,ba1);
example1 = SymbolicMealyAutomaton.getNormalized(example1,ba1);
example1 = SymbolicMealyAutomaton.getClean(example1,ba1);
example1 = SymbolicMealyAutomaton.getMinimal(example1, ba1);
SymbolicMealyAutomatonOracle<IntPred, Integer, Character> oracle = new SymbolicMealyAutomatonOracle<IntPred, Integer, Character>(example1,ba1);
SymbolicMealyAutomaton<IntPred, Integer, Character> learned = learner.learn(oracle, ba1);
} catch (TimeoutException e) {
}
}
private static List<SFAMove<IntPred, Integer>> createTransitionsState1() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 25, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(353, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(725, 783), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 33, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(353, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(700, 724), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(725, 783), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 25, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 28, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 25, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(384, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(608, 699), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(154, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(384, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(514, 538), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 27, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 31, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 25, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(384, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 23, new IntPred(700, 724), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 39, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 29, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(608, 699), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 38, new IntPred(725, 783), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(353, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(384, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(700, 724), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 24, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 30, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 24, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(384, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 30, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(154, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(353, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 25, new IntPred(514, 538), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(608, 699), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 26, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 26, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(700, 724), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(154, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 32, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(384, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(514, 538), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 30, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(514, 538), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 29, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 38, new IntPred(384, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(154, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 27, new IntPred(353, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(384, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(514, 538), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(608, 699), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 38, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(353, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 37, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 27, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(154, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 29, new IntPred(514, 538), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(700, 724), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 34, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(154, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 38, new IntPred(725, 783), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 2, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 2, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 12, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 9, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 19, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 19, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(725, 783), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 20, new IntPred(700, 724), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 4, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(154, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 27, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(384, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(514, 538), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 23, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 9, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 28, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(353, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 19, new IntPred(154, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 30, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(514, 538), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(725, 783), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 16, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(154, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(353, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(784, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(608, 699), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(700, 724), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 8, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 28, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(608, 699), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 13, new IntPred(725, 783), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 23, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 29, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(384, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 26, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 18, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(73, 86), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 5, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 24, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 19, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(353, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 15, new IntPred(447, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 5, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(725, 783), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 18, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 18, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 24, new IntPred(87, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(340, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 37, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 14, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(405, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(539, 607), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(700, 724), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(784, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(0, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 10, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(144, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(344, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(405, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(514, 538), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(608, 699), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 1, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(154, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(234, 248), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(249, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(340, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(344, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 25, new IntPred(353, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(514, 538), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(539, 607), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(700, 724), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(725, 783), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(0, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(73, 86), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(87, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(144, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(154, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(234, 248), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(249, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(353, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(384, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 11, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(447, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 3, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(608, 699), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(700, 724), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(725, 783), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 13, new IntPred(784, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(0, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(73, 86), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(87, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(144, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(154, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(234, 248), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(249, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(340, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(344, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(353, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(384, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(405, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(447, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(514, 538), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(539, 607), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(608, 699), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(700, 724), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 39, new IntPred(725, 783), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(784, null), 'b'));
return trans;
}

}
