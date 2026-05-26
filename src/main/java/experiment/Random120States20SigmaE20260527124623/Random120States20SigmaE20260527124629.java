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
public class Random120States20SigmaE20260527124629{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 45, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 81, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 116, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 89, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 68, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 98, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 89, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 47, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 87, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 111, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 92, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 43, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 86, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 41, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 45, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 111, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 85, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 51, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 55, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 92, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 118, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 23, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 99, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 119, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 61, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 92, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 73, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 114, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 105, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 105, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 100, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 85, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 94, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 87, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 112, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 56, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 120, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 113, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 86, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 75, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 87, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 66, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 44, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 80, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 72, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 101, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 86, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 90, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 93, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 86, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 83, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 89, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 89, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 85, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 69, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 59, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 54, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 84, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 58, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 33, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 41, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 88, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 108, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 41, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 119, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 111, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 89, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 41, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 68, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 100, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 66, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 107, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 109, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 85, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 67, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 78, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 69, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 54, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 39, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 114, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 69, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 118, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 106, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 61, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 42, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 89, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 95, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 67, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 65, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 81, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 51, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 119, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 65, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 41, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 46, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 119, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 34, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 64, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 57, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 120, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 63, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 60, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 77, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 96, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 111, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 46, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 118, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 93, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 59, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 59, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 48, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 62, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 86, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 41, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 85, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 76, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 90, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 72, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 77, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 99, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 112, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 98, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 84, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 42, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 110, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 115, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 56, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 33, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 47, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 119, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 52, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 86, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 55, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 54, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 108, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 80, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 94, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 77, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 89, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 103, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 50, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 60, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 118, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 41, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 115, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 66, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 117, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 81, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 94, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 61, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 89, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 105, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 41, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 103, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 66, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 45, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 115, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 84, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 77, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 71, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 120, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 64, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 91, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 68, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 111, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 111, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 92, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 57, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 109, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 93, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 92, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 88, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 49, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 80, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 90, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 51, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 68, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 42, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 109, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 114, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 113, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 108, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 85, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 107, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 91, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 43, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 58, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 99, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 30, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 56, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 104, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 62, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 112, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 38, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 97, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 65, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 72, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 74, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 50, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 118, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 31, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 72, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 94, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 94, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 66, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 116, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 118, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 102, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 44, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 89, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 79, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 60, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 113, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 48, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 91, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 99, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 93, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 87, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 49, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 81, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 52, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 22, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 67, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 71, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 104, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 75, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 83, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 117, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 88, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 67, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 104, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 63, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 113, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 118, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 98, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 99, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 94, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 111, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 70, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 41, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 86, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 86, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 74, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 59, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 48, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 105, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 106, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 42, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 77, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 105, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 92, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 82, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 114, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 64, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 105, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 49, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 59, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 81, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 58, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 97, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 107, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 114, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 81, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 114, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 100, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 41, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 109, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 57, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 85, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 82, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 70, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 120, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 101, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 66, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 66, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 103, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 64, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 55, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 118, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 70, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 83, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 62, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 76, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 93, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 112, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 41, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 96, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 112, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 44, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 93, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 72, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 66, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 94, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 75, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 79, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 52, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 66, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 74, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 65, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 118, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 76, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 114, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 116, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 67, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 52, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 102, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 105, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 51, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 54, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 56, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 85, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 59, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 87, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 80, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 65, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 103, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 113, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 60, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 85, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 91, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 97, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 107, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 52, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 75, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 53, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 118, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 111, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 111, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 90, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 76, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 81, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 103, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 13, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 81, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 72, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 69, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 87, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 99, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 119, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 56, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 83, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 101, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 103, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 95, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 95, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 91, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 41, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 71, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 75, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 71, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 82, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 27, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 81, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 98, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 67, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 104, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 99, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 64, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 18, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 98, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 95, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 107, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 83, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 50, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 100, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 41, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 68, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 63, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 119, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 74, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 41, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 111, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 73, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 16, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 48, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 65, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 67, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 56, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 45, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 71, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 89, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 106, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 87, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 81, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 101, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 53, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 63, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 114, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 51, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 64, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 82, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 108, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 92, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 46, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 120, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 117, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 85, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 89, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 96, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 67, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 90, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 108, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 31, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 81, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 97, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 100, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 117, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 72, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 72, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 101, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 81, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 45, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 77, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 97, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 44, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 80, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 105, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 47, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 114, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 87, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 84, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 79, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 102, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 66, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 108, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 108, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 97, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 89, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 100, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 89, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 86, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 78, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 51, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 42, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 110, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 120, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 95, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 82, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 45, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 102, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 94, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 88, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 45, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 95, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 43, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 110, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 109, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 47, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 66, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 110, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 66, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 94, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 100, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 85, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 94, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 62, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 91, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 59, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 73, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 110, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 42, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 92, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 105, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 60, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 43, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 115, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 55, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 75, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 82, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 63, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 18, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 22, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 118, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 85, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 37, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 47, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 104, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 79, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 86, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 106, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 97, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 58, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 83, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 104, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 102, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 93, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 57, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 107, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 107, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 55, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 107, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 51, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 45, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 103, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 43, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 57, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 56, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 108, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 92, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 74, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 54, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 44, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 94, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 117, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 118, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 72, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 45, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 46, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 90, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 48, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 101, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 86, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 67, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 91, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 67, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 110, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 49, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 56, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 120, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 57, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 68, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 117, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 98, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 88, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 67, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 53, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 60, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 93, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 79, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 67, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 57, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 96, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 69, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 39, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 118, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 84, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 88, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 28, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 43, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 28, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 82, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 69, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 111, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 4, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 65, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 14, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 101, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 5, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 79, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 98, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 67, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 95, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 95, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 46, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 79, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 41, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 75, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 45, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 91, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 53, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 41, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 56, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 43, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 104, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 60, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 48, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 23, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 49, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 23, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 1, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 53, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 16, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 70, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 80, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 114, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 119, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 102, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 73, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 83, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 86, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 75, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 45, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 29, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 33, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 94, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 104, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 114, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 43, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 29, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 55, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 59, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 88, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 104, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 35, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 8, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 119, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 82, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 37, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 34, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 18, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 102, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 116, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 74, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 94, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 116, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 27, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 106, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 4, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 5, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 71, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 64, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 95, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 92, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 32, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 23, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 26, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 65, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 111, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 88, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 44, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 107, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 41, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 25, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 81, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 2, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 80, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 82, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 26, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 3, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 38, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 65, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 77, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 83, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 120, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 60, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 90, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 103, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 64, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 92, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 37, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 67, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 48, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 66, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 66, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 55, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 29, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 66, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 85, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 93, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 70, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 82, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 57, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 110, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 1, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 83, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 102, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 17, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 65, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 94, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 111, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 9, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 92, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 83, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 57, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 59, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 109, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 13, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 51, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 29, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 54, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 82, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 84, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 53, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 57, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 10, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 1, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 11, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 83, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 105, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 84, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 98, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 53, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 68, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 10, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 110, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 14, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 62, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 105, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 50, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 79, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 65, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 113, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 65, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 71, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 27, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 74, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 102, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 34, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 108, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 59, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 109, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 48, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 109, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 58, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 32, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 73, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 101, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 49, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 59, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 111, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 77, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 38, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 43, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 110, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 5, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 90, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 12, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 13, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 70, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 41, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 29, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 91, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 22, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 38, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 105, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 26, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 18, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 17, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 26, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 110, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 26, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 82, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 86, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 60, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 114, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 28, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 76, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 109, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 21, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 109, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 85, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 34, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 50, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 114, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 53, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 95, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 81, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 5, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 40, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 18, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 28, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 97, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 87, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 18, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 40, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 49, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 18, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 19, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 118, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 38, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 13, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 13, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 72, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 55, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 25, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 17, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 18, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 12, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 10, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 40, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 102, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 62, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 64, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 17, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 74, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 28, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 35, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 111, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 31, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 20, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 27, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 69, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 32, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 67, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 28, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 82, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 94, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 46, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 78, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 112, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 86, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 13, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 15, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 62, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 49, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 97, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 119, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 92, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 29, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 81, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 16, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 50, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 120, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 82, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 100, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 54, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 34, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 62, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 1, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 68, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 69, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 48, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 101, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 46, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 84, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 29, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 51, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 19, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 57, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 9, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 33, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 4, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 56, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 39, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 44, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 91, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 52, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 22, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 62, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 65, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 32, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 71, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 34, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 78, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 17, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 108, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 15, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 29, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 12, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 51, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 72, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 8, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 67, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 90, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 73, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 19, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 45, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 108, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 113, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 6, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 31, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 101, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 64, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 10, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 118, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 19, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 103, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 89, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 105, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 21, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 44, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 103, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 105, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 29, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 5, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 69, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 97, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 63, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 82, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 58, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 104, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 10, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 109, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 74, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 99, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 50, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 73, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 102, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 54, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 81, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 70, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 82, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 79, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 105, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 98, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 61, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 66, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 100, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 64, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 39, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 25, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 104, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 85, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 97, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 84, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 58, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 22, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 37, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 119, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 106, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 30, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 98, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 17, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 11, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 119, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 49, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 73, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 14, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 77, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 97, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 99, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 73, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 120, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 29, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 72, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 18, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 116, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 82, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 83, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 106, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 41, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 89, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 65, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 88, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 72, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 35, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 104, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 50, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 37, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 44, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 96, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 33, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 93, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 105, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 75, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 94, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 39, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 116, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 85, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 89, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 5, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 4, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 110, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 14, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 17, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 63, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 29, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 23, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 2, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 75, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 36, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 39, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 86, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 104, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 51, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 111, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 66, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 32, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 41, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 32, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 101, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 43, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 18, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 87, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 90, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 84, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 105, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 10, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 67, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 7, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 66, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 108, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 16, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 99, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 38, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 95, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 87, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 31, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 36, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 48, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 76, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 102, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 79, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 39, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 23, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 109, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 108, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 22, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 83, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 66, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 50, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 64, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 98, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 44, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 25, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 81, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 44, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 111, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 101, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 73, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 103, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 118, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 19, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 90, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 37, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 49, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 64, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 95, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 83, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 119, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 47, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 22, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 53, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 106, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 33, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 92, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 13, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 119, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 99, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 21, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 28, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 54, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 44, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 67, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 104, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 34, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 110, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 36, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 21, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 20, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 47, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 44, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 42, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 49, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 114, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 41, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 84, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 3, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 8, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 35, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 120, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 117, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 120, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 95, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 98, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 83, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 101, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 44, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 112, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 83, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 87, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 109, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 75, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 23, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 106, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 14, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 55, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 111, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 64, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 43, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 61, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 28, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 39, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 97, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 80, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 55, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 61, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 73, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 109, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 79, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 80, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 71, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 8, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 5, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 26, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 95, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 9, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 96, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 92, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 108, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 100, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 36, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 86, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 55, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 20, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 36, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 111, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 38, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 71, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 40, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 82, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 24, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 76, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 110, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 7, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 71, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 88, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 91, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 8, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 26, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 94, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 66, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 8, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 9, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 40, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 111, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 33, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 114, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 100, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 104, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 107, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 107, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 49, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 84, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 101, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 31, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 113, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 22, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 19, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 28, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 89, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 119, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 85, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 64, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 67, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 114, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 51, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 115, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 44, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 41, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 20, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 75, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 109, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 82, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 23, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 65, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 68, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 22, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 99, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 20, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 100, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 78, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 37, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 42, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 23, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 64, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 64, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 30, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 117, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 90, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 60, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 98, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 12, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 35, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 57, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 60, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 88, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 46, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 35, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 66, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 65, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 111, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 69, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 79, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 73, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 29, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 24, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 22, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 29, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 1, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 99, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 115, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 33, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 75, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 25, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 47, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 118, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 42, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 56, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 50, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 86, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 74, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 6, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 33, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 99, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 52, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 100, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 87, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 69, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 3, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 117, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 5, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 107, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 75, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 117, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 84, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 110, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 74, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 115, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 70, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 11, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 9, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 67, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 63, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 82, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 7, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 98, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 64, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 47, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 30, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 23, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 84, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 91, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 3, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 64, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 11, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 5, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 42, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 10, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 41, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 107, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 49, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 61, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 35, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 47, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 19, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 49, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 113, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 98, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 46, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 71, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 94, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 9, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 110, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 50, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 90, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 43, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 91, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 5, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 108, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 82, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 80, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 111, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 66, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 17, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 112, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 100, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 58, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 67, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 24, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 92, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 52, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 103, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 67, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 17, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 90, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 42, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 21, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 107, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 97, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 120, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 45, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 35, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 103, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 67, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 25, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 103, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 40, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 21, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 106, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 92, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 108, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 74, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 70, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 100, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 111, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 9, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 30, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 26, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 2, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 60, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 73, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 59, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 102, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 8, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 91, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 37, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 73, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 76, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 99, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 22, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 4, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 119, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 46, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 118, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 27, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 111, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 67, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 80, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 21, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 91, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 25, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 55, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 16, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 83, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 1, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 64, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 81, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 34, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 46, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 59, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 64, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 52, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 117, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 73, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 63, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 47, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 91, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 84, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 17, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 107, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 115, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 115, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 37, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 108, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 7, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 29, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 17, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 116, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 36, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 43, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 65, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 75, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 72, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 48, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 95, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 33, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 93, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 66, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 2, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 96, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 61, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 16, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 113, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 52, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 109, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 19, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 39, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 20, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 4, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 111, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 6, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 64, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 83, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 112, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 110, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 106, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 116, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 55, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 100, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 79, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 20, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 29, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 45, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 109, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 82, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 116, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 114, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 28, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 8, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 91, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 75, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 87, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 111, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 48, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 103, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 98, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 60, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 109, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 71, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 91, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 47, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 85, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 56, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 90, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 72, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 37, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 79, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 58, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 3, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 22, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 12, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 24, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 58, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 63, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 26, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 105, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 31, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 36, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 83, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 109, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 73, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 36, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 53, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 120, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 91, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 68, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 97, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 101, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 106, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 63, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 56, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 83, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 45, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 7, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 22, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 10, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 61, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 10, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 113, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 116, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 52, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 87, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 97, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 102, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 24, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 40, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 95, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 86, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 38, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 48, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 103, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 20, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 41, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 60, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 88, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 43, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 18, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 19, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 56, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 118, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 71, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 32, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 106, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 117, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 70, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 84, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 25, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 63, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 64, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 46, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 116, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 15, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 104, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 117, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 18, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 26, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 59, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 1, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 37, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 77, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 16, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 63, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 73, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 120, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 95, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 28, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 99, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 47, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 67, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 95, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 99, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 69, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 26, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 81, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 12, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 49, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 25, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 69, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 17, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 2, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 114, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 74, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 64, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 116, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 71, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 38, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 72, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 3, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 102, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 2, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 107, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 101, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 28, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 2, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 110, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 90, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 60, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 51, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 30, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 117, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 23, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 117, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 115, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 57, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 43, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 57, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 55, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 46, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 47, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 74, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 37, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 115, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 58, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 61, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 20, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 99, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 80, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 42, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 114, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 106, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 119, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 114, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 67, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 7, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 51, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 113, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 89, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 50, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 40, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 27, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 51, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 4, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 38, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 88, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 72, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 51, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 116, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 97, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 19, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 101, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 71, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 106, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 30, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 1, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 1, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 96, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 16, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 59, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 12, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 90, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 1, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 111, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 6, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 98, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 19, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 115, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 45, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 83, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 24, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 95, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 26, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 81, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 24, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 69, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 23, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 70, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 9, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 19, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 83, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 65, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 47, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 85, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 18, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 102, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 107, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 69, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 119, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 83, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 6, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 117, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 19, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 86, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 101, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 81, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 77, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 50, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 83, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 32, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 73, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 120, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 108, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 97, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 107, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 72, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 69, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 64, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 11, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 103, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 7, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 24, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 72, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 112, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 19, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 111, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 112, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 118, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 30, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 111, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 115, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 37, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 91, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 17, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 28, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 86, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 117, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 57, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 9, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 65, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 108, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 55, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 16, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 2, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 76, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 2, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 34, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 46, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 52, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 68, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 90, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 29, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 26, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 43, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 36, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 87, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 41, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 99, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 8, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 65, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 116, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 94, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 38, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 23, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 98, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 6, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 88, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 97, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 34, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 79, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 5, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 63, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 102, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 88, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 114, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 111, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 57, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 16, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 65, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 100, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 59, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 58, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 83, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 46, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 105, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 27, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 95, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 110, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 15, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 48, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 67, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 96, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 104, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 75, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 23, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 72, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 57, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 101, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 7, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 7, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 75, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 42, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 63, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 110, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 32, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 2, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 54, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 47, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 115, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 83, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 29, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 41, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 2, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 34, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 23, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 10, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 53, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 17, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 41, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 84, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 94, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 23, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 64, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 114, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 72, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 29, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 23, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 49, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 33, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 69, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 48, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 98, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 34, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 83, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 88, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 84, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 91, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 22, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 13, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 100, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 33, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 53, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 73, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 118, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 26, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 27, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 46, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 34, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 117, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 5, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 1, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 74, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 53, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 40, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 72, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 32, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 12, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 86, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 30, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 98, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 73, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 111, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 12, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 8, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 116, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 74, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 63, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 42, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 7, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 11, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 78, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 43, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 44, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 76, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 59, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 66, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 3, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 54, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 55, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 6, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 50, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 22, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 79, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 95, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 61, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 90, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 75, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 34, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 53, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 75, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 3, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 3, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 27, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 27, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 90, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 17, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 108, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 70, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 5, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 79, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 43, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 2, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 11, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 31, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 76, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 40, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 99, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 103, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 52, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 50, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 10, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 77, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 84, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 13, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 13, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 4, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 69, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 46, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 33, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 55, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 99, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 23, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 63, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 19, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 68, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 120, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 35, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 70, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 16, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 32, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 42, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 28, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 96, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 3, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 49, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 78, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 8, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 74, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 19, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 42, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 62, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 8, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 73, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 40, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 59, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 33, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 64, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 9, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 102, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 52, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 41, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 120, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 6, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 40, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 82, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 50, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 15, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 7, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 71, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 7, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 48, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 47, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 93, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 88, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 21, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 13, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 11, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 81, new IntPred(342, 404), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 1, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 98, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 105, new IntPred(482, 560), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 118, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 49, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 88, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 106, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 95, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 61, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 44, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 59, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 69, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 48, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 91, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 27, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 100, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 109, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 118, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 51, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 89, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 73, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 80, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 109, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 12, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 102, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 12, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 23, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 12, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 27, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 17, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 54, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 39, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 46, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 7, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 117, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 41, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 4, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 114, new IntPred(206, 269), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 45, new IntPred(270, 341), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 33, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 21, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 35, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 60, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 73, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 67, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 92, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 40, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 117, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 33, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 106, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 27, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 64, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 29, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 74, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 14, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 52, new IntPred(43, 136), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 120, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 30, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 63, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 120, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 74, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 55, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 69, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 25, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 24, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 106, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 88, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 108, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 112, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 76, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 20, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 15, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 25, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 1, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 76, new IntPred(32, 42), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 21, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 62, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 38, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 120, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 24, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 105, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 68, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 17, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 31, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 89, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 22, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 66, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 7, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 86, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 31, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 70, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 92, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 97, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 118, new IntPred(19, 31), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 110, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 119, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 31, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 67, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 18, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 86, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 21, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 57, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 60, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 89, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 66, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 36, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 58, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 56, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 73, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 98, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 91, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 80, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 102, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 4, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 6, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 29, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 22, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 11, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 88, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 31, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 1, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 109, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 36, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 39, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 57, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 87, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 2, new IntPred(708, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 56, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 2, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 9, new IntPred(786, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 18, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 24, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 42, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 95, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 88, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 94, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 24, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 5, new IntPred(206, 269), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 64, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 51, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 94, new IntPred(405, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 8, new IntPred(444, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 64, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 11, new IntPred(561, 582), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 16, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 97, new IntPred(651, 707), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 58, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 75, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 19, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 114, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 113, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 2, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 97, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 88, new IntPred(19, 31), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 105, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 65, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 2, new IntPred(137, 205), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 49, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 73, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 101, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 98, new IntPred(405, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 109, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 41, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 49, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 111, new IntPred(583, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 23, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 102, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 119, new IntPred(727, 773), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 98, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 107, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 51, new IntPred(876, 947), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 101, new IntPred(948, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 10, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 55, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 48, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 26, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 62, new IntPred(137, 205), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 3, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 92, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 48, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 34, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 75, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 4, new IntPred(482, 560), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 64, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 37, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 57, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 52, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 84, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 43, new IntPred(774, 785), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 13, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 98, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 109, new IntPred(948, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 47, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 39, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 103, new IntPred(32, 42), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 115, new IntPred(43, 136), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 118, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 113, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 15, new IntPred(270, 341), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 51, new IntPred(342, 404), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 40, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 103, new IntPred(444, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 101, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 64, new IntPred(561, 582), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 80, new IntPred(583, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 88, new IntPred(651, 707), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 34, new IntPred(708, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 100, new IntPred(727, 773), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 57, new IntPred(774, 785), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 76, new IntPred(786, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 101, new IntPred(876, 947), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 29, new IntPred(948, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 16, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 37, new IntPred(19, 31), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 98, new IntPred(32, 42), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 58, new IntPred(43, 136), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 118, new IntPred(137, 205), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 64, new IntPred(206, 269), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 5, new IntPred(270, 341), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 29, new IntPred(342, 404), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 117, new IntPred(405, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 83, new IntPred(444, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 69, new IntPred(482, 560), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 1, new IntPred(561, 582), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 64, new IntPred(583, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 30, new IntPred(651, 707), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 67, new IntPred(708, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 19, new IntPred(727, 773), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 117, new IntPred(774, 785), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 36, new IntPred(786, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 58, new IntPred(876, 947), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 19, new IntPred(948, null), 'c'));
return trans;
}

}
