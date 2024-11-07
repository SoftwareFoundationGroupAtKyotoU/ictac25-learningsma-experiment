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
public class Random40States20SigmaE20240822005034{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(288, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(453, 528), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(281, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(288, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 33, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 33, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 28, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(453, 528), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 28, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 32, new IntPred(688, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 39, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 33, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 35, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(388, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(453, 528), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 28, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(281, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(288, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(453, 528), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 25, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 39, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 39, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 30, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 30, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 27, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(453, 528), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 22, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(281, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 30, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 36, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 24, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(388, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(572, 602), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(688, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(288, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 30, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(232, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 27, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(388, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(232, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(288, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(572, 602), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(688, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 33, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 11, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(453, 528), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(688, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 31, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(288, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(388, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 30, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(572, 602), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 35, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(232, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 22, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 26, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(288, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(388, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 38, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(288, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(232, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 15, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 24, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(281, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 23, new IntPred(388, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 15, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 6, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 19, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 7, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 6, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 23, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 21, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(453, 528), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 4, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 1, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(288, 303), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(688, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 13, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 12, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 37, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(232, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 33, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(572, 602), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 26, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 21, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(688, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(281, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(688, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(232, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(281, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(453, 528), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 28, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(281, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 13, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 28, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(281, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 40, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 27, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(572, 602), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 27, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 30, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(232, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(388, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 24, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(688, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(763, 766), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(335, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(388, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 12, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 31, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(45, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(57, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 11, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 7, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(281, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(453, 528), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 2, new IntPred(603, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 14, new IntPred(156, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 37, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 37, new IntPred(304, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(388, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(572, 602), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 22, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(745, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(21, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(70, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(232, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 37, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 1, new IntPred(453, 528), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(529, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(688, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(745, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(767, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 22, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(45, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 25, new IntPred(70, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(281, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(388, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(529, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(572, 602), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 20, new IntPred(767, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 11, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(21, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(57, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(156, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(232, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(288, 303), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(304, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(335, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(388, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(453, 528), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(572, 602), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 13, new IntPred(603, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(688, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(763, 766), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(767, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(21, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(45, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(57, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(70, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(156, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(232, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(281, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(288, 303), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(304, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(335, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(388, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(453, 528), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(529, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(572, 602), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(603, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(688, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(745, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(763, 766), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(767, null), 'c'));
return trans;
}

}
