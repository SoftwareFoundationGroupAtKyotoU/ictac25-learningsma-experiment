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
public class Random120States10SigmaE20260527124608{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 47, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 71, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 74, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 83, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 105, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 89, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 86, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 77, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 91, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 73, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 70, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 86, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 72, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 105, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 94, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 80, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 49, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 120, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 91, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 56, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 95, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 59, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 107, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 96, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 87, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 63, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 66, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 69, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 62, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 112, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 63, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 97, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 45, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 54, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 89, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 113, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 82, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 98, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 118, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 102, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 67, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 67, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 82, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 95, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 84, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 47, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 117, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 110, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 120, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 45, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 98, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 57, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 109, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 61, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 41, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 112, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 76, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 59, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 83, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 106, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 61, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 47, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 102, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 60, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 52, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 118, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 74, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 42, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 74, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 91, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 68, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 50, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 92, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 120, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 42, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 60, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 24, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 103, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 88, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 120, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 44, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 77, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 72, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 69, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 44, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 63, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 47, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 95, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 38, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 68, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 64, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 51, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 41, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 65, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 87, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 120, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 114, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 98, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 75, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 97, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 119, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 95, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 53, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 48, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 100, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 82, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 91, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 103, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 91, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 48, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 45, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 78, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 80, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 44, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 73, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 74, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 53, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 87, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 64, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 106, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 94, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 71, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 57, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 66, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 48, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 60, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 65, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 56, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 108, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 45, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 114, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 65, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 118, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 60, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 95, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 101, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 104, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 82, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 119, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 86, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 94, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 103, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 87, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 120, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 108, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 85, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 87, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 62, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 80, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 69, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 112, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 47, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 90, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 62, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 91, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 100, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 107, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 93, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 99, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 49, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 77, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 113, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 60, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 43, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 86, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 19, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 81, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 114, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 89, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 69, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 41, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 88, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 82, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 42, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 112, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 107, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 24, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 66, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 27, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 55, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 12, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 59, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 74, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 79, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 78, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 86, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 102, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 106, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 103, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 102, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 57, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 73, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 112, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 89, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 31, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 106, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 96, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 58, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 57, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 54, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 76, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 74, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 57, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 113, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 78, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 82, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 83, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 111, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 85, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 56, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 91, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 46, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 48, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 56, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 78, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 113, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 94, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 55, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 42, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 90, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 110, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 119, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 45, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 54, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 110, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 71, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 86, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 97, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 49, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 83, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 109, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 60, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 58, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 60, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 76, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 114, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 96, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 18, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 7, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 97, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 104, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 60, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 64, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 95, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 44, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 120, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 116, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 98, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 72, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 48, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 94, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 92, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 48, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 53, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 76, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 73, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 87, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 117, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 68, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 79, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 87, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 63, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 111, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 85, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 115, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 72, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 47, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 61, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 47, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 62, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 70, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 102, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 28, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 60, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 1, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 48, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 112, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 114, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 117, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 33, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 75, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 52, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 32, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 96, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 27, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 66, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 48, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 17, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 79, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 35, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 56, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 24, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 100, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 74, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 54, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 24, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 82, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 12, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 92, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 44, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 14, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 15, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 16, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 93, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 23, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 106, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 63, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 65, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 84, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 43, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 73, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 22, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 57, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 51, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 41, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 86, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 43, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 91, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 112, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 66, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 65, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 86, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 105, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 111, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 115, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 2, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 107, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 42, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 116, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 54, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 30, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 65, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 99, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 43, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 9, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 101, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 93, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 87, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 4, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 25, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 59, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 109, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 63, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 94, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 117, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 74, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 46, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 93, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 13, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 108, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 83, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 30, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 44, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 62, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 20, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 6, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 51, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 94, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 71, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 116, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 110, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 9, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 46, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 44, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 91, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 21, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 45, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 88, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 26, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 35, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 23, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 22, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 79, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 110, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 5, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 14, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 84, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 84, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 113, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 35, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 97, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 65, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 92, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 63, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 102, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 96, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 86, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 24, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 117, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 43, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 100, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 120, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 82, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 96, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 25, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 22, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 4, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 92, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 7, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 7, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 51, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 49, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 117, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 89, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 113, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 73, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 16, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 108, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 91, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 26, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 51, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 73, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 95, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 17, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 57, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 12, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 70, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 57, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 87, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 4, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 80, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 51, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 53, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 95, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 68, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 77, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 91, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 16, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 21, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 78, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 89, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 69, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 18, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 13, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 78, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 118, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 38, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 110, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 16, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 54, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 5, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 87, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 28, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 17, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 71, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 91, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 112, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 96, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 110, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 89, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 12, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 68, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 9, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 101, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 100, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 28, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 114, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 72, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 76, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 46, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 16, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 46, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 113, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 100, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 70, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 64, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 77, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 114, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 95, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 64, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 81, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 18, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 93, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 38, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 54, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 78, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 41, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 13, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 44, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 83, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 17, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 77, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 49, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 28, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 32, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 74, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 48, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 5, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 97, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 71, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 1, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 59, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 94, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 91, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 80, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 118, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 24, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 67, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 68, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 72, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 48, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 84, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 74, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 69, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 57, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 43, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 105, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 90, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 93, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 75, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 60, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 67, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 84, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 109, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 80, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 20, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 50, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 98, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 87, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 35, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 87, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 9, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 39, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 37, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 5, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 120, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 105, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 108, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 89, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 57, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 16, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 100, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 88, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 33, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 100, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 102, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 49, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 48, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 79, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 85, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 43, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 101, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 61, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 29, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 88, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 97, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 35, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 68, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 25, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 36, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 15, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 98, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 114, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 24, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 101, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 100, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 29, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 52, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 44, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 58, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 119, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 58, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 30, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 22, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 40, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 23, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 83, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 10, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 6, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 108, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 28, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 41, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 103, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 46, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 84, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 100, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 92, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 86, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 69, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 70, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 41, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 44, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 71, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 60, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 110, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 29, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 97, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 42, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 36, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 82, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 41, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 120, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 89, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 89, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 119, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 14, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 112, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 50, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 60, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 15, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 22, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 97, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 17, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 61, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 67, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 102, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 76, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 38, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 24, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 81, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 65, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 58, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 4, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 120, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 76, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 110, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 57, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 7, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 28, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 79, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 70, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 25, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 8, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 70, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 54, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 111, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 68, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 46, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 56, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 112, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 21, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 80, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 5, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 106, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 16, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 72, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 116, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 67, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 49, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 50, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 48, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 86, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 104, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 9, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 49, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 106, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 51, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 1, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 104, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 104, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 14, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 44, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 102, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 104, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 49, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 107, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 60, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 7, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 119, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 63, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 12, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 58, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 24, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 36, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 25, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 72, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 28, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 13, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 42, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 116, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 86, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 19, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 94, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 34, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 67, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 72, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 78, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 88, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 105, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 118, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 104, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 103, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 10, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 66, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 24, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 74, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 88, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 37, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 110, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 68, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 32, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 54, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 36, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 51, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 41, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 3, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 111, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 105, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 76, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 63, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 91, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 39, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 59, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 42, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 81, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 49, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 67, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 71, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 107, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 39, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 68, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 46, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 92, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 15, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 85, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 120, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 25, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 62, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 106, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 1, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 60, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 6, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 32, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 93, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 85, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 102, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 93, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 93, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 73, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 7, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 10, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 72, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 45, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 67, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 90, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 61, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 114, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 38, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 42, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 29, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 16, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 47, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 113, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 11, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 20, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 109, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 103, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 29, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 84, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 51, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 111, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 98, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 63, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 94, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 110, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 107, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 71, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 83, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 19, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 20, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 88, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 44, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 95, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 1, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 104, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 65, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 36, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 35, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 55, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 81, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 48, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 91, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 78, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 24, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 64, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 67, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 41, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 32, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 7, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 74, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 103, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 50, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 78, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 54, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 38, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 91, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 115, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 73, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 25, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 50, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 12, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 45, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 76, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 62, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 107, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 34, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 27, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 73, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 89, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 109, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 120, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 25, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 20, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 72, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 116, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 84, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 27, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 103, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 67, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 89, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 70, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 54, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 10, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 11, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 104, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 29, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 90, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 79, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 103, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 86, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 36, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 74, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 40, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 83, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 20, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 21, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 69, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 74, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 63, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 59, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 88, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 26, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 31, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 47, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 119, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 117, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 11, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 97, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 48, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 62, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 97, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 87, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 51, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 74, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 47, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 117, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 13, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 25, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 75, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 63, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 81, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 115, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 95, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 100, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 70, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 28, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 64, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 42, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 46, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 18, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 76, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 14, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 66, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 44, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 90, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 67, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 88, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 114, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 91, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 63, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 103, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 1, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 109, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 67, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 96, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 102, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 107, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 25, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 92, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 39, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 64, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 86, new IntPred(493, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 50, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 23, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 91, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 55, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 7, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 33, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 34, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 29, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 85, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 41, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 1, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 27, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 31, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 112, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 57, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 84, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 104, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 87, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 108, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 103, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 105, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 96, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 28, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 21, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 90, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 9, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 25, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 47, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 86, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 106, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 90, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 50, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 49, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 100, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 40, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 12, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 19, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 25, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 56, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 86, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 83, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 9, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 71, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 89, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 46, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 97, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 29, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 83, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 23, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 43, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 60, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 57, new IntPred(51, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 30, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 106, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 104, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 68, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 4, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 60, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 79, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 102, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 26, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 56, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 80, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 28, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 119, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 47, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 69, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 3, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 25, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 53, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 106, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 68, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 112, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 111, new IntPred(185, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 5, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 57, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 48, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 69, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 110, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 111, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 77, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 14, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 102, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 109, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 110, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 8, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 81, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 33, new IntPred(368, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 52, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 87, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 54, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 7, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 41, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 82, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 19, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 99, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 68, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 67, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 75, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 75, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 65, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 117, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 114, new IntPred(90, 184), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 112, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 19, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 14, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 20, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 35, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 92, new IntPred(441, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 44, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 27, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 58, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 33, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 18, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 32, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 90, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 104, new IntPred(345, 367), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 73, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 71, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 27, new IntPred(493, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 114, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 113, new IntPred(51, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 93, new IntPred(90, 184), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 17, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 91, new IntPred(192, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 87, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 43, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 32, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 79, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 30, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 26, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 109, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 29, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 64, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 69, new IntPred(192, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 49, new IntPred(246, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 53, new IntPred(345, 367), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 68, new IntPred(368, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 92, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 78, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 3, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 55, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 45, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 17, new IntPred(185, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 99, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 116, new IntPred(246, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 43, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 80, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 68, new IntPred(441, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 86, new IntPred(493, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 97, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 68, new IntPred(51, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 48, new IntPred(90, 184), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 59, new IntPred(185, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 5, new IntPred(192, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 22, new IntPred(246, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 16, new IntPred(345, 367), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 80, new IntPred(368, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 87, new IntPred(441, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 10, new IntPred(493, null), 'b'));
return trans;
}

}
