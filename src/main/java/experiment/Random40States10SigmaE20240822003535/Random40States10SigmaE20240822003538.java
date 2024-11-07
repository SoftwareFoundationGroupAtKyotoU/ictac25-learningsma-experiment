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
public class Random40States10SigmaE20240822003538{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(1, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(68, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(247, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 23, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(68, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 23, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 38, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(40, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(68, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(351, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 32, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(68, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(279, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(1, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(40, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(351, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(40, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(68, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(1, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 32, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(247, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(1, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 24, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(1, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 25, new IntPred(13, 39), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 39, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 30, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 39, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(13, 39), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(40, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 32, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(247, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(40, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(68, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(351, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 23, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 38, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(279, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(351, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 28, new IntPred(40, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(279, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 29, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(1, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(68, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 34, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(247, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 21, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(351, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(1, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(247, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(279, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(13, 39), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 33, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(13, 39), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 23, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 35, new IntPred(351, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(40, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(68, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(247, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(351, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 21, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 23, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(1, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 27, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(247, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 27, new IntPred(279, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(40, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(68, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 24, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 9, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(247, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 12, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(351, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 10, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 16, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(13, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 13, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(351, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 40, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 14, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 18, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 25, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(13, 39), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(68, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 24, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(351, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(1, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 10, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(109, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 10, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 19, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 3, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 7, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(13, 39), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 34, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 16, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(177, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(279, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(13, 39), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(40, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(247, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(279, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(351, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(40, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(177, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(247, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(279, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 20, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(1, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(40, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(68, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(109, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(247, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(279, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(351, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 4, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(1, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(13, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(40, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(68, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(109, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(177, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(247, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(279, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(351, null), 'c'));
return trans;
}

}
