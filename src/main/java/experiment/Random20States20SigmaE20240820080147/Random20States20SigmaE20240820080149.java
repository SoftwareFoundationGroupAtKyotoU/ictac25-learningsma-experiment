package experiment.Random20States20SigmaE20240820080147;
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
public class Random20States20SigmaE20240820080149{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(74, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(120, 128), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(129, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(180, 216), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(217, 300), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(301, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(400, 491), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(492, 590), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(591, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(653, 661), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(662, 730), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(731, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(805, 873), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(874, 878), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(879, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(930, 1017), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(1018, 1049), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(1050, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(74, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(120, 128), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(129, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(180, 216), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(217, 300), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(301, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(400, 491), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(492, 590), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(591, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(653, 661), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(662, 730), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(731, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(805, 873), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(874, 878), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(879, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(930, 1017), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(1018, 1049), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(1050, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(74, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(120, 128), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(129, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(180, 216), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(217, 300), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(301, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(400, 491), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(492, 590), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(591, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(653, 661), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(662, 730), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(731, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(805, 873), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(874, 878), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(879, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(930, 1017), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(1018, 1049), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(1050, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(74, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(120, 128), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(129, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(180, 216), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(217, 300), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(301, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(400, 491), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(492, 590), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(653, 661), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(662, 730), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(731, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(805, 873), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(874, 878), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(879, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(930, 1017), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(1018, 1049), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(1050, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(74, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(120, 128), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(129, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(180, 216), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(217, 300), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(301, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(400, 491), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(492, 590), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(653, 661), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(662, 730), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(731, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(805, 873), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(874, 878), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(879, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(930, 1017), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(1018, 1049), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(1050, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(74, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(120, 128), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(129, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(180, 216), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(217, 300), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(301, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(400, 491), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(492, 590), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(591, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(653, 661), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(662, 730), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(731, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(805, 873), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(874, 878), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(879, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(930, 1017), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(1018, 1049), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(1050, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(74, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(120, 128), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(129, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(180, 216), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(217, 300), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(301, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(400, 491), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(492, 590), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(591, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(653, 661), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(662, 730), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(731, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(805, 873), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(874, 878), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(879, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(930, 1017), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(1018, 1049), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(1050, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(74, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(120, 128), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(129, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(180, 216), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(217, 300), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(301, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(400, 491), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(492, 590), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(653, 661), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(662, 730), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(731, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(805, 873), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(874, 878), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(879, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(930, 1017), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(1018, 1049), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(1050, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(74, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(120, 128), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(129, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(180, 216), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(217, 300), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(301, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(400, 491), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(492, 590), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(653, 661), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(662, 730), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(731, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(805, 873), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(874, 878), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(879, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(930, 1017), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(1018, 1049), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(1050, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(74, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(120, 128), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(129, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(180, 216), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(217, 300), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(301, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(400, 491), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(492, 590), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(653, 661), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(662, 730), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(731, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(805, 873), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(874, 878), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(879, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(930, 1017), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(1018, 1049), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(1050, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(74, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(120, 128), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(129, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(180, 216), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(217, 300), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(301, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(400, 491), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(492, 590), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(653, 661), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(662, 730), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(731, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(805, 873), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(874, 878), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(879, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(930, 1017), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(1018, 1049), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(1050, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(74, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(120, 128), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(129, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(180, 216), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(217, 300), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(301, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(400, 491), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(492, 590), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(591, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(653, 661), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(662, 730), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(731, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(805, 873), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(874, 878), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(879, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(930, 1017), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(1018, 1049), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(1050, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(74, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(120, 128), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(129, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(180, 216), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(217, 300), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(301, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(400, 491), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(492, 590), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(591, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(653, 661), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(662, 730), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(731, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(805, 873), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(874, 878), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(879, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(930, 1017), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(1018, 1049), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(1050, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(74, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(120, 128), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(129, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(180, 216), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(217, 300), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(301, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(400, 491), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(492, 590), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(653, 661), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(662, 730), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(731, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(805, 873), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(874, 878), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(879, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(930, 1017), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(1018, 1049), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(1050, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(74, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(120, 128), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(129, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(180, 216), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(217, 300), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(301, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(400, 491), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(492, 590), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(653, 661), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(662, 730), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(731, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(805, 873), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(874, 878), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(879, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(930, 1017), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(1018, 1049), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(1050, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(0, 73), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(74, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(120, 128), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(129, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(180, 216), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(217, 300), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(301, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(400, 491), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(492, 590), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(653, 661), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(662, 730), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(731, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(805, 873), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(874, 878), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(879, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(930, 1017), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(1018, 1049), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(1050, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(0, 73), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(74, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(120, 128), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(129, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(180, 216), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(217, 300), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(301, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(400, 491), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(492, 590), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(591, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(653, 661), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(662, 730), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(731, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(805, 873), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(874, 878), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(879, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(930, 1017), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(1018, 1049), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(1050, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(74, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(120, 128), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(129, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(180, 216), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(217, 300), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(301, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(400, 491), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(492, 590), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(653, 661), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(662, 730), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(731, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(805, 873), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(874, 878), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(879, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(930, 1017), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(1018, 1049), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(1050, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(74, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(120, 128), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(129, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(180, 216), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(217, 300), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(301, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(400, 491), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(492, 590), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(653, 661), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(662, 730), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(731, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(805, 873), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(874, 878), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(879, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(930, 1017), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(1018, 1049), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(1050, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(0, 73), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(74, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(120, 128), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(129, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(180, 216), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(217, 300), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(301, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(400, 491), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(492, 590), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(591, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(653, 661), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(662, 730), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(731, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(805, 873), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(874, 878), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(879, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(930, 1017), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(1018, 1049), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(1050, null), 'b'));
return trans;
}

}
