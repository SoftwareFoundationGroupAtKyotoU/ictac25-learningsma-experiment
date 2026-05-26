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
public class Random120States10SigmaE20260527124616{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 50, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 47, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 65, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 34, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 85, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 91, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 98, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 114, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 97, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 112, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 81, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 101, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 83, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 91, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 89, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 96, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 99, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 48, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 43, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 104, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 82, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 115, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 21, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 24, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 59, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 69, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 35, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 81, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 95, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 114, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 76, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 103, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 68, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 109, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 83, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 47, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 89, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 79, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 95, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 45, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 42, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 61, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 110, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 41, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 108, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 111, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 77, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 47, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 69, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 110, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 71, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 87, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 76, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 80, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 87, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 103, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 47, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 69, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 119, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 61, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 76, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 78, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 112, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 58, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 56, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 67, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 44, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 115, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 50, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 57, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 118, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 107, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 81, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 84, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 43, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 116, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 50, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 50, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 52, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 88, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 95, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 80, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 80, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 66, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 108, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 111, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 55, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 43, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 75, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 82, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 61, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 77, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 43, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 79, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 58, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 101, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 62, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 70, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 92, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 111, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 49, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 74, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 87, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 118, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 51, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 85, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 92, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 79, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 85, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 84, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 96, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 81, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 101, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 85, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 76, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 71, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 120, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 110, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 111, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 112, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 110, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 48, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 44, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 63, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 112, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 109, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 86, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 94, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 60, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 43, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 84, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 88, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 68, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 81, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 118, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 110, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 75, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 61, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 91, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 77, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 118, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 94, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 71, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 109, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 96, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 64, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 90, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 115, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 60, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 12, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 31, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 79, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 90, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 94, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 7, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 65, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 94, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 66, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 42, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 104, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 74, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 102, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 103, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 72, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 120, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 54, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 108, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 113, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 114, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 63, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 12, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 72, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 106, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 41, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 12, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 83, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 47, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 24, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 108, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 104, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 56, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 75, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 87, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 95, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 42, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 105, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 86, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 108, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 82, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 113, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 80, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 71, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 96, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 62, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 94, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 51, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 78, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 46, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 101, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 89, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 97, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 46, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 42, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 42, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 84, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 116, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 83, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 104, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 49, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 76, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 107, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 107, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 77, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 93, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 52, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 86, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 106, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 79, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 88, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 55, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 100, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 81, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 60, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 43, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 69, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 52, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 70, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 83, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 63, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 82, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 113, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 81, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 77, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 75, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 49, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 53, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 43, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 53, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 61, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 70, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 48, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 48, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 28, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 58, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 119, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 71, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 89, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 47, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 67, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 113, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 58, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 43, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 20, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 85, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 87, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 116, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 95, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 59, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 60, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 83, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 41, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 103, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 53, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 103, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 42, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 64, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 119, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 85, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 108, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 115, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 4, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 96, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 115, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 79, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 11, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 110, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 71, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 46, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 95, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 68, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 46, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 102, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 76, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 60, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 120, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 45, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 51, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 51, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 59, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 4, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 10, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 70, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 107, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 62, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 49, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 68, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 12, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 31, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 25, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 65, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 100, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 86, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 117, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 22, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 69, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 90, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 108, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 117, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 96, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 24, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 13, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 69, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 24, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 37, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 81, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 34, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 29, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 79, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 106, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 61, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 21, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 28, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 74, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 74, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 47, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 83, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 102, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 45, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 53, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 6, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 3, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 36, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 65, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 33, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 82, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 106, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 41, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 38, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 39, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 60, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 81, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 66, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 50, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 99, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 23, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 13, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 97, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 35, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 96, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 55, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 13, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 8, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 74, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 89, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 25, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 94, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 93, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 97, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 56, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 76, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 3, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 56, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 88, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 62, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 53, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 55, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 41, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 119, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 60, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 83, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 86, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 20, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 46, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 25, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 98, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 19, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 84, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 86, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 42, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 108, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 50, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 66, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 62, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 99, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 94, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 109, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 58, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 53, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 34, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 117, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 8, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 60, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 111, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 39, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 101, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 65, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 18, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 67, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 94, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 8, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 75, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 17, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 90, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 116, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 113, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 32, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 106, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 96, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 2, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 25, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 100, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 42, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 58, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 55, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 63, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 74, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 76, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 47, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 78, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 89, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 112, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 6, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 107, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 93, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 94, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 119, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 27, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 9, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 7, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 20, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 71, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 9, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 10, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 20, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 33, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 15, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 66, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 63, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 101, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 21, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 47, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 102, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 116, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 45, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 63, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 104, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 9, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 54, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 15, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 117, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 26, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 19, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 71, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 120, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 90, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 22, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 81, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 112, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 98, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 28, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 90, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 14, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 83, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 3, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 17, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 119, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 2, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 99, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 80, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 118, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 4, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 24, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 56, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 34, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 54, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 82, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 2, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 20, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 10, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 107, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 75, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 37, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 28, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 109, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 68, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 120, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 78, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 42, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 100, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 32, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 24, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 80, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 94, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 6, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 47, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 114, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 68, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 73, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 103, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 78, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 120, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 116, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 32, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 107, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 54, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 76, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 100, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 51, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 117, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 112, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 69, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 42, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 29, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 65, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 17, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 118, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 96, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 73, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 120, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 110, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 35, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 62, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 57, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 61, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 52, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 101, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 82, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 23, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 115, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 105, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 79, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 104, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 74, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 35, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 80, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 17, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 87, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 25, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 37, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 92, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 23, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 89, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 42, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 45, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 114, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 36, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 21, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 41, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 43, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 37, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 93, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 40, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 95, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 105, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 90, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 11, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 90, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 103, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 41, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 64, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 39, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 23, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 103, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 51, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 7, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 11, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 21, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 46, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 28, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 118, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 31, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 18, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 28, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 19, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 12, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 5, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 78, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 89, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 116, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 72, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 100, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 94, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 21, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 48, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 84, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 83, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 58, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 83, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 59, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 76, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 14, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 113, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 68, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 23, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 7, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 52, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 120, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 50, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 117, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 98, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 109, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 54, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 106, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 64, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 34, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 80, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 105, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 110, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 22, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 56, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 119, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 69, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 82, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 24, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 63, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 109, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 35, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 57, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 77, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 107, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 115, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 88, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 16, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 24, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 54, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 59, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 28, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 79, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 28, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 34, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 100, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 118, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 14, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 109, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 118, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 106, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 8, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 34, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 20, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 87, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 93, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 63, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 114, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 99, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 31, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 76, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 108, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 107, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 105, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 17, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 108, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 101, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 109, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 58, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 77, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 24, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 69, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 65, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 90, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 67, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 107, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 85, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 110, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 49, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 95, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 21, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 84, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 39, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 40, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 75, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 42, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 106, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 65, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 96, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 62, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 50, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 30, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 59, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 3, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 82, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 86, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 33, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 59, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 59, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 56, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 83, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 27, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 70, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 40, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 109, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 12, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 57, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 73, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 2, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 77, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 54, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 105, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 99, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 52, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 25, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 66, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 63, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 60, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 8, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 5, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 9, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 14, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 59, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 14, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 47, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 98, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 75, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 117, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 47, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 28, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 44, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 89, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 42, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 105, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 4, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 44, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 75, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 65, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 11, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 83, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 30, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 4, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 115, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 109, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 107, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 39, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 88, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 9, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 10, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 86, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 71, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 74, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 93, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 89, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 71, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 76, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 75, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 41, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 116, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 101, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 81, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 113, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 65, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 7, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 33, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 7, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 11, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 50, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 44, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 90, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 107, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 116, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 65, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 99, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 25, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 2, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 30, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 22, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 3, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 22, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 67, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 104, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 38, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 73, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 4, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 64, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 97, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 71, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 85, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 87, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 71, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 56, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 117, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 66, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 99, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 26, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 85, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 76, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 67, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 106, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 80, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 30, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 78, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 90, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 3, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 49, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 96, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 41, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 3, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 24, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 19, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 48, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 91, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 113, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 62, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 97, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 101, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 10, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 95, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 32, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 30, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 93, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 34, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 99, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 28, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 30, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 105, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 100, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 97, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 49, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 51, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 19, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 103, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 14, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 87, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 53, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 107, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 15, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 15, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 26, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 115, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 30, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 40, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 96, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 114, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 89, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 62, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 19, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 25, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 64, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 82, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 38, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 93, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 91, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 29, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 9, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 101, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 70, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 116, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 50, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 19, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 86, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 51, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 102, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 64, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 26, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 76, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 23, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 1, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 45, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 95, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 4, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 102, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 8, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 17, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 78, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 23, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 90, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 79, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 111, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 87, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 89, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 17, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 75, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 115, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 48, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 89, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 56, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 50, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 81, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 11, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 7, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 67, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 42, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 53, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 74, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 99, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 26, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 94, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 38, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 39, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 114, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 112, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 40, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 92, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 93, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 39, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 41, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 115, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 106, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 57, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 116, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 40, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 23, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 109, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 76, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 88, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 13, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 78, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 81, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 72, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 32, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 88, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 49, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 75, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 38, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 71, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 8, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 74, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 13, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 44, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 34, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 59, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 118, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 17, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 110, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 76, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 118, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 33, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 74, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 70, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 81, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 43, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 19, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 100, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 55, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 22, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 60, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 19, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 90, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 12, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 99, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 98, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 67, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 96, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 89, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 89, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 89, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 113, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 104, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 11, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 19, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 95, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 68, new IntPred(255, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 13, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 19, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 3, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 29, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 14, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 35, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 56, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 97, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 79, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 1, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 14, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 35, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 74, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 20, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 99, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 41, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 101, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 6, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 50, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 55, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 6, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 9, new IntPred(305, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 6, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 110, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 117, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 108, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 45, new IntPred(76, 167), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 25, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 54, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 77, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 15, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 28, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 30, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 23, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 61, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 69, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 11, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 35, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 52, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 69, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 23, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 88, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 10, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 30, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 67, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 116, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 13, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 75, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 77, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 1, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 97, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 20, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 44, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 83, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 24, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 73, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 96, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 63, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 97, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 76, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 61, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 43, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 107, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 34, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 22, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 26, new IntPred(0, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 48, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 40, new IntPred(168, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 35, new IntPred(251, 254), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 71, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 85, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 103, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 5, new IntPred(384, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 46, new IntPred(461, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 6, new IntPred(501, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 1, new IntPred(0, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 47, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 8, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 76, new IntPred(251, 254), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 99, new IntPred(255, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 44, new IntPred(273, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 117, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 64, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 84, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 13, new IntPred(501, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 97, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 94, new IntPred(76, 167), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 106, new IntPred(168, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 50, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 57, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 29, new IntPred(273, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 73, new IntPred(305, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 5, new IntPred(384, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 5, new IntPred(461, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 116, new IntPred(501, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 85, new IntPred(0, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 28, new IntPred(76, 167), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 5, new IntPred(168, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 100, new IntPred(251, 254), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 116, new IntPred(255, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 86, new IntPred(273, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 118, new IntPred(305, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 34, new IntPred(384, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 86, new IntPred(461, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 98, new IntPred(501, null), 'a'));
return trans;
}

}
