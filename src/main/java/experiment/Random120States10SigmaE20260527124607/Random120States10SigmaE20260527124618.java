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
public class Random120States10SigmaE20260527124618{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 119, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 43, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 25, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 111, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 115, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 116, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 61, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 69, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 86, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 71, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 101, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 102, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 105, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 84, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 67, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 98, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 33, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 61, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 114, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 51, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 88, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 87, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 118, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 70, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 48, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 47, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 43, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 47, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 74, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 56, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 47, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 59, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 85, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 91, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 79, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 74, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 65, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 62, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 77, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 111, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 53, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 54, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 66, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 99, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 43, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 115, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 101, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 112, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 118, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 115, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 58, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 70, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 84, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 55, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 46, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 89, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 84, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 110, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 97, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 54, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 73, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 57, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 24, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 108, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 53, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 62, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 118, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 106, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 78, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 78, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 113, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 86, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 72, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 51, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 51, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 118, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 120, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 116, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 119, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 106, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 73, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 116, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 79, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 112, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 106, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 52, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 47, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 45, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 43, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 53, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 49, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 92, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 68, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 79, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 114, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 43, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 95, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 44, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 105, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 45, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 117, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 38, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 55, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 60, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 104, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 62, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 120, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 100, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 113, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 48, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 49, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 100, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 68, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 49, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 105, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 117, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 60, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 95, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 120, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 98, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 53, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 75, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 93, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 103, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 55, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 78, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 78, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 109, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 70, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 45, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 67, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 90, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 109, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 86, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 60, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 99, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 119, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 66, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 65, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 120, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 68, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 87, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 105, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 54, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 95, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 86, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 58, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 109, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 87, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 69, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 118, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 79, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 113, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 118, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 112, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 112, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 43, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 105, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 94, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 110, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 63, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 115, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 47, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 42, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 113, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 95, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 96, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 84, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 49, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 108, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 65, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 50, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 89, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 69, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 96, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 106, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 76, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 115, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 117, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 45, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 43, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 54, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 87, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 38, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 75, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 111, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 45, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 119, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 107, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 76, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 88, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 108, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 28, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 120, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 75, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 70, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 80, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 61, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 111, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 64, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 43, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 75, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 1, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 57, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 98, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 95, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 92, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 46, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 112, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 110, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 14, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 113, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 85, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 63, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 85, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 70, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 56, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 60, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 84, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 97, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 49, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 92, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 118, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 86, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 61, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 75, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 2, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 86, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 118, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 87, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 99, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 68, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 61, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 102, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 101, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 100, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 41, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 63, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 68, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 78, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 116, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 81, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 68, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 47, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 42, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 110, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 83, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 53, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 98, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 98, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 88, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 61, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 90, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 107, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 88, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 82, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 75, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 82, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 53, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 47, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 38, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 6, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 82, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 22, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 120, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 22, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 110, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 109, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 70, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 97, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 40, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 65, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 93, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 52, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 69, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 58, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 94, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 24, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 98, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 106, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 46, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 59, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 34, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 51, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 41, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 107, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 95, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 112, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 82, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 78, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 88, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 25, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 50, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 56, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 3, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 68, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 57, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 61, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 49, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 57, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 60, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 64, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 96, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 28, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 16, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 37, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 10, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 94, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 42, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 47, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 102, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 116, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 26, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 104, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 97, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 71, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 49, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 45, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 75, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 110, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 93, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 59, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 102, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 53, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 94, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 49, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 4, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 83, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 120, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 84, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 107, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 15, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 20, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 98, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 40, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 56, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 6, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 14, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 104, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 4, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 84, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 57, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 118, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 82, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 93, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 70, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 79, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 9, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 33, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 67, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 70, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 28, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 83, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 7, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 77, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 96, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 32, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 99, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 30, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 115, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 48, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 27, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 99, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 60, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 2, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 60, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 75, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 71, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 105, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 29, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 54, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 8, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 3, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 96, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 13, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 28, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 53, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 23, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 109, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 53, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 34, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 9, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 26, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 109, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 59, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 28, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 62, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 103, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 110, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 18, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 9, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 18, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 10, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 78, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 111, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 14, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 110, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 8, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 56, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 39, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 56, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 105, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 81, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 112, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 101, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 113, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 9, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 12, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 104, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 79, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 66, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 46, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 7, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 110, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 94, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 13, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 67, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 27, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 64, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 21, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 51, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 110, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 29, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 97, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 48, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 65, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 7, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 53, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 51, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 111, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 104, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 72, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 68, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 108, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 85, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 79, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 15, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 44, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 23, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 30, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 88, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 19, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 76, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 18, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 60, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 17, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 28, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 109, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 78, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 118, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 57, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 14, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 14, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 103, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 6, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 14, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 27, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 120, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 114, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 31, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 98, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 120, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 108, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 69, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 78, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 106, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 102, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 110, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 103, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 96, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 115, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 43, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 78, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 72, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 114, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 31, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 4, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 9, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 107, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 92, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 8, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 116, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 70, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 43, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 87, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 109, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 25, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 42, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 52, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 8, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 16, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 29, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 87, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 110, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 100, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 47, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 55, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 64, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 23, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 87, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 2, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 80, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 52, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 62, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 17, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 4, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 25, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 29, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 111, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 116, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 29, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 65, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 40, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 89, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 36, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 65, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 4, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 86, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 16, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 75, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 99, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 56, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 79, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 4, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 80, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 7, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 42, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 87, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 111, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 53, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 73, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 34, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 64, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 35, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 65, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 6, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 92, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 16, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 109, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 21, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 43, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 61, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 76, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 7, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 30, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 72, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 115, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 35, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 67, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 64, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 63, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 29, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 50, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 44, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 19, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 52, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 101, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 65, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 31, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 73, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 98, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 115, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 76, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 13, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 60, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 95, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 23, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 37, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 110, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 97, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 108, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 117, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 114, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 33, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 105, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 53, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 84, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 68, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 55, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 85, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 103, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 87, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 56, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 72, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 37, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 82, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 104, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 66, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 22, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 71, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 77, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 108, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 4, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 81, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 8, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 4, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 55, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 99, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 31, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 5, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 114, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 82, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 9, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 95, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 73, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 116, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 65, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 72, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 8, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 18, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 104, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 54, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 119, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 92, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 64, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 81, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 101, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 88, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 102, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 57, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 19, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 20, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 89, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 67, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 21, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 9, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 91, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 50, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 57, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 24, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 85, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 15, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 79, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 30, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 12, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 106, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 81, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 41, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 72, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 24, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 82, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 9, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 105, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 5, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 41, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 2, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 34, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 113, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 44, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 119, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 104, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 77, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 111, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 62, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 74, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 68, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 36, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 120, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 112, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 92, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 74, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 87, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 77, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 44, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 65, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 31, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 30, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 6, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 9, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 23, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 26, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 19, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 104, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 7, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 90, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 67, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 3, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 114, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 88, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 44, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 9, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 107, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 81, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 120, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 116, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 97, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 29, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 114, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 41, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 92, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 91, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 118, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 77, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 7, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 31, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 110, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 87, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 70, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 22, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 73, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 91, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 103, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 46, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 11, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 19, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 18, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 88, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 73, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 29, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 107, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 104, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 100, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 73, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 100, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 81, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 99, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 42, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 85, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 74, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 107, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 82, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 30, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 61, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 8, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 104, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 1, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 93, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 98, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 91, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 74, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 45, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 99, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 69, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 24, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 117, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 93, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 82, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 67, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 62, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 103, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 72, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 45, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 98, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 70, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 15, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 83, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 55, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 101, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 16, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 27, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 114, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 47, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 40, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 94, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 14, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 105, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 67, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 12, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 28, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 99, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 42, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 36, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 18, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 5, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 8, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 59, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 7, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 68, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 22, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 10, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 66, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 100, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 52, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 66, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 47, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 77, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 81, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 104, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 115, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 55, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 111, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 59, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 85, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 47, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 106, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 99, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 117, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 50, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 55, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 18, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 31, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 7, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 103, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 108, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 102, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 71, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 3, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 16, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 35, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 86, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 111, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 30, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 53, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 73, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 73, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 104, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 79, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 70, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 48, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 83, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 111, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 9, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 111, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 117, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 59, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 107, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 113, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 14, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 19, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 43, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 76, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 65, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 108, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 111, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 88, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 97, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 73, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 49, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 119, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 22, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 49, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 44, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 12, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 119, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 94, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 85, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 62, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 48, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 114, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 4, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 35, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 83, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 25, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 42, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 39, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 64, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 59, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 19, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 12, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 102, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 8, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 3, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 89, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 81, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 76, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 58, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 14, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 68, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 74, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 50, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 75, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 86, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 11, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 93, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 38, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 87, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 38, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 73, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 19, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 105, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 7, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 69, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 3, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 33, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 105, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 35, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 104, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 68, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 61, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 118, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 29, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 20, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 59, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 43, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 15, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 35, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 62, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 105, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 32, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 29, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 58, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 114, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 24, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 55, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 39, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 18, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 68, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 12, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 109, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 53, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 2, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 52, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 62, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 98, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 16, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 92, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 1, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 12, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 41, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 43, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 43, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 117, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 1, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 24, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 37, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 42, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 70, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 55, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 19, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 12, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 39, new IntPred(325, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 3, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 1, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 27, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 86, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 2, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 53, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 82, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 15, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 102, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 42, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 24, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 25, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 48, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 73, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 115, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 25, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 85, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 47, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 76, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 19, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 67, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 27, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 23, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 27, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 74, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 86, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 89, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 29, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 100, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 11, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 2, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 19, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 7, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 30, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 59, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 109, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 111, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 111, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 30, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 23, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 30, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 110, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 51, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 120, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 6, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 109, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 7, new IntPred(199, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 103, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 12, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 99, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 92, new IntPred(354, 375), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 22, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 20, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 45, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 61, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 33, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 33, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 77, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 56, new IntPred(282, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 53, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 75, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 13, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 84, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 3, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 64, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 66, new IntPred(179, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 114, new IntPred(199, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 92, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 22, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 59, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 22, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 108, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 100, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 104, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 45, new IntPred(100, 178), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 80, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 54, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 93, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 62, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 58, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 32, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 30, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 19, new IntPred(0, 17), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 49, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 71, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 51, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 15, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 107, new IntPred(272, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 85, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 67, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 54, new IntPred(354, 375), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 62, new IntPred(376, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 44, new IntPred(0, 17), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 42, new IntPred(18, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 82, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 72, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 103, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 28, new IntPred(272, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 50, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 35, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 6, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 73, new IntPred(376, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 18, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 93, new IntPred(18, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 112, new IntPred(100, 178), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 113, new IntPred(179, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 31, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 33, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 48, new IntPred(282, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 71, new IntPred(325, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 42, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 25, new IntPred(376, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 98, new IntPred(0, 17), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 56, new IntPred(18, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 66, new IntPred(100, 178), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 101, new IntPred(179, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 28, new IntPred(199, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 26, new IntPred(272, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 84, new IntPred(282, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 107, new IntPred(325, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 88, new IntPred(354, 375), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 95, new IntPred(376, null), 'b'));
return trans;
}

}
