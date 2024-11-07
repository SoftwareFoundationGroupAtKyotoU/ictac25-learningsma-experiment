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
public class Random40States20SigmaE20240822005043{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(643, 710), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(839, 930), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 34, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 23, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(345, 429), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(839, 930), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(345, 429), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(643, 710), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(839, 930), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(76, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 21, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 25, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(931, 994), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 32, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(345, 429), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 27, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(643, 710), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 25, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(643, 710), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(839, 930), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 27, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(0, 40), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 22, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 25, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 23, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 34, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 32, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 39, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(931, 994), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 29, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(345, 429), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 38, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(41, 51), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(76, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(76, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(931, 994), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 24, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 24, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 28, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 28, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(0, 40), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 39, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 27, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 27, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 30, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(931, 994), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 21, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(76, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 30, new IntPred(41, 51), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 11, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 11, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 38, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(0, 40), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(41, 51), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 22, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(0, 40), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(345, 429), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 34, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(839, 930), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(839, 930), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 17, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 15, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(345, 429), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 40, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 22, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(345, 429), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 23, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 15, new IntPred(643, 710), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 9, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(0, 40), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 19, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(345, 429), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 7, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 6, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(0, 40), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 29, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 27, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 29, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(345, 429), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 12, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(643, 710), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 4, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 40, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 12, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 21, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 32, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(643, 710), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(839, 930), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 37, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(643, 710), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 22, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 24, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 24, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 28, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 9, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 24, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 40, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 30, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(931, 994), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(52, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 19, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 10, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 10, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 39, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 16, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(41, 51), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(76, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 28, new IntPred(0, 40), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 30, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 30, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 14, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(0, 40), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 5, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(839, 930), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(931, 994), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(0, 40), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 12, new IntPred(41, 51), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 15, new IntPred(613, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(643, 710), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(711, 768), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(769, 838), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(41, 51), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(76, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 30, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(253, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(430, 522), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 11, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 1, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 7, new IntPred(931, 994), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(41, 51), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(76, 81), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 37, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 18, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(430, 522), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(523, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(643, 710), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(711, 768), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(995, 995), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(0, 40), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(105, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(345, 429), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 28, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 12, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(996, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(0, 40), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(67, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 27, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(82, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(253, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(345, 429), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(839, 930), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(931, 994), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(996, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(41, 51), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(52, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(67, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(76, 81), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(82, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(105, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 36, new IntPred(523, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(613, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(769, 838), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(839, 930), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(931, 994), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(995, 995), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(996, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(0, 40), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(41, 51), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(52, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(67, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(76, 81), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(82, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(105, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(253, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(345, 429), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(430, 522), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(523, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(613, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 11, new IntPred(643, 710), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(711, 768), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(769, 838), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(839, 930), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(931, 994), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(995, 995), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(996, null), 'b'));
return trans;
}

}
