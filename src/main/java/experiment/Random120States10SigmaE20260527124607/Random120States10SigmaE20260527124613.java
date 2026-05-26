package experiment.Random120States10SigmaE20260527124607;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import experiment.BenchmarkLog;
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
public class Random120States10SigmaE20260527124613{
public static void main(String[] args){
try{
BooleanAlgebra<IntPred, Integer> ba1 = new BoundedIntegerSolver(0, null);
boolean learnerDebug = BenchmarkLog.learnerDebugEnabled();
boolean captureTableStats = BenchmarkLog.captureTableStatsEnabled();
boolean effectiveLearnerDebug = learnerDebug || captureTableStats;
SymbolicMealyAutomatonLearner<IntPred, Integer, Character> learner = new SymbolicMealyAutomatonLearner<IntPred, Integer, Character>(effectiveLearnerDebug);
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
trans.addAll(createTransitionsState81());
trans.addAll(createTransitionsState82());
trans.addAll(createTransitionsState83());
trans.addAll(createTransitionsState84());
trans.addAll(createTransitionsState85());
trans.addAll(createTransitionsState86());
trans.addAll(createTransitionsState87());
trans.addAll(createTransitionsState88());
trans.addAll(createTransitionsState89());
trans.addAll(createTransitionsState90());
trans.addAll(createTransitionsState91());
trans.addAll(createTransitionsState92());
trans.addAll(createTransitionsState93());
trans.addAll(createTransitionsState94());
trans.addAll(createTransitionsState95());
trans.addAll(createTransitionsState96());
trans.addAll(createTransitionsState97());
trans.addAll(createTransitionsState98());
trans.addAll(createTransitionsState99());
trans.addAll(createTransitionsState100());
trans.addAll(createTransitionsState101());
trans.addAll(createTransitionsState102());
trans.addAll(createTransitionsState103());
trans.addAll(createTransitionsState104());
trans.addAll(createTransitionsState105());
trans.addAll(createTransitionsState106());
trans.addAll(createTransitionsState107());
trans.addAll(createTransitionsState108());
trans.addAll(createTransitionsState109());
trans.addAll(createTransitionsState110());
trans.addAll(createTransitionsState111());
trans.addAll(createTransitionsState112());
trans.addAll(createTransitionsState113());
trans.addAll(createTransitionsState114());
trans.addAll(createTransitionsState115());
trans.addAll(createTransitionsState116());
trans.addAll(createTransitionsState117());
trans.addAll(createTransitionsState118());
trans.addAll(createTransitionsState119());
trans.addAll(createTransitionsState120());
SymbolicMealyAutomaton<IntPred, Integer, Character> example1 = SymbolicMealyAutomaton.MkSMA(trans,init,ba1);
example1 = SymbolicMealyAutomaton.getNormalized(example1,ba1);
example1 = SymbolicMealyAutomaton.getClean(example1,ba1);
example1 = SymbolicMealyAutomaton.getMinimal(example1, ba1);
SymbolicMealyAutomatonOracle<IntPred, Integer, Character> oracle = BenchmarkLog.wrap(
            new SymbolicMealyAutomatonOracle<IntPred, Integer, Character>(example1,ba1));
java.io.PrintStream originalOut = System.out;
BenchmarkLog.LearnerDebugPrintStream learnerOut = captureTableStats ? new BenchmarkLog.LearnerDebugPrintStream(originalOut, learnerDebug) : null;
SymbolicMealyAutomaton<IntPred, Integer, Character> learned;
try {
if (learnerOut != null) {
System.setOut(learnerOut);
}
learned = learner.learn(oracle, ba1);
} finally {
if (learnerOut != null) {
learnerOut.flush();
System.setOut(originalOut);
}
}
BenchmarkLog.printSummary(oracle, learnerOut);
} catch (TimeoutException e) {
}
}
private static List<SFAMove<IntPred, Integer>> createTransitionsState1() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 111, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 97, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 98, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 92, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 84, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 89, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 84, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 82, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 44, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 114, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 112, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 59, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 117, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 79, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 100, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 119, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 53, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 47, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 58, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 111, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 48, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 90, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 41, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 111, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 77, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 50, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 60, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 112, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 90, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 108, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 111, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 45, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 74, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 33, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 42, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 120, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 60, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 86, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 87, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 94, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 80, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 103, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 98, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 102, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 116, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 47, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 78, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 104, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 84, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 110, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 72, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 70, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 80, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 47, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 42, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 110, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 91, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 104, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 56, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 66, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 108, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 113, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 47, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 102, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 72, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 109, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 80, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 100, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 89, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 96, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 24, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 92, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 75, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 65, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 66, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 66, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 55, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 77, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 72, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 114, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 78, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 79, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 46, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 47, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 44, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 104, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 44, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 56, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 52, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 86, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 114, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 63, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 59, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 65, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 104, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 71, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 82, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 74, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 42, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 117, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 99, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 60, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 103, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 88, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 64, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 115, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 29, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 120, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 108, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 76, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 116, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 70, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 85, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 91, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 110, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 54, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 92, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 96, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 118, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 46, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 59, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 80, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 114, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 90, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 74, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 43, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 55, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 80, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 100, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 44, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 71, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 65, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 88, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 52, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 102, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 48, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 15, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 79, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 87, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 85, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 45, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 101, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 63, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 44, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 61, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 69, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 91, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 48, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 55, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 80, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 51, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 108, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 100, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 41, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 63, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 97, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 66, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 71, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 118, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 107, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 73, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 78, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 23, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 47, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 72, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 54, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 95, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 78, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 104, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 89, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 83, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 22, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 72, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 76, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 114, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 55, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 70, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 73, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 55, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 118, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 76, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 55, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 89, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 55, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 10, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 92, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 105, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 110, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 71, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 65, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 52, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 118, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 55, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 91, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 48, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 77, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 110, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 104, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 99, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 88, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 111, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 86, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 8, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 81, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 84, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 8, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 106, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 63, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 86, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 106, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 48, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 116, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 56, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 108, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 98, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 109, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 93, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 109, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 82, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 106, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 80, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 51, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 89, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 113, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 115, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 85, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 89, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 44, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 106, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 65, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 111, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 42, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 106, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 80, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 104, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 87, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 88, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 88, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 68, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 90, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 120, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 61, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 69, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 74, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 112, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 76, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 107, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 108, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 96, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 45, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 53, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 100, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 79, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 3, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 42, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 46, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 119, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 99, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 116, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 112, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 10, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 120, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 110, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 85, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 80, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 91, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 61, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 29, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 43, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 117, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 60, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 80, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 106, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 52, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 120, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 4, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 61, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 32, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 58, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 3, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 82, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 68, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 84, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 91, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 91, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 18, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 36, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 108, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 62, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 55, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 111, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 63, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 96, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 104, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 84, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 56, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 10, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 24, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 12, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 28, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 30, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 98, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 84, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 116, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 81, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 11, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 46, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 45, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 78, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 77, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 64, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 43, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 37, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 105, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 87, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 99, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 9, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 58, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 81, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 117, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 78, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 92, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 96, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 107, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 43, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 96, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 7, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 57, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 32, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 69, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 116, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 13, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 14, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 38, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 55, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 110, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 67, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 32, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 15, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 30, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 21, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 58, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 89, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 113, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 116, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 116, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 58, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 34, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 10, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 57, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 89, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 100, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 65, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 120, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 24, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 47, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 6, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 26, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 101, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 69, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 3, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 28, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 46, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 72, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 19, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 53, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 67, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 3, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 83, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 15, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 38, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 118, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 65, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 86, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 75, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 96, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 14, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 85, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 4, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 101, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 46, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 81, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 6, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 59, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 112, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 109, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 101, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 119, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 56, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 85, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 112, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 33, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 75, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 80, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 107, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 116, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 47, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 118, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 17, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 93, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 23, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 111, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 57, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 11, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 30, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 9, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 34, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 87, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 72, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 89, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 104, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 99, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 22, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 86, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 47, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 13, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 64, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 66, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 4, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 58, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 114, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 66, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 81, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 45, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 89, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 11, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 88, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 111, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 101, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 69, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 20, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 62, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 111, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 65, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 45, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 72, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 57, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 108, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 74, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 78, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 106, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 116, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 54, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 84, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 81, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 79, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 77, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 23, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 105, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 62, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 8, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 119, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 116, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 104, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 47, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 110, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 94, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 109, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 86, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 25, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 29, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 69, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 14, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 4, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 27, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 17, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 36, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 95, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 100, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 45, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 95, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 112, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 117, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 97, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 91, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 94, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 95, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 8, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 57, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 57, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 98, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 4, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 89, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 37, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 82, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 118, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 85, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 75, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 105, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 20, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 107, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 100, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 87, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 42, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 89, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 91, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 57, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 74, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 97, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 54, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 116, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 52, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 11, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 120, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 34, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 64, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 45, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 87, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 45, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 28, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 29, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 118, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 33, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 99, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 95, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 16, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 96, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 76, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 62, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 32, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 24, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 35, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 107, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 51, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 62, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 42, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 34, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 19, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 12, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 95, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 65, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 49, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 101, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 106, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 97, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 116, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 107, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 23, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 34, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 114, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 118, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 92, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 45, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 39, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 120, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 52, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 99, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 94, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 32, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 103, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 51, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 105, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 15, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 85, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 12, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 8, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 33, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 38, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 8, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 54, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 101, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 103, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 20, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 91, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 14, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 63, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 25, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 64, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 114, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 27, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 82, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 112, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 74, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 52, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 12, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 74, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 112, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 110, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 88, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 94, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 113, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 45, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 110, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 100, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 114, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 111, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 82, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 66, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 85, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 78, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 57, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 92, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 59, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 45, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 113, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 99, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 72, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 48, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 54, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 1, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 75, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 38, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 49, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 65, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 101, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 57, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 81, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 55, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 105, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 84, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 88, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 30, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 53, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 59, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 82, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 56, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 20, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 11, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 57, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 14, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 69, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 105, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 107, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 26, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 53, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 59, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 32, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 72, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 59, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 11, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 62, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 108, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 52, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 38, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 5, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 90, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 117, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 88, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 103, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 102, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 67, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 17, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 68, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 112, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 80, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 120, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 3, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 88, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 92, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 61, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 27, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 104, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 99, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 67, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 24, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 72, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 50, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 93, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 6, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 88, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 102, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 106, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 12, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 107, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 56, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 91, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 75, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 64, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 56, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 49, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 110, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 94, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 108, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 89, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 82, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 85, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 47, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 1, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 60, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 1, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 101, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 98, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 31, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 8, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 91, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 118, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 101, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 24, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 9, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 40, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 83, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 44, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 9, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 33, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 63, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 94, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 119, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 103, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 27, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 27, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 80, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 109, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 73, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 28, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 53, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 47, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 38, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 65, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 31, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 100, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 105, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 37, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 26, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 100, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 82, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 23, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 59, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 90, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 61, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 69, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 28, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 105, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 111, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 8, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 117, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 40, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 5, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 44, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 74, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 48, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 49, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 6, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 105, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 58, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 54, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 38, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 58, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 19, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 1, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 117, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 15, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 33, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 96, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 53, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 27, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 44, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 60, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 37, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 109, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 112, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 8, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 108, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 59, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 39, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 81, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 35, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 81, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 58, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 45, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 22, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 42, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 6, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 94, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 65, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 91, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 104, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 46, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 20, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 20, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 108, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 106, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 120, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 56, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 71, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 57, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 33, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 25, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 82, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 68, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 44, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 71, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 119, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 61, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 32, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 8, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 99, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 114, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 54, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 86, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 44, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 16, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 19, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 22, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 67, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 74, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 19, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 45, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 113, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 105, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 37, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 67, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 75, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 83, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 91, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 49, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 111, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 78, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 24, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 100, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 5, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 43, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 90, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 105, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 81, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 29, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 95, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 105, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 117, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 49, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 57, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 108, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 73, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 110, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 28, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 7, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 53, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 52, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 52, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 72, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 19, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 70, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 2, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 6, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 63, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 17, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 117, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 3, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 72, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 21, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 91, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 67, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 86, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 120, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 71, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 36, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 83, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 96, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 98, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 86, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 108, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 15, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 44, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 18, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 31, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 14, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 97, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 109, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 20, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 61, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 62, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 35, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 78, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 118, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 106, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 86, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 113, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 7, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 32, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 30, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 3, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 22, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 49, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 71, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 116, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 37, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 52, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 64, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 104, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 85, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 104, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 40, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 89, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 68, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 78, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 113, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 79, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 49, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 9, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 55, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 34, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 116, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 31, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 7, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 44, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 80, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 62, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 18, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 25, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 67, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 90, new IntPred(282, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 81, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 48, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 74, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 67, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 96, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 72, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 95, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 33, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 101, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 38, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 101, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 26, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 119, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 28, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 15, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 47, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 1, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 73, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 94, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 77, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 54, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 5, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 74, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 23, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 12, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 42, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 54, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 86, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 51, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 70, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 70, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 115, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 69, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 46, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 97, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 113, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 37, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 82, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 89, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 5, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 34, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 29, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 71, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 39, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 82, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 12, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 81, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 89, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 89, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 100, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 118, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 68, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 9, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 117, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 103, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 95, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 17, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 107, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 117, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 34, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 49, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 9, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 23, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 20, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 81, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 22, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 10, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 10, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 95, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 10, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 17, new IntPred(357, 391), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 57, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 79, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 39, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 116, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 81, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 58, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 73, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 50, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 81, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 74, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 32, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 89, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 63, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 98, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 51, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 82, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 23, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 119, new IntPred(190, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 77, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 96, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 9, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 35, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 113, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 47, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 61, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 55, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 55, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 38, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 39, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 45, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 6, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 119, new IntPred(427, 515), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 61, new IntPred(516, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 54, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 18, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 12, new IntPred(126, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 29, new IntPred(181, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 55, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 69, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 97, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 42, new IntPred(392, 426), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 27, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 47, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 70, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 30, new IntPred(69, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 6, new IntPred(126, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 119, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 36, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 111, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 14, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 89, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 109, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 43, new IntPred(516, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 34, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 40, new IntPred(69, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 53, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 5, new IntPred(181, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 20, new IntPred(190, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 42, new IntPred(282, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 101, new IntPred(357, 391), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 64, new IntPred(392, 426), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 105, new IntPred(427, 515), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 25, new IntPred(516, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 76, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 80, new IntPred(69, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 117, new IntPred(126, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 38, new IntPred(181, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 78, new IntPred(190, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 54, new IntPred(282, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 112, new IntPred(357, 391), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 94, new IntPred(392, 426), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 7, new IntPred(427, 515), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 2, new IntPred(516, null), 'a'));
return trans;
}

}
