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
public class Random120States10SigmaE20260527124609{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 91, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 72, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 75, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 116, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 71, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 54, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 95, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 47, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 66, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 75, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 117, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 103, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 90, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 119, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 58, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 55, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 80, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 80, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 56, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 69, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 79, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 103, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 67, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 54, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 115, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 117, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 82, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 59, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 45, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 83, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 32, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 114, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 85, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 110, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 49, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 83, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 53, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 50, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 45, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 116, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 82, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 103, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 110, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 44, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 63, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 56, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 53, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 62, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 114, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 97, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 53, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 88, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 53, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 119, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 98, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 41, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 83, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 114, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 81, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 89, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 107, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 114, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 47, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 86, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 65, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 66, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 69, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 41, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 23, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 90, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 103, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 106, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 107, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 64, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 61, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 101, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 70, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 112, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 80, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 59, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 68, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 75, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 66, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 103, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 62, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 82, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 64, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 117, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 116, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 95, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 60, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 108, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 44, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 93, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 77, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 91, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 63, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 106, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 49, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 118, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 86, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 96, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 93, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 105, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 117, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 103, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 86, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 57, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 98, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 80, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 30, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 92, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 42, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 77, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 64, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 72, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 54, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 35, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 77, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 69, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 45, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 58, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 69, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 78, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 58, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 100, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 93, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 102, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 105, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 107, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 91, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 38, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 116, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 46, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 117, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 49, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 52, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 108, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 91, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 107, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 86, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 31, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 77, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 116, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 114, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 73, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 117, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 102, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 88, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 110, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 59, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 42, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 93, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 43, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 40, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 74, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 84, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 70, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 92, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 98, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 48, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 77, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 81, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 94, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 102, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 81, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 64, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 113, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 112, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 44, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 93, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 62, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 67, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 63, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 116, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 110, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 51, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 88, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 43, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 78, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 114, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 67, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 99, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 86, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 82, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 41, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 105, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 114, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 102, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 71, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 105, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 72, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 92, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 12, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 79, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 74, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 61, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 103, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 93, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 93, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 97, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 95, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 85, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 16, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 85, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 62, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 28, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 102, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 91, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 41, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 49, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 82, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 117, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 49, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 116, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 66, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 58, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 81, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 75, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 53, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 114, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 52, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 107, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 103, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 117, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 65, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 108, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 70, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 106, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 106, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 91, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 91, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 83, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 118, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 90, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 107, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 100, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 120, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 90, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 54, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 101, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 34, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 113, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 67, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 85, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 97, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 90, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 94, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 80, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 108, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 101, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 66, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 85, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 48, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 100, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 74, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 114, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 12, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 116, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 93, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 70, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 59, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 87, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 73, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 56, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 44, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 36, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 97, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 45, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 96, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 32, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 64, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 107, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 115, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 97, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 65, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 52, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 66, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 95, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 19, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 79, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 101, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 58, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 93, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 66, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 86, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 97, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 94, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 111, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 47, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 118, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 29, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 70, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 73, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 18, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 65, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 69, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 113, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 58, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 82, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 64, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 29, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 118, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 69, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 8, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 62, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 54, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 70, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 86, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 6, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 53, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 28, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 79, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 113, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 48, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 6, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 5, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 70, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 111, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 35, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 38, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 90, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 63, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 69, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 117, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 88, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 23, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 64, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 120, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 103, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 32, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 41, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 92, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 74, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 6, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 10, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 10, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 102, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 7, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 19, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 46, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 73, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 75, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 59, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 21, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 71, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 35, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 28, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 9, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 51, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 14, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 85, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 33, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 27, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 116, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 51, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 94, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 44, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 99, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 92, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 1, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 39, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 76, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 43, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 107, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 101, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 21, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 90, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 2, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 74, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 82, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 59, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 34, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 16, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 43, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 16, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 64, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 14, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 28, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 92, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 93, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 20, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 113, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 68, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 35, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 117, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 10, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 80, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 15, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 38, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 32, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 19, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 110, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 78, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 95, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 88, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 41, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 6, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 36, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 28, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 72, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 47, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 9, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 39, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 106, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 79, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 86, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 116, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 34, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 113, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 82, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 104, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 92, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 7, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 29, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 88, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 60, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 88, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 62, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 111, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 116, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 46, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 23, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 107, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 24, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 4, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 93, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 59, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 80, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 29, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 25, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 67, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 49, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 34, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 59, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 109, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 90, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 88, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 108, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 107, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 37, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 107, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 71, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 27, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 55, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 55, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 50, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 28, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 84, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 71, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 8, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 1, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 73, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 35, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 19, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 84, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 111, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 84, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 10, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 36, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 9, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 5, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 74, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 9, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 2, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 17, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 55, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 68, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 57, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 41, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 98, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 58, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 46, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 77, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 88, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 84, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 55, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 12, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 85, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 39, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 109, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 3, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 100, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 53, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 6, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 19, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 113, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 55, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 105, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 8, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 17, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 62, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 99, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 58, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 36, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 112, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 15, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 106, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 60, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 2, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 5, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 115, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 21, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 28, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 61, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 3, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 5, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 66, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 43, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 73, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 67, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 16, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 11, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 38, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 105, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 3, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 91, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 110, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 83, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 36, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 5, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 54, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 53, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 92, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 45, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 84, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 67, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 60, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 116, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 84, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 36, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 64, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 104, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 52, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 92, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 50, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 90, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 33, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 42, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 117, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 110, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 102, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 69, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 82, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 13, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 89, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 118, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 103, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 59, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 93, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 102, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 15, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 112, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 60, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 23, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 39, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 70, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 40, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 93, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 64, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 114, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 114, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 118, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 81, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 108, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 58, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 118, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 67, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 58, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 27, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 51, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 83, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 93, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 111, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 76, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 119, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 32, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 35, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 16, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 85, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 5, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 1, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 35, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 32, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 88, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 72, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 16, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 28, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 59, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 25, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 38, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 86, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 120, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 47, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 29, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 118, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 31, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 19, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 17, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 36, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 25, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 37, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 50, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 93, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 3, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 69, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 16, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 45, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 19, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 84, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 102, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 35, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 55, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 7, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 58, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 10, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 53, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 55, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 105, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 62, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 97, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 47, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 23, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 67, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 91, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 82, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 87, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 11, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 97, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 86, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 40, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 65, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 26, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 31, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 24, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 102, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 105, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 34, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 81, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 89, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 29, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 1, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 63, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 11, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 118, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 54, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 87, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 27, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 72, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 83, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 87, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 72, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 26, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 76, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 89, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 3, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 55, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 119, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 95, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 103, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 95, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 60, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 99, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 40, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 41, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 51, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 93, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 51, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 9, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 79, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 26, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 40, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 113, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 77, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 52, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 65, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 1, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 35, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 14, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 2, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 64, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 67, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 15, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 57, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 114, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 7, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 100, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 84, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 26, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 20, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 111, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 95, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 95, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 49, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 108, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 77, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 32, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 14, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 40, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 28, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 1, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 87, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 10, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 52, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 70, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 9, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 28, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 6, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 21, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 65, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 97, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 46, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 38, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 18, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 46, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 106, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 83, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 29, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 18, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 98, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 58, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 55, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 7, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 120, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 88, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 24, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 17, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 71, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 21, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 41, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 19, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 86, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 12, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 115, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 111, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 108, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 113, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 28, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 116, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 59, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 3, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 50, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 63, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 78, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 73, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 15, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 61, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 100, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 39, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 109, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 100, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 37, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 48, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 1, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 31, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 97, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 26, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 83, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 17, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 14, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 63, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 33, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 70, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 40, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 80, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 40, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 63, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 17, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 41, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 29, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 52, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 88, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 18, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 22, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 89, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 83, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 2, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 27, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 91, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 63, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 43, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 112, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 26, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 12, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 67, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 50, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 87, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 59, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 38, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 79, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 4, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 65, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 119, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 33, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 64, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 60, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 53, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 9, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 2, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 82, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 96, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 29, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 19, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 94, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 67, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 52, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 47, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 13, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 8, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 118, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 2, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 18, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 74, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 78, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 3, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 39, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 52, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 81, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 78, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 54, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 28, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 79, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 84, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 41, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 108, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 55, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 74, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 15, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 117, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 92, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 2, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 80, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 115, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 92, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 26, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 29, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 86, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 52, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 24, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 75, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 93, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 71, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 39, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 70, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 2, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 6, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 8, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 8, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 50, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 71, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 12, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 17, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 116, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 81, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 23, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 6, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 95, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 35, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 108, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 108, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 30, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 98, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 20, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 83, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 101, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 113, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 25, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 13, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 26, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 40, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 116, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 6, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 86, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 111, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 117, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 59, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 4, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 33, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 57, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 85, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 94, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 92, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 51, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 85, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 37, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 93, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 109, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 15, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 55, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 110, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 109, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 40, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 40, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 2, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 27, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 26, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 20, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 101, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 63, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 13, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 104, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 78, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 53, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 45, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 70, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 69, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 42, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 104, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 79, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 63, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 53, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 46, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 8, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 15, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 9, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 33, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 8, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 37, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 111, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 68, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 6, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 8, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 6, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 38, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 76, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 69, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 117, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 22, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 88, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 15, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 5, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 46, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 16, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 94, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 1, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 73, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 99, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 27, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 22, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 46, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 76, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 23, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 85, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 4, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 56, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 89, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 102, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 54, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 76, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 46, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 77, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 31, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 41, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 113, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 63, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 84, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 114, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 42, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 99, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 118, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 18, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 96, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 82, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 103, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 89, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 65, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 48, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 114, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 109, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 54, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 75, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 61, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 115, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 98, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 89, new IntPred(104, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 87, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 13, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 89, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 60, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 100, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 66, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 35, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 54, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 86, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 67, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 88, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 103, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 67, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 34, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 26, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 36, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 67, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 114, new IntPred(45, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 56, new IntPred(47, 103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 95, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 25, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 44, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 79, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 44, new IntPred(271, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 31, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 38, new IntPred(335, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 33, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 79, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 28, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 27, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 32, new IntPred(152, 206), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 120, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 103, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 71, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 32, new IntPred(272, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 120, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 10, new IntPred(0, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 98, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 82, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 116, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 65, new IntPred(152, 206), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 18, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 93, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 119, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 26, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 67, new IntPred(335, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 85, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 97, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 109, new IntPred(47, 103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 56, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 46, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 116, new IntPred(207, 226), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 51, new IntPred(227, 270), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 16, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 120, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 10, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 89, new IntPred(0, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 52, new IntPred(45, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 114, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 26, new IntPred(104, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 11, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 5, new IntPred(207, 226), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 104, new IntPred(227, 270), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 19, new IntPred(271, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 99, new IntPred(272, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 88, new IntPred(335, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 62, new IntPred(0, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 101, new IntPred(45, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 113, new IntPred(47, 103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 91, new IntPred(104, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 20, new IntPred(152, 206), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 116, new IntPred(207, 226), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 42, new IntPred(227, 270), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 103, new IntPred(271, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 98, new IntPred(272, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 54, new IntPred(335, null), 'b'));
return trans;
}

}
