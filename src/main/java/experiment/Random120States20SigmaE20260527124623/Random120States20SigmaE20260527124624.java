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
public class Random120States20SigmaE20260527124624{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 102, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 73, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 51, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 106, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 107, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 105, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 65, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 59, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 102, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 98, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 114, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 63, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 70, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 112, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 120, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 73, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 91, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 44, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 95, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 87, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 97, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 109, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 48, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 94, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 91, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 57, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 53, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 108, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 108, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 101, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 76, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 85, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 83, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 63, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 54, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 107, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 81, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 107, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 96, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 108, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 51, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 72, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 82, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 111, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 116, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 115, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 96, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 60, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 69, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 102, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 59, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 74, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 72, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 99, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 78, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 103, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 81, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 81, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 56, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 83, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 42, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 67, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 97, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 61, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 88, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 43, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 100, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 94, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 81, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 79, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 78, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 72, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 65, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 103, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 69, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 73, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 114, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 62, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 49, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 66, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 108, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 117, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 107, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 88, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 93, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 109, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 60, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 99, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 117, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 110, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 77, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 98, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 42, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 95, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 120, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 87, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 87, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 74, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 86, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 55, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 64, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 69, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 94, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 45, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 51, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 45, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 113, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 54, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 47, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 116, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 70, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 116, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 109, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 110, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 116, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 100, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 43, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 88, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 65, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 83, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 89, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 48, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 44, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 51, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 76, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 67, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 77, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 22, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 55, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 106, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 98, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 113, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 60, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 86, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 90, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 100, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 79, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 99, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 60, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 62, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 88, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 46, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 48, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 50, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 53, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 92, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 74, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 92, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 81, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 101, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 76, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 58, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 117, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 68, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 88, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 120, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 65, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 111, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 59, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 104, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 66, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 119, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 26, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 53, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 72, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 83, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 110, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 64, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 118, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 96, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 94, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 68, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 97, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 84, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 32, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 57, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 89, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 107, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 27, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 84, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 51, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 55, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 90, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 110, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 55, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 91, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 23, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 88, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 70, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 51, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 45, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 99, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 101, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 102, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 77, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 55, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 117, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 114, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 44, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 86, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 68, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 110, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 60, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 118, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 101, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 99, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 62, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 84, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 42, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 51, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 49, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 66, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 49, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 76, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 42, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 43, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 92, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 92, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 47, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 101, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 108, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 109, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 54, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 87, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 56, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 71, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 52, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 114, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 47, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 66, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 50, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 60, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 65, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 110, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 114, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 98, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 27, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 50, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 100, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 78, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 98, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 58, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 78, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 67, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 81, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 85, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 74, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 114, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 48, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 63, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 113, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 120, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 102, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 51, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 115, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 85, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 104, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 72, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 78, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 58, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 44, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 98, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 50, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 84, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 87, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 94, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 79, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 99, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 118, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 102, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 7, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 112, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 106, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 72, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 96, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 100, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 76, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 45, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 102, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 42, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 72, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 84, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 96, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 65, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 112, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 79, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 112, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 60, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 53, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 106, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 97, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 99, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 119, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 44, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 59, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 50, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 68, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 74, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 87, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 41, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 96, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 70, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 112, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 64, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 95, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 58, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 114, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 90, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 116, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 79, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 110, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 79, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 42, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 104, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 109, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 4, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 120, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 57, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 84, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 102, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 76, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 64, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 115, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 72, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 102, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 58, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 63, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 43, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 58, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 69, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 54, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 59, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 111, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 92, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 79, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 56, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 112, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 59, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 96, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 55, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 53, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 118, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 82, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 55, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 62, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 117, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 57, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 67, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 26, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 75, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 101, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 87, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 94, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 94, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 105, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 109, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 82, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 57, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 57, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 53, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 99, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 110, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 83, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 74, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 18, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 79, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 62, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 42, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 105, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 56, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 93, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 16, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 111, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 55, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 79, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 90, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 56, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 31, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 120, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 45, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 100, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 103, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 78, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 104, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 103, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 116, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 74, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 107, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 41, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 119, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 98, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 61, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 48, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 43, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 80, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 88, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 31, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 93, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 68, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 55, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 92, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 44, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 96, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 67, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 92, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 107, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 66, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 112, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 89, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 81, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 89, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 30, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 111, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 18, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 42, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 109, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 70, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 74, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 108, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 115, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 98, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 66, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 113, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 106, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 100, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 56, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 67, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 42, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 114, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 54, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 48, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 62, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 65, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 88, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 71, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 58, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 16, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 43, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 96, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 45, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 115, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 97, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 79, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 69, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 110, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 114, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 11, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 77, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 30, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 104, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 107, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 83, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 78, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 53, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 51, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 110, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 56, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 96, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 47, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 58, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 42, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 107, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 65, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 101, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 75, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 120, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 60, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 101, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 57, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 98, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 79, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 48, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 109, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 115, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 66, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 46, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 77, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 51, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 88, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 92, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 50, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 118, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 78, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 62, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 75, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 49, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 83, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 60, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 68, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 76, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 50, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 46, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 111, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 113, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 100, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 89, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 63, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 49, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 13, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 59, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 85, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 57, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 73, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 43, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 53, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 86, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 103, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 94, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 42, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 103, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 81, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 45, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 120, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 81, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 86, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 112, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 48, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 74, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 56, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 111, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 60, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 28, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 99, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 116, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 38, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 106, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 115, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 10, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 90, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 69, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 116, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 4, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 79, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 62, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 20, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 41, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 62, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 9, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 104, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 103, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 35, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 112, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 100, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 48, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 55, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 36, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 98, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 10, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 7, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 45, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 111, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 80, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 56, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 46, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 91, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 36, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 44, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 44, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 95, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 119, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 43, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 102, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 78, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 100, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 21, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 67, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 70, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 98, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 12, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 48, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 78, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 73, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 117, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 18, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 31, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 117, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 6, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 109, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 32, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 117, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 109, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 61, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 98, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 7, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 51, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 14, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 8, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 8, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 85, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 98, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 92, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 94, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 107, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 81, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 90, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 79, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 5, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 107, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 55, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 7, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 91, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 114, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 106, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 51, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 92, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 82, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 12, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 67, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 64, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 68, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 59, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 109, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 40, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 67, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 85, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 113, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 26, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 68, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 85, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 42, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 91, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 102, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 92, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 82, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 92, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 33, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 106, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 71, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 15, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 72, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 44, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 42, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 40, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 73, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 29, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 93, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 70, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 9, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 119, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 90, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 25, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 106, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 56, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 104, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 43, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 86, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 72, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 47, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 113, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 11, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 39, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 32, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 105, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 38, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 97, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 23, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 59, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 74, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 11, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 59, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 26, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 120, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 45, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 42, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 66, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 118, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 63, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 15, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 97, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 58, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 14, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 62, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 63, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 62, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 110, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 28, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 64, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 91, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 94, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 65, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 22, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 55, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 89, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 103, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 33, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 25, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 1, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 74, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 97, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 33, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 20, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 87, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 23, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 91, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 65, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 15, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 2, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 26, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 33, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 115, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 93, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 54, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 87, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 3, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 96, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 2, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 16, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 110, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 59, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 64, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 96, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 41, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 115, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 35, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 94, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 98, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 102, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 85, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 89, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 103, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 5, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 76, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 70, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 24, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 73, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 40, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 103, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 101, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 42, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 110, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 92, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 109, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 93, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 76, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 69, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 82, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 103, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 13, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 85, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 61, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 62, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 19, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 65, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 77, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 20, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 7, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 77, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 39, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 45, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 12, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 28, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 76, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 21, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 65, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 111, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 111, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 60, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 85, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 10, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 102, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 115, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 19, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 76, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 71, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 63, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 38, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 84, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 74, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 67, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 47, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 34, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 7, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 91, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 30, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 13, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 69, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 88, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 17, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 16, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 100, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 10, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 119, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 77, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 119, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 33, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 50, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 91, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 88, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 46, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 20, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 16, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 75, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 52, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 108, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 97, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 110, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 113, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 26, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 66, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 92, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 104, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 58, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 84, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 21, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 65, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 7, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 86, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 41, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 70, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 97, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 92, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 62, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 69, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 23, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 30, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 23, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 89, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 5, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 77, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 48, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 33, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 60, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 23, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 100, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 61, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 10, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 104, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 6, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 20, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 68, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 81, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 91, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 90, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 110, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 19, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 48, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 118, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 73, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 90, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 55, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 98, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 35, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 61, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 114, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 30, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 28, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 18, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 84, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 42, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 28, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 108, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 61, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 50, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 80, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 39, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 92, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 73, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 4, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 72, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 60, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 17, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 72, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 87, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 89, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 47, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 21, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 38, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 90, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 25, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 87, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 25, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 6, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 113, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 74, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 13, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 49, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 70, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 51, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 118, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 54, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 84, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 19, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 51, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 24, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 19, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 58, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 4, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 15, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 104, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 20, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 41, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 104, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 89, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 102, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 106, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 101, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 57, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 85, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 102, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 88, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 99, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 99, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 14, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 48, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 93, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 9, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 117, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 35, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 119, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 93, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 16, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 35, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 99, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 5, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 107, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 12, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 93, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 93, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 25, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 89, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 5, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 51, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 88, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 31, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 44, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 4, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 45, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 66, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 110, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 18, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 5, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 91, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 86, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 94, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 84, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 77, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 28, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 97, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 113, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 1, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 98, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 67, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 101, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 62, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 58, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 42, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 23, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 5, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 107, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 114, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 80, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 40, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 26, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 84, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 92, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 82, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 66, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 64, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 97, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 6, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 118, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 101, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 70, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 76, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 24, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 112, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 87, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 25, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 68, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 105, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 49, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 100, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 72, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 50, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 93, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 4, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 13, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 75, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 36, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 36, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 109, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 15, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 85, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 109, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 100, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 43, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 113, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 111, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 72, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 110, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 51, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 67, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 32, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 1, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 83, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 13, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 36, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 18, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 18, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 4, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 87, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 87, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 94, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 101, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 88, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 43, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 107, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 10, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 40, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 117, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 39, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 19, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 49, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 83, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 106, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 15, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 113, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 111, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 21, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 82, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 13, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 83, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 14, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 88, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 102, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 46, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 4, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 115, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 78, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 57, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 41, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 36, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 52, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 88, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 36, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 33, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 45, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 6, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 100, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 67, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 54, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 82, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 35, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 54, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 117, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 75, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 71, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 85, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 108, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 99, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 118, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 40, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 79, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 110, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 7, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 71, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 42, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 105, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 53, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 101, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 77, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 77, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 116, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 79, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 106, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 67, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 100, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 77, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 59, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 67, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 94, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 30, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 78, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 5, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 29, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 2, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 2, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 45, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 56, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 49, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 82, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 85, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 100, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 37, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 92, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 86, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 77, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 111, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 90, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 56, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 29, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 45, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 23, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 78, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 118, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 59, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 72, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 31, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 102, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 51, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 48, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 15, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 9, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 57, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 102, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 114, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 9, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 68, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 1, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 111, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 41, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 40, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 90, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 90, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 43, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 9, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 39, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 91, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 12, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 98, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 27, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 74, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 97, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 84, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 113, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 5, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 14, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 101, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 32, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 4, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 16, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 20, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 98, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 33, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 34, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 2, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 33, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 56, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 95, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 27, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 91, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 37, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 48, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 97, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 43, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 26, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 84, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 56, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 2, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 87, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 38, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 63, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 89, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 91, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 4, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 100, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 84, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 70, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 107, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 3, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 40, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 80, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 33, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 56, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 62, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 99, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 3, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 27, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 26, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 19, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 90, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 40, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 62, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 104, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 47, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 56, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 107, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 73, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 120, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 59, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 116, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 109, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 6, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 77, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 101, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 58, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 9, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 75, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 60, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 35, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 4, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 116, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 97, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 77, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 53, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 42, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 45, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 118, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 67, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 72, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 60, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 111, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 117, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 90, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 69, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 1, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 54, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 10, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 118, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 97, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 77, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 95, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 26, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 13, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 22, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 109, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 28, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 61, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 26, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 107, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 77, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 57, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 44, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 6, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 7, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 97, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 109, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 79, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 68, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 109, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 1, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 114, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 9, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 35, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 101, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 84, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 35, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 16, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 31, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 110, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 88, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 34, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 55, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 42, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 48, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 120, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 111, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 110, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 16, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 59, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 104, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 96, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 103, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 40, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 79, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 12, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 112, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 66, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 2, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 25, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 54, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 76, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 34, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 118, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 4, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 7, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 100, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 112, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 58, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 64, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 58, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 45, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 98, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 64, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 95, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 25, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 102, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 7, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 93, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 59, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 61, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 98, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 102, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 7, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 21, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 35, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 21, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 91, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 41, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 111, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 27, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 31, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 68, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 56, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 37, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 61, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 115, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 69, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 27, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 16, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 34, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 63, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 103, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 15, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 88, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 18, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 14, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 18, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 78, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 66, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 12, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 68, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 14, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 56, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 58, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 16, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 29, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 61, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 50, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 100, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 67, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 11, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 22, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 43, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 47, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 41, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 94, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 100, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 29, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 117, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 105, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 38, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 74, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 25, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 88, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 70, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 68, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 88, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 16, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 116, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 108, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 63, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 118, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 76, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 45, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 95, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 74, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 112, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 68, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 39, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 86, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 24, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 23, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 115, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 30, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 108, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 16, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 10, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 32, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 117, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 49, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 73, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 51, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 34, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 39, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 10, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 89, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 14, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 105, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 2, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 102, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 92, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 88, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 52, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 88, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 6, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 54, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 24, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 87, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 78, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 57, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 48, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 20, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 53, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 70, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 79, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 35, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 58, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 48, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 18, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 82, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 80, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 80, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 24, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 114, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 35, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 12, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 44, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 19, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 32, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 42, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 15, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 81, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 58, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 83, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 112, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 27, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 65, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 74, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 6, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 88, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 74, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 13, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 41, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 82, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 36, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 96, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 30, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 108, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 7, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 110, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 74, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 21, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 28, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 2, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 68, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 85, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 49, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 15, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 53, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 61, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 28, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 69, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 48, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 97, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 69, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 13, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 20, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 54, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 118, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 57, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 30, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 69, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 36, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 23, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 26, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 88, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 36, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 29, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 113, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 2, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 72, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 11, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 49, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 73, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 74, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 78, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 34, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 21, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 38, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 1, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 109, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 40, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 105, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 67, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 5, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 85, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 38, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 5, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 39, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 42, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 61, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 99, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 11, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 88, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 11, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 24, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 66, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 7, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 63, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 44, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 64, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 117, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 88, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 87, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 97, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 22, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 58, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 28, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 29, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 18, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 40, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 25, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 77, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 115, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 24, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 107, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 45, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 70, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 4, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 20, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 82, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 55, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 77, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 71, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 83, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 23, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 88, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 63, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 98, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 55, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 90, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 101, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 10, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 76, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 5, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 41, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 87, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 11, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 51, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 102, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 11, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 35, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 95, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 24, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 13, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 103, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 57, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 86, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 9, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 35, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 72, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 26, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 109, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 76, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 23, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 101, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 63, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 75, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 42, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 30, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 114, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 80, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 120, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 74, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 7, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 104, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 88, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 74, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 94, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 104, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 29, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 10, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 100, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 9, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 92, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 53, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 28, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 92, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 91, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 4, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 89, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 37, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 97, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 46, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 47, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 74, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 82, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 103, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 79, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 83, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 74, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 99, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 89, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 25, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 110, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 65, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 25, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 8, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 16, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 106, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 52, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 54, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 18, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 48, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 26, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 68, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 79, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 26, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 43, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 90, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 47, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 60, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 84, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 20, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 113, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 33, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 113, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 41, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 72, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 59, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 34, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 80, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 56, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 54, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 71, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 91, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 71, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 114, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 14, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 69, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 30, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 24, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 2, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 29, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 48, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 50, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 50, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 91, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 31, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 108, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 114, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 80, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 60, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 23, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 3, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 119, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 93, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 66, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 18, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 88, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 78, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 9, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 72, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 49, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 43, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 8, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 6, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 101, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 1, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 102, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 6, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 31, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 106, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 45, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 95, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 53, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 55, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 13, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 7, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 23, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 46, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 38, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 72, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 94, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 67, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 76, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 13, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 39, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 64, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 98, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 3, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 80, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 47, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 2, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 35, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 63, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 84, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 17, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 108, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 40, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 5, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 5, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 99, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 53, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 35, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 56, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 44, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 69, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 25, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 60, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 87, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 55, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 17, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 70, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 38, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 110, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 76, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 53, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 107, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 12, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 48, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 57, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 100, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 120, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 97, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 46, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 49, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 74, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 90, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 48, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 74, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 91, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 42, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 87, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 82, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 56, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 98, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 34, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 16, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 54, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 107, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 37, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 115, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 76, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 18, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 20, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 59, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 29, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 46, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 71, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 93, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 21, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 38, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 6, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 109, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 73, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 76, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 12, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 26, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 1, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 14, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 22, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 71, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 48, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 10, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 11, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 46, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 56, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 79, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 67, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 53, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 47, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 48, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 25, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 74, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 14, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 9, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 82, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 16, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 118, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 82, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 85, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 114, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 83, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 73, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 106, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 29, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 59, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 66, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 78, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 39, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 69, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 72, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 43, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 36, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 12, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 114, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 57, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 21, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 108, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 25, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 98, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 16, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 25, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 110, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 95, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 45, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 44, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 46, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 118, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 29, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 111, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 31, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 93, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 43, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 14, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 18, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 77, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 4, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 117, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 81, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 105, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 40, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 14, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 119, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 30, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 8, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 82, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 85, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 51, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 48, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 77, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 73, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 112, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 68, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 20, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 110, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 72, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 20, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 71, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 104, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 24, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 57, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 65, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 94, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 87, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 47, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 5, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 1, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 62, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 19, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 32, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 41, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 95, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 61, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 27, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 52, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 40, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 28, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 40, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 96, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 63, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 6, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 2, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 14, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 84, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 87, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 87, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 111, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 68, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 102, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 95, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 40, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 25, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 13, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 99, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 23, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 13, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 104, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 104, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 117, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 62, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 74, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 36, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 51, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 112, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 61, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 77, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 95, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 57, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 24, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 87, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 22, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 69, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 96, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 52, new IntPred(294, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 17, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 111, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 34, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 75, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 2, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 26, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 92, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 11, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 101, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 97, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 9, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 22, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 97, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 93, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 99, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 1, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 31, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 100, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 89, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 24, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 23, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 20, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 120, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 60, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 23, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 120, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 84, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 70, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 21, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 46, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 30, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 107, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 98, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 33, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 60, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 23, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 103, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 115, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 70, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 4, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 96, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 96, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 52, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 58, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 69, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 23, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 115, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 6, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 102, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 98, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 55, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 61, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 44, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 90, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 104, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 95, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 53, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 69, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 119, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 62, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 46, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 26, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 23, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 22, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 120, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 114, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 6, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 12, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 85, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 78, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 19, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 73, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 105, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 13, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 15, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 78, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 75, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 92, new IntPred(246, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 30, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 47, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 115, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 109, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 61, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 10, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 51, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 27, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 83, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 79, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 81, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 98, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 41, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 119, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 81, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 97, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 68, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 86, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 92, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 25, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 95, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 10, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 109, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 36, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 27, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 11, new IntPred(488, 506), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 71, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 72, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 89, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 35, new IntPred(666, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 98, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 28, new IntPred(738, 751), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 100, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 22, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 62, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 104, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 66, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 16, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 4, new IntPred(171, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 22, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 41, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 3, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 42, new IntPred(328, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 77, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 36, new IntPred(431, 487), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 88, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 77, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 106, new IntPred(572, 636), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 108, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 50, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 29, new IntPred(693, 737), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 38, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 73, new IntPred(752, 769), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 9, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 78, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 69, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 104, new IntPred(47, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 42, new IntPred(145, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 59, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 27, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 84, new IntPred(272, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 49, new IntPred(294, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 11, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 110, new IntPred(354, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 95, new IntPred(431, 487), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 40, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 118, new IntPred(507, 571), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 65, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 79, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 23, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 14, new IntPred(693, 737), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 68, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 91, new IntPred(752, 769), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 84, new IntPred(770, 770), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 64, new IntPred(771, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 22, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 69, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 26, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 26, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 29, new IntPred(246, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 48, new IntPred(272, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 4, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 92, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 75, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 81, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 72, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 97, new IntPred(507, 571), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 24, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 8, new IntPred(637, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 53, new IntPred(666, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 61, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 68, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 109, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 111, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 6, new IntPred(771, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 67, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 93, new IntPred(47, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 72, new IntPred(145, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 92, new IntPred(171, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 24, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 4, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 110, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 74, new IntPred(328, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 117, new IntPred(354, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 33, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 2, new IntPred(488, 506), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 117, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 119, new IntPred(572, 636), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 23, new IntPred(637, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 44, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 42, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 116, new IntPred(738, 751), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 24, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 57, new IntPred(770, 770), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 105, new IntPred(771, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 5, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 42, new IntPred(47, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 47, new IntPred(145, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 30, new IntPred(171, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 86, new IntPred(246, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 28, new IntPred(272, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 21, new IntPred(294, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 52, new IntPred(328, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 83, new IntPred(354, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 119, new IntPred(431, 487), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 94, new IntPred(488, 506), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 34, new IntPred(507, 571), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 115, new IntPred(572, 636), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 38, new IntPred(637, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 84, new IntPred(666, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 56, new IntPred(693, 737), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 118, new IntPred(738, 751), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 8, new IntPred(752, 769), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 70, new IntPred(770, 770), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 8, new IntPred(771, null), 'b'));
return trans;
}

}
