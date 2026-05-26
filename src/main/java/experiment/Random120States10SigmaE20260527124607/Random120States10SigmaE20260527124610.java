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
public class Random120States10SigmaE20260527124610{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 45, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 75, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 73, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 66, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 96, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 104, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 112, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 92, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 54, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 110, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 76, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 67, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 67, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 112, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 66, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 85, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 102, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 118, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 59, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 93, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 54, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 102, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 93, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 113, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 84, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 109, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 98, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 112, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 45, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 57, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 117, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 103, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 91, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 90, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 116, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 39, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 31, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 116, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 84, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 45, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 41, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 53, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 93, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 100, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 51, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 102, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 106, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 44, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 70, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 112, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 69, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 94, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 107, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 110, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 69, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 93, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 88, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 52, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 84, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 69, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 61, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 88, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 114, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 99, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 87, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 85, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 91, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 102, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 74, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 120, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 102, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 119, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 96, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 111, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 80, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 72, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 111, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 84, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 115, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 118, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 56, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 78, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 59, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 94, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 118, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 30, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 95, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 47, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 43, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 41, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 42, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 82, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 92, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 96, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 55, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 83, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 55, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 59, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 92, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 86, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 70, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 92, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 77, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 47, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 78, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 64, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 82, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 57, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 115, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 116, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 111, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 120, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 92, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 43, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 108, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 54, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 78, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 55, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 51, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 75, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 100, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 68, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 28, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 47, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 75, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 96, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 112, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 113, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 98, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 96, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 90, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 95, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 116, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 82, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 95, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 64, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 104, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 65, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 62, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 79, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 113, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 117, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 42, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 80, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 75, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 90, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 44, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 115, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 92, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 72, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 111, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 113, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 114, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 109, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 102, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 31, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 106, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 72, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 105, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 95, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 46, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 91, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 108, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 62, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 52, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 50, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 120, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 62, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 48, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 115, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 65, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 103, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 10, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 110, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 49, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 104, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 46, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 41, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 98, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 45, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 119, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 102, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 112, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 119, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 73, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 79, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 64, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 107, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 75, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 45, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 96, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 101, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 44, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 68, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 108, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 91, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 112, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 59, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 75, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 97, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 104, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 112, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 91, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 50, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 113, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 48, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 111, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 100, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 91, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 115, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 41, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 67, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 56, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 53, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 94, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 90, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 94, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 105, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 15, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 61, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 21, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 55, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 94, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 56, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 43, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 76, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 97, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 88, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 84, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 118, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 56, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 81, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 98, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 16, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 43, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 96, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 50, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 82, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 94, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 111, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 99, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 89, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 97, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 50, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 120, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 84, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 101, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 114, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 97, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 64, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 87, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 113, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 99, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 85, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 57, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 114, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 3, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 108, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 56, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 98, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 43, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 84, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 70, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 115, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 88, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 102, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 10, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 23, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 3, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 102, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 109, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 77, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 58, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 29, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 119, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 113, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 2, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 104, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 39, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 40, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 114, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 78, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 54, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 66, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 68, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 86, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 24, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 39, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 5, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 69, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 104, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 69, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 2, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 109, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 94, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 95, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 91, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 71, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 92, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 119, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 3, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 9, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 12, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 4, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 109, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 96, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 51, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 100, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 120, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 39, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 57, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 11, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 76, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 93, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 95, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 89, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 34, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 27, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 30, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 32, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 8, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 27, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 62, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 107, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 82, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 114, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 60, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 80, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 57, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 70, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 66, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 54, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 56, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 15, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 106, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 71, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 89, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 98, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 75, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 47, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 3, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 25, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 106, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 10, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 103, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 27, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 34, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 73, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 86, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 10, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 68, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 109, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 96, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 103, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 74, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 64, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 88, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 80, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 45, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 65, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 27, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 82, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 30, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 111, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 80, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 47, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 110, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 65, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 53, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 10, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 44, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 52, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 106, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 54, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 59, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 63, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 120, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 73, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 38, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 75, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 65, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 111, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 66, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 26, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 67, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 33, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 115, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 33, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 76, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 47, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 50, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 118, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 22, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 118, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 41, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 98, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 108, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 106, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 84, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 39, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 99, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 109, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 50, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 114, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 109, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 64, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 90, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 33, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 1, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 20, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 94, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 93, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 52, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 64, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 107, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 114, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 17, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 83, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 60, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 55, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 116, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 115, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 7, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 53, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 111, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 117, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 102, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 96, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 41, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 115, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 10, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 12, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 19, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 26, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 56, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 87, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 106, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 62, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 114, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 7, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 36, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 46, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 114, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 68, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 8, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 96, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 89, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 86, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 110, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 118, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 47, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 86, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 92, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 98, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 101, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 67, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 116, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 112, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 20, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 3, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 116, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 86, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 32, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 86, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 80, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 69, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 114, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 83, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 11, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 3, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 73, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 55, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 106, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 7, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 26, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 103, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 42, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 107, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 50, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 60, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 12, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 55, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 109, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 101, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 92, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 5, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 36, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 68, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 111, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 80, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 120, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 90, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 12, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 101, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 72, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 75, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 12, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 45, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 68, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 61, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 114, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 10, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 2, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 95, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 17, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 8, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 98, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 45, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 72, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 103, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 96, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 56, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 119, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 13, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 1, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 95, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 107, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 113, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 43, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 66, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 6, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 102, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 12, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 17, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 112, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 14, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 67, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 30, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 104, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 108, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 91, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 102, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 11, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 14, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 94, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 22, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 76, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 89, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 75, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 86, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 25, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 88, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 65, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 65, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 52, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 53, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 41, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 106, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 111, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 102, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 22, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 1, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 110, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 113, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 40, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 108, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 56, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 71, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 60, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 101, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 54, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 60, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 13, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 58, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 42, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 86, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 57, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 56, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 109, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 93, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 25, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 111, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 81, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 7, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 35, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 29, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 61, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 119, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 65, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 94, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 74, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 117, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 113, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 51, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 88, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 24, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 39, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 59, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 117, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 2, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 30, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 27, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 43, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 119, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 64, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 95, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 30, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 70, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 81, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 101, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 115, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 30, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 119, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 25, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 98, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 98, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 60, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 91, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 53, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 117, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 34, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 10, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 70, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 30, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 85, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 44, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 28, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 45, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 4, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 107, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 86, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 75, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 88, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 113, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 77, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 117, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 19, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 4, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 22, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 42, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 50, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 90, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 94, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 96, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 43, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 13, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 83, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 90, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 7, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 64, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 41, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 12, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 96, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 40, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 60, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 28, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 4, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 36, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 59, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 96, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 101, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 111, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 18, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 85, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 46, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 76, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 5, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 76, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 14, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 99, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 70, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 22, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 60, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 99, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 38, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 53, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 69, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 55, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 68, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 61, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 106, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 44, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 21, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 58, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 63, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 104, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 77, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 28, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 49, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 10, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 49, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 35, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 16, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 78, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 51, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 2, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 46, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 86, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 109, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 47, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 7, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 89, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 100, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 41, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 95, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 54, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 62, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 120, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 38, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 65, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 116, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 33, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 54, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 5, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 80, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 63, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 35, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 9, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 16, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 2, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 34, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 35, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 88, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 19, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 114, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 30, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 83, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 5, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 117, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 55, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 99, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 22, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 55, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 28, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 52, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 3, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 69, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 116, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 52, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 23, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 7, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 33, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 29, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 60, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 111, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 32, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 105, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 23, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 55, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 6, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 37, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 24, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 46, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 21, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 14, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 87, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 51, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 101, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 94, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 24, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 56, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 74, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 119, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 111, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 56, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 60, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 46, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 52, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 48, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 98, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 49, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 16, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 113, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 21, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 1, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 78, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 36, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 35, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 104, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 18, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 100, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 57, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 60, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 12, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 31, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 23, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 26, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 14, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 45, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 64, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 115, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 57, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 47, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 14, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 97, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 84, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 64, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 74, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 82, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 5, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 103, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 81, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 4, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 52, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 43, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 7, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 63, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 39, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 109, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 80, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 78, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 120, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 1, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 33, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 21, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 80, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 52, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 19, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 3, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 40, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 39, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 40, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 97, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 66, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 66, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 36, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 42, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 20, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 9, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 108, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 40, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 100, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 98, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 42, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 117, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 52, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 13, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 30, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 119, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 119, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 106, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 62, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 105, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 10, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 38, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 54, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 88, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 91, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 101, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 32, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 51, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 21, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 9, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 117, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 42, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 58, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 105, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 42, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 56, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 31, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 66, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 116, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 105, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 83, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 81, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 91, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 100, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 119, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 15, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 114, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 97, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 102, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 59, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 100, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 11, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 22, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 99, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 17, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 78, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 86, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 51, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 70, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 17, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 85, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 35, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 112, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 109, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 49, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 92, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 25, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 85, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 117, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 51, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 97, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 92, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 16, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 61, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 102, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 33, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 53, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 1, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 35, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 53, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 53, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 24, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 108, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 66, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 46, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 24, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 72, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 46, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 15, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 36, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 30, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 62, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 81, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 45, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 8, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 83, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 39, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 68, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 90, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 111, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 86, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 52, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 59, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 56, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 13, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 108, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 74, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 68, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 110, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 59, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 105, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 51, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 98, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 98, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 118, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 24, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 73, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 53, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 52, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 56, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 119, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 89, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 78, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 48, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 71, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 15, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 92, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 2, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 116, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 31, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 36, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 72, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 58, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 30, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 66, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 87, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 49, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 48, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 87, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 21, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 50, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 61, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 53, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 51, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 55, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 63, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 80, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 116, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 118, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 98, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 70, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 99, new IntPred(372, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 111, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 59, new IntPred(464, 499), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 56, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 64, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 89, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 65, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 38, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 59, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 88, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 47, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 110, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 7, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 98, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 71, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 102, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 72, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 116, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 79, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 37, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 93, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 25, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 96, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 5, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 102, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 19, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 113, new IntPred(99, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 75, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 6, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 87, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 120, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 5, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 9, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 101, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 73, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 74, new IntPred(29, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 39, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 46, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 116, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 77, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 103, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 92, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 35, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 74, new IntPred(500, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 12, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 36, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 72, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 15, new IntPred(156, 198), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 59, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 70, new IntPred(287, 371), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 107, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 76, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 35, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 11, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 74, new IntPred(0, 28), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 11, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 43, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 46, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 63, new IntPred(199, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 96, new IntPred(287, 371), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 14, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 20, new IntPred(408, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 45, new IntPred(464, 499), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 97, new IntPred(500, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 50, new IntPred(0, 28), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 83, new IntPred(29, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 51, new IntPred(99, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 70, new IntPred(156, 198), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 20, new IntPred(199, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 54, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 102, new IntPred(372, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 105, new IntPred(408, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 77, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 38, new IntPred(500, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 98, new IntPred(0, 28), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 55, new IntPred(29, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 8, new IntPred(99, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 18, new IntPred(156, 198), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 114, new IntPred(199, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 6, new IntPred(287, 371), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 89, new IntPred(372, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 104, new IntPred(408, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 43, new IntPred(464, 499), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 84, new IntPred(500, null), 'b'));
return trans;
}

}
