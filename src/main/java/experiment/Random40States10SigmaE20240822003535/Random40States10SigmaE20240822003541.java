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
public class Random40States10SigmaE20240822003541{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(517, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(258, 316), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(317, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(517, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 33, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(258, 316), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 38, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 39, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 29, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(517, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(258, 316), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 22, new IntPred(317, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 35, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(517, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 32, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(411, 414), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(517, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 32, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(170, 257), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(258, 316), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 32, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(258, 316), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 23, new IntPred(170, 257), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(411, 414), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(483, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(517, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 30, new IntPred(0, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(317, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 36, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(258, 316), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(411, 414), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(0, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(258, 316), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(411, 414), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(483, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(317, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(411, 414), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 31, new IntPred(483, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(0, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(517, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(0, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(170, 257), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 11, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 22, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 19, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(483, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(517, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 21, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(411, 414), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(517, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(483, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(317, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 13, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 28, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 28, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(317, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(0, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(0, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(258, 316), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(483, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 7, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 39, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(170, 257), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(517, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(0, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(0, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(170, 257), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(317, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 31, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 29, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 25, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(0, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(111, 169), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(317, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(483, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 34, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(170, 257), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 1, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(317, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 22, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(415, 482), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(517, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(111, 169), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(170, 257), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 10, new IntPred(258, 316), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(0, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(86, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(258, 316), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(317, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(411, 414), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(483, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(0, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(86, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 3, new IntPred(170, 257), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(258, 316), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(317, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(411, 414), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 27, new IntPred(415, 482), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(483, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(517, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(0, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(86, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(111, 169), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 11, new IntPred(170, 257), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(258, 316), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(317, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(411, 414), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(415, 482), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(483, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(517, null), 'b'));
return trans;
}

}
