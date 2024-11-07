package experiment.Random20States20SigmaE20240820080147;
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
public class Random20States20SigmaE20240820080155{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(38, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(64, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(82, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(163, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(251, 302), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(303, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(356, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(360, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(376, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(441, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(470, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(562, 632), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(633, 701), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(702, 738), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(794, 881), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(882, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(923, 975), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(976, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(38, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(64, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(82, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(163, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(251, 302), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(303, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(356, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(360, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(376, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(441, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(470, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(562, 632), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(633, 701), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(702, 738), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(739, 793), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(794, 881), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(882, 922), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(923, 975), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(976, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(38, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(64, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(82, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(163, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(251, 302), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(303, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(356, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(360, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(376, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(441, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(470, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(562, 632), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(633, 701), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(702, 738), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(739, 793), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(794, 881), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(882, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(923, 975), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(976, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(38, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(64, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(82, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(163, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(251, 302), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(303, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(356, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(360, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(376, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(441, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(470, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(562, 632), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(633, 701), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(702, 738), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(794, 881), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(882, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(923, 975), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(976, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(38, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(64, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(82, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(163, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(251, 302), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(303, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(356, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(360, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(376, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(441, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(470, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(562, 632), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(633, 701), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(702, 738), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(739, 793), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(794, 881), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(882, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(923, 975), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(976, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(38, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(64, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(82, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(163, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(251, 302), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(303, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(356, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(360, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(376, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(441, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(470, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(562, 632), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(633, 701), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(702, 738), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(794, 881), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(882, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(923, 975), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(976, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(38, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(64, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(82, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(163, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(251, 302), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(303, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(356, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(360, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(376, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(441, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(470, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(562, 632), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(633, 701), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(702, 738), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(794, 881), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(882, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(923, 975), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(976, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(38, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(64, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(82, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(163, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(251, 302), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(303, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(356, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(360, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(376, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(441, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(470, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(562, 632), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(633, 701), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(702, 738), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(794, 881), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(882, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(923, 975), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(976, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(38, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(64, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(82, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(163, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(251, 302), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(303, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(356, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(360, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(376, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(441, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(470, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(562, 632), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(633, 701), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(702, 738), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(739, 793), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(794, 881), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(882, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(923, 975), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(976, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(38, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(64, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(82, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(163, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(251, 302), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(303, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(356, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(360, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(376, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(441, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(470, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(562, 632), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(633, 701), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(702, 738), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(794, 881), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(882, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(923, 975), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(976, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(38, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(64, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(82, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(163, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(251, 302), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(303, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(356, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(360, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(376, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(441, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(470, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(562, 632), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(633, 701), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(702, 738), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(739, 793), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(794, 881), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(882, 922), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(923, 975), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(976, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(38, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(64, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(82, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(163, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(251, 302), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(303, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(356, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(360, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(376, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(441, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(470, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(562, 632), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(633, 701), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(702, 738), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(739, 793), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(794, 881), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(882, 922), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(923, 975), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(976, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(38, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(64, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(82, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(163, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(251, 302), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(303, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(356, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(360, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(376, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(441, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(470, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(562, 632), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(633, 701), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(702, 738), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(794, 881), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(882, 922), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(923, 975), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(976, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(38, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(64, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(82, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(163, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(251, 302), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(303, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(356, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(360, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(376, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(441, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(470, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(562, 632), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(633, 701), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(702, 738), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(794, 881), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(882, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(923, 975), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(976, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(38, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(64, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(82, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(163, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(251, 302), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(303, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(356, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(360, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(376, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(441, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(470, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(562, 632), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(633, 701), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(702, 738), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(739, 793), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(794, 881), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(882, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(923, 975), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(976, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(38, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(64, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(82, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(163, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(251, 302), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(303, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(356, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(360, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(376, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(441, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(470, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(562, 632), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(633, 701), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(702, 738), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(794, 881), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(882, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(923, 975), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(976, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(38, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(64, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(82, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(163, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(251, 302), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(303, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(356, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(360, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(376, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(441, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(470, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(562, 632), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(633, 701), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(702, 738), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(739, 793), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(794, 881), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(882, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(923, 975), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(976, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(38, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(64, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(82, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(163, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(251, 302), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(303, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(356, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(360, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(376, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(441, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(470, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(562, 632), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(633, 701), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(702, 738), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(739, 793), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(794, 881), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(882, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(923, 975), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(976, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(38, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(64, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(82, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(163, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(251, 302), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(303, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(356, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(360, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(376, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(441, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(470, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(562, 632), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(633, 701), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(702, 738), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(794, 881), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(882, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(923, 975), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(976, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(38, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(64, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(82, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(163, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(251, 302), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(303, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(356, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(360, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(376, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(441, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(470, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(562, 632), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(633, 701), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(702, 738), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(739, 793), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(794, 881), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(882, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(923, 975), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(976, null), 'a'));
return trans;
}

}
