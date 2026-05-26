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
public class Random120States10SigmaE20260527124615{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 89, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 116, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 106, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 59, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 91, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 45, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 60, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 53, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 106, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 118, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 115, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 120, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 41, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 67, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 45, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 76, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 74, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 117, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 41, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 104, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 112, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 60, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 89, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 60, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 96, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 58, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 32, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 42, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 79, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 110, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 115, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 68, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 55, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 111, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 41, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 95, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 58, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 112, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 72, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 67, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 68, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 46, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 51, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 28, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 110, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 67, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 60, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 87, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 40, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 22, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 93, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 107, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 57, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 56, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 61, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 108, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 102, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 98, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 91, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 112, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 72, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 106, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 106, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 84, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 103, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 116, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 115, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 55, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 63, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 78, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 54, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 57, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 84, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 91, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 49, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 67, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 110, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 109, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 115, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 50, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 68, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 109, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 98, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 42, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 96, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 47, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 63, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 110, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 51, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 57, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 44, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 86, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 111, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 67, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 115, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 105, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 43, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 97, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 74, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 116, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 76, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 96, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 53, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 71, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 70, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 93, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 88, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 78, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 120, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 93, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 45, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 112, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 52, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 46, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 87, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 55, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 53, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 94, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 115, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 61, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 79, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 85, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 43, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 66, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 47, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 52, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 42, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 82, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 94, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 84, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 80, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 52, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 9, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 59, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 55, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 42, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 119, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 73, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 46, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 70, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 105, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 86, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 111, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 94, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 63, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 108, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 113, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 114, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 59, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 40, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 116, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 47, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 87, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 94, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 94, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 104, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 116, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 108, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 119, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 80, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 98, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 99, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 41, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 87, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 80, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 110, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 80, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 91, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 52, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 12, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 38, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 63, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 86, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 111, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 96, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 74, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 105, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 115, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 49, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 75, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 82, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 47, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 113, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 15, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 120, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 75, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 103, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 117, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 107, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 79, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 112, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 101, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 41, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 105, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 67, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 101, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 114, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 75, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 81, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 108, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 50, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 18, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 29, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 96, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 64, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 18, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 103, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 62, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 42, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 51, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 102, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 25, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 87, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 46, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 14, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 57, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 60, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 52, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 90, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 112, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 50, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 90, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 71, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 71, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 30, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 90, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 87, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 108, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 105, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 52, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 50, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 93, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 96, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 103, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 115, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 114, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 104, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 49, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 42, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 83, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 108, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 95, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 79, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 97, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 57, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 48, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 99, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 81, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 117, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 22, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 74, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 47, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 106, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 120, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 97, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 104, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 116, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 66, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 104, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 3, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 83, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 91, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 99, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 82, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 52, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 59, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 68, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 68, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 10, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 47, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 54, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 66, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 120, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 92, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 14, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 108, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 107, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 19, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 3, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 60, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 14, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 77, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 114, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 85, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 34, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 99, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 84, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 49, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 105, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 38, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 61, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 120, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 92, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 38, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 61, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 44, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 67, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 88, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 102, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 65, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 97, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 39, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 84, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 69, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 1, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 75, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 76, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 64, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 115, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 21, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 29, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 77, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 112, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 73, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 63, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 105, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 100, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 4, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 25, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 16, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 59, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 85, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 99, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 12, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 7, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 43, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 77, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 15, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 27, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 95, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 24, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 99, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 30, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 1, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 64, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 106, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 8, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 57, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 30, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 19, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 11, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 68, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 98, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 84, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 99, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 101, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 44, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 83, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 89, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 80, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 118, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 8, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 48, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 33, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 36, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 44, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 79, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 57, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 98, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 37, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 53, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 117, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 13, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 81, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 101, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 12, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 48, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 56, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 118, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 30, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 20, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 43, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 22, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 46, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 112, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 77, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 50, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 48, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 57, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 85, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 82, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 82, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 2, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 2, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 97, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 102, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 14, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 37, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 91, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 70, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 72, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 50, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 29, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 103, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 97, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 30, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 80, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 110, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 74, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 10, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 38, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 5, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 69, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 70, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 3, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 30, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 111, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 110, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 12, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 38, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 73, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 88, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 27, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 75, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 82, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 116, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 96, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 6, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 58, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 105, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 98, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 81, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 111, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 26, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 76, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 111, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 69, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 22, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 55, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 92, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 14, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 101, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 45, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 41, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 69, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 18, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 87, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 28, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 119, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 111, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 119, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 60, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 106, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 61, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 6, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 36, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 88, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 109, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 91, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 72, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 62, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 116, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 61, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 80, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 22, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 4, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 116, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 79, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 54, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 118, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 89, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 91, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 120, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 65, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 57, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 80, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 32, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 81, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 17, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 61, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 3, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 71, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 98, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 32, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 45, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 44, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 52, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 48, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 43, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 86, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 17, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 108, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 119, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 96, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 102, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 43, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 48, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 82, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 16, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 102, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 54, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 97, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 16, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 49, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 36, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 58, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 73, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 75, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 62, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 42, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 82, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 67, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 43, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 75, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 90, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 60, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 19, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 25, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 18, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 33, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 9, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 112, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 94, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 41, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 113, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 96, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 19, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 75, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 75, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 113, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 18, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 27, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 102, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 95, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 83, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 99, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 37, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 102, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 43, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 66, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 5, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 94, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 118, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 48, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 31, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 100, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 71, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 107, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 14, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 79, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 5, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 102, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 35, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 77, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 87, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 37, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 69, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 67, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 68, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 53, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 111, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 59, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 83, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 118, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 44, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 101, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 108, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 86, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 30, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 9, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 29, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 38, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 91, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 103, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 103, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 62, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 82, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 9, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 86, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 7, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 71, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 89, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 57, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 27, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 118, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 43, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 15, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 114, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 7, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 103, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 108, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 91, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 30, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 87, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 74, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 49, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 72, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 30, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 111, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 105, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 75, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 17, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 41, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 65, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 81, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 10, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 101, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 87, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 19, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 87, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 11, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 86, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 13, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 43, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 60, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 85, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 99, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 15, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 58, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 120, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 40, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 105, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 111, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 103, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 28, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 118, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 103, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 38, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 94, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 65, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 93, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 37, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 70, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 12, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 72, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 25, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 15, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 25, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 97, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 29, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 11, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 76, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 38, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 45, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 97, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 11, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 96, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 33, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 26, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 60, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 25, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 72, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 67, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 67, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 109, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 85, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 62, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 49, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 57, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 29, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 93, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 109, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 95, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 47, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 103, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 119, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 32, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 2, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 64, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 95, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 39, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 113, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 93, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 114, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 116, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 82, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 77, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 13, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 94, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 74, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 41, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 103, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 39, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 114, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 75, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 99, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 76, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 37, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 66, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 75, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 26, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 15, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 28, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 101, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 106, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 63, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 59, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 106, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 117, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 109, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 48, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 89, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 95, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 68, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 66, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 96, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 119, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 8, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 16, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 107, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 29, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 65, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 114, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 98, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 35, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 54, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 83, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 47, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 12, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 35, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 73, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 61, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 88, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 67, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 99, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 2, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 101, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 61, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 2, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 93, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 79, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 90, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 8, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 64, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 48, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 117, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 19, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 14, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 96, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 81, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 98, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 109, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 46, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 38, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 78, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 37, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 84, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 4, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 2, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 87, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 38, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 14, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 20, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 31, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 3, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 120, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 41, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 90, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 10, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 1, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 44, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 40, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 38, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 57, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 86, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 58, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 2, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 43, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 103, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 44, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 61, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 92, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 76, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 12, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 71, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 50, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 22, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 9, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 49, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 61, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 24, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 76, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 9, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 8, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 33, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 49, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 75, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 48, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 22, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 95, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 64, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 67, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 81, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 115, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 58, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 107, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 84, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 89, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 53, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 24, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 110, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 35, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 112, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 33, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 28, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 78, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 81, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 67, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 120, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 84, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 60, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 79, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 6, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 77, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 100, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 120, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 41, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 52, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 56, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 34, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 26, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 71, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 7, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 28, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 41, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 71, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 60, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 6, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 33, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 35, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 34, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 19, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 72, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 33, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 80, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 24, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 76, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 5, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 21, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 67, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 46, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 103, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 116, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 28, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 66, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 97, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 89, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 70, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 69, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 54, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 18, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 86, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 13, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 44, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 55, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 11, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 4, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 58, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 50, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 44, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 101, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 10, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 15, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 36, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 109, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 56, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 44, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 57, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 114, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 72, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 2, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 112, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 31, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 107, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 97, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 58, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 54, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 66, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 63, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 90, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 83, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 49, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 18, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 20, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 47, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 77, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 105, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 47, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 91, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 22, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 86, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 28, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 72, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 21, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 62, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 76, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 13, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 86, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 14, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 84, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 64, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 39, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 16, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 20, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 75, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 23, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 92, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 35, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 88, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 7, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 111, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 117, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 109, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 116, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 86, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 53, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 89, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 2, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 3, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 34, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 28, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 114, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 95, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 46, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 18, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 116, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 78, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 89, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 24, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 13, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 54, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 98, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 21, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 18, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 103, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 78, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 26, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 59, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 107, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 70, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 74, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 72, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 71, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 69, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 98, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 47, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 88, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 31, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 17, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 59, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 119, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 115, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 17, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 30, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 61, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 50, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 68, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 96, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 14, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 5, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 71, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 60, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 50, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 49, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 73, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 9, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 111, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 86, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 44, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 79, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 48, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 107, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 75, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 46, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 64, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 52, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 34, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 18, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 95, new IntPred(212, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 116, new IntPred(298, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 1, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 49, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 19, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 66, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 25, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 82, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 56, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 24, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 68, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 119, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 104, new IntPred(320, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 86, new IntPred(347, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 40, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 51, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 83, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 51, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 77, new IntPred(57, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 77, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 24, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 12, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 114, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 91, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 105, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 19, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 107, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 55, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 91, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 89, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 53, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 117, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 99, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 43, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 80, new IntPred(400, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 18, new IntPred(452, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 41, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 96, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 52, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 110, new IntPred(123, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 80, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 32, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 28, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 74, new IntPred(347, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 76, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 46, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 13, new IntPred(544, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 27, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 10, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 47, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 111, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 52, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 75, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 9, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 90, new IntPred(400, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 119, new IntPred(452, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 16, new IntPred(544, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 100, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 114, new IntPred(57, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 5, new IntPred(123, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 31, new IntPred(212, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 35, new IntPred(298, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 44, new IntPred(320, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 104, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 60, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 68, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 102, new IntPred(544, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 104, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 72, new IntPred(57, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 59, new IntPred(123, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 82, new IntPred(212, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 10, new IntPred(298, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 5, new IntPred(320, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 74, new IntPred(347, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 43, new IntPred(400, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 34, new IntPred(452, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 24, new IntPred(544, null), 'b'));
return trans;
}

}
