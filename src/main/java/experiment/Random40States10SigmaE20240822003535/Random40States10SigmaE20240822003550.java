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
public class Random40States10SigmaE20240822003550{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 21, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(211, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 27, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 31, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 39, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 38, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 36, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 30, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(0, 4), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 25, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(211, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 27, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 32, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 23, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 25, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 17, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 35, new IntPred(0, 4), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 11, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 7, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(211, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(0, 4), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 29, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(211, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 12, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(0, 4), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 7, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(211, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 24, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 31, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(0, 4), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 38, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 38, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 9, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 7, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(211, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(0, 4), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 13, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 39, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(211, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 18, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(211, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(0, 4), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(104, 130), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(328, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(5, 34), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(70, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(211, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(0, 4), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(67, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 28, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 20, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 20, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 20, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 22, new IntPred(5, 34), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(35, 66), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(104, 130), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(131, 210), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(211, 239), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(240, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(328, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(35, 66), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(67, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(70, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(131, 210), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(211, 239), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(240, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(328, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(0, 4), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(5, 34), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(35, 66), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(67, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(70, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(104, 130), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(131, 210), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(211, 239), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(240, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(328, null), 'c'));
return trans;
}

}
