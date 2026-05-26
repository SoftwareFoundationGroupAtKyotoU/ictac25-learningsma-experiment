package experiment.Random120States20SigmaE20260527124623;
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
public class Random120States20SigmaE20260527124627{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 48, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 54, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 65, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 118, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 79, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 53, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 47, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 46, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 57, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 119, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 68, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 44, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 68, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 83, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 110, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 101, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 51, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 72, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 67, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 64, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 54, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 89, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 86, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 23, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 116, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 58, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 100, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 43, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 49, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 106, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 100, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 54, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 52, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 82, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 104, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 100, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 101, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 63, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 43, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 78, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 61, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 57, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 111, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 99, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 120, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 96, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 86, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 76, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 47, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 104, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 109, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 115, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 41, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 117, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 77, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 47, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 67, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 95, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 73, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 96, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 97, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 49, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 91, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 67, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 63, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 105, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 69, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 109, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 75, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 103, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 46, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 60, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 107, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 49, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 61, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 67, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 97, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 105, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 80, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 98, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 45, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 114, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 119, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 114, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 102, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 46, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 43, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 62, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 61, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 51, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 96, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 59, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 86, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 73, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 82, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 68, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 72, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 102, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 88, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 101, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 94, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 105, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 118, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 50, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 95, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 97, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 66, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 114, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 42, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 109, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 70, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 79, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 112, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 47, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 108, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 38, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 101, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 68, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 44, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 32, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 100, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 81, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 72, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 98, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 75, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 91, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 57, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 99, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 93, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 57, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 72, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 47, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 72, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 88, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 118, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 92, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 53, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 42, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 114, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 79, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 101, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 55, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 93, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 86, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 51, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 67, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 61, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 66, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 47, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 28, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 74, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 102, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 106, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 96, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 56, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 85, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 77, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 41, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 60, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 89, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 90, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 95, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 93, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 47, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 98, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 74, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 48, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 76, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 113, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 56, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 30, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 118, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 114, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 111, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 114, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 53, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 54, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 79, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 40, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 72, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 91, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 94, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 49, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 92, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 63, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 23, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 107, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 96, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 56, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 87, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 83, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 94, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 56, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 88, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 85, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 83, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 53, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 106, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 89, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 86, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 54, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 106, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 91, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 54, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 88, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 49, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 54, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 79, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 113, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 59, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 95, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 90, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 113, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 89, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 30, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 57, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 104, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 104, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 27, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 112, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 90, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 72, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 92, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 93, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 62, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 55, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 92, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 87, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 110, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 56, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 46, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 50, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 94, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 22, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 110, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 64, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 103, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 49, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 111, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 89, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 86, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 64, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 102, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 55, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 83, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 115, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 67, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 48, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 101, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 81, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 30, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 98, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 84, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 76, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 90, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 119, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 64, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 55, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 98, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 104, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 87, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 107, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 47, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 64, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 117, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 118, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 112, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 93, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 104, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 67, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 106, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 119, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 91, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 50, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 63, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 96, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 70, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 49, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 102, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 52, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 67, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 92, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 44, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 12, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 87, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 96, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 45, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 69, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 75, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 71, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 42, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 118, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 91, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 105, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 55, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 72, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 112, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 51, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 119, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 116, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 46, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 90, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 108, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 115, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 53, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 102, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 99, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 44, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 47, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 76, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 116, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 68, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 46, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 72, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 88, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 53, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 95, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 72, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 108, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 48, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 103, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 74, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 64, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 47, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 99, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 60, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 95, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 93, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 109, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 114, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 76, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 54, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 104, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 79, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 78, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 89, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 116, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 53, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 54, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 109, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 117, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 120, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 43, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 52, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 45, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 114, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 81, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 103, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 80, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 46, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 41, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 78, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 63, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 27, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 102, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 104, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 97, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 95, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 113, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 104, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 71, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 64, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 70, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 102, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 94, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 85, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 104, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 48, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 81, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 56, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 56, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 82, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 83, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 72, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 77, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 110, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 102, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 67, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 104, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 82, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 83, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 87, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 75, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 99, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 57, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 118, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 52, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 84, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 120, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 80, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 89, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 98, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 69, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 103, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 83, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 48, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 41, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 82, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 98, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 62, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 118, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 73, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 97, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 118, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 44, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 57, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 82, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 96, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 80, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 79, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 71, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 96, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 92, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 90, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 60, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 106, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 91, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 27, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 94, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 44, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 101, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 48, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 89, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 5, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 81, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 54, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 59, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 71, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 82, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 46, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 81, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 98, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 57, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 90, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 81, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 57, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 99, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 83, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 83, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 55, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 72, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 12, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 42, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 12, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 108, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 95, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 77, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 53, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 70, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 71, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 63, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 45, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 87, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 48, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 71, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 44, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 70, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 63, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 87, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 117, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 61, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 86, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 56, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 110, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 112, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 43, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 71, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 69, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 99, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 43, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 103, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 100, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 82, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 116, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 48, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 77, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 68, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 70, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 58, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 92, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 60, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 88, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 80, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 98, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 64, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 94, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 85, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 107, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 101, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 76, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 99, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 99, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 110, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 110, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 120, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 115, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 114, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 63, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 112, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 60, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 43, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 83, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 108, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 53, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 69, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 26, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 88, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 47, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 65, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 99, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 110, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 57, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 106, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 110, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 80, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 105, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 106, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 104, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 84, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 65, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 81, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 73, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 114, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 64, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 44, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 58, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 88, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 84, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 101, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 76, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 65, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 78, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 78, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 62, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 47, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 86, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 8, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 85, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 35, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 13, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 120, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 112, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 114, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 15, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 51, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 92, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 98, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 93, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 102, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 16, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 82, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 109, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 85, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 5, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 52, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 101, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 79, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 63, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 77, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 76, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 106, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 41, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 47, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 96, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 15, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 25, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 24, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 63, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 38, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 70, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 78, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 65, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 92, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 73, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 61, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 52, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 58, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 108, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 23, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 23, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 55, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 34, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 3, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 6, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 92, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 51, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 44, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 86, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 94, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 113, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 62, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 26, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 70, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 38, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 12, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 80, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 120, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 29, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 39, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 82, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 72, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 99, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 84, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 9, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 93, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 100, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 35, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 76, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 42, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 50, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 88, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 85, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 104, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 6, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 28, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 90, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 6, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 37, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 75, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 101, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 116, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 66, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 27, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 111, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 111, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 101, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 51, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 69, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 81, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 32, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 110, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 101, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 66, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 37, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 119, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 103, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 28, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 43, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 109, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 93, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 104, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 32, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 30, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 37, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 91, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 47, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 77, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 19, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 101, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 97, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 29, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 89, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 95, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 109, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 5, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 34, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 26, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 57, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 59, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 24, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 44, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 96, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 51, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 98, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 59, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 43, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 24, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 50, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 9, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 111, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 88, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 112, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 3, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 88, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 66, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 101, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 30, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 78, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 86, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 80, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 105, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 12, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 4, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 119, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 87, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 94, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 39, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 89, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 120, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 104, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 85, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 79, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 49, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 18, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 31, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 101, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 13, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 99, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 53, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 17, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 33, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 13, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 99, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 56, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 111, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 30, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 30, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 46, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 88, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 114, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 76, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 47, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 3, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 111, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 18, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 42, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 67, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 64, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 5, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 66, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 118, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 13, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 87, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 95, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 27, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 21, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 19, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 30, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 57, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 48, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 63, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 109, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 52, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 73, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 58, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 107, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 39, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 101, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 29, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 58, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 88, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 92, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 20, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 71, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 33, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 85, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 4, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 94, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 11, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 59, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 92, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 8, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 10, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 44, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 117, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 102, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 94, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 61, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 52, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 12, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 117, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 105, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 29, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 73, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 100, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 81, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 55, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 75, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 53, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 35, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 68, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 101, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 48, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 30, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 95, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 19, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 97, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 45, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 58, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 91, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 73, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 23, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 18, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 59, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 9, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 60, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 85, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 98, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 25, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 33, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 87, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 119, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 33, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 106, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 101, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 61, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 4, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 103, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 72, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 65, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 16, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 114, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 25, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 97, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 82, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 69, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 84, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 108, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 36, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 103, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 111, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 102, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 9, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 101, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 33, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 10, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 101, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 98, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 85, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 72, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 87, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 97, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 118, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 95, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 7, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 95, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 83, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 105, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 58, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 68, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 10, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 59, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 51, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 80, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 11, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 106, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 88, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 26, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 50, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 71, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 117, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 34, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 36, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 31, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 77, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 15, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 95, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 48, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 54, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 15, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 79, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 53, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 27, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 12, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 69, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 52, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 81, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 62, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 42, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 84, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 8, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 42, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 21, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 14, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 19, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 96, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 67, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 37, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 84, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 14, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 71, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 16, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 67, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 65, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 109, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 94, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 57, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 72, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 61, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 39, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 73, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 90, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 45, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 75, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 40, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 96, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 47, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 116, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 117, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 79, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 107, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 64, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 69, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 99, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 16, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 6, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 7, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 19, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 16, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 54, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 112, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 98, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 23, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 113, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 118, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 115, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 33, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 40, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 10, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 81, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 59, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 8, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 48, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 56, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 94, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 43, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 76, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 22, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 93, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 19, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 30, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 26, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 90, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 12, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 64, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 47, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 117, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 63, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 44, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 23, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 87, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 83, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 40, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 56, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 68, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 27, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 29, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 15, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 22, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 7, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 44, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 64, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 73, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 34, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 20, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 84, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 16, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 62, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 22, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 19, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 49, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 94, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 34, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 18, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 61, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 79, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 65, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 111, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 91, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 80, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 87, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 25, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 91, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 18, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 28, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 75, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 98, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 75, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 19, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 47, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 116, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 73, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 105, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 56, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 83, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 67, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 70, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 74, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 53, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 95, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 87, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 80, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 30, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 104, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 69, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 90, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 21, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 105, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 28, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 86, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 75, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 62, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 50, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 55, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 42, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 56, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 38, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 82, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 55, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 19, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 86, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 65, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 47, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 92, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 113, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 90, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 86, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 87, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 51, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 81, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 20, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 68, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 97, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 28, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 21, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 22, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 108, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 49, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 118, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 52, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 109, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 51, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 53, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 116, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 56, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 62, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 113, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 105, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 99, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 87, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 39, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 34, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 1, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 52, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 112, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 111, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 112, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 105, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 54, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 51, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 63, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 110, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 59, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 110, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 12, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 94, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 12, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 116, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 115, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 117, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 107, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 45, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 69, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 10, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 3, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 26, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 69, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 2, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 110, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 29, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 82, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 101, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 118, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 24, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 108, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 2, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 75, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 70, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 29, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 16, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 61, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 84, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 59, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 90, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 111, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 36, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 114, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 59, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 110, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 111, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 11, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 89, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 96, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 22, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 58, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 106, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 27, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 102, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 2, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 105, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 98, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 62, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 90, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 71, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 97, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 78, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 12, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 60, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 24, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 51, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 101, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 48, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 48, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 77, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 17, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 61, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 33, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 78, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 6, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 95, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 33, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 110, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 3, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 89, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 28, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 93, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 112, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 22, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 64, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 11, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 73, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 69, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 106, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 7, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 102, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 53, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 77, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 74, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 116, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 26, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 118, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 82, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 31, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 119, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 108, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 16, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 11, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 98, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 54, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 45, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 44, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 21, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 105, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 51, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 43, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 3, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 20, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 101, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 120, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 92, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 21, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 116, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 9, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 91, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 28, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 94, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 94, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 113, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 93, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 82, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 60, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 66, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 51, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 33, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 119, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 53, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 111, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 87, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 106, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 98, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 56, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 8, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 11, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 3, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 33, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 93, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 81, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 5, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 48, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 119, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 14, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 99, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 104, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 112, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 46, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 42, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 111, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 74, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 32, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 10, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 90, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 61, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 55, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 30, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 10, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 115, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 59, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 45, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 100, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 111, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 108, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 81, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 77, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 96, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 91, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 51, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 3, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 101, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 53, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 90, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 8, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 23, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 33, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 39, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 84, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 63, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 7, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 79, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 56, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 80, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 106, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 37, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 119, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 67, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 120, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 11, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 15, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 6, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 9, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 43, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 1, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 57, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 70, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 28, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 73, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 116, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 53, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 3, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 98, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 49, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 14, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 85, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 11, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 76, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 61, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 18, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 111, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 54, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 66, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 76, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 117, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 67, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 47, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 52, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 29, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 109, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 115, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 26, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 56, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 104, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 79, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 76, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 60, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 95, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 8, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 89, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 89, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 94, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 50, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 1, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 50, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 52, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 19, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 73, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 73, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 112, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 4, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 14, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 12, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 110, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 9, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 87, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 30, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 116, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 35, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 120, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 105, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 43, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 107, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 42, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 85, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 96, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 43, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 68, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 58, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 65, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 27, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 39, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 72, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 98, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 28, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 12, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 27, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 4, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 90, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 58, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 109, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 85, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 116, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 11, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 49, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 61, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 96, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 5, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 75, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 84, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 57, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 100, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 19, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 63, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 59, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 91, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 73, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 66, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 115, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 34, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 103, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 117, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 17, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 38, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 84, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 41, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 15, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 109, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 21, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 82, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 72, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 65, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 12, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 108, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 28, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 34, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 27, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 95, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 88, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 94, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 87, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 100, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 48, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 91, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 119, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 15, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 95, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 96, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 83, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 69, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 19, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 65, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 111, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 21, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 51, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 2, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 111, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 49, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 106, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 25, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 90, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 107, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 3, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 46, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 82, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 18, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 52, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 51, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 48, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 28, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 93, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 109, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 73, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 27, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 48, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 91, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 69, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 90, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 24, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 36, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 92, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 103, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 52, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 43, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 41, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 64, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 114, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 52, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 49, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 16, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 86, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 101, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 90, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 72, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 106, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 8, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 78, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 16, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 85, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 45, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 7, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 45, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 63, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 2, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 106, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 82, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 72, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 68, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 70, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 17, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 54, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 53, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 36, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 9, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 53, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 14, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 62, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 95, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 62, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 59, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 81, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 30, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 18, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 52, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 13, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 1, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 78, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 72, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 65, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 69, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 7, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 57, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 1, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 74, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 21, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 108, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 66, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 17, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 17, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 80, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 82, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 100, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 72, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 60, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 82, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 66, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 39, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 67, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 77, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 98, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 6, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 49, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 120, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 101, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 88, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 28, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 10, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 78, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 55, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 117, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 59, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 107, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 105, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 14, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 110, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 51, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 47, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 76, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 56, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 47, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 42, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 117, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 56, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 50, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 79, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 80, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 103, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 107, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 58, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 105, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 71, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 40, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 11, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 51, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 94, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 83, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 101, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 70, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 82, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 22, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 12, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 96, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 35, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 63, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 20, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 86, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 69, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 103, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 15, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 106, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 53, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 28, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 77, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 59, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 89, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 52, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 74, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 18, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 107, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 52, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 77, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 81, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 68, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 18, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 5, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 116, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 106, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 88, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 52, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 89, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 68, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 50, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 62, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 25, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 98, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 12, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 16, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 94, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 63, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 30, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 19, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 85, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 33, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 34, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 55, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 59, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 61, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 50, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 34, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 98, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 117, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 76, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 105, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 50, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 99, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 47, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 59, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 50, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 77, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 13, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 11, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 110, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 1, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 49, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 92, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 55, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 71, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 16, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 116, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 49, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 100, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 41, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 19, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 118, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 67, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 79, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 27, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 37, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 3, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 59, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 95, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 55, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 118, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 108, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 54, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 69, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 37, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 56, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 14, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 5, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 6, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 98, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 19, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 116, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 8, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 12, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 87, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 92, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 100, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 100, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 25, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 21, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 19, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 64, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 120, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 100, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 116, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 43, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 103, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 32, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 36, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 32, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 120, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 2, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 101, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 43, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 3, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 2, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 26, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 61, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 22, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 46, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 87, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 54, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 91, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 77, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 3, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 75, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 31, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 37, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 62, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 31, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 79, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 74, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 109, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 27, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 42, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 88, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 75, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 63, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 68, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 29, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 64, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 72, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 54, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 82, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 19, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 50, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 25, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 49, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 25, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 117, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 2, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 45, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 13, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 26, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 100, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 86, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 47, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 85, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 99, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 52, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 104, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 58, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 61, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 97, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 25, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 81, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 25, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 50, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 113, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 27, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 81, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 92, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 14, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 92, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 57, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 112, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 80, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 97, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 47, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 33, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 27, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 73, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 11, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 58, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 67, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 30, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 118, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 98, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 79, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 51, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 4, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 41, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 112, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 60, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 99, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 66, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 17, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 11, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 4, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 25, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 78, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 47, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 79, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 116, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 78, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 44, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 32, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 100, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 115, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 80, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 38, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 82, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 15, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 25, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 8, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 12, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 31, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 17, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 8, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 15, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 89, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 116, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 98, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 52, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 46, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 87, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 99, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 29, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 42, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 88, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 19, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 62, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 73, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 82, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 93, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 46, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 74, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 71, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 100, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 21, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 45, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 38, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 118, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 118, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 38, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 76, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 18, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 68, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 81, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 84, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 51, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 78, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 14, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 33, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 44, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 20, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 4, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 64, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 19, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 57, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 7, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 65, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 120, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 17, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 91, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 37, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 92, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 74, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 64, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 30, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 61, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 44, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 94, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 59, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 46, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 99, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 104, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 99, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 89, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 65, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 3, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 119, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 118, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 70, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 5, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 98, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 83, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 18, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 80, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 114, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 51, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 87, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 62, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 94, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 9, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 65, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 84, new IntPred(1013, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 47, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 44, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 23, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 33, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 73, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 26, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 25, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 53, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 112, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 103, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 49, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 36, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 29, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 52, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 116, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 50, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 97, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 106, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 80, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 39, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 110, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 46, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 101, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 42, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 11, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 53, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 22, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 23, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 22, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 110, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 7, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 51, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 1, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 5, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 110, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 84, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 119, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 83, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 107, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 51, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 21, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 73, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 65, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 43, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 35, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 4, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 93, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 49, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 99, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 31, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 35, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 51, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 22, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 62, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 54, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 91, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 20, new IntPred(832, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 87, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 111, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 67, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 114, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 32, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 90, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 89, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 42, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 118, new IntPred(126, 211), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 38, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 82, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 105, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 2, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 99, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 7, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 10, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 35, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 51, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 77, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 61, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 120, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 19, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 110, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 84, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 44, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 81, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 27, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 26, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 83, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 69, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 91, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 28, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 33, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 81, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 26, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 81, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 95, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 99, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 93, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 4, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 119, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 64, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 2, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 46, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 77, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 72, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 74, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 78, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 30, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 102, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 57, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 58, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 113, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 23, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 58, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 13, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 90, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 7, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 68, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 57, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 108, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 105, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 65, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 28, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 36, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 102, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 20, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 77, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 75, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 10, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 64, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 117, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 34, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 4, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 101, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 87, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 36, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 99, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 76, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 2, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 49, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 83, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 7, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 51, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 95, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 40, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 12, new IntPred(33, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 94, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 113, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 24, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 49, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 76, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 82, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 19, new IntPred(533, 546), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 38, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 75, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 56, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 4, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 72, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 11, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 59, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 6, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 10, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 5, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 84, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 9, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 59, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 116, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 41, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 20, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 100, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 69, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 13, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 90, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 113, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 56, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 82, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 63, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 61, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 30, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 104, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 82, new IntPred(1002, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 120, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 74, new IntPred(1093, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 68, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 90, new IntPred(24, 32), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 50, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 27, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 92, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 107, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 119, new IntPred(308, 397), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 62, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 112, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 80, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 58, new IntPred(547, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 37, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 16, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 16, new IntPred(744, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 115, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 28, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 33, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 98, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 3, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 64, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 66, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 58, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 93, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 104, new IntPred(121, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 57, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 12, new IntPred(212, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 45, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 70, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 72, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 70, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 42, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 117, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 116, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 104, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 12, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 49, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 25, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 92, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 64, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 116, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 105, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 112, new IntPred(24, 32), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 49, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 69, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 36, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 56, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 54, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 96, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 103, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 22, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 57, new IntPred(547, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 67, new IntPred(620, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 103, new IntPred(686, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 52, new IntPred(744, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 36, new IntPred(779, 831), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 4, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 28, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 110, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 91, new IntPred(1013, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 61, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 104, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 115, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 118, new IntPred(33, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 10, new IntPred(121, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 87, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 42, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 45, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 32, new IntPred(398, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 111, new IntPred(450, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 7, new IntPred(533, 546), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 44, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 117, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 39, new IntPred(686, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 61, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 119, new IntPred(779, 831), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 108, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 49, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 58, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 44, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 112, new IntPred(1093, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 89, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 88, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 45, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 101, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 61, new IntPred(126, 211), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 80, new IntPred(212, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 13, new IntPred(308, 397), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 99, new IntPred(398, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 61, new IntPred(450, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 30, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 64, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 45, new IntPred(620, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 26, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 82, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 117, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 116, new IntPred(832, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 96, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 107, new IntPred(1002, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 29, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 62, new IntPred(1093, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 77, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 75, new IntPred(24, 32), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 115, new IntPred(33, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 51, new IntPred(121, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 49, new IntPred(126, 211), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 16, new IntPred(212, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 59, new IntPred(308, 397), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 75, new IntPred(398, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 62, new IntPred(450, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 70, new IntPred(533, 546), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 20, new IntPred(547, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 75, new IntPred(620, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 8, new IntPred(686, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 15, new IntPred(744, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 88, new IntPred(779, 831), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 23, new IntPred(832, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 51, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 45, new IntPred(1002, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 81, new IntPred(1013, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 39, new IntPred(1093, null), 'b'));
return trans;
}

}
