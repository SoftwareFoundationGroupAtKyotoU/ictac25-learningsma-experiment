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
public class Random40States10SigmaE20240822003536{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(0, 15), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(16, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(196, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(337, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(0, 15), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 33, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(196, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(337, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 39, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(19, 111), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(0, 15), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 33, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(337, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 29, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(259, 336), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 31, new IntPred(0, 15), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 22, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(19, 111), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(196, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(259, 336), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 21, new IntPred(337, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(19, 111), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 24, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(19, 111), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(196, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(16, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 28, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(16, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 39, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(337, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 21, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(259, 336), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 21, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 40, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 30, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 23, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(259, 336), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 31, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 26, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 21, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(0, 15), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 25, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 24, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 33, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(19, 111), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 23, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 40, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 12, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 15, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(0, 15), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 21, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 40, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 19, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(19, 111), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 13, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(337, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 26, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 31, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(196, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 24, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(259, 336), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(337, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(19, 111), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(259, 336), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(337, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(16, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(16, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(196, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(0, 15), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 27, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 27, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 23, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(0, 15), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(16, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(196, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(0, 15), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(16, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 31, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(220, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(259, 336), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(337, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(361, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 3, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 11, new IntPred(19, 111), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(259, 336), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(427, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(16, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(19, 111), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 14, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(259, 336), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(337, 360), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 20, new IntPred(19, 111), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(112, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(220, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(361, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 28, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(16, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(427, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(0, 15), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(16, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(19, 111), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(112, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(196, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 27, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(259, 336), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(337, 360), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 27, new IntPred(427, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(0, 15), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(16, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(19, 111), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(112, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(196, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(220, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(259, 336), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(337, 360), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(361, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(427, null), 'b'));
return trans;
}

}
