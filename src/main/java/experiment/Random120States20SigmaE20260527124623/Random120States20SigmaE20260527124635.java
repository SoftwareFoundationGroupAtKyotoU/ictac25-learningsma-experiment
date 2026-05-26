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
public class Random120States20SigmaE20260527124635{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 108, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 72, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 41, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 105, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 109, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 95, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 43, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 98, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 89, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 75, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 116, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 93, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 87, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 55, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 90, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 86, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 102, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 73, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 99, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 102, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 45, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 94, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 58, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 62, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 119, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 56, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 88, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 119, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 54, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 47, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 107, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 118, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 83, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 93, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 111, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 102, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 87, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 58, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 113, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 94, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 43, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 60, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 93, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 113, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 92, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 115, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 94, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 55, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 59, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 67, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 87, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 103, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 46, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 41, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 100, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 68, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 111, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 118, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 70, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 89, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 72, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 63, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 43, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 92, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 71, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 74, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 97, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 51, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 56, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 81, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 44, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 118, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 52, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 109, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 117, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 34, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 93, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 60, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 108, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 68, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 44, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 62, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 63, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 41, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 90, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 63, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 53, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 62, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 110, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 100, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 86, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 58, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 52, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 39, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 112, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 45, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 50, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 69, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 39, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 21, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 90, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 87, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 104, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 91, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 42, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 63, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 113, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 115, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 71, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 53, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 98, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 42, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 89, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 110, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 111, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 89, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 109, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 58, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 79, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 101, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 114, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 61, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 104, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 68, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 59, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 112, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 85, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 99, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 58, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 44, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 101, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 98, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 90, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 104, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 111, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 120, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 92, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 78, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 113, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 63, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 41, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 86, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 105, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 82, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 83, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 74, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 49, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 112, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 97, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 94, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 115, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 97, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 116, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 62, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 30, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 112, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 109, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 72, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 116, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 116, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 78, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 55, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 57, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 59, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 62, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 89, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 53, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 114, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 59, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 45, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 60, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 46, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 69, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 44, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 61, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 109, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 105, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 56, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 102, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 114, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 85, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 80, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 52, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 113, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 74, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 80, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 74, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 99, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 62, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 44, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 73, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 74, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 112, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 44, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 49, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 64, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 91, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 62, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 83, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 52, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 48, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 105, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 41, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 107, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 70, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 78, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 43, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 62, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 88, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 102, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 107, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 119, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 112, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 38, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 103, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 72, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 91, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 49, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 68, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 91, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 118, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 58, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 105, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 106, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 64, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 69, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 113, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 103, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 80, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 46, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 117, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 109, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 95, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 100, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 76, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 79, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 104, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 84, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 79, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 90, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 102, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 29, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 103, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 94, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 57, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 45, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 120, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 117, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 67, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 106, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 84, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 109, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 108, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 91, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 52, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 96, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 52, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 41, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 99, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 96, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 94, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 110, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 90, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 55, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 82, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 115, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 75, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 96, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 97, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 67, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 61, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 75, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 94, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 79, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 114, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 77, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 75, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 87, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 68, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 113, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 31, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 15, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 84, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 118, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 114, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 84, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 65, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 106, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 69, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 23, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 96, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 94, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 55, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 117, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 101, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 45, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 54, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 63, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 98, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 103, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 110, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 43, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 85, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 38, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 120, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 107, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 23, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 20, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 118, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 69, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 51, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 41, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 87, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 73, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 100, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 44, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 101, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 109, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 27, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 79, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 99, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 63, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 57, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 105, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 104, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 42, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 32, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 97, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 100, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 44, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 88, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 108, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 77, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 101, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 87, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 81, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 86, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 95, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 74, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 37, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 61, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 85, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 111, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 100, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 74, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 62, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 97, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 81, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 106, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 66, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 68, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 119, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 89, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 109, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 114, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 69, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 97, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 120, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 99, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 85, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 96, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 118, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 87, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 85, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 116, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 83, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 106, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 72, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 71, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 117, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 102, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 55, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 100, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 92, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 46, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 62, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 71, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 65, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 94, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 103, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 47, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 100, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 66, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 105, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 50, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 83, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 91, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 112, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 52, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 86, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 43, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 115, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 42, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 38, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 72, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 102, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 96, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 73, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 78, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 59, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 48, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 85, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 69, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 95, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 90, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 101, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 102, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 68, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 99, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 53, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 89, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 82, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 62, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 77, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 78, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 28, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 92, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 47, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 69, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 115, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 47, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 63, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 110, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 78, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 53, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 81, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 29, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 67, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 108, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 73, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 103, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 120, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 46, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 97, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 111, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 118, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 86, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 116, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 61, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 57, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 98, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 96, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 65, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 110, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 50, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 82, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 109, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 95, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 45, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 43, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 113, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 119, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 109, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 19, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 52, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 68, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 85, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 88, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 60, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 78, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 77, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 58, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 62, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 95, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 107, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 45, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 74, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 77, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 90, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 110, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 113, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 78, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 53, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 68, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 86, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 90, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 16, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 90, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 100, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 98, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 87, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 52, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 60, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 42, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 104, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 55, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 54, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 51, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 47, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 48, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 80, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 49, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 43, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 95, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 83, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 66, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 59, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 65, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 91, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 59, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 111, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 68, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 99, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 27, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 114, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 92, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 74, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 54, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 116, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 57, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 69, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 80, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 91, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 74, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 87, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 42, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 70, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 80, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 81, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 69, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 72, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 117, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 42, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 57, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 95, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 116, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 50, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 57, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 85, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 108, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 115, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 65, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 50, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 69, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 45, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 109, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 111, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 88, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 20, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 54, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 58, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 77, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 97, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 86, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 96, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 103, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 89, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 1, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 84, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 7, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 86, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 37, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 115, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 102, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 52, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 100, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 61, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 38, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 95, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 107, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 94, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 12, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 55, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 86, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 116, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 2, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 38, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 51, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 54, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 52, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 56, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 11, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 116, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 110, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 58, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 80, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 89, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 8, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 13, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 91, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 76, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 113, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 53, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 23, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 52, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 60, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 76, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 119, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 110, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 3, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 44, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 109, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 41, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 117, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 52, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 119, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 79, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 85, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 88, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 11, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 115, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 110, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 65, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 9, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 6, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 91, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 110, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 75, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 53, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 72, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 45, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 97, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 61, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 93, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 69, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 49, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 113, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 8, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 22, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 32, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 87, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 95, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 42, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 112, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 111, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 96, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 44, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 5, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 14, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 98, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 86, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 65, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 6, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 54, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 70, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 59, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 23, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 13, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 90, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 106, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 46, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 102, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 77, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 89, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 90, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 78, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 18, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 108, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 119, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 93, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 101, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 60, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 52, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 47, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 72, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 49, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 120, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 109, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 7, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 109, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 109, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 57, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 15, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 56, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 25, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 41, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 28, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 47, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 93, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 12, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 26, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 85, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 97, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 90, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 98, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 48, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 92, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 93, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 60, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 107, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 3, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 43, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 36, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 111, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 55, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 44, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 110, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 120, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 81, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 15, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 29, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 30, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 82, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 31, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 91, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 99, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 3, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 27, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 116, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 91, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 101, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 43, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 118, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 40, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 94, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 59, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 50, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 42, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 75, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 49, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 67, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 21, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 107, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 101, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 12, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 85, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 120, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 32, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 28, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 41, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 54, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 107, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 42, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 86, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 101, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 28, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 35, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 61, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 94, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 19, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 104, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 1, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 89, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 78, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 112, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 78, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 90, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 102, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 77, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 82, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 88, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 108, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 97, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 3, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 82, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 38, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 73, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 115, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 50, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 97, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 83, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 22, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 28, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 78, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 80, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 113, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 117, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 79, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 36, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 66, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 29, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 64, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 51, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 60, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 55, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 120, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 84, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 65, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 30, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 47, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 55, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 48, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 48, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 120, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 40, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 78, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 36, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 118, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 54, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 21, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 40, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 16, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 115, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 78, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 118, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 62, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 98, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 101, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 59, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 97, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 115, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 10, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 115, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 77, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 119, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 70, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 20, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 10, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 24, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 47, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 54, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 104, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 5, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 120, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 37, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 74, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 101, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 11, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 19, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 61, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 17, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 16, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 72, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 79, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 28, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 117, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 4, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 34, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 116, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 77, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 89, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 120, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 120, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 99, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 19, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 1, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 78, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 57, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 83, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 107, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 20, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 63, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 106, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 57, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 91, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 6, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 103, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 94, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 94, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 44, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 11, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 116, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 26, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 105, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 56, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 104, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 31, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 12, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 109, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 87, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 56, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 1, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 40, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 16, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 73, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 101, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 19, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 79, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 48, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 46, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 97, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 45, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 69, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 93, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 79, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 67, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 83, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 45, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 21, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 14, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 15, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 75, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 61, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 49, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 29, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 13, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 40, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 16, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 29, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 30, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 41, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 37, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 20, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 106, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 84, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 51, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 116, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 40, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 32, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 76, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 28, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 77, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 116, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 69, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 21, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 87, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 98, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 64, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 70, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 38, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 67, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 68, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 29, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 47, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 85, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 78, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 99, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 99, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 36, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 89, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 77, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 63, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 78, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 1, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 98, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 28, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 120, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 31, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 18, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 84, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 8, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 32, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 80, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 76, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 51, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 25, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 100, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 39, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 92, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 9, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 62, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 59, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 62, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 115, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 3, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 38, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 6, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 120, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 78, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 7, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 109, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 84, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 50, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 55, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 68, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 49, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 30, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 85, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 94, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 76, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 43, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 77, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 65, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 45, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 9, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 114, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 118, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 120, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 91, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 42, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 11, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 46, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 100, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 101, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 104, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 37, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 50, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 30, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 74, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 77, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 29, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 40, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 52, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 87, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 54, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 67, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 45, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 94, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 67, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 46, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 94, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 55, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 71, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 92, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 51, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 90, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 100, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 89, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 111, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 64, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 18, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 76, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 114, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 20, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 102, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 68, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 92, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 93, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 38, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 101, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 41, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 8, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 34, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 106, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 4, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 119, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 10, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 98, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 109, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 30, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 107, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 60, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 77, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 34, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 100, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 12, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 55, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 98, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 91, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 46, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 87, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 64, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 26, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 72, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 100, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 39, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 110, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 58, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 38, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 75, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 51, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 102, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 106, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 46, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 19, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 66, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 35, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 71, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 78, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 10, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 80, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 114, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 1, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 80, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 11, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 21, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 97, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 110, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 30, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 118, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 118, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 80, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 109, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 119, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 50, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 21, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 24, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 28, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 9, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 92, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 111, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 42, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 41, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 49, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 38, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 119, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 97, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 119, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 65, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 118, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 11, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 52, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 118, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 26, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 83, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 58, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 63, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 87, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 55, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 114, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 23, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 13, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 24, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 50, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 119, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 108, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 108, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 111, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 86, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 42, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 21, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 103, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 24, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 63, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 5, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 93, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 109, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 67, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 50, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 53, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 109, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 120, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 8, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 22, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 101, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 105, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 42, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 41, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 53, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 23, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 91, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 17, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 91, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 77, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 85, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 117, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 77, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 80, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 67, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 95, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 75, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 77, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 30, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 43, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 30, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 77, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 3, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 34, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 24, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 60, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 38, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 93, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 41, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 85, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 30, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 44, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 58, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 85, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 54, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 25, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 15, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 69, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 41, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 111, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 100, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 48, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 15, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 45, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 99, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 105, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 62, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 2, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 59, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 110, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 11, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 34, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 106, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 70, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 112, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 113, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 82, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 77, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 92, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 79, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 102, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 69, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 56, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 100, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 59, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 84, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 62, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 42, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 26, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 43, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 10, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 104, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 106, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 83, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 107, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 11, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 15, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 95, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 48, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 37, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 24, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 118, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 12, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 32, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 50, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 63, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 12, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 57, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 96, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 84, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 93, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 87, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 28, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 90, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 16, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 18, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 92, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 45, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 56, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 30, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 16, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 46, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 64, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 31, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 62, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 16, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 85, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 87, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 2, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 39, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 23, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 54, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 111, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 94, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 85, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 32, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 69, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 4, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 111, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 2, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 59, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 78, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 56, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 60, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 110, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 20, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 109, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 81, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 13, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 13, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 6, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 21, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 82, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 71, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 57, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 3, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 57, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 99, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 64, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 49, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 16, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 35, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 21, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 101, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 70, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 108, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 85, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 34, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 69, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 75, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 111, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 83, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 1, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 73, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 108, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 100, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 24, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 25, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 86, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 102, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 9, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 62, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 82, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 82, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 119, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 56, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 64, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 2, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 93, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 69, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 63, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 12, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 10, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 49, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 99, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 24, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 84, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 64, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 7, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 38, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 17, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 87, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 20, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 11, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 50, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 62, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 92, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 114, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 89, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 79, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 98, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 94, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 61, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 86, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 77, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 114, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 41, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 61, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 46, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 5, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 8, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 4, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 89, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 108, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 87, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 39, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 59, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 35, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 75, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 32, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 64, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 34, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 56, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 10, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 41, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 47, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 3, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 109, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 97, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 40, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 100, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 63, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 27, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 7, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 42, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 91, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 102, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 117, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 35, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 68, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 90, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 82, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 51, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 48, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 66, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 48, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 105, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 30, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 114, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 109, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 47, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 82, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 113, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 15, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 41, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 86, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 29, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 79, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 42, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 56, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 19, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 41, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 20, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 89, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 93, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 104, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 38, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 25, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 28, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 19, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 53, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 46, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 29, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 109, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 38, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 35, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 85, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 94, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 111, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 59, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 112, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 28, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 19, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 29, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 3, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 103, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 92, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 118, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 55, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 38, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 113, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 13, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 119, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 116, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 63, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 104, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 102, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 31, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 114, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 65, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 107, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 117, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 3, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 60, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 94, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 110, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 120, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 112, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 74, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 63, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 25, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 20, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 19, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 11, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 6, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 1, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 103, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 113, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 52, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 75, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 31, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 91, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 31, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 73, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 44, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 58, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 119, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 75, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 20, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 53, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 101, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 49, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 52, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 64, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 20, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 32, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 12, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 95, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 42, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 29, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 8, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 34, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 14, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 33, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 20, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 48, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 89, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 5, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 101, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 38, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 23, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 85, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 68, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 118, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 77, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 23, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 75, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 83, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 26, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 42, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 111, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 105, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 63, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 113, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 118, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 95, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 17, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 88, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 48, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 110, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 43, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 67, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 16, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 16, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 110, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 43, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 50, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 100, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 75, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 106, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 100, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 78, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 109, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 27, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 46, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 97, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 34, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 5, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 116, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 6, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 16, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 71, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 56, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 100, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 113, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 107, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 114, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 120, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 97, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 12, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 82, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 43, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 92, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 17, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 66, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 17, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 35, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 34, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 62, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 30, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 5, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 95, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 77, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 81, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 48, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 70, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 15, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 50, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 87, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 4, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 86, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 85, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 74, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 24, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 79, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 38, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 115, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 28, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 56, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 36, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 53, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 85, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 17, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 80, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 93, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 112, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 69, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 5, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 75, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 21, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 119, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 111, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 31, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 54, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 7, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 110, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 110, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 46, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 109, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 113, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 68, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 75, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 42, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 5, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 104, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 117, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 27, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 118, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 77, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 87, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 31, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 10, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 45, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 67, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 118, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 27, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 70, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 96, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 57, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 91, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 70, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 77, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 62, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 78, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 81, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 92, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 51, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 45, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 87, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 90, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 16, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 112, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 72, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 43, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 79, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 16, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 82, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 80, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 77, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 77, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 62, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 42, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 96, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 51, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 80, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 118, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 80, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 36, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 86, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 104, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 80, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 11, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 78, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 74, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 51, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 21, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 49, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 36, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 33, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 103, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 92, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 18, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 113, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 20, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 68, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 107, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 39, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 22, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 111, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 31, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 77, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 114, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 23, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 30, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 75, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 7, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 119, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 61, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 80, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 60, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 45, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 1, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 64, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 86, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 105, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 67, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 86, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 9, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 66, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 52, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 56, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 12, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 93, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 64, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 8, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 56, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 47, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 13, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 7, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 119, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 87, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 98, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 26, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 94, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 87, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 82, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 111, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 101, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 90, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 32, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 78, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 27, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 93, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 98, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 49, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 100, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 63, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 1, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 62, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 37, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 58, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 36, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 17, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 84, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 98, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 90, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 29, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 50, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 18, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 6, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 106, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 18, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 52, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 106, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 21, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 113, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 31, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 15, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 69, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 94, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 112, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 17, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 65, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 120, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 52, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 77, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 53, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 29, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 9, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 51, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 91, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 15, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 82, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 54, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 84, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 86, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 50, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 96, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 23, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 27, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 61, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 113, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 54, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 8, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 108, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 63, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 77, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 10, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 111, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 29, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 108, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 89, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 2, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 109, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 34, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 109, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 106, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 15, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 65, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 88, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 111, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 26, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 95, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 88, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 58, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 120, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 112, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 107, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 101, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 28, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 86, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 42, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 87, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 108, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 67, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 48, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 47, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 48, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 35, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 42, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 54, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 27, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 85, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 103, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 103, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 79, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 56, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 111, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 24, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 59, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 56, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 45, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 72, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 94, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 88, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 95, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 65, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 50, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 70, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 10, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 101, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 60, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 36, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 72, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 49, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 56, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 107, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 99, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 14, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 30, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 23, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 41, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 101, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 18, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 104, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 120, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 1, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 61, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 21, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 80, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 54, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 87, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 32, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 102, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 85, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 22, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 46, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 77, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 79, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 77, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 14, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 100, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 15, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 112, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 47, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 45, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 83, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 100, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 36, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 105, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 81, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 25, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 113, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 22, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 92, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 17, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 36, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 43, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 117, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 64, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 94, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 8, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 100, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 35, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 10, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 97, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 22, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 11, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 34, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 17, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 22, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 81, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 79, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 25, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 110, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 105, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 71, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 24, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 108, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 89, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 78, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 41, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 24, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 16, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 48, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 90, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 58, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 1, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 26, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 89, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 14, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 119, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 86, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 87, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 65, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 9, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 101, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 94, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 66, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 37, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 36, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 93, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 36, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 118, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 26, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 112, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 72, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 87, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 86, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 50, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 21, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 46, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 2, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 36, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 18, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 52, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 60, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 61, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 64, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 106, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 10, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 82, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 34, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 99, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 3, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 36, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 5, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 30, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 98, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 71, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 10, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 67, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 84, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 46, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 65, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 83, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 30, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 98, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 6, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 113, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 9, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 58, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 46, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 93, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 96, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 26, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 16, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 77, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 6, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 110, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 53, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 43, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 91, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 93, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 41, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 28, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 93, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 16, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 114, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 5, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 49, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 97, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 62, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 78, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 65, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 39, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 15, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 64, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 36, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 46, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 103, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 56, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 35, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 113, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 62, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 91, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 47, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 74, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 113, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 90, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 38, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 117, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 114, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 101, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 86, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 83, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 52, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 105, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 86, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 106, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 86, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 84, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 73, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 39, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 45, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 53, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 27, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 78, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 43, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 38, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 12, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 69, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 100, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 4, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 34, new IntPred(374, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 15, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 117, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 75, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 105, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 53, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 22, new IntPred(609, 612), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 84, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 60, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 44, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 7, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 120, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 106, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 107, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 83, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 67, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 68, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 51, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 73, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 4, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 43, new IntPred(374, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 39, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 64, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 89, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 44, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 11, new IntPred(548, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 16, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 101, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 77, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 23, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 85, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 44, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 103, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 91, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 45, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 11, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 35, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 34, new IntPred(139, 208), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 70, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 98, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 15, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 1, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 75, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 75, new IntPred(478, 527), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 48, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 38, new IntPred(548, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 22, new IntPred(609, 612), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 42, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 111, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 27, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 44, new IntPred(727, 736), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 12, new IntPred(737, 816), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 110, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 2, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 118, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 58, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 106, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 96, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 52, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 37, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 120, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 92, new IntPred(391, 440), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 65, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 1, new IntPred(478, 527), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 113, new IntPred(528, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 46, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 60, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 44, new IntPred(613, 656), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 79, new IntPred(657, 725), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 34, new IntPred(726, 726), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 3, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 69, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 96, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 116, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 39, new IntPred(858, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 63, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 80, new IntPred(80, 138), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 36, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 20, new IntPred(209, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 93, new IntPred(290, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 8, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 113, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 55, new IntPred(441, 477), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 69, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 27, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 23, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 80, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 55, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 21, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 3, new IntPred(726, 726), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 16, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 21, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 60, new IntPred(817, 819), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 107, new IntPred(820, 857), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 97, new IntPred(858, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 82, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 49, new IntPred(80, 138), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 16, new IntPred(139, 208), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 66, new IntPred(209, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 109, new IntPred(290, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 85, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 109, new IntPred(391, 440), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 106, new IntPred(441, 477), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 29, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 6, new IntPred(528, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 55, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 66, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 19, new IntPred(613, 656), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 105, new IntPred(657, 725), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 92, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 54, new IntPred(727, 736), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 5, new IntPred(737, 816), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 95, new IntPred(817, 819), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 78, new IntPred(820, 857), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 26, new IntPred(858, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 79, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 90, new IntPred(80, 138), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 87, new IntPred(139, 208), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 110, new IntPred(209, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 9, new IntPred(290, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 6, new IntPred(374, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 68, new IntPred(391, 440), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 83, new IntPred(441, 477), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 86, new IntPred(478, 527), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 50, new IntPred(528, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 36, new IntPred(548, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 109, new IntPred(609, 612), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 96, new IntPred(613, 656), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 86, new IntPred(657, 725), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 64, new IntPred(726, 726), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 89, new IntPred(727, 736), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 95, new IntPred(737, 816), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 85, new IntPred(817, 819), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 42, new IntPred(820, 857), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 118, new IntPred(858, null), 'b'));
return trans;
}

}
