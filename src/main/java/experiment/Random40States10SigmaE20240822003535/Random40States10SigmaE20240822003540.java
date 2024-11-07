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
public class Random40States10SigmaE20240822003540{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(275, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(388, 466), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(76, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(275, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(467, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 32, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(360, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(388, 466), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 38, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(76, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(76, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(275, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(467, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(360, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(467, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(76, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(360, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 30, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(275, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 40, new IntPred(388, 466), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(467, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(275, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(360, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 38, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(388, 466), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(76, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 35, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 37, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(275, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 26, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(360, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 7, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(388, 466), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(76, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(275, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(388, 466), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(76, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(275, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(360, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(388, 466), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 12, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 32, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(467, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 12, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 12, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 7, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(76, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 21, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(275, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 12, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 12, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(360, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(467, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 15, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(467, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 28, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 22, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(360, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 28, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 1, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 27, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 40, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(360, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(388, 466), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(467, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(388, 466), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(76, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 10, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(275, 359), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(360, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 3, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(467, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(111, 162), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(163, 199), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 22, new IntPred(222, 274), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(388, 466), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(467, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(76, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(111, 162), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(163, 199), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 26, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(200, 221), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 20, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 26, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(467, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 36, new IntPred(76, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 3, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(200, 221), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(222, 274), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(275, 359), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(360, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(388, 466), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(467, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(76, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(111, 162), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(163, 199), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(200, 221), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(222, 274), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(275, 359), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(360, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(388, 466), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(467, null), 'b'));
return trans;
}

}
