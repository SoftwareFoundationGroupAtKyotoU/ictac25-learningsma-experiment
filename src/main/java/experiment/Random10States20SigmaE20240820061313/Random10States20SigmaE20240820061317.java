package experiment.Random10States20SigmaE20240820061313;
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
public class Random10States20SigmaE20240820061317{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(14, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(56, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(82, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(167, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(232, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(323, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(381, 433), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(434, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(438, 476), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(477, 573), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(574, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(609, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(675, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(727, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(746, 845), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(846, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(932, 1023), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(1024, 1060), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(1061, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(14, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(56, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(82, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(167, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(232, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(323, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(381, 433), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(434, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(438, 476), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(477, 573), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(574, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(609, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(675, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(727, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(746, 845), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(846, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(932, 1023), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(1024, 1060), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(1061, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(14, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(56, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(82, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(167, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(232, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(323, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(381, 433), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(434, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(438, 476), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(477, 573), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(574, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(609, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(675, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(727, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(746, 845), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(846, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(932, 1023), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(1024, 1060), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(1061, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(14, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(56, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(82, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(167, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(232, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(323, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(381, 433), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(434, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(438, 476), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(477, 573), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(574, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(609, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(675, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(727, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(746, 845), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(846, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(932, 1023), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(1024, 1060), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(1061, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(14, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(56, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(82, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(167, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(232, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(323, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(381, 433), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(434, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(438, 476), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(477, 573), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(574, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(609, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(675, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(727, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(746, 845), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(846, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(932, 1023), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(1024, 1060), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(1061, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(14, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(56, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(82, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(167, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(232, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(323, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(381, 433), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(434, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(438, 476), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(477, 573), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(574, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(609, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(675, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(727, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(746, 845), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(846, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(932, 1023), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(1024, 1060), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(1061, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(14, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(56, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(82, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(167, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(232, 322), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(323, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(381, 433), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(434, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(438, 476), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(477, 573), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(574, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(609, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(675, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(727, 745), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(746, 845), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(846, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(932, 1023), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(1024, 1060), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(1061, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(14, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(56, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(82, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(167, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(232, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(323, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(381, 433), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(434, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(438, 476), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(477, 573), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(574, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(609, 674), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(675, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(727, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(746, 845), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(846, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(932, 1023), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(1024, 1060), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(1061, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(14, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(56, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(82, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(167, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(232, 322), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(323, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(381, 433), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(434, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(438, 476), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(477, 573), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(574, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(609, 674), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(675, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(727, 745), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(746, 845), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(846, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(932, 1023), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(1024, 1060), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(1061, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(14, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(56, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(82, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(167, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(232, 322), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(323, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(381, 433), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(434, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(438, 476), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(477, 573), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(574, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(609, 674), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(675, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(727, 745), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(746, 845), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(846, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(932, 1023), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(1024, 1060), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(1061, null), 'b'));
return trans;
}

}
