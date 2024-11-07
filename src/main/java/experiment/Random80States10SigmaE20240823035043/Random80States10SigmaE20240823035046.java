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
public class Random80States10SigmaE20240823035046{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 71, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 78, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 47, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 48, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 74, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 50, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 54, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 70, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 51, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 63, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 54, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 53, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 49, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 45, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 71, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 56, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 33, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 44, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 61, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 43, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 44, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 62, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 71, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 80, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 51, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 80, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 78, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 57, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 43, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 79, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 43, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 50, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 71, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 55, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 61, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 43, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 39, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 49, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 58, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 71, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 70, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 55, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 77, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 62, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 55, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 41, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 80, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 72, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 66, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 64, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 75, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 48, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 75, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 64, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 52, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 47, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 52, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 39, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 48, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 74, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 44, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 53, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 63, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 80, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 56, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 77, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 39, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 61, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 69, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 61, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 76, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 59, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 72, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 47, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 29, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 61, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 61, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 47, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 47, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 77, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 49, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 55, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 80, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 31, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 71, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 51, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 77, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 72, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 58, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 59, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 58, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 67, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 23, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 74, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 62, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 44, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 73, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 76, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 75, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 72, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 55, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 73, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 44, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 73, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 9, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 41, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 56, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 55, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 44, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 38, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 54, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 44, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 53, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 29, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 79, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 43, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 60, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 41, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 80, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 79, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 41, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 69, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 70, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 74, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 12, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 63, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 79, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 52, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 65, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 51, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 51, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 63, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 76, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 59, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 40, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 47, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 67, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 66, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 16, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 71, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 68, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 71, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 53, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 44, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 67, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 79, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 70, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 74, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 63, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 72, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 58, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 56, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 72, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 73, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 66, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 41, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 30, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 72, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 66, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 76, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 10, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 46, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 61, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 49, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 1, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 73, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 56, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 61, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 61, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 49, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 77, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 53, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 45, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 59, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 52, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 47, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 71, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 56, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 54, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 77, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 20, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 64, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 61, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 50, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 76, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 54, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 73, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 75, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 75, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 51, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 43, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 36, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 52, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 71, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 52, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 10, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 73, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 41, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 31, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 69, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 13, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 72, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 6, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 37, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 61, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 3, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 6, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 34, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 28, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 12, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 1, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 6, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 32, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 37, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 14, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 31, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 38, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 56, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 19, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 32, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 69, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 27, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 60, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 23, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 6, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 69, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 4, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 21, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 49, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 12, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 16, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 63, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 76, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 52, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 54, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 9, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 42, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 80, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 16, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 40, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 14, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 39, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 26, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 80, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 18, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 3, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 78, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 22, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 74, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 20, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 44, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 4, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 52, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 2, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 34, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 72, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 20, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 13, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 61, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 68, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 18, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 78, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 8, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 21, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 45, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 53, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 57, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 56, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 59, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 77, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 40, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 71, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 60, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 71, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 15, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 80, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 74, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 24, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 25, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 5, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 31, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 71, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 30, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 73, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 23, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 3, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 62, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 76, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 73, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 77, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 23, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 49, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 77, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 40, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 27, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 11, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 62, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 58, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 46, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 16, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 24, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 8, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 54, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 73, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 73, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 13, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 25, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 63, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 35, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 17, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 47, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 24, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 23, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 59, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 7, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 12, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 9, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 51, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 54, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 23, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 9, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 73, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 47, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 32, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 59, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 78, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 38, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 50, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 3, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 55, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 49, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 42, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 25, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 24, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 23, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 70, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 70, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 26, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 52, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 55, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 5, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 31, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 2, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 39, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 18, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 52, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 78, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 27, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 33, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 58, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 24, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 2, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 34, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 60, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 77, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 80, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 62, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 30, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 15, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 71, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 9, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 67, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 20, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 14, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 21, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 30, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 7, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 79, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 68, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 40, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 36, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 74, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 45, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 49, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 40, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 77, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 52, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 26, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 36, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 58, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 67, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 69, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 7, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 4, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 40, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 41, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 52, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 57, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 58, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 7, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 1, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 18, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 54, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 61, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 28, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 36, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 21, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 56, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 42, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 33, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 72, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 68, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 10, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 42, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 4, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 31, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 78, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 24, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 20, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 61, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 29, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 67, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 3, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 1, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 64, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 13, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 56, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 58, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 9, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 16, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 53, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 48, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 1, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 53, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 20, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 9, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 70, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 14, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 17, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 70, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 71, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 47, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 8, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 74, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 7, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 32, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 74, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 31, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 50, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 13, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 79, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 25, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 74, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 69, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 7, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 21, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 61, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 75, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 22, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 43, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 50, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 42, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 11, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 35, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 78, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 11, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 32, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 53, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 72, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 24, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 7, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 38, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 51, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 50, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 68, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 66, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 66, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 21, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 58, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 74, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 52, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 55, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 68, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 34, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(373, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 63, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 49, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 52, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 28, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 56, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 65, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 25, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 52, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 61, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 23, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 49, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 40, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 45, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 23, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 56, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 70, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 40, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 57, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 65, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 28, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 31, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 20, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 47, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 45, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 23, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 3, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 38, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 13, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 70, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 51, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 30, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 48, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 4, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 2, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 32, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 46, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 75, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 33, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 38, new IntPred(311, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 66, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 39, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 67, new IntPred(0, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 62, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 38, new IntPred(127, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 71, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(197, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 8, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 23, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 25, new IntPred(311, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 49, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 67, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 39, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 33, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 77, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 19, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 21, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 18, new IntPred(247, 267), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 10, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 14, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 70, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 66, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 4, new IntPred(0, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 25, new IntPred(71, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 58, new IntPred(168, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 26, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 79, new IntPred(247, 267), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 25, new IntPred(268, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 20, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 60, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 10, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 59, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 75, new IntPred(71, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(127, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 39, new IntPred(168, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 19, new IntPred(197, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 45, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 33, new IntPred(268, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 38, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 13, new IntPred(373, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 28, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 32, new IntPred(0, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 40, new IntPred(71, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(127, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 56, new IntPred(168, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 17, new IntPred(197, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 79, new IntPred(247, 267), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(268, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 70, new IntPred(311, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 15, new IntPred(373, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(466, null), 'b'));
return trans;
}

}
