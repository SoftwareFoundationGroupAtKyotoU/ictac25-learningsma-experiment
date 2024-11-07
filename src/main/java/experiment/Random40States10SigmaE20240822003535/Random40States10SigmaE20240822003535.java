package experiment.Random40States10SigmaE20240822003535;
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
public class Random40States10SigmaE20240822003535{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(59, 141), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(315, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 32, new IntPred(153, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 35, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(153, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(209, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 35, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(315, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 34, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(153, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 40, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(59, 141), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(209, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(315, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(59, 141), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(209, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(153, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(209, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 26, new IntPred(315, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 37, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 32, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 40, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 38, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 30, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 23, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(59, 141), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 37, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 28, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(315, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(209, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(315, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(59, 141), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 40, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 35, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(59, 141), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(315, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 19, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(59, 141), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 21, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 1, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 1, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 7, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(153, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(153, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 19, new IntPred(153, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 31, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(315, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(47, 58), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 14, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 31, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(59, 141), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 23, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(315, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(59, 141), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(209, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(315, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 16, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(31, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(47, 58), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(142, 152), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 24, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(209, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(274, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 34, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 34, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(153, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 34, new IntPred(209, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 37, new IntPred(315, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(2, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(209, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(2, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(59, 141), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(153, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(209, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 11, new IntPred(31, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(59, 141), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(142, 152), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(153, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(209, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(274, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(315, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(2, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(31, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(47, 58), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(59, 141), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(142, 152), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(153, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(209, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(274, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(315, null), 'a'));
return trans;
}

}
