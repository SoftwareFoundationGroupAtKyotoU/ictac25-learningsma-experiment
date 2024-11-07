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
public class Random40States10SigmaE20240822003543{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 25, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(119, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(212, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(0, 24), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(25, 118), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 39, new IntPred(25, 118), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(212, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 32, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(468, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 28, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(119, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(304, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(0, 24), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 34, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 39, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(212, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 34, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 39, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(119, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 39, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(551, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 29, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(212, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(468, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(25, 118), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 24, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(551, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(304, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(400, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 30, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 21, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 26, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 36, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 30, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(119, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(468, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 37, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(119, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(400, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 33, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(119, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(400, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(551, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(25, 118), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(400, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(25, 118), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 35, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 23, new IntPred(25, 118), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(119, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 29, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 34, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(304, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 25, new IntPred(25, 118), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 2, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(212, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 7, new IntPred(304, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 24, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(468, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 17, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(0, 24), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 9, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 23, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(468, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(0, 24), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 19, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(468, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 38, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(551, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 29, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(25, 118), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(304, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(468, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(25, 118), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(304, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 22, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 10, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(551, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(119, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 31, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(304, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 27, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(0, 24), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 12, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(0, 24), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(25, 118), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 7, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(304, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(400, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 13, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(212, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(551, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(212, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(551, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(0, 24), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(304, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(400, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(468, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 24, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(119, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(400, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(416, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(551, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(0, 24), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(212, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(400, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(468, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 1, new IntPred(0, 24), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 10, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(304, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(468, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(513, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(0, 24), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(25, 118), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(551, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(0, 24), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(119, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(212, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(304, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(400, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(416, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(468, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(513, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(551, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(0, 24), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(25, 118), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(119, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 8, new IntPred(212, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 11, new IntPred(304, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(400, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(416, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(468, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(513, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 19, new IntPred(551, null), 'c'));
return trans;
}

}
