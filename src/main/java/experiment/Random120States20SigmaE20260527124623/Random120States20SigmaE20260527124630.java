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
public class Random120States20SigmaE20260527124630{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 94, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 46, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 92, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 44, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 88, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 50, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 71, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 99, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 115, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 49, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 74, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 74, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 103, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 77, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 51, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 104, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 104, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 70, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 53, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 61, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 100, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 113, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 111, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 84, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 120, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 106, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 48, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 60, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 92, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 102, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 111, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 103, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 87, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 50, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 110, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 43, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 103, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 87, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 99, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 95, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 109, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 85, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 98, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 43, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 117, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 91, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 120, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 95, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 109, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 99, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 25, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 120, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 49, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 96, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 48, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 98, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 104, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 100, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 84, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 92, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 56, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 81, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 97, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 73, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 50, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 75, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 110, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 55, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 80, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 105, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 81, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 117, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 47, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 71, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 52, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 56, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 96, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 116, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 50, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 77, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 63, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 29, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 54, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 104, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 104, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 114, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 120, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 60, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 106, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 48, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 84, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 101, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 109, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 109, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 64, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 89, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 74, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 108, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 53, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 86, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 84, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 66, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 58, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 73, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 82, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 56, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 109, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 30, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 118, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 68, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 65, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 58, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 105, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 119, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 85, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 70, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 41, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 77, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 119, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 44, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 62, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 105, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 115, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 66, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 68, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 89, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 85, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 88, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 93, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 51, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 65, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 62, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 102, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 52, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 67, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 55, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 89, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 89, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 49, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 47, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 41, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 77, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 75, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 72, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 112, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 99, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 66, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 119, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 78, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 111, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 48, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 90, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 88, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 63, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 62, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 28, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 104, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 115, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 69, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 97, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 58, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 26, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 104, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 82, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 67, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 97, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 39, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 47, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 36, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 79, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 72, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 106, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 42, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 77, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 116, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 114, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 54, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 100, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 109, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 77, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 71, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 48, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 107, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 73, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 119, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 62, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 90, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 91, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 79, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 103, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 78, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 88, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 96, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 119, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 93, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 95, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 102, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 95, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 70, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 107, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 98, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 53, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 100, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 38, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 102, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 41, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 71, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 81, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 79, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 80, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 41, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 84, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 82, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 74, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 62, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 116, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 48, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 118, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 107, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 85, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 96, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 60, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 35, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 22, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 109, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 60, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 57, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 92, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 49, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 82, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 59, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 44, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 117, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 99, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 50, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 93, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 43, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 95, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 61, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 44, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 69, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 97, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 108, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 89, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 86, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 107, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 86, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 63, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 47, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 46, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 68, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 91, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 93, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 67, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 53, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 58, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 107, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 52, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 107, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 119, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 15, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 55, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 43, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 79, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 118, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 48, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 108, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 51, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 116, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 103, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 99, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 99, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 101, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 44, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 111, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 40, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 91, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 111, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 59, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 103, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 91, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 76, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 88, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 90, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 94, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 112, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 79, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 88, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 79, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 84, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 96, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 51, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 58, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 83, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 109, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 101, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 86, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 49, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 70, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 70, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 114, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 88, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 24, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 52, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 118, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 19, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 64, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 80, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 51, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 19, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 45, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 96, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 32, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 43, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 74, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 87, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 118, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 79, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 109, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 104, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 60, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 95, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 45, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 66, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 94, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 56, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 111, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 117, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 91, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 43, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 99, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 59, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 72, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 53, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 80, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 75, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 97, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 45, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 91, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 116, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 88, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 91, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 95, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 112, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 112, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 90, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 86, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 98, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 100, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 91, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 53, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 58, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 67, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 65, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 99, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 79, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 115, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 106, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 42, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 110, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 41, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 32, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 61, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 72, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 19, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 78, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 108, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 7, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 79, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 115, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 111, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 16, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 111, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 110, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 90, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 74, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 89, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 60, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 52, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 99, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 7, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 66, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 77, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 114, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 43, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 57, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 117, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 68, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 74, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 114, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 83, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 51, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 46, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 66, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 83, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 81, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 91, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 56, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 91, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 97, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 119, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 117, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 44, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 62, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 75, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 110, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 87, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 120, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 98, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 82, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 64, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 79, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 82, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 100, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 108, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 44, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 88, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 64, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 47, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 113, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 42, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 64, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 14, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 53, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 53, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 106, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 111, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 82, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 81, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 86, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 83, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 44, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 59, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 118, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 44, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 103, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 53, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 72, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 54, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 101, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 109, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 68, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 70, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 62, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 60, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 99, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 84, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 55, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 51, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 51, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 43, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 52, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 99, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 108, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 104, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 82, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 113, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 73, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 89, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 45, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 120, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 85, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 109, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 111, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 119, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 50, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 78, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 34, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 99, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 87, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 55, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 51, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 63, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 98, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 51, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 1, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 120, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 81, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 93, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 104, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 67, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 53, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 46, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 61, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 63, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 73, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 105, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 37, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 62, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 54, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 119, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 112, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 84, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 62, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 94, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 112, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 48, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 107, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 27, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 93, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 54, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 46, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 91, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 100, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 79, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 60, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 69, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 13, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 90, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 41, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 66, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 99, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 115, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 80, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 77, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 58, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 44, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 83, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 91, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 70, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 59, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 96, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 95, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 104, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 52, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 102, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 97, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 24, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 50, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 39, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 108, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 62, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 103, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 15, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 30, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 42, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 85, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 25, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 24, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 9, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 70, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 43, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 117, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 19, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 80, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 43, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 23, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 13, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 67, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 17, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 78, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 97, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 13, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 77, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 79, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 76, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 48, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 107, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 117, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 43, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 86, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 3, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 37, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 45, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 55, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 101, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 61, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 7, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 41, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 102, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 61, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 1, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 7, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 1, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 61, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 116, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 78, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 45, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 8, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 107, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 1, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 114, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 81, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 63, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 37, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 24, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 115, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 97, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 54, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 59, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 88, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 5, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 119, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 36, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 96, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 78, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 88, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 91, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 114, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 108, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 10, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 38, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 80, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 24, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 41, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 95, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 3, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 88, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 84, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 106, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 39, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 76, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 84, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 120, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 69, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 19, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 73, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 93, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 6, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 59, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 52, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 20, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 99, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 15, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 82, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 2, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 106, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 20, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 49, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 83, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 42, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 31, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 9, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 48, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 100, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 58, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 94, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 38, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 117, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 117, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 67, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 109, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 73, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 14, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 7, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 102, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 9, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 96, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 116, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 20, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 6, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 120, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 26, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 27, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 51, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 2, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 56, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 60, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 110, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 40, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 115, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 70, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 54, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 107, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 13, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 14, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 55, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 96, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 40, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 35, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 50, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 99, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 54, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 89, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 55, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 77, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 59, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 88, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 90, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 73, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 93, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 110, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 98, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 115, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 16, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 117, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 53, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 85, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 20, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 109, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 107, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 68, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 74, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 99, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 68, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 93, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 94, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 92, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 108, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 6, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 115, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 87, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 25, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 7, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 116, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 26, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 10, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 31, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 63, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 105, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 52, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 80, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 77, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 58, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 73, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 26, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 84, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 25, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 58, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 2, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 39, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 47, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 58, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 34, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 88, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 78, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 108, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 27, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 20, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 120, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 87, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 114, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 106, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 35, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 10, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 70, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 91, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 119, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 79, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 79, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 11, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 53, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 43, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 105, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 70, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 33, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 52, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 70, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 43, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 57, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 41, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 23, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 12, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 76, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 77, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 84, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 68, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 84, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 36, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 103, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 84, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 19, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 52, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 97, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 13, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 18, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 30, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 84, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 105, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 82, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 22, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 5, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 84, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 87, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 50, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 73, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 60, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 85, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 65, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 21, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 89, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 10, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 108, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 73, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 6, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 48, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 102, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 54, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 32, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 101, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 23, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 15, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 7, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 70, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 83, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 26, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 84, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 52, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 25, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 64, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 63, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 8, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 89, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 102, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 68, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 98, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 113, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 57, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 45, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 22, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 78, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 10, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 107, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 16, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 35, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 48, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 60, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 104, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 31, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 62, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 99, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 23, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 13, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 15, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 89, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 55, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 20, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 4, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 46, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 108, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 42, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 74, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 57, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 70, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 20, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 97, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 108, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 32, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 51, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 74, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 29, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 82, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 110, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 46, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 70, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 41, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 54, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 12, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 69, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 98, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 95, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 84, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 38, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 92, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 78, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 114, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 64, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 3, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 29, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 112, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 83, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 86, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 117, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 111, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 90, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 18, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 91, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 13, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 70, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 42, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 72, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 24, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 63, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 110, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 88, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 1, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 29, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 24, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 57, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 84, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 94, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 5, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 58, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 30, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 95, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 40, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 84, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 83, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 74, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 71, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 98, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 110, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 34, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 40, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 84, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 73, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 7, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 5, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 51, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 68, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 22, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 51, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 109, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 97, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 48, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 46, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 51, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 68, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 48, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 69, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 2, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 11, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 85, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 71, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 66, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 54, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 95, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 73, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 92, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 40, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 43, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 111, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 98, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 33, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 109, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 74, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 48, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 34, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 101, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 52, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 3, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 5, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 75, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 23, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 110, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 45, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 107, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 113, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 109, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 81, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 104, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 33, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 60, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 33, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 10, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 95, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 19, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 48, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 80, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 119, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 76, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 104, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 94, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 62, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 51, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 80, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 104, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 75, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 101, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 33, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 92, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 111, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 57, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 20, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 60, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 5, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 25, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 93, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 1, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 82, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 49, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 75, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 120, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 109, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 5, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 49, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 17, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 45, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 74, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 60, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 81, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 97, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 80, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 32, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 4, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 108, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 53, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 67, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 22, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 41, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 74, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 109, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 23, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 104, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 87, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 57, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 40, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 46, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 117, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 14, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 62, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 9, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 107, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 24, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 54, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 57, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 5, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 75, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 23, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 24, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 22, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 120, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 42, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 47, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 94, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 37, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 21, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 45, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 106, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 67, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 2, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 6, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 62, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 85, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 2, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 116, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 52, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 73, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 120, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 13, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 67, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 101, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 39, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 107, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 17, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 55, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 104, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 2, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 77, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 68, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 100, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 24, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 13, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 44, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 54, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 118, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 100, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 94, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 96, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 92, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 68, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 88, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 82, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 3, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 112, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 51, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 80, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 51, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 92, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 9, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 119, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 104, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 30, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 70, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 53, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 96, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 54, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 18, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 67, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 109, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 28, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 102, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 105, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 17, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 112, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 7, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 55, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 106, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 37, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 33, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 47, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 8, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 34, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 105, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 36, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 36, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 42, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 97, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 63, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 116, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 5, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 111, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 54, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 92, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 21, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 89, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 25, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 65, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 32, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 102, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 120, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 14, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 30, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 10, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 33, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 80, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 56, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 120, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 114, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 51, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 108, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 15, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 52, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 37, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 7, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 46, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 118, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 92, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 36, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 115, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 2, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 61, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 115, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 102, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 102, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 33, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 119, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 63, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 27, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 9, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 56, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 76, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 26, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 106, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 97, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 93, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 16, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 77, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 97, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 81, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 115, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 42, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 77, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 114, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 93, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 116, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 65, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 61, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 95, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 111, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 88, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 71, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 7, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 5, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 39, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 8, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 10, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 92, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 110, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 43, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 17, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 64, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 62, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 36, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 112, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 87, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 67, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 32, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 10, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 88, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 106, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 96, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 62, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 83, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 44, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 69, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 68, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 99, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 25, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 96, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 78, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 102, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 12, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 78, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 51, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 63, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 36, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 67, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 58, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 68, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 69, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 114, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 111, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 56, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 52, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 68, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 103, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 44, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 72, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 54, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 18, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 120, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 16, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 111, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 23, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 3, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 110, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 70, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 37, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 78, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 119, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 112, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 91, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 55, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 87, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 56, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 43, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 104, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 35, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 12, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 116, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 45, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 70, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 46, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 115, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 86, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 5, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 68, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 26, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 58, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 81, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 117, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 86, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 97, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 115, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 10, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 55, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 117, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 24, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 85, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 69, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 73, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 86, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 50, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 29, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 75, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 61, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 97, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 112, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 42, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 95, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 2, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 35, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 8, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 113, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 71, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 1, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 16, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 15, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 117, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 18, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 8, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 27, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 10, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 112, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 32, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 77, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 88, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 76, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 83, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 120, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 44, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 39, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 51, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 96, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 88, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 95, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 108, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 45, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 32, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 49, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 112, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 57, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 39, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 102, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 61, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 19, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 18, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 102, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 63, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 74, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 59, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 110, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 117, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 23, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 8, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 80, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 82, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 120, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 90, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 80, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 101, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 117, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 31, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 51, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 7, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 4, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 87, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 83, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 64, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 103, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 34, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 83, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 24, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 82, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 106, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 71, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 92, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 107, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 84, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 48, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 81, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 66, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 7, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 109, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 62, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 98, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 82, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 99, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 14, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 93, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 18, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 118, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 67, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 116, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 73, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 29, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 100, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 76, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 111, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 1, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 55, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 50, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 101, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 77, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 39, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 104, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 69, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 103, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 6, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 4, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 19, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 61, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 51, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 95, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 14, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 81, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 46, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 59, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 103, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 77, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 22, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 20, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 39, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 23, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 1, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 88, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 13, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 78, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 84, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 70, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 102, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 114, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 70, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 42, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 82, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 31, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 73, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 95, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 118, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 58, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 1, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 27, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 36, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 90, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 58, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 118, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 115, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 120, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 77, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 74, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 37, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 46, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 59, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 44, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 11, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 19, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 24, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 49, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 107, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 54, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 49, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 106, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 10, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 94, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 30, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 72, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 82, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 48, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 8, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 63, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 29, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 80, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 115, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 46, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 87, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 101, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 53, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 61, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 63, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 1, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 85, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 6, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 54, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 95, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 108, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 37, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 21, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 83, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 62, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 15, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 67, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 5, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 114, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 118, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 13, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 29, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 101, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 114, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 20, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 120, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 19, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 9, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 114, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 49, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 54, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 103, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 100, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 80, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 36, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 54, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 33, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 70, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 28, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 71, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 64, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 110, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 25, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 7, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 62, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 78, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 45, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 35, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 37, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 59, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 55, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 91, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 110, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 96, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 53, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 26, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 47, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 47, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 18, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 115, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 101, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 77, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 40, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 101, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 11, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 106, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 39, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 48, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 112, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 38, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 60, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 62, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 53, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 117, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 58, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 2, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 116, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 67, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 4, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 51, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 82, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 113, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 72, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 26, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 53, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 37, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 69, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 55, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 37, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 53, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 13, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 95, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 30, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 109, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 43, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 32, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 37, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 91, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 54, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 51, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 30, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 73, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 100, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 89, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 20, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 27, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 63, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 86, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 120, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 100, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 75, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 105, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 48, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 77, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 13, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 113, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 66, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 22, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 61, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 25, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 53, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 18, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 92, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 84, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 54, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 7, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 70, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 113, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 112, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 27, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 1, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 71, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 106, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 112, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 28, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 34, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 61, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 16, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 96, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 76, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 11, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 32, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 2, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 36, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 81, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 17, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 54, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 34, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 61, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 18, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 37, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 72, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 15, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 15, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 47, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 82, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 68, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 29, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 41, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 70, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 110, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 18, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 88, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 45, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 117, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 65, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 52, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 55, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 80, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 60, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 118, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 42, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 92, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 80, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 9, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 92, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 51, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 92, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 12, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 44, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 110, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 89, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 69, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 116, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 12, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 2, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 63, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 89, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 23, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 45, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 53, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 65, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 118, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 1, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 100, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 67, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 61, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 30, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 108, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 82, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 70, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 63, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 71, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 98, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 51, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 58, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 80, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 73, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 120, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 6, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 61, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 79, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 85, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 27, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 13, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 53, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 114, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 37, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 98, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 49, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 49, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 65, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 48, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 80, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 64, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 54, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 36, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 34, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 19, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 61, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 69, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 106, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 5, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 17, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 21, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 35, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 24, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 63, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 16, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 43, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 111, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 7, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 115, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 67, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 27, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 16, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 30, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 12, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 51, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 23, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 50, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 59, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 17, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 88, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 35, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 13, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 44, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 91, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 87, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 59, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 48, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 96, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 29, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 47, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 47, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 91, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 39, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 109, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 3, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 96, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 39, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 90, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 72, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 31, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 21, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 72, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 102, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 41, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 102, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 119, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 13, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 120, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 86, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 13, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 24, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 106, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 39, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 111, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 50, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 87, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 31, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 37, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 91, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 22, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 86, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 49, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 34, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 3, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 44, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 8, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 12, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 76, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 47, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 47, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 108, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 22, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 51, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 46, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 8, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 4, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 23, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 112, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 82, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 72, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 70, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 105, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 108, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 32, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 35, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 38, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 98, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 58, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 67, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 16, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 43, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 23, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 111, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 40, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 16, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 107, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 87, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 76, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 35, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 18, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 111, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 24, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 49, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 117, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 77, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 14, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 88, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 67, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 64, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 94, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 89, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 23, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 82, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 77, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 86, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 8, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 87, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 90, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 13, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 44, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 51, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 36, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 106, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 107, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 63, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 29, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 88, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 34, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 69, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 89, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 33, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 100, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 111, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 71, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 113, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 50, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 51, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 46, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 22, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 100, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 49, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 1, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 66, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 30, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 18, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 115, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 63, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 107, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 91, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 91, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 113, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 93, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 55, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 113, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 31, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 34, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 24, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 14, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 66, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 32, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 15, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 64, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 36, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 65, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 7, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 27, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 34, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 119, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 13, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 8, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 34, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 73, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 74, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 25, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 77, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 91, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 31, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 58, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 21, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 10, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 95, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 26, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 56, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 61, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 72, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 23, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 59, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 101, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 2, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 117, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 23, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 61, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 13, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 55, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 118, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 74, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 103, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 116, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 94, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 67, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 76, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 59, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 4, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 17, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 35, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 46, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 74, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 112, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 87, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 90, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 10, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 92, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 75, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 13, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 89, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 76, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 108, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 119, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 92, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 26, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 67, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 17, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 61, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 89, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 64, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 56, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 86, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 29, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 23, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 18, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 76, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 70, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 14, new IntPred(244, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 119, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 13, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 52, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 12, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 9, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 90, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 68, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 4, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 20, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 93, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 81, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 7, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 30, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 99, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 91, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 61, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 63, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 43, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 83, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 20, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 18, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 21, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 84, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 63, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 2, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 44, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 19, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 48, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 77, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 52, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 96, new IntPred(853, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 101, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 44, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 91, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 34, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 6, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 88, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 19, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 46, new IntPred(148, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 92, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 46, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 110, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 73, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 44, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 19, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 49, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 88, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 42, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 25, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 113, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 23, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 86, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 88, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 112, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 62, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 113, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 45, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 80, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 77, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 40, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 5, new IntPred(326, 412), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 70, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 73, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 96, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 42, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 32, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 92, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 120, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 53, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 63, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 32, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 113, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 81, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 77, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 84, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 16, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 62, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 56, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 45, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 35, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 44, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 69, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 118, new IntPred(508, 555), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 87, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 75, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 69, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 64, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 24, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 49, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 66, new IntPred(838, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 58, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 17, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 11, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 42, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 25, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 103, new IntPred(0, 9), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 17, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 115, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 96, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 9, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 30, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 13, new IntPred(413, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 57, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 82, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 102, new IntPred(585, 638), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 115, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 74, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 61, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 94, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 33, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 57, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 8, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 119, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 46, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 88, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 33, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 43, new IntPred(10, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 35, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 49, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 99, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 54, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 67, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 65, new IntPred(508, 555), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 106, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 37, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 120, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 73, new IntPred(722, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 2, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 58, new IntPred(797, 837), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 20, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 64, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 67, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 101, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 5, new IntPred(1002, 1100), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 82, new IntPred(1101, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 79, new IntPred(0, 9), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 4, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 54, new IntPred(98, 147), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 3, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 66, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 92, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 108, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 20, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 113, new IntPred(556, 584), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 20, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 54, new IntPred(639, 721), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 13, new IntPred(722, 756), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 99, new IntPred(757, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 25, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 52, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 104, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 58, new IntPred(865, 915), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 36, new IntPred(916, 1001), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 1, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 44, new IntPred(1101, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 58, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 101, new IntPred(10, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 9, new IntPred(98, 147), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 39, new IntPred(148, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 9, new IntPred(244, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 91, new IntPred(326, 412), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 19, new IntPred(413, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 19, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 5, new IntPred(556, 584), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 73, new IntPred(585, 638), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 79, new IntPred(639, 721), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 113, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 1, new IntPred(757, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 51, new IntPred(797, 837), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 72, new IntPred(838, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 64, new IntPred(853, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 103, new IntPred(865, 915), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 118, new IntPred(916, 1001), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 42, new IntPred(1002, 1100), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 70, new IntPred(1101, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 110, new IntPred(0, 9), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 107, new IntPred(10, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 92, new IntPred(98, 147), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 85, new IntPred(148, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 61, new IntPred(244, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 19, new IntPred(326, 412), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 87, new IntPred(413, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 79, new IntPred(508, 555), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 22, new IntPred(556, 584), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 116, new IntPred(585, 638), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 86, new IntPred(639, 721), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 2, new IntPred(722, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 12, new IntPred(757, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 114, new IntPred(797, 837), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 28, new IntPred(838, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 85, new IntPred(853, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 4, new IntPred(865, 915), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 86, new IntPred(916, 1001), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 32, new IntPred(1002, 1100), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 56, new IntPred(1101, null), 'b'));
return trans;
}

}
