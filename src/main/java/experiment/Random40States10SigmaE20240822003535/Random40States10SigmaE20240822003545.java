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
public class Random40States10SigmaE20240822003545{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(97, 100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(97, 100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(259, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(334, 335), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 24, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(101, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 32, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 35, new IntPred(97, 100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(334, 335), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 27, new IntPred(363, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(101, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 25, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(89, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(128, 215), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 22, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 21, new IntPred(89, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(128, 215), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(97, 100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(101, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(363, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(101, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 25, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 24, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(89, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(259, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(363, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(89, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 37, new IntPred(101, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(259, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(101, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 31, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(101, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 27, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(97, 100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 28, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(259, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(334, 335), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 21, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(363, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(89, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(259, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(363, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(259, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(259, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 12, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 21, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(101, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 24, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 21, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(97, 100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(259, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(334, 335), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 24, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(89, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(334, 335), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 19, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(259, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 32, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(334, 335), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 15, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(97, 100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(101, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(216, 258), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(101, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 18, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(89, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 24, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(334, 335), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 5, new IntPred(363, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(128, 215), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 15, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 2, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(363, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(363, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 7, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 28, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(259, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 20, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 28, new IntPred(363, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(97, 100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(128, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 20, new IntPred(259, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(334, 335), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 20, new IntPred(336, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(89, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(97, 100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(101, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(128, 215), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(216, 258), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(336, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(363, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(89, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(97, 100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(101, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(128, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(216, 258), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(259, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(334, 335), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(336, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(363, null), 'c'));
return trans;
}

}
