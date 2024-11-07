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
public class Random40States20SigmaE20240822005045{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(74, 124), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 32, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(407, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(125, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(74, 124), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 38, new IntPred(125, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(125, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 32, new IntPred(157, 158), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(407, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(416, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 27, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(74, 124), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(125, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(157, 158), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 25, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 39, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(619, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 35, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 39, new IntPred(149, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(407, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 30, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 29, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 27, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 38, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 22, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(125, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(74, 124), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(125, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(157, 158), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 36, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(619, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(149, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 21, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(416, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 24, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 24, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(125, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(149, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(416, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(619, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 36, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(407, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 30, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(157, 158), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 38, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(125, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(157, 158), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 35, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 35, new IntPred(619, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 34, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(125, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 23, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 26, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(416, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 26, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 34, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 38, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(149, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(407, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(416, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 17, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 29, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 9, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 29, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 7, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 6, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(149, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(416, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 21, new IntPred(74, 124), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(125, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 27, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(157, 158), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 19, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 29, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(125, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(157, 158), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(416, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 10, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(157, 158), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 34, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(407, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 10, new IntPred(416, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 12, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(619, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 33, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(74, 124), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(125, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(407, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(619, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(74, 124), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 12, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 19, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 40, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(125, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(149, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 7, new IntPred(157, 158), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 19, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 10, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 31, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(781, 848), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 16, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(125, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 13, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(345, 406), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(619, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 8, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 23, new IntPred(74, 124), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(125, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 26, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 28, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(407, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 28, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(849, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 24, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(125, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(149, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(246, 284), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 25, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 16, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 21, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 31, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(619, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 19, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(74, 124), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(125, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 2, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(416, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(849, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(74, 124), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(149, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 16, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(159, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(285, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 34, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(768, 780), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(157, 158), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 37, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(491, 505), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(768, 780), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(74, 124), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 20, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(211, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(285, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(345, 406), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(416, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(491, 505), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(506, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 27, new IntPred(583, 618), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(686, 767), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 26, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 22, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 3, new IntPred(125, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(157, 158), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(159, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(211, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(246, 284), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 13, new IntPred(407, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(416, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(506, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(583, 618), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(619, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(686, 767), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(781, 848), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(849, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(74, 124), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(125, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(149, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(157, 158), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(159, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 14, new IntPred(211, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(246, 284), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(285, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(345, 406), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(407, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(416, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(491, 505), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(506, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(583, 618), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(619, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(686, 767), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(768, 780), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(781, 848), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 39, new IntPred(849, null), 'a'));
return trans;
}

}
