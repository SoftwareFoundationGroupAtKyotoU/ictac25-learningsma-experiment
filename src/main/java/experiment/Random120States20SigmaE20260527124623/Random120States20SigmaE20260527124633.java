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
public class Random120States20SigmaE20260527124633{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 69, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 51, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 115, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 41, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 48, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 92, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 50, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 61, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 77, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 41, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 98, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 110, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 74, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 52, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 78, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 98, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 120, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 117, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 74, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 99, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 109, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 98, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 70, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 50, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 49, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 62, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 55, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 120, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 73, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 94, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 63, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 112, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 57, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 66, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 48, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 61, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 74, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 57, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 58, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 96, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 119, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 84, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 46, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 99, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 113, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 106, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 47, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 75, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 46, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 95, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 44, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 90, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 92, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 61, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 78, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 90, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 116, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 91, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 50, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 56, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 113, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 52, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 77, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 104, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 46, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 111, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 114, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 97, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 105, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 63, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 113, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 105, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 115, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 50, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 112, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 54, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 77, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 106, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 82, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 119, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 91, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 43, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 75, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 73, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 65, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 50, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 103, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 81, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 55, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 106, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 58, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 97, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 41, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 91, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 53, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 57, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 119, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 105, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 95, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 70, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 110, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 106, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 56, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 68, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 98, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 54, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 52, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 77, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 109, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 60, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 92, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 82, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 78, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 99, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 91, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 68, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 91, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 81, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 112, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 98, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 64, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 90, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 66, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 42, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 88, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 58, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 115, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 92, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 72, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 82, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 60, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 24, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 78, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 60, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 73, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 48, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 75, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 88, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 91, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 58, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 64, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 93, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 46, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 65, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 80, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 106, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 74, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 42, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 88, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 113, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 97, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 61, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 72, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 98, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 44, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 111, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 44, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 39, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 106, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 30, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 86, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 79, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 40, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 94, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 89, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 103, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 73, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 99, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 92, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 75, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 111, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 49, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 50, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 97, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 83, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 102, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 58, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 53, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 102, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 62, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 105, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 46, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 117, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 110, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 88, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 29, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 89, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 49, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 96, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 113, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 33, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 89, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 120, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 33, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 85, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 59, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 57, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 88, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 48, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 103, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 80, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 104, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 80, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 105, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 68, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 82, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 95, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 91, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 31, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 119, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 88, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 62, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 117, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 103, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 49, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 44, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 120, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 104, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 102, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 73, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 56, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 110, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 118, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 83, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 97, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 88, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 102, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 96, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 80, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 113, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 93, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 51, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 78, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 95, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 119, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 88, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 70, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 67, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 80, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 116, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 43, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 43, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 75, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 62, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 119, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 109, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 89, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 84, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 118, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 112, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 120, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 56, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 70, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 65, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 49, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 83, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 49, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 105, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 89, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 33, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 74, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 72, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 108, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 61, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 101, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 62, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 60, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 63, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 102, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 23, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 111, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 69, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 106, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 99, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 48, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 50, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 62, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 91, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 74, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 90, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 70, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 49, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 83, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 80, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 63, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 74, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 93, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 86, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 46, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 102, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 48, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 47, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 99, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 84, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 119, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 102, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 27, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 109, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 49, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 80, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 69, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 65, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 49, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 60, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 53, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 59, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 110, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 44, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 21, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 86, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 79, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 79, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 97, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 29, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 118, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 42, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 59, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 87, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 56, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 84, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 88, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 110, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 105, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 116, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 67, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 43, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 72, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 99, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 57, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 44, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 92, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 7, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 81, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 58, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 78, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 65, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 117, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 94, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 105, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 65, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 70, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 92, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 50, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 70, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 118, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 65, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 116, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 120, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 74, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 63, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 112, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 55, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 89, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 63, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 117, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 41, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 44, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 78, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 104, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 112, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 107, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 52, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 117, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 48, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 100, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 87, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 67, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 50, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 61, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 113, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 113, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 119, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 81, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 53, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 7, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 85, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 53, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 73, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 115, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 111, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 89, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 68, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 13, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 120, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 118, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 107, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 110, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 48, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 85, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 94, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 87, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 60, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 64, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 101, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 60, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 13, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 78, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 54, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 114, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 98, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 45, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 120, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 51, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 62, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 111, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 74, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 84, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 96, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 89, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 50, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 117, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 66, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 102, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 80, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 77, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 76, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 101, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 61, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 108, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 108, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 99, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 90, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 97, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 113, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 43, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 84, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 104, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 64, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 117, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 44, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 56, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 59, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 95, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 64, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 91, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 10, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 16, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 70, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 105, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 117, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 54, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 68, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 44, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 75, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 63, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 87, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 78, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 112, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 112, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 45, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 72, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 49, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 45, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 102, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 95, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 41, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 119, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 119, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 53, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 93, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 78, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 14, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 48, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 78, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 107, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 52, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 77, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 52, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 120, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 112, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 83, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 112, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 12, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 68, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 47, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 51, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 86, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 88, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 113, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 93, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 86, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 60, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 90, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 100, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 81, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 99, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 26, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 74, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 68, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 48, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 46, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 118, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 57, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 65, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 103, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 118, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 51, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 97, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 43, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 46, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 79, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 117, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 76, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 88, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 114, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 80, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 71, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 84, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 42, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 78, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 99, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 116, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 50, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 49, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 89, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 105, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 111, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 18, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 110, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 78, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 73, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 76, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 70, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 72, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 44, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 99, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 61, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 120, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 117, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 101, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 1, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 71, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 39, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 54, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 110, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 46, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 10, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 62, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 48, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 55, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 50, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 51, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 7, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 74, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 118, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 85, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 75, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 115, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 42, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 87, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 36, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 60, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 78, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 41, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 117, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 64, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 104, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 20, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 73, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 53, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 1, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 74, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 95, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 81, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 77, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 13, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 64, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 109, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 65, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 77, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 67, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 25, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 91, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 26, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 114, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 74, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 72, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 118, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 35, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 101, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 85, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 18, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 117, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 111, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 99, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 71, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 112, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 96, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 92, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 101, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 115, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 41, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 62, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 103, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 10, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 119, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 46, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 116, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 19, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 44, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 64, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 59, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 95, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 28, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 8, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 70, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 63, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 110, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 68, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 63, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 91, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 94, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 52, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 13, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 51, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 73, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 100, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 113, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 41, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 97, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 84, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 4, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 109, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 37, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 34, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 62, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 55, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 58, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 101, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 15, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 21, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 50, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 76, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 12, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 57, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 85, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 45, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 6, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 39, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 70, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 82, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 61, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 109, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 86, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 99, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 6, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 117, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 100, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 110, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 25, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 119, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 15, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 40, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 102, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 9, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 81, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 95, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 89, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 99, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 42, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 33, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 72, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 116, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 73, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 88, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 66, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 51, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 72, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 92, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 120, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 4, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 40, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 69, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 119, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 40, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 14, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 8, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 15, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 9, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 16, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 4, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 28, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 34, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 78, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 42, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 75, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 113, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 51, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 5, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 84, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 6, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 3, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 98, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 39, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 67, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 44, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 6, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 57, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 59, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 23, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 54, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 69, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 61, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 38, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 109, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 63, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 108, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 81, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 25, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 21, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 120, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 59, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 116, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 97, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 76, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 94, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 4, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 42, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 49, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 52, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 40, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 7, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 59, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 74, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 33, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 19, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 9, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 39, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 43, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 80, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 67, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 84, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 59, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 45, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 60, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 99, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 96, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 98, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 103, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 81, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 19, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 65, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 98, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 85, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 97, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 36, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 8, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 73, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 93, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 107, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 64, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 86, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 64, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 117, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 113, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 41, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 11, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 75, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 32, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 34, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 17, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 2, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 37, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 72, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 63, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 116, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 102, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 50, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 55, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 63, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 117, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 61, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 30, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 74, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 41, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 76, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 105, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 82, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 102, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 77, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 41, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 18, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 116, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 55, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 61, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 31, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 117, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 116, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 8, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 88, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 91, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 104, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 117, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 30, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 108, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 73, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 13, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 75, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 40, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 47, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 69, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 117, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 87, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 43, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 67, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 65, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 4, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 25, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 55, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 106, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 102, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 8, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 100, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 25, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 28, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 92, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 30, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 54, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 34, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 49, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 113, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 107, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 57, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 64, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 100, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 73, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 31, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 69, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 104, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 89, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 32, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 48, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 113, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 18, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 99, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 60, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 82, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 36, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 48, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 38, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 59, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 104, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 42, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 7, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 65, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 84, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 15, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 95, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 14, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 18, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 19, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 6, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 83, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 84, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 119, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 30, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 30, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 54, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 115, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 51, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 24, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 87, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 18, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 103, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 15, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 64, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 5, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 85, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 62, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 86, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 94, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 1, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 89, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 96, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 35, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 51, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 42, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 14, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 27, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 104, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 44, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 101, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 55, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 115, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 32, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 90, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 100, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 113, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 7, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 5, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 38, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 21, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 107, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 93, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 9, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 37, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 102, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 45, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 22, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 74, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 17, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 80, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 78, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 42, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 90, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 120, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 85, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 50, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 51, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 120, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 85, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 75, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 3, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 31, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 7, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 11, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 8, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 110, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 32, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 80, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 111, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 114, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 58, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 107, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 36, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 96, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 79, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 22, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 78, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 50, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 79, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 51, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 115, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 109, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 90, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 45, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 25, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 13, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 117, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 23, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 90, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 87, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 99, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 17, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 25, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 72, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 31, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 118, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 108, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 101, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 46, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 101, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 28, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 114, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 77, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 97, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 10, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 88, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 93, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 79, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 45, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 23, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 71, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 29, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 27, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 2, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 32, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 50, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 28, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 67, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 66, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 83, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 94, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 3, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 113, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 78, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 47, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 88, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 36, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 59, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 110, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 110, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 45, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 27, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 72, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 20, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 54, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 25, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 93, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 40, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 50, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 41, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 46, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 93, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 41, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 19, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 30, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 34, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 23, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 89, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 90, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 87, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 7, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 105, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 104, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 34, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 86, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 42, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 101, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 91, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 43, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 59, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 9, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 78, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 59, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 4, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 34, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 62, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 39, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 114, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 36, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 100, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 115, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 110, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 52, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 82, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 46, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 24, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 99, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 89, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 110, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 78, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 112, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 65, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 50, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 4, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 116, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 36, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 119, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 76, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 93, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 38, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 3, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 106, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 107, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 110, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 2, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 56, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 45, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 90, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 113, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 69, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 107, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 118, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 2, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 73, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 72, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 68, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 49, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 119, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 87, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 90, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 32, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 107, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 109, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 90, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 95, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 67, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 8, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 24, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 11, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 72, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 2, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 40, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 66, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 84, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 21, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 35, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 115, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 76, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 120, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 41, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 62, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 91, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 4, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 54, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 89, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 23, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 101, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 113, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 49, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 67, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 112, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 82, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 89, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 68, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 32, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 3, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 120, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 17, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 62, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 47, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 68, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 61, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 51, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 22, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 22, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 64, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 5, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 84, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 78, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 113, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 8, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 6, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 118, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 63, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 23, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 36, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 85, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 98, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 12, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 73, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 18, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 98, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 37, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 74, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 77, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 31, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 48, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 69, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 43, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 78, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 92, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 76, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 73, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 4, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 28, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 57, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 110, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 66, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 100, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 106, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 51, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 65, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 84, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 43, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 59, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 53, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 98, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 40, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 93, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 28, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 2, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 82, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 119, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 54, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 7, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 87, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 106, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 4, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 64, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 20, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 66, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 82, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 102, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 20, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 30, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 50, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 8, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 25, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 24, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 73, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 61, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 103, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 50, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 57, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 44, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 107, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 75, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 101, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 38, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 49, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 14, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 48, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 86, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 70, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 66, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 103, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 1, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 11, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 109, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 117, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 107, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 102, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 97, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 112, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 81, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 34, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 25, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 39, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 99, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 27, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 40, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 12, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 56, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 38, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 81, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 87, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 114, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 52, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 20, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 17, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 89, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 92, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 100, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 28, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 59, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 12, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 59, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 103, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 22, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 73, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 51, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 99, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 94, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 43, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 60, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 115, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 4, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 10, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 115, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 75, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 17, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 112, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 31, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 97, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 75, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 73, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 43, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 102, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 28, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 43, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 29, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 99, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 93, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 92, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 118, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 14, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 60, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 55, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 14, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 68, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 72, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 5, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 50, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 102, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 78, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 110, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 91, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 104, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 95, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 97, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 75, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 34, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 27, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 83, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 101, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 91, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 16, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 26, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 1, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 65, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 119, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 97, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 8, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 84, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 22, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 59, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 114, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 93, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 43, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 73, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 115, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 105, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 111, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 91, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 40, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 20, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 43, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 99, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 49, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 40, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 115, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 15, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 71, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 77, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 79, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 22, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 76, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 64, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 7, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 7, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 55, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 14, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 84, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 55, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 55, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 87, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 100, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 97, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 69, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 21, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 76, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 29, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 36, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 52, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 37, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 51, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 42, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 98, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 97, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 79, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 38, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 45, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 100, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 20, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 9, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 81, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 61, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 3, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 23, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 10, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 84, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 3, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 77, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 59, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 59, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 104, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 58, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 79, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 63, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 45, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 88, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 118, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 6, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 27, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 41, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 12, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 97, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 90, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 100, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 95, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 113, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 21, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 31, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 80, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 82, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 40, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 92, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 110, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 68, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 27, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 118, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 72, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 23, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 13, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 34, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 25, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 76, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 115, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 81, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 83, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 1, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 8, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 18, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 47, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 75, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 53, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 2, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 73, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 114, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 56, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 101, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 118, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 34, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 54, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 19, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 86, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 102, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 90, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 54, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 76, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 77, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 61, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 48, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 83, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 111, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 94, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 95, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 48, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 110, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 25, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 107, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 100, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 55, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 34, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 92, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 9, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 80, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 64, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 70, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 10, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 73, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 92, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 62, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 53, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 109, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 17, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 67, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 98, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 104, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 67, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 96, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 66, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 64, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 74, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 30, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 18, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 37, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 70, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 36, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 111, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 98, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 42, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 1, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 74, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 116, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 34, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 61, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 35, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 72, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 87, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 69, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 16, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 78, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 119, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 46, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 68, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 82, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 103, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 71, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 50, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 15, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 83, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 81, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 89, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 68, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 66, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 32, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 22, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 81, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 12, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 32, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 63, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 64, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 109, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 66, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 12, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 38, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 41, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 95, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 86, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 24, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 63, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 105, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 90, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 113, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 9, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 6, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 61, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 96, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 48, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 102, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 46, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 92, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 89, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 66, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 88, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 18, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 52, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 117, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 71, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 34, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 57, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 20, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 32, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 103, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 43, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 39, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 83, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 77, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 63, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 15, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 114, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 83, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 43, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 40, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 41, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 97, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 41, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 102, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 85, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 40, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 35, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 97, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 23, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 86, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 38, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 107, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 16, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 17, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 113, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 70, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 52, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 9, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 84, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 64, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 49, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 88, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 11, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 16, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 119, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 35, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 51, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 64, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 87, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 63, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 97, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 42, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 61, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 22, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 8, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 37, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 111, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 42, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 73, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 120, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 37, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 6, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 57, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 59, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 1, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 90, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 104, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 90, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 86, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 85, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 86, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 3, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 11, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 50, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 95, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 20, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 95, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 45, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 14, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 8, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 36, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 21, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 42, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 113, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 117, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 113, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 37, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 116, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 1, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 93, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 17, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 18, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 8, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 44, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 43, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 43, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 114, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 37, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 50, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 66, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 93, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 23, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 119, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 22, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 5, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 94, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 60, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 12, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 108, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 38, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 103, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 79, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 89, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 52, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 69, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 74, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 18, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 50, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 17, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 67, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 76, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 18, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 44, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 112, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 103, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 119, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 36, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 26, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 28, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 57, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 63, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 86, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 24, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 39, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 15, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 80, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 72, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 108, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 5, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 104, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 13, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 28, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 39, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 119, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 103, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 62, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 28, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 32, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 99, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 97, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 12, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 25, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 79, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 120, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 50, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 25, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 114, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 88, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 99, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 113, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 39, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 15, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 7, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 69, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 88, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 84, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 36, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 106, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 76, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 67, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 80, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 63, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 91, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 72, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 77, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 14, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 30, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 96, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 92, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 57, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 90, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 101, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 85, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 47, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 3, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 16, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 82, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 102, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 67, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 55, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 49, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 120, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 42, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 70, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 89, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 48, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 100, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 95, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 1, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 76, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 80, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 108, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 21, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 58, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 46, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 25, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 43, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 60, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 94, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 85, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 16, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 94, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 100, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 55, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 61, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 28, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 112, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 42, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 93, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 119, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 120, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 51, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 102, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 110, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 22, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 119, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 93, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 103, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 6, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 48, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 20, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 109, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 109, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 7, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 86, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 72, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 37, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 40, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 111, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 26, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 70, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 107, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 78, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 78, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 108, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 86, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 11, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 25, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 21, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 45, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 27, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 67, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 33, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 37, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 73, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 60, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 66, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 34, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 4, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 113, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 3, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 46, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 46, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 54, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 75, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 35, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 97, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 18, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 41, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 37, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 25, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 112, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 54, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 34, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 62, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 98, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 80, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 27, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 72, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 110, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 83, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 10, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 51, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 11, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 103, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 36, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 75, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 58, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 55, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 118, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 46, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 14, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 38, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 26, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 47, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 102, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 25, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 25, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 30, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 64, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 65, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 15, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 26, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 109, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 80, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 19, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 113, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 42, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 113, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 86, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 28, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 18, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 57, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 89, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 14, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 62, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 82, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 33, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 11, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 79, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 101, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 60, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 67, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 48, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 21, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 67, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 94, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 86, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 112, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 48, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 118, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 49, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 38, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 71, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 66, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 106, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 10, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 70, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 23, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 29, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 6, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 54, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 63, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 54, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 81, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 1, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 115, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 93, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 50, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 60, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 18, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 84, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 67, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 76, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 66, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 13, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 48, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 50, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 43, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 14, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 39, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 33, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 41, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 110, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 120, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 12, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 32, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 79, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 108, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 115, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 56, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 108, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 80, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 92, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 104, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 42, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 104, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 51, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 4, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 112, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 94, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 52, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 80, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 104, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 50, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 37, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 36, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 78, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 9, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 95, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 8, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 29, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 47, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 116, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 31, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 95, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 31, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 79, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 109, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 27, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 72, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 97, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 27, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 22, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 54, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 112, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 79, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 77, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 105, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 23, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 46, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 38, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 86, new IntPred(900, 919), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 98, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 76, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 68, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 89, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 56, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 72, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 66, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 85, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 65, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 75, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 84, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 80, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 104, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 31, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 91, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 34, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 16, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 105, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 111, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 51, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 120, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 56, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 68, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 66, new IntPred(99, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 97, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 30, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 120, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 42, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 100, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 92, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 17, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 4, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 118, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 47, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 24, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 2, new IntPred(712, 757), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 77, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 119, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 90, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 47, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 97, new IntPred(920, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 44, new IntPred(0, 0), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 43, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 1, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 94, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 25, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 91, new IntPred(296, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 65, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 54, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 11, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 19, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 56, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 26, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 97, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 94, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 105, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 79, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 59, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 114, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 11, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 74, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 100, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 6, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 110, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 55, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 81, new IntPred(252, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 51, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 74, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 107, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 57, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 37, new IntPred(437, 512), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 77, new IntPred(513, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 7, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 28, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 113, new IntPred(670, 711), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 91, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 21, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 79, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 62, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 61, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 82, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 100, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 14, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 53, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 37, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 20, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 3, new IntPred(296, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 6, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 12, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 22, new IntPred(377, 436), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 84, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 30, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 107, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 38, new IntPred(661, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 47, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 20, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 102, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 41, new IntPred(857, 867), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 54, new IntPred(868, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 44, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 11, new IntPred(920, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 101, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 13, new IntPred(1, 98), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 120, new IntPred(99, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 98, new IntPred(189, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 11, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 103, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 62, new IntPred(297, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 7, new IntPred(333, 376), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 102, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 5, new IntPred(437, 512), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 14, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 84, new IntPred(570, 660), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 68, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 73, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 3, new IntPred(712, 757), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 41, new IntPred(758, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 17, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 60, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 7, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 62, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 32, new IntPred(0, 0), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 86, new IntPred(1, 98), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 24, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 93, new IntPred(189, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 75, new IntPred(252, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 36, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 40, new IntPred(297, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 90, new IntPred(333, 376), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 96, new IntPred(377, 436), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 113, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 54, new IntPred(513, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 60, new IntPred(570, 660), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 76, new IntPred(661, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 95, new IntPred(670, 711), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 15, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 99, new IntPred(758, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 17, new IntPred(857, 867), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 117, new IntPred(868, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 65, new IntPred(900, 919), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 17, new IntPred(920, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 9, new IntPred(0, 0), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 64, new IntPred(1, 98), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 76, new IntPred(99, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 67, new IntPred(189, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 90, new IntPred(252, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 99, new IntPred(296, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 81, new IntPred(297, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 71, new IntPred(333, 376), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 73, new IntPred(377, 436), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 17, new IntPred(437, 512), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 52, new IntPred(513, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 30, new IntPred(570, 660), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 97, new IntPred(661, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 39, new IntPred(670, 711), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 116, new IntPred(712, 757), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 8, new IntPred(758, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 99, new IntPred(857, 867), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 45, new IntPred(868, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 31, new IntPred(900, 919), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 36, new IntPred(920, null), 'b'));
return trans;
}

}
