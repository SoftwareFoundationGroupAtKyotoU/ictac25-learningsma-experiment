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
public class Random120States20SigmaE20260527124632{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 43, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 73, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 51, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 54, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 106, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 32, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 117, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 75, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 101, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 59, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 57, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 83, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 80, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 91, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 55, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 58, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 80, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 117, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 110, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 113, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 42, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 106, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 52, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 69, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 115, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 104, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 111, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 45, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 105, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 72, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 74, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 51, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 119, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 107, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 113, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 102, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 78, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 70, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 102, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 111, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 68, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 55, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 108, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 49, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 105, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 93, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 76, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 43, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 100, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 78, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 105, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 71, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 108, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 80, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 54, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 44, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 102, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 87, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 71, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 87, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 116, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 83, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 85, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 113, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 69, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 49, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 75, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 98, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 59, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 87, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 106, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 86, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 34, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 94, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 92, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 114, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 68, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 42, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 109, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 55, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 63, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 108, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 100, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 99, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 67, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 63, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 61, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 60, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 35, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 48, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 39, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 85, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 57, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 104, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 79, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 89, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 63, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 21, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 82, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 57, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 70, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 69, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 76, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 87, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 98, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 85, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 64, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 58, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 57, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 78, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 94, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 76, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 68, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 51, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 46, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 69, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 67, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 76, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 117, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 70, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 100, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 46, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 62, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 114, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 64, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 119, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 109, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 53, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 65, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 90, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 113, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 114, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 51, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 118, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 72, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 118, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 88, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 99, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 41, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 76, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 92, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 81, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 95, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 101, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 86, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 52, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 76, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 119, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 103, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 55, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 50, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 59, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 47, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 65, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 101, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 99, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 115, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 113, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 107, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 97, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 87, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 80, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 74, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 79, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 46, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 57, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 82, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 115, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 81, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 54, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 74, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 100, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 110, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 49, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 91, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 63, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 69, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 111, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 93, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 43, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 47, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 69, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 60, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 54, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 92, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 86, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 60, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 91, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 41, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 83, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 41, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 71, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 110, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 46, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 79, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 90, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 97, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 116, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 59, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 103, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 56, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 111, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 60, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 82, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 97, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 72, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 57, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 98, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 73, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 79, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 95, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 43, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 60, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 112, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 81, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 66, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 57, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 86, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 50, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 46, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 98, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 85, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 120, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 78, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 93, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 110, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 107, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 97, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 103, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 86, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 86, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 89, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 62, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 89, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 110, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 81, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 77, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 62, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 49, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 41, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 86, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 99, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 88, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 102, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 27, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 90, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 80, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 113, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 99, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 63, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 60, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 69, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 44, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 30, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 64, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 120, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 30, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 42, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 59, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 65, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 57, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 49, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 65, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 87, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 117, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 115, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 47, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 115, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 88, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 58, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 70, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 57, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 70, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 87, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 63, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 75, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 106, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 99, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 68, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 53, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 69, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 58, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 79, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 92, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 62, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 67, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 47, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 68, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 111, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 80, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 91, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 84, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 119, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 48, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 120, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 88, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 43, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 94, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 71, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 86, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 89, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 104, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 107, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 41, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 24, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 29, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 67, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 112, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 83, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 45, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 89, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 111, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 84, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 96, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 99, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 70, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 101, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 65, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 103, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 56, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 82, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 72, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 86, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 97, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 116, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 118, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 102, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 81, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 48, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 106, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 82, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 85, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 78, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 88, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 86, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 90, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 61, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 86, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 75, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 106, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 42, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 85, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 68, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 88, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 64, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 86, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 60, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 83, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 57, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 46, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 50, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 99, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 68, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 53, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 42, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 119, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 85, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 56, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 71, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 73, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 86, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 87, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 60, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 85, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 104, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 86, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 66, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 43, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 52, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 110, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 112, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 78, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 74, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 95, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 91, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 89, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 81, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 51, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 9, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 74, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 100, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 77, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 97, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 22, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 70, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 95, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 115, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 99, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 52, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 13, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 70, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 95, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 63, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 115, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 78, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 119, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 94, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 75, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 108, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 67, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 83, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 116, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 116, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 94, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 46, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 120, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 74, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 97, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 59, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 68, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 69, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 99, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 28, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 85, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 112, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 42, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 58, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 94, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 89, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 64, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 118, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 57, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 111, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 59, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 75, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 95, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 69, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 58, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 84, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 74, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 77, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 91, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 116, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 67, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 96, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 82, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 116, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 58, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 71, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 118, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 107, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 92, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 111, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 75, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 109, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 31, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 94, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 1, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 69, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 7, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 104, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 86, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 64, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 67, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 64, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 65, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 67, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 118, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 116, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 111, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 73, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 83, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 100, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 79, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 60, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 118, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 42, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 41, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 51, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 95, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 12, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 113, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 85, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 99, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 103, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 57, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 71, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 64, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 106, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 89, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 20, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 74, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 66, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 53, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 116, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 115, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 78, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 63, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 42, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 92, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 98, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 74, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 55, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 53, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 115, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 106, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 115, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 49, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 55, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 72, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 77, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 98, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 97, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 105, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 46, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 65, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 82, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 68, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 50, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 48, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 98, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 97, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 67, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 74, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 86, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 47, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 116, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 53, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 84, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 104, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 33, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 66, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 112, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 60, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 87, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 16, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 42, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 67, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 75, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 31, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 98, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 48, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 65, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 3, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 101, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 105, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 96, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 57, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 52, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 28, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 18, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 18, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 56, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 10, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 33, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 102, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 7, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 101, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 43, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 98, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 61, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 113, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 23, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 58, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 91, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 38, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 109, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 76, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 27, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 2, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 25, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 74, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 108, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 97, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 92, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 13, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 10, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 79, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 83, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 29, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 78, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 89, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 72, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 20, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 80, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 98, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 56, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 28, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 117, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 111, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 71, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 90, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 28, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 54, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 72, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 70, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 7, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 21, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 106, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 110, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 48, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 71, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 28, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 103, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 4, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 110, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 42, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 76, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 11, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 97, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 20, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 12, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 37, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 39, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 54, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 47, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 109, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 90, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 2, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 105, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 61, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 39, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 94, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 113, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 38, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 13, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 27, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 75, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 44, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 46, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 67, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 61, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 89, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 46, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 87, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 58, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 80, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 60, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 28, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 19, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 7, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 86, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 49, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 79, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 14, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 40, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 93, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 90, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 54, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 13, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 117, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 107, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 92, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 3, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 20, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 4, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 87, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 27, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 67, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 79, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 26, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 97, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 79, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 98, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 94, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 12, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 66, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 19, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 119, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 66, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 58, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 105, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 52, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 108, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 32, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 29, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 38, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 74, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 86, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 41, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 75, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 87, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 58, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 3, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 10, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 54, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 58, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 37, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 99, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 77, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 1, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 23, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 18, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 48, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 20, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 31, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 3, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 16, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 24, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 54, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 21, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 85, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 92, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 108, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 51, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 95, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 54, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 27, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 47, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 100, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 37, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 49, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 7, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 4, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 58, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 36, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 105, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 88, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 119, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 103, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 120, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 77, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 69, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 72, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 54, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 25, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 98, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 53, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 42, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 19, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 4, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 16, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 84, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 94, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 59, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 59, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 70, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 52, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 52, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 109, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 73, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 104, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 98, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 15, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 38, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 96, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 45, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 16, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 73, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 52, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 81, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 106, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 5, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 102, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 35, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 9, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 111, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 59, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 10, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 81, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 26, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 90, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 39, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 51, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 69, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 82, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 109, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 80, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 70, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 56, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 105, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 4, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 2, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 22, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 42, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 89, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 93, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 56, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 19, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 65, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 101, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 29, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 33, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 107, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 107, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 30, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 108, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 17, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 13, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 41, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 82, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 73, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 91, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 13, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 9, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 55, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 34, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 2, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 104, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 63, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 57, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 85, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 45, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 87, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 89, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 111, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 113, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 53, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 114, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 28, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 22, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 26, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 58, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 110, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 36, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 99, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 64, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 19, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 74, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 79, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 53, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 50, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 106, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 110, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 109, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 86, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 57, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 82, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 51, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 57, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 83, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 49, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 103, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 50, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 91, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 72, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 3, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 47, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 33, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 97, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 9, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 107, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 1, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 46, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 38, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 72, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 98, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 67, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 106, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 54, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 36, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 111, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 109, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 10, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 120, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 11, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 67, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 111, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 92, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 48, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 81, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 56, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 76, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 5, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 69, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 35, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 25, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 23, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 17, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 7, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 69, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 111, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 39, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 93, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 111, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 3, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 21, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 52, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 27, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 101, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 87, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 53, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 57, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 26, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 108, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 26, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 113, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 76, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 104, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 85, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 74, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 7, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 10, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 52, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 33, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 56, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 113, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 12, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 65, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 103, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 95, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 39, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 117, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 101, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 114, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 102, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 24, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 70, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 37, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 40, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 75, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 48, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 99, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 65, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 31, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 106, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 100, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 115, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 38, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 37, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 93, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 80, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 110, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 118, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 13, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 28, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 29, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 97, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 66, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 23, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 45, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 31, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 63, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 17, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 49, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 16, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 32, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 116, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 38, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 113, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 83, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 69, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 59, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 71, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 56, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 19, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 64, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 82, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 114, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 22, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 10, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 83, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 12, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 72, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 101, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 93, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 84, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 55, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 103, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 75, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 104, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 108, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 55, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 11, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 101, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 37, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 56, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 103, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 72, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 79, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 13, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 85, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 5, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 25, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 43, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 39, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 99, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 85, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 34, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 109, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 83, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 13, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 20, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 28, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 55, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 95, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 108, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 58, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 100, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 26, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 40, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 86, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 72, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 86, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 71, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 4, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 92, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 87, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 83, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 119, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 18, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 90, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 80, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 101, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 110, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 34, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 98, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 28, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 35, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 37, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 99, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 103, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 34, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 20, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 116, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 117, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 68, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 100, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 3, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 83, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 82, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 21, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 115, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 64, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 43, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 113, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 43, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 48, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 42, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 97, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 99, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 26, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 35, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 83, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 86, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 7, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 118, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 119, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 43, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 66, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 68, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 17, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 44, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 38, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 55, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 5, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 115, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 75, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 52, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 67, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 72, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 112, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 65, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 84, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 24, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 54, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 55, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 82, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 15, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 83, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 16, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 28, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 103, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 36, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 9, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 87, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 22, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 105, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 49, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 109, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 20, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 32, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 1, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 105, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 64, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 81, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 99, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 111, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 50, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 38, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 30, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 59, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 79, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 41, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 103, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 68, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 82, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 15, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 70, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 52, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 33, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 67, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 90, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 106, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 106, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 107, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 66, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 94, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 44, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 62, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 105, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 107, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 102, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 56, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 56, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 41, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 21, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 89, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 104, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 109, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 69, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 82, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 58, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 19, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 111, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 41, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 39, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 100, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 60, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 114, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 25, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 50, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 117, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 48, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 94, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 88, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 26, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 107, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 13, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 10, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 16, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 108, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 46, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 62, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 46, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 41, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 104, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 43, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 80, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 43, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 24, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 59, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 105, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 95, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 109, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 11, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 96, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 81, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 93, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 30, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 45, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 102, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 114, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 70, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 97, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 96, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 22, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 36, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 33, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 9, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 111, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 59, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 36, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 78, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 3, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 64, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 48, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 117, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 116, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 108, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 112, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 55, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 56, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 56, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 6, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 67, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 7, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 102, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 39, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 53, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 15, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 35, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 49, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 52, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 80, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 112, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 52, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 83, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 42, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 97, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 11, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 31, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 116, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 57, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 31, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 63, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 18, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 15, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 44, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 93, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 109, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 116, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 2, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 88, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 21, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 99, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 80, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 21, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 99, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 74, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 34, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 73, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 17, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 106, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 47, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 109, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 66, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 74, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 67, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 35, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 55, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 114, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 41, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 86, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 87, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 79, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 78, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 111, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 35, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 94, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 69, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 105, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 110, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 58, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 87, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 26, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 43, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 43, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 60, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 35, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 90, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 34, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 98, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 68, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 99, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 98, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 52, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 99, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 56, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 89, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 12, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 54, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 87, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 36, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 96, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 91, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 110, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 102, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 40, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 103, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 81, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 95, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 114, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 76, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 48, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 41, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 49, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 84, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 63, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 22, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 116, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 26, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 13, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 29, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 14, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 22, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 60, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 10, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 68, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 86, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 41, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 101, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 59, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 42, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 114, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 71, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 57, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 83, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 88, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 43, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 66, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 15, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 110, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 69, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 80, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 67, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 23, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 69, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 26, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 111, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 67, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 5, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 29, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 30, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 90, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 78, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 69, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 50, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 55, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 7, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 45, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 3, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 6, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 29, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 98, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 65, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 13, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 11, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 115, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 61, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 110, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 84, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 27, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 36, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 27, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 67, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 69, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 59, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 88, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 17, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 87, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 11, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 109, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 23, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 7, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 86, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 89, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 119, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 64, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 80, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 95, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 103, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 22, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 54, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 60, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 69, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 21, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 33, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 62, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 91, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 101, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 116, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 38, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 4, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 8, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 114, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 15, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 53, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 82, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 96, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 84, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 116, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 120, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 72, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 45, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 76, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 113, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 91, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 50, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 39, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 111, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 94, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 62, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 49, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 14, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 22, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 100, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 67, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 76, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 91, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 29, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 110, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 15, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 48, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 120, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 67, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 89, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 56, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 80, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 1, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 119, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 18, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 73, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 22, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 5, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 46, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 75, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 68, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 3, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 94, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 45, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 54, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 75, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 21, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 42, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 120, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 120, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 107, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 103, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 73, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 79, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 94, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 34, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 84, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 57, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 97, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 28, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 82, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 87, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 88, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 96, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 73, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 92, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 50, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 97, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 32, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 94, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 78, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 71, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 96, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 53, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 61, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 98, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 28, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 90, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 30, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 109, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 97, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 65, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 108, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 60, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 46, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 23, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 34, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 117, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 21, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 75, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 87, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 115, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 111, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 112, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 33, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 86, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 99, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 89, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 46, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 67, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 88, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 12, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 78, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 113, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 70, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 15, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 26, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 1, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 113, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 62, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 47, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 70, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 93, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 74, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 116, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 67, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 26, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 90, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 87, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 103, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 33, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 22, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 75, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 35, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 52, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 46, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 4, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 81, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 89, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 71, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 32, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 47, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 88, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 53, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 71, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 82, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 120, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 42, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 108, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 59, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 61, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 117, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 114, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 45, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 12, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 99, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 32, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 20, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 61, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 34, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 93, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 62, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 112, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 64, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 27, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 101, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 48, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 56, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 79, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 115, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 18, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 60, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 15, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 45, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 62, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 51, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 18, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 80, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 101, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 60, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 99, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 87, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 49, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 73, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 110, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 98, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 119, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 13, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 41, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 71, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 31, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 102, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 28, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 84, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 42, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 67, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 25, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 66, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 75, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 45, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 4, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 36, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 94, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 114, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 107, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 13, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 44, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 77, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 118, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 61, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 76, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 15, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 87, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 92, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 3, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 41, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 35, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 45, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 13, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 111, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 111, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 20, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 49, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 46, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 44, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 96, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 24, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 101, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 51, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 49, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 85, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 31, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 25, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 2, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 86, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 7, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 116, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 95, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 49, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 115, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 83, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 40, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 40, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 98, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 73, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 52, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 45, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 93, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 25, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 46, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 86, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 40, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 11, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 19, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 57, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 42, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 14, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 66, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 16, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 96, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 107, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 114, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 46, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 93, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 8, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 14, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 80, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 101, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 2, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 28, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 5, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 93, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 65, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 49, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 22, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 109, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 15, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 110, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 117, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 77, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 81, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 46, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 57, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 74, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 84, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 45, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 49, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 26, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 32, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 114, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 36, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 35, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 48, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 85, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 95, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 56, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 16, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 1, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 118, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 91, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 21, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 82, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 88, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 115, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 24, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 56, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 55, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 16, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 43, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 98, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 117, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 73, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 57, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 99, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 48, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 4, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 18, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 88, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 23, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 6, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 76, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 48, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 83, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 70, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 34, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 74, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 30, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 86, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 41, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 2, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 70, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 97, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 21, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 35, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 42, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 46, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 16, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 93, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 99, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 51, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 67, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 48, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 52, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 18, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 67, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 119, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 99, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 95, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 12, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 46, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 77, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 95, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 25, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 28, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 93, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 33, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 25, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 25, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 77, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 1, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 75, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 64, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 18, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 56, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 107, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 54, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 76, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 52, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 50, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 88, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 27, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 46, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 33, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 89, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 11, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 94, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 101, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 81, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 8, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 25, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 109, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 54, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 82, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 35, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 87, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 22, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 82, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 77, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 86, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 107, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 114, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 103, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 22, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 21, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 97, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 30, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 29, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 99, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 60, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 23, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 92, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 106, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 102, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 57, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 100, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 75, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 16, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 79, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 65, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 49, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 96, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 67, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 98, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 96, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 110, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 4, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 14, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 87, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 34, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 32, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 47, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 38, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 63, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 106, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 42, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 56, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 115, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 20, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 29, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 10, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 36, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 46, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 16, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 81, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 99, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 85, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 76, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 56, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 44, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 20, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 54, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 119, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 20, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 54, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 92, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 60, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 9, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 1, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 86, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 78, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 77, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 92, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 110, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 108, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 35, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 33, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 80, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 9, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 16, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 83, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 10, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 51, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 107, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 113, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 108, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 111, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 60, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 113, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 33, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 30, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 56, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 5, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 60, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 59, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 115, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 120, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 27, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 82, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 12, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 66, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 39, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 18, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 100, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 119, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 74, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 20, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 118, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 28, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 7, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 73, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 24, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 106, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 108, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 102, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 72, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 32, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 2, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 43, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 32, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 76, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 99, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 31, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 115, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 42, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 3, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 38, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 92, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 19, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 72, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 115, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 29, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 79, new IntPred(969, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 98, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 5, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 93, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 35, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 34, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 85, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 41, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 115, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 38, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 110, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 36, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 113, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 75, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 28, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 69, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 107, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 105, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 53, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 119, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 56, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 75, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 82, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 76, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 35, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 44, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 62, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 1, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 118, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 18, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 61, new IntPred(511, 595), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 86, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 64, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 53, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 94, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 82, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 119, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 8, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 73, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 90, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 94, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 7, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 66, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 34, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 56, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 95, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 115, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 42, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 106, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 114, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 29, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 2, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 36, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 47, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 15, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 5, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 72, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 85, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 53, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 49, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 89, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 41, new IntPred(0, 52), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 106, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 13, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 85, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 66, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 109, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 18, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 35, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 84, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 48, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 74, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 29, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 57, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 75, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 84, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 71, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 1, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 93, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 69, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 109, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 99, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 19, new IntPred(53, 57), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 95, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 56, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 9, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 38, new IntPred(287, 297), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 69, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 113, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 56, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 81, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 69, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 76, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 4, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 97, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 52, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 54, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 96, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 11, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 45, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 63, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 4, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 96, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 106, new IntPred(58, 157), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 9, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 100, new IntPred(197, 286), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 67, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 48, new IntPred(298, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 30, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 55, new IntPred(432, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 73, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 23, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 13, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 69, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 119, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 120, new IntPred(755, 802), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 101, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 56, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 56, new IntPred(854, 879), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 52, new IntPred(880, 968), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 71, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 43, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 20, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 19, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 24, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 46, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 65, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 50, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 68, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 63, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 6, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 83, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 4, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 89, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 106, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 89, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 96, new IntPred(803, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 96, new IntPred(835, 853), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 73, new IntPred(854, 879), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 96, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 21, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 75, new IntPred(0, 52), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 119, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 97, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 8, new IntPred(158, 196), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 73, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 2, new IntPred(287, 297), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 35, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 57, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 28, new IntPred(432, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 51, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 19, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 49, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 24, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 37, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 60, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 83, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 84, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 12, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 87, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 94, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 95, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 47, new IntPred(53, 57), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 116, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 16, new IntPred(158, 196), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 60, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 111, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 87, new IntPred(298, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 100, new IntPred(352, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 54, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 5, new IntPred(511, 595), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 91, new IntPred(596, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 117, new IntPred(609, 650), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 76, new IntPred(651, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 63, new IntPred(716, 754), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 113, new IntPred(755, 802), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 104, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 117, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 10, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 106, new IntPred(880, 968), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 93, new IntPred(969, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 117, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 33, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 112, new IntPred(58, 157), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 22, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 110, new IntPred(197, 286), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 4, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 97, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 119, new IntPred(352, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 47, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 106, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 99, new IntPred(596, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 68, new IntPred(609, 650), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 96, new IntPred(651, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 111, new IntPred(716, 754), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 9, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 101, new IntPred(803, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 83, new IntPred(835, 853), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 69, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 92, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 12, new IntPred(969, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 116, new IntPred(0, 52), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 47, new IntPred(53, 57), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 65, new IntPred(58, 157), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 60, new IntPred(158, 196), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 10, new IntPred(197, 286), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 73, new IntPred(287, 297), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 25, new IntPred(298, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 52, new IntPred(352, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 3, new IntPred(432, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 89, new IntPred(511, 595), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 12, new IntPred(596, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 42, new IntPred(609, 650), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 59, new IntPred(651, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 25, new IntPred(716, 754), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 117, new IntPred(755, 802), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 120, new IntPred(803, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 61, new IntPred(835, 853), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 34, new IntPred(854, 879), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 97, new IntPred(880, 968), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 58, new IntPred(969, null), 'c'));
return trans;
}

}
