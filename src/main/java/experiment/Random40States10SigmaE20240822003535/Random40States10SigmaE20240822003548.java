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
public class Random40States10SigmaE20240822003548{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(205, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 25, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(141, 204), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(141, 204), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 39, new IntPred(329, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(141, 204), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 35, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 29, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(550, 616), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(141, 204), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(205, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 32, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(141, 204), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(329, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(550, 616), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(141, 204), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(205, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(550, 616), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(141, 204), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 39, new IntPred(205, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(205, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(141, 204), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 29, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 23, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(550, 616), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 38, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(550, 616), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 29, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 34, new IntPred(329, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 26, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(205, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 15, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(550, 616), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(141, 204), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 12, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 35, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 6, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 19, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 19, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(550, 616), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 38, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(205, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(550, 616), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(205, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 28, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(329, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 31, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(550, 616), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(0, 63), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(287, 328), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(329, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 28, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 28, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 23, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(550, 616), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 5, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 25, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 19, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 1, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 7, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 7, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 16, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(329, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(617, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(329, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 25, new IntPred(0, 63), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(64, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 25, new IntPred(205, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(329, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(426, 501), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(502, 549), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(550, 616), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(617, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(64, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(141, 204), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(287, 328), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(329, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(426, 501), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(502, 549), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(617, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(0, 63), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(64, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(141, 204), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(205, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(287, 328), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(329, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(426, 501), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(502, 549), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(550, 616), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(617, null), 'b'));
return trans;
}

}
