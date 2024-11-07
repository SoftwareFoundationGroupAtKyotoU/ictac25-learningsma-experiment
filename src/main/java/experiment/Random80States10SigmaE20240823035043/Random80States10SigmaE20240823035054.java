package experiment.Random80States10SigmaE20240823035043;
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
public class Random80States10SigmaE20240823035054{
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
trans.addAll(createTransitionsState41());
trans.addAll(createTransitionsState42());
trans.addAll(createTransitionsState43());
trans.addAll(createTransitionsState44());
trans.addAll(createTransitionsState45());
trans.addAll(createTransitionsState46());
trans.addAll(createTransitionsState47());
trans.addAll(createTransitionsState48());
trans.addAll(createTransitionsState49());
trans.addAll(createTransitionsState50());
trans.addAll(createTransitionsState51());
trans.addAll(createTransitionsState52());
trans.addAll(createTransitionsState53());
trans.addAll(createTransitionsState54());
trans.addAll(createTransitionsState55());
trans.addAll(createTransitionsState56());
trans.addAll(createTransitionsState57());
trans.addAll(createTransitionsState58());
trans.addAll(createTransitionsState59());
trans.addAll(createTransitionsState60());
trans.addAll(createTransitionsState61());
trans.addAll(createTransitionsState62());
trans.addAll(createTransitionsState63());
trans.addAll(createTransitionsState64());
trans.addAll(createTransitionsState65());
trans.addAll(createTransitionsState66());
trans.addAll(createTransitionsState67());
trans.addAll(createTransitionsState68());
trans.addAll(createTransitionsState69());
trans.addAll(createTransitionsState70());
trans.addAll(createTransitionsState71());
trans.addAll(createTransitionsState72());
trans.addAll(createTransitionsState73());
trans.addAll(createTransitionsState74());
trans.addAll(createTransitionsState75());
trans.addAll(createTransitionsState76());
trans.addAll(createTransitionsState77());
trans.addAll(createTransitionsState78());
trans.addAll(createTransitionsState79());
trans.addAll(createTransitionsState80());
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 55, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 34, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 45, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 67, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 52, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 68, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 61, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 78, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 42, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 49, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 46, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 73, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 71, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 54, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 24, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 57, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 56, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 42, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 71, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 62, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 46, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 44, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 79, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 45, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 29, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 49, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 65, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 61, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 41, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 59, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 78, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 68, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 35, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 42, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 50, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 64, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 34, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 63, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 65, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 54, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 48, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 48, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 69, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 76, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 67, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 53, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 71, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 70, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 70, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 73, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 51, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 46, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 80, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 53, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 64, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 30, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 73, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 76, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 79, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 43, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 63, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 57, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 72, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 41, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 58, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 52, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 67, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 71, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 67, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 56, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 77, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 42, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 41, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 58, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 68, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 58, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 58, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 78, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 75, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 50, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 46, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 76, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 73, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 68, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 22, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 51, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 59, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 59, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 65, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 30, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 68, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 53, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 45, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 59, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 44, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 42, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 76, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 73, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 71, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 68, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 47, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 45, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 77, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 50, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 47, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 31, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 46, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 56, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 48, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 23, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 4, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 79, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 53, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 54, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 53, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 75, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 29, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 59, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 78, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 79, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 41, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 66, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 52, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 73, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 27, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 63, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 57, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 70, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 31, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 43, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 55, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 52, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 60, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 47, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 46, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 67, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 61, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 44, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 52, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 66, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 64, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 75, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 15, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 56, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 46, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 60, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 41, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 68, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 62, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 76, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 41, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 67, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 78, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 65, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 67, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 52, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 50, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 69, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 77, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 46, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 75, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 72, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 52, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 57, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 55, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 46, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 70, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 42, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 42, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 72, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 76, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 51, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 16, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 58, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 47, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 63, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 43, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 70, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 78, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 43, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 59, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 77, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 1, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 76, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 46, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 47, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 50, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 58, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 50, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 62, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 58, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 11, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 64, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 56, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 76, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 50, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 32, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 3, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 77, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 5, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 10, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 51, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 32, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 56, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 17, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 7, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 28, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 60, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 46, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 45, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 54, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 31, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 17, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 20, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 67, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 9, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 50, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 32, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 60, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 54, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 22, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 67, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 62, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 77, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 58, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 63, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 19, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 51, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 21, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 58, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 33, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 61, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 66, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 74, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 30, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 36, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 6, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 26, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 56, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 37, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 20, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 75, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 27, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 17, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 14, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 39, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 58, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 75, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 5, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 45, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 68, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 8, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 70, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 50, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 37, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 5, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 39, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 27, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 52, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 61, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 34, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 24, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 58, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 14, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 4, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 43, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 68, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 71, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 8, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 63, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 71, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 60, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 45, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 24, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 33, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 5, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 17, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 59, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 27, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 25, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 45, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 2, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 78, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 55, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 22, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 38, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 14, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 53, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 49, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 21, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 34, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 29, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 58, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 68, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 73, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 27, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 14, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 54, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 65, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 10, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 46, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 50, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 28, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 60, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 27, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 80, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 29, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 17, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 59, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 76, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 72, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 61, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 66, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 33, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 6, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 57, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 47, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 60, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 68, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 43, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 70, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 79, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 66, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 8, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 20, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 62, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 10, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 43, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 61, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 50, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 16, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 2, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 19, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 58, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 11, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 13, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 68, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 27, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 65, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 67, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 36, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 10, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 10, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 14, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 47, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 77, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 43, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 9, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 33, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 61, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 68, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 78, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 75, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 32, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 46, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 73, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 7, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 1, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 49, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 14, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 5, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 70, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 56, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 54, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 73, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 20, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 22, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 62, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 34, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 51, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 5, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 34, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 73, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 21, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 60, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 7, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 46, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 74, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 27, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 56, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 37, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 56, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 12, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 8, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 16, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 22, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 65, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 56, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 19, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 57, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 17, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 36, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 70, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 33, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 11, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 18, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 26, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 65, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 74, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 80, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 6, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 36, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 73, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 46, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 50, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 41, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 44, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 66, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 28, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 19, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 19, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 58, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 51, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 41, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 39, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 11, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 4, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 2, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 73, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 6, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 62, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 33, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 69, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 43, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 51, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 37, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 15, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 1, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 35, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 5, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 64, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 4, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 78, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 60, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 16, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 22, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 41, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 48, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 48, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 10, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 65, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 72, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 50, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 47, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 78, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 39, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 45, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 70, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 51, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 21, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 7, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 43, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 49, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 13, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 22, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 26, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 34, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 7, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 72, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 65, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 71, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 30, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 69, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 16, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 17, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 50, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 46, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 47, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 59, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 45, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 66, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 67, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 29, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 41, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 2, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 79, new IntPred(38, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 62, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 10, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 43, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 41, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 1, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 6, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 25, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 60, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 36, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 58, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 20, new IntPred(139, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 22, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 48, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 62, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 41, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 25, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 69, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 25, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 36, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 64, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 48, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 47, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 67, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 74, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 68, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 71, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 73, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 21, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 16, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 25, new IntPred(88, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 56, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 51, new IntPred(168, 172), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 10, new IntPred(173, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 79, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 53, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 8, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 39, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 39, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 55, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 57, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 31, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 30, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 72, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 77, new IntPred(245, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 77, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 70, new IntPred(290, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 49, new IntPred(357, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 48, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 29, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 80, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 18, new IntPred(139, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 11, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 60, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 34, new IntPred(245, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 39, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 29, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 43, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 67, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 3, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 4, new IntPred(88, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 12, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 9, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 41, new IntPred(173, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 4, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 67, new IntPred(268, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 17, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 77, new IntPred(357, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 62, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 37, new IntPred(38, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 39, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 7, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(168, 172), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 75, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 79, new IntPred(268, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(290, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 32, new IntPred(357, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 7, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 65, new IntPred(38, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 67, new IntPred(88, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 46, new IntPred(139, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 38, new IntPred(168, 172), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 75, new IntPred(173, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 5, new IntPred(245, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 37, new IntPred(268, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 24, new IntPred(290, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 74, new IntPred(357, null), 'b'));
return trans;
}

}
