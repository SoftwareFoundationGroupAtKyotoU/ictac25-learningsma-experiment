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
public class Random120States10SigmaE20260527124619{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 49, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 100, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 103, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 87, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 48, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 90, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 114, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 43, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 58, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 119, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 47, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 81, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 92, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 101, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 120, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 89, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 56, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 68, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 81, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 48, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 86, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 107, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 79, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 75, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 69, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 58, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 44, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 81, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 67, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 44, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 66, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 118, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 73, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 118, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 109, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 112, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 108, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 45, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 45, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 102, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 108, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 100, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 84, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 75, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 101, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 92, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 72, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 70, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 73, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 100, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 61, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 101, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 106, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 97, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 44, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 56, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 115, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 92, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 95, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 93, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 108, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 57, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 57, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 91, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 84, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 71, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 107, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 111, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 46, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 65, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 103, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 80, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 90, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 93, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 67, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 28, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 119, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 45, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 79, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 97, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 88, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 105, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 103, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 53, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 21, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 84, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 68, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 62, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 113, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 99, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 96, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 73, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 67, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 100, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 108, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 80, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 105, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 58, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 114, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 80, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 72, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 72, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 116, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 69, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 62, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 54, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 42, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 112, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 103, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 106, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 78, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 119, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 83, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 104, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 44, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 78, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 53, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 88, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 96, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 50, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 89, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 74, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 107, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 114, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 111, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 60, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 92, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 87, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 67, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 83, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 94, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 105, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 62, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 86, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 42, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 12, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 114, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 44, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 71, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 102, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 81, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 55, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 31, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 51, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 45, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 53, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 93, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 48, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 85, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 106, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 98, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 102, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 55, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 45, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 21, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 65, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 74, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 44, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 59, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 96, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 113, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 55, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 72, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 114, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 108, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 86, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 101, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 98, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 64, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 99, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 56, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 64, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 114, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 90, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 66, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 97, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 100, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 70, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 58, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 51, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 82, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 104, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 83, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 79, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 76, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 32, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 66, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 114, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 41, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 66, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 44, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 96, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 82, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 72, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 110, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 54, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 64, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 67, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 50, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 100, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 113, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 94, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 97, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 103, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 28, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 103, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 117, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 73, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 87, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 5, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 80, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 91, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 51, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 87, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 58, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 49, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 93, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 80, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 94, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 54, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 81, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 90, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 61, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 111, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 49, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 45, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 59, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 120, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 74, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 98, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 95, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 55, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 59, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 56, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 94, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 41, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 104, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 100, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 115, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 106, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 93, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 87, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 95, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 111, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 45, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 75, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 61, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 98, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 88, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 65, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 63, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 32, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 101, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 108, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 99, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 102, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 107, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 92, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 94, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 60, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 114, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 119, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 68, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 100, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 105, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 76, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 24, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 74, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 17, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 102, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 86, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 36, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 88, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 43, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 120, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 87, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 113, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 118, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 94, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 42, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 44, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 47, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 113, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 45, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 16, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 1, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 65, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 82, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 73, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 111, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 119, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 88, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 38, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 115, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 79, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 38, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 90, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 3, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 19, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 14, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 28, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 42, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 87, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 93, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 75, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 13, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 81, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 80, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 114, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 18, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 50, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 51, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 56, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 67, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 16, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 60, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 6, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 2, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 95, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 12, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 17, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 26, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 107, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 21, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 7, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 110, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 100, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 54, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 113, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 29, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 83, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 39, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 103, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 40, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 107, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 64, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 82, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 48, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 60, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 94, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 27, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 110, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 2, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 29, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 75, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 40, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 21, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 68, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 100, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 101, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 26, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 108, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 79, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 16, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 65, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 55, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 40, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 22, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 3, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 74, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 32, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 52, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 32, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 107, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 50, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 21, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 82, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 13, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 116, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 54, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 98, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 101, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 102, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 84, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 57, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 99, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 113, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 97, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 97, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 33, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 114, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 96, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 111, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 82, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 63, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 100, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 20, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 84, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 32, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 20, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 15, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 103, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 113, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 76, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 42, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 40, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 78, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 71, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 91, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 81, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 71, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 97, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 120, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 90, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 34, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 2, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 95, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 86, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 48, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 108, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 42, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 48, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 52, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 30, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 37, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 118, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 74, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 54, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 33, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 1, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 58, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 107, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 33, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 79, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 117, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 39, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 53, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 72, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 2, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 83, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 58, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 39, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 15, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 62, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 78, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 34, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 40, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 57, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 31, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 71, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 94, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 112, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 95, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 67, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 66, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 56, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 58, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 84, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 68, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 79, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 37, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 27, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 97, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 36, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 54, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 91, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 11, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 17, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 74, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 119, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 36, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 26, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 32, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 5, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 118, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 48, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 41, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 48, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 96, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 7, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 77, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 10, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 117, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 5, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 8, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 67, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 117, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 108, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 65, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 65, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 87, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 10, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 31, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 71, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 78, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 17, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 40, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 94, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 119, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 112, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 73, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 55, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 48, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 10, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 68, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 57, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 34, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 101, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 105, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 93, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 45, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 85, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 99, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 34, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 56, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 72, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 52, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 76, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 19, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 12, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 75, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 94, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 33, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 64, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 91, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 87, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 80, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 97, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 59, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 36, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 57, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 62, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 103, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 70, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 32, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 26, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 55, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 76, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 90, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 73, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 23, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 120, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 39, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 26, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 66, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 97, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 38, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 42, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 69, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 86, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 98, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 2, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 92, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 32, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 96, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 70, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 102, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 84, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 62, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 84, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 115, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 10, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 37, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 43, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 45, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 106, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 89, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 116, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 39, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 77, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 46, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 36, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 48, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 97, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 93, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 103, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 65, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 5, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 44, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 6, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 106, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 88, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 57, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 90, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 112, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 14, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 104, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 78, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 82, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 106, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 111, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 64, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 23, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 61, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 89, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 55, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 33, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 61, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 119, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 110, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 60, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 6, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 104, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 95, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 79, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 76, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 10, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 97, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 30, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 94, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 74, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 117, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 12, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 63, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 77, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 94, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 98, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 107, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 69, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 67, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 2, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 96, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 111, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 115, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 13, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 71, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 76, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 90, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 115, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 53, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 52, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 58, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 85, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 68, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 115, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 66, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 33, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 14, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 87, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 90, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 118, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 106, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 95, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 68, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 75, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 36, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 85, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 76, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 84, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 9, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 21, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 81, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 16, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 115, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 41, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 52, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 73, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 8, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 8, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 66, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 81, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 6, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 73, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 42, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 52, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 79, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 18, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 17, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 33, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 17, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 84, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 92, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 97, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 76, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 113, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 116, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 16, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 105, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 4, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 20, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 66, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 44, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 36, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 65, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 86, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 19, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 32, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 97, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 46, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 93, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 107, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 20, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 101, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 28, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 97, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 6, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 47, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 2, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 8, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 90, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 4, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 15, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 80, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 71, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 20, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 81, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 75, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 15, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 19, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 65, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 101, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 75, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 54, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 44, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 108, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 31, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 84, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 79, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 120, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 20, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 63, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 106, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 4, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 104, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 56, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 62, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 18, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 47, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 45, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 118, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 115, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 117, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 93, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 57, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 84, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 41, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 58, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 53, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 42, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 100, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 6, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 13, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 46, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 7, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 118, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 76, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 97, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 32, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 2, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 120, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 1, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 5, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 90, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 71, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 57, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 110, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 66, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 68, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 61, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 15, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 102, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 2, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 2, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 51, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 22, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 55, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 50, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 42, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 75, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 51, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 22, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 19, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 79, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 6, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 9, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 106, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 57, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 92, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 91, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 67, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 30, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 12, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 115, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 116, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 112, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 108, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 116, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 30, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 19, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 86, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 112, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 20, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 50, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 14, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 31, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 107, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 62, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 58, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 33, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 48, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 55, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 120, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 31, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 92, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 16, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 82, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 14, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 107, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 38, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 29, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 67, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 111, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 73, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 12, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 39, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 113, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 58, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 113, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 60, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 25, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 107, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 93, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 29, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 56, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 81, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 19, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 17, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 109, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 37, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 104, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 25, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 116, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 86, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 101, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 37, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 88, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 103, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 107, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 43, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 33, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 7, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 29, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 47, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 70, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 44, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 41, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 43, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 29, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 86, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 47, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 16, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 93, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 90, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 104, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 3, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 82, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 60, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 15, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 81, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 89, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 51, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 91, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 18, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 55, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 72, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 75, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 81, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 29, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 62, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 31, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 9, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 63, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 75, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 117, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 49, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 23, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 45, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 50, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 89, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 70, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 6, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 12, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 26, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 60, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 40, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 86, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 34, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 66, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 49, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 36, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 37, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 47, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 16, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 74, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 108, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 15, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 93, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 48, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 73, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 37, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 28, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 64, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 97, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 82, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 82, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 102, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 96, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 19, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 102, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 55, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 104, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 46, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 81, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 26, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 90, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 12, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 6, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 41, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 10, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 97, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 114, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 96, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 86, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 15, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 84, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 69, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 96, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 102, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 54, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 30, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 87, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 71, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 9, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 117, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 81, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 3, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 117, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 39, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 20, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 16, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 62, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 32, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 104, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 12, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 71, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 8, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 86, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 71, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 11, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 40, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 115, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 53, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 22, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 45, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 29, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 25, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 80, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 52, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 52, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 43, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 25, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 12, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 90, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 98, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 102, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 62, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 115, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 50, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 50, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 56, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 77, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 103, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 77, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 77, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 57, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 56, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 32, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 110, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 39, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 76, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 110, new IntPred(128, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 19, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 101, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 111, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 29, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 34, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 81, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 46, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 50, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 39, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 26, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 78, new IntPred(162, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 24, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 82, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 58, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 8, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 1, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 92, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 110, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 72, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 58, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 57, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 99, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 17, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 11, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 118, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 83, new IntPred(514, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 18, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 28, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 76, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 118, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 19, new IntPred(162, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 81, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 43, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 89, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 96, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 23, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 87, new IntPred(593, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 98, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 84, new IntPred(55, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 108, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 62, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 56, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 95, new IntPred(311, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 66, new IntPred(411, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 8, new IntPred(479, 513), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 119, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 65, new IntPred(593, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 11, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 117, new IntPred(55, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 74, new IntPred(128, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 52, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 86, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 82, new IntPred(311, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 111, new IntPred(411, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 4, new IntPred(479, 513), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 80, new IntPred(514, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 51, new IntPred(593, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 118, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 26, new IntPred(55, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 108, new IntPred(128, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 34, new IntPred(162, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 73, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 20, new IntPred(311, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 35, new IntPred(411, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 110, new IntPred(479, 513), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 109, new IntPred(514, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 103, new IntPred(593, null), 'b'));
return trans;
}

}
