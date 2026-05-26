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
public class Random120States10SigmaE20260527124621{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 100, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 45, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 70, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 74, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 51, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 51, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 114, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 65, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 86, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 94, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 84, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 115, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 42, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 101, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 117, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 59, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 97, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 58, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 87, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 120, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 28, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 55, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 52, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 95, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 117, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 87, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 86, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 116, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 95, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 64, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 80, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 78, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 72, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 88, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 101, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 118, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 103, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 71, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 106, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 104, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 105, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 110, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 60, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 120, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 69, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 100, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 85, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 64, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 51, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 58, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 60, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 63, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 47, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 83, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 72, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 24, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 114, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 69, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 110, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 118, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 111, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 23, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 75, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 112, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 36, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 87, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 62, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 48, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 60, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 28, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 73, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 80, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 93, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 117, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 102, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 73, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 60, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 68, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 103, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 63, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 101, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 55, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 39, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 39, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 49, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 84, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 111, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 56, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 47, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 115, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 100, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 93, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 62, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 57, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 89, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 109, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 56, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 94, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 56, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 97, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 60, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 68, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 87, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 64, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 60, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 65, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 118, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 112, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 73, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 97, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 85, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 65, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 84, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 96, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 114, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 75, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 120, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 77, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 111, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 89, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 99, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 43, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 47, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 95, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 83, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 110, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 71, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 71, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 112, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 62, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 52, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 58, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 99, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 85, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 50, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 101, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 53, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 64, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 83, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 88, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 56, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 90, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 67, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 114, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 71, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 38, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 80, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 20, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 117, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 24, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 64, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 97, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 64, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 12, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 45, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 90, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 82, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 74, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 43, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 81, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 56, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 41, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 100, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 65, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 42, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 46, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 114, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 118, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 67, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 99, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 82, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 47, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 41, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 104, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 102, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 12, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 41, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 48, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 48, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 64, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 74, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 89, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 75, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 78, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 106, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 100, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 49, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 93, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 32, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 101, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 58, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 88, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 47, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 118, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 91, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 77, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 57, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 110, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 48, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 64, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 65, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 54, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 28, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 53, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 120, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 48, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 107, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 47, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 87, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 51, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 104, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 120, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 99, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 73, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 93, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 66, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 106, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 50, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 81, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 58, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 66, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 118, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 71, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 120, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 45, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 57, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 120, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 98, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 47, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 108, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 80, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 11, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 111, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 41, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 116, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 43, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 79, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 56, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 108, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 89, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 105, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 76, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 42, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 117, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 71, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 86, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 86, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 10, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 101, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 61, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 91, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 73, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 107, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 95, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 100, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 68, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 59, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 95, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 42, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 67, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 65, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 96, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 100, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 116, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 54, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 83, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 42, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 10, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 103, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 116, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 102, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 64, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 95, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 106, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 70, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 27, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 45, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 72, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 3, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 8, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 45, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 41, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 101, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 51, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 107, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 68, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 64, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 93, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 105, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 43, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 72, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 51, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 56, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 94, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 22, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 59, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 50, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 12, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 27, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 89, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 88, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 101, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 105, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 54, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 25, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 48, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 86, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 83, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 98, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 36, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 84, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 89, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 100, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 110, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 89, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 100, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 109, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 4, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 114, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 49, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 94, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 43, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 25, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 103, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 111, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 73, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 40, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 38, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 113, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 47, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 32, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 64, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 3, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 5, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 38, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 103, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 28, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 85, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 66, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 62, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 15, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 114, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 38, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 47, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 33, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 73, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 107, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 57, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 55, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 117, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 55, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 96, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 117, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 72, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 29, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 102, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 83, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 59, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 89, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 77, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 105, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 113, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 73, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 34, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 108, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 87, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 20, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 115, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 30, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 38, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 46, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 1, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 9, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 79, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 106, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 87, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 85, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 118, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 40, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 60, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 118, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 42, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 60, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 12, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 106, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 72, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 115, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 117, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 114, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 109, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 15, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 102, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 49, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 54, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 86, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 108, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 68, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 70, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 42, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 16, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 112, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 79, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 80, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 119, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 92, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 50, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 2, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 86, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 57, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 72, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 59, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 22, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 86, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 30, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 60, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 73, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 58, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 6, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 13, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 106, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 64, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 109, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 58, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 41, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 37, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 52, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 113, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 4, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 111, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 10, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 66, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 103, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 103, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 43, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 23, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 115, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 63, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 27, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 109, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 83, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 67, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 110, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 11, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 118, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 75, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 61, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 4, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 1, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 102, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 32, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 75, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 96, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 114, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 89, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 54, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 54, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 4, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 60, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 11, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 41, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 18, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 46, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 107, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 17, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 104, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 68, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 21, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 10, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 61, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 66, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 1, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 20, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 11, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 80, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 57, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 46, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 12, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 79, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 88, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 59, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 78, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 76, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 13, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 88, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 16, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 60, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 9, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 3, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 58, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 118, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 84, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 53, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 96, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 92, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 115, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 80, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 64, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 1, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 101, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 10, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 62, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 27, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 104, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 8, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 78, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 10, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 96, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 3, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 10, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 15, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 105, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 55, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 85, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 95, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 45, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 99, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 92, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 86, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 115, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 56, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 98, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 115, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 14, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 117, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 60, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 118, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 90, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 110, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 113, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 12, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 95, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 1, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 113, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 50, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 61, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 116, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 45, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 18, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 72, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 66, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 114, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 22, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 20, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 87, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 38, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 3, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 81, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 55, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 33, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 120, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 39, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 106, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 117, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 12, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 99, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 99, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 6, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 88, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 67, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 19, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 24, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 70, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 82, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 23, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 87, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 7, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 28, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 4, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 34, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 93, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 21, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 3, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 2, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 12, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 92, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 111, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 31, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 95, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 103, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 69, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 14, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 31, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 52, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 82, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 108, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 17, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 41, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 57, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 62, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 69, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 80, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 45, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 41, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 107, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 49, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 62, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 7, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 87, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 54, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 49, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 67, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 118, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 58, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 20, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 95, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 22, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 34, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 103, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 117, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 1, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 87, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 3, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 11, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 106, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 82, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 110, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 84, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 13, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 62, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 21, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 19, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 2, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 97, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 22, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 99, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 52, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 26, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 93, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 58, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 38, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 102, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 83, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 3, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 74, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 61, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 55, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 42, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 49, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 78, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 82, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 6, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 98, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 76, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 84, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 12, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 35, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 68, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 86, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 88, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 112, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 64, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 9, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 14, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 14, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 59, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 77, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 35, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 34, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 44, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 119, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 4, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 45, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 30, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 52, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 72, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 86, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 72, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 98, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 79, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 29, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 86, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 3, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 77, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 82, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 115, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 7, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 63, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 82, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 28, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 29, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 44, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 58, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 100, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 18, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 92, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 105, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 98, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 71, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 4, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 34, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 59, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 87, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 96, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 31, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 6, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 86, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 31, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 47, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 83, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 74, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 59, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 16, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 35, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 94, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 53, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 20, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 11, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 42, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 20, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 120, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 96, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 115, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 55, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 16, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 27, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 41, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 38, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 116, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 77, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 91, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 92, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 94, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 44, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 116, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 63, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 105, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 20, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 1, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 78, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 75, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 95, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 33, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 9, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 99, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 21, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 27, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 109, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 11, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 35, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 82, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 101, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 22, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 56, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 84, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 9, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 27, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 99, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 62, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 10, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 63, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 118, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 57, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 3, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 71, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 29, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 24, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 97, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 107, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 39, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 95, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 52, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 107, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 83, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 69, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 67, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 102, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 76, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 82, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 3, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 109, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 94, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 57, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 9, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 100, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 30, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 111, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 82, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 73, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 44, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 73, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 26, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 67, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 84, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 113, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 41, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 107, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 32, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 114, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 47, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 78, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 87, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 7, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 105, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 40, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 57, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 39, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 105, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 97, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 41, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 83, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 65, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 84, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 57, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 78, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 40, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 11, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 40, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 108, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 3, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 28, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 87, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 75, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 92, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 86, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 111, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 12, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 47, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 28, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 4, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 74, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 15, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 96, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 84, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 97, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 37, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 17, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 113, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 40, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 49, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 21, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 42, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 55, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 110, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 7, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 117, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 57, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 98, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 41, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 80, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 19, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 3, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 18, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 58, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 34, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 2, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 74, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 55, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 96, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 99, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 80, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 49, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 96, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 91, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 115, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 119, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 5, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 88, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 37, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 113, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 62, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 28, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 96, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 49, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 93, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 82, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 93, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 67, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 26, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 47, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 80, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 117, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 76, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 73, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 21, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 7, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 32, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 115, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 21, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 84, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 103, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 103, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 25, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 103, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 76, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 17, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 77, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 22, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 27, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 106, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 102, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 10, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 67, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 107, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 52, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 60, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 84, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 117, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 112, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 49, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 17, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 111, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 47, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 47, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 39, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 79, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 36, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 21, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 60, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 39, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 41, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 110, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 120, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 105, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 94, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 78, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 14, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 59, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 96, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 35, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 76, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 44, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 107, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 60, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 22, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 28, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 80, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 45, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 6, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 111, new IntPred(0, 71), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 63, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 9, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 79, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 90, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 37, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 14, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 68, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 44, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 95, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 36, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 14, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 78, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 13, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 46, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 35, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 3, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 88, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 78, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 47, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 32, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 3, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 108, new IntPred(81, 154), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 102, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 12, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 52, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 72, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 47, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 113, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 92, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 107, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 74, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 17, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 67, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 58, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 2, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 65, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 44, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 98, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 4, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 88, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 23, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 60, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 70, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 56, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 81, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 18, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 104, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 92, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 85, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 8, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 69, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 112, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 46, new IntPred(155, 176), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 19, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 27, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 116, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 114, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 101, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 86, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 81, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 32, new IntPred(72, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 78, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 120, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 89, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 42, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 60, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 92, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 42, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 44, new IntPred(470, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 52, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 94, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 60, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 106, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 62, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 100, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 6, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 77, new IntPred(313, 408), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 100, new IntPred(409, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 39, new IntPred(470, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 4, new IntPred(0, 71), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 62, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 90, new IntPred(81, 154), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 26, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 11, new IntPred(177, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 81, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 7, new IntPred(263, 312), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 97, new IntPred(313, 408), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 91, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 51, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 107, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 27, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 4, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 28, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 38, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 89, new IntPred(260, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 105, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 61, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 79, new IntPred(409, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 20, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 103, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 51, new IntPred(72, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 10, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 106, new IntPred(155, 176), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 22, new IntPred(177, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 82, new IntPred(260, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 8, new IntPred(263, 312), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 120, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 22, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 41, new IntPred(470, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 91, new IntPred(0, 71), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 49, new IntPred(72, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 99, new IntPred(81, 154), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 36, new IntPred(155, 176), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 62, new IntPred(177, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 101, new IntPred(260, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 2, new IntPred(263, 312), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 36, new IntPred(313, 408), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 56, new IntPred(409, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 74, new IntPred(470, null), 'b'));
return trans;
}

}
