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
public class Random40States10SigmaE20240822003546{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(12, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 25, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(12, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(340, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 38, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 21, new IntPred(220, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 24, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(12, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 30, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 39, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 38, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(340, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 29, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(220, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(340, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 27, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(340, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 27, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 29, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 27, new IntPred(340, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 38, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 7, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 17, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 7, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 40, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(12, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 1, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 1, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 21, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 28, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(220, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 40, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(220, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 9, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 15, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(220, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(340, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(12, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(276, 339), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 16, new IntPred(340, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 31, new IntPred(12, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 28, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 28, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(203, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 29, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 23, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(340, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 21, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(220, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(76, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(152, 202), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 1, new IntPred(340, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(12, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(203, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(346, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(347, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(12, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(220, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(340, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(220, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 25, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(340, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(347, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(12, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(76, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 36, new IntPred(152, 202), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(220, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 36, new IntPred(276, 339), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 36, new IntPred(346, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(347, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 8, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(12, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(76, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(152, 202), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 8, new IntPred(203, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(220, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(276, 339), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(340, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(346, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(347, null), 'b'));
return trans;
}

}
