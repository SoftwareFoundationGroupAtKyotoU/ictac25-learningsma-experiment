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
public class Random120States10SigmaE20260527124612{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 112, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 53, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 108, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 79, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 90, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 57, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 58, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 75, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 62, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 76, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 93, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 47, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 54, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 59, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 46, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 114, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 101, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 87, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 47, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 61, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 118, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 116, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 85, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 56, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 79, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 106, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 109, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 77, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 79, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 27, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 96, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 66, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 93, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 76, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 119, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 75, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 90, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 59, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 66, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 35, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 90, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 98, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 105, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 56, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 105, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 39, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 49, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 93, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 77, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 34, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 42, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 87, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 51, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 110, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 61, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 73, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 115, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 25, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 43, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 101, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 91, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 99, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 114, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 109, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 46, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 93, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 41, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 63, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 49, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 116, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 79, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 67, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 31, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 103, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 112, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 91, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 61, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 63, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 72, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 82, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 43, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 79, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 37, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 73, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 99, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 75, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 37, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 27, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 117, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 117, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 73, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 68, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 97, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 71, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 54, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 46, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 107, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 100, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 59, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 83, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 119, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 75, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 80, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 46, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 102, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 42, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 92, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 38, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 110, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 87, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 101, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 81, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 79, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 107, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 117, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 42, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 72, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 81, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 90, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 83, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 106, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 96, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 62, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 107, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 92, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 85, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 78, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 100, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 106, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 58, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 84, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 65, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 55, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 78, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 100, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 108, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 46, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 106, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 71, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 98, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 22, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 111, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 82, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 94, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 53, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 115, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 50, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 56, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 110, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 66, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 76, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 65, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 110, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 42, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 103, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 27, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 111, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 51, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 81, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 65, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 72, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 100, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 101, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 71, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 105, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 118, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 81, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 85, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 44, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 91, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 116, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 64, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 102, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 82, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 70, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 112, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 75, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 99, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 61, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 105, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 28, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 102, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 26, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 76, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 86, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 67, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 75, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 82, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 41, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 50, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 48, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 67, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 63, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 91, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 95, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 58, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 93, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 54, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 75, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 70, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 79, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 22, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 118, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 44, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 46, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 58, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 72, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 94, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 118, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 69, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 47, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 118, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 94, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 60, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 55, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 118, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 51, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 55, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 109, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 97, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 69, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 14, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 102, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 63, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 91, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 110, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 82, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 12, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 73, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 91, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 120, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 46, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 64, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 62, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 68, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 113, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 99, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 78, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 106, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 103, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 34, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 101, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 82, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 57, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 110, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 105, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 45, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 94, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 49, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 41, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 83, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 101, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 75, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 1, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 81, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 103, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 119, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 92, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 53, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 46, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 59, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 85, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 32, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 89, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 119, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 106, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 74, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 41, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 58, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 57, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 11, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 72, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 104, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 110, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 53, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 76, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 5, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 52, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 108, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 35, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 63, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 101, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 84, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 92, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 61, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 84, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 77, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 69, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 117, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 43, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 75, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 60, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 15, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 117, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 3, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 25, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 82, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 23, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 116, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 3, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 3, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 109, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 110, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 7, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 73, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 108, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 19, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 3, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 84, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 28, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 18, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 106, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 44, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 88, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 14, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 120, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 98, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 117, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 65, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 48, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 7, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 104, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 83, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 120, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 72, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 80, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 49, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 85, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 9, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 98, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 105, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 112, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 23, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 82, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 111, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 110, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 113, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 120, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 102, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 113, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 8, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 55, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 86, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 34, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 25, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 19, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 101, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 80, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 87, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 104, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 104, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 16, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 48, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 97, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 69, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 67, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 103, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 78, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 99, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 85, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 83, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 84, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 47, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 29, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 23, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 106, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 75, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 90, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 79, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 118, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 110, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 62, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 113, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 44, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 44, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 85, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 118, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 7, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 116, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 20, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 120, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 114, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 115, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 115, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 36, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 64, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 11, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 53, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 95, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 41, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 57, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 77, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 115, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 94, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 112, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 41, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 64, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 74, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 80, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 96, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 37, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 32, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 91, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 37, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 9, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 28, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 43, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 101, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 69, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 8, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 16, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 67, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 30, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 70, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 76, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 61, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 2, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 24, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 105, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 33, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 88, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 2, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 90, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 104, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 71, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 32, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 45, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 52, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 52, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 1, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 8, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 18, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 104, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 101, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 61, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 25, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 95, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 54, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 41, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 81, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 59, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 93, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 63, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 118, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 21, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 41, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 27, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 3, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 5, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 85, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 61, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 73, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 70, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 107, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 75, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 15, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 27, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 8, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 80, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 78, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 90, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 74, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 36, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 29, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 37, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 107, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 77, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 14, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 106, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 76, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 119, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 66, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 52, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 87, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 23, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 91, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 103, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 107, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 49, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 89, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 90, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 63, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 33, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 35, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 69, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 62, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 48, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 71, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 7, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 30, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 71, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 104, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 17, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 32, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 94, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 39, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 112, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 39, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 114, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 18, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 77, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 74, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 113, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 84, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 44, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 30, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 82, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 41, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 9, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 69, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 103, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 120, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 82, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 11, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 76, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 65, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 17, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 45, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 103, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 63, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 17, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 10, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 23, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 109, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 118, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 116, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 104, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 42, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 7, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 5, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 51, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 14, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 77, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 60, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 7, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 68, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 99, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 23, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 21, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 88, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 109, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 64, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 109, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 32, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 59, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 59, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 85, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 45, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 27, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 6, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 16, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 70, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 98, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 37, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 71, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 2, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 63, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 18, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 23, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 25, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 47, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 57, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 116, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 94, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 7, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 31, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 21, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 37, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 108, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 45, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 9, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 100, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 35, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 42, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 46, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 46, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 119, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 70, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 23, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 9, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 30, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 20, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 13, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 45, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 7, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 71, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 45, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 66, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 61, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 78, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 102, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 116, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 99, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 97, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 105, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 72, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 39, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 91, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 105, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 94, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 73, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 16, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 106, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 62, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 58, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 30, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 92, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 69, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 39, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 37, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 103, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 103, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 54, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 33, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 118, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 54, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 84, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 46, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 36, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 16, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 6, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 101, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 29, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 97, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 71, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 61, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 34, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 23, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 97, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 72, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 66, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 98, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 16, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 11, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 1, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 34, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 59, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 5, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 15, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 29, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 26, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 94, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 76, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 95, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 98, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 54, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 65, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 103, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 54, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 111, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 44, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 55, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 1, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 109, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 34, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 112, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 35, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 65, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 72, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 50, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 27, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 95, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 62, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 98, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 115, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 66, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 98, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 64, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 94, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 118, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 12, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 116, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 41, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 32, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 103, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 41, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 92, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 41, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 72, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 4, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 96, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 49, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 84, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 68, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 57, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 117, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 51, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 97, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 91, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 34, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 33, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 94, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 31, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 17, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 57, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 88, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 52, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 107, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 50, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 30, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 111, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 117, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 52, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 81, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 13, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 11, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 73, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 67, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 110, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 45, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 110, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 105, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 90, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 22, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 57, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 11, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 21, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 66, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 26, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 88, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 4, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 53, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 108, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 101, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 94, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 96, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 82, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 76, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 45, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 29, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 4, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 7, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 101, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 104, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 17, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 100, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 10, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 29, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 109, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 63, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 35, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 14, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 10, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 109, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 75, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 116, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 64, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 109, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 108, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 11, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 30, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 39, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 19, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 104, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 72, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 110, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 105, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 36, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 89, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 8, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 14, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 111, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 40, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 2, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 14, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 39, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 36, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 30, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 13, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 113, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 106, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 70, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 116, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 28, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 99, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 104, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 3, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 59, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 64, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 81, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 95, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 73, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 88, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 36, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 75, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 116, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 30, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 50, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 16, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 52, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 37, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 33, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 39, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 66, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 93, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 111, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 66, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 59, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 69, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 14, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 49, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 69, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 24, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 55, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 73, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 38, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 114, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 41, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 52, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 18, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 2, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 16, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 109, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 99, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 48, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 120, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 18, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 8, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 77, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 105, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 34, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 72, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 87, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 65, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 39, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 94, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 76, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 56, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 35, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 76, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 51, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 21, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 52, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 10, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 33, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 83, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 113, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 70, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 103, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 32, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 28, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 114, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 38, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 90, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 95, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 10, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 53, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 90, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 73, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 61, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 118, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 42, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 48, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 66, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 87, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 48, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 46, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 66, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 28, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 115, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 15, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 98, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 103, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 74, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 38, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 39, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 114, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 90, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 53, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 33, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 98, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 54, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 75, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 58, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 43, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 14, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 61, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 22, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 112, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 35, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 79, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 51, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 73, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 70, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 114, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 80, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 108, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 94, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 30, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 47, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 30, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 112, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 110, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 100, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 1, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 39, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 25, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 21, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 14, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 91, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 20, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 81, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 74, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 51, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 10, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 107, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 106, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 53, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 102, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 71, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 8, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 34, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 22, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 57, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 69, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 45, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 47, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 74, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 63, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 50, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 45, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 68, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 98, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 97, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 73, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 19, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 104, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 81, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 2, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 115, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 91, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 71, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 95, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 38, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 79, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 63, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 89, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 69, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 51, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 31, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 67, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 108, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 38, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 32, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 19, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 120, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 67, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 22, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 112, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 113, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 55, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 85, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 99, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 18, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 112, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 84, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 24, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 78, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 5, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 91, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 52, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 11, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 50, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 118, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 22, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 24, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 26, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 9, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 23, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 95, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 69, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 51, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 52, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 85, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 114, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 101, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 73, new IntPred(524, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 63, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 51, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 106, new IntPred(115, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 69, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 13, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 117, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 54, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 90, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 1, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 47, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 41, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 3, new IntPred(80, 114), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 30, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 8, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 43, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 5, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 50, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 82, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 111, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 104, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 54, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 67, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 58, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 62, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 90, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 9, new IntPred(277, 368), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 58, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 104, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 20, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 107, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 25, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 45, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 120, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 76, new IntPred(160, 180), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 96, new IntPred(181, 276), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 37, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 110, new IntPred(369, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 97, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 30, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 7, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 88, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 95, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 105, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 49, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 27, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 48, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 82, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 102, new IntPred(386, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 3, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 116, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 43, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 6, new IntPred(80, 114), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 57, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 34, new IntPred(160, 180), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 41, new IntPred(181, 276), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 91, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 54, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 86, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 99, new IntPred(482, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 24, new IntPred(524, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 71, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 82, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 43, new IntPred(115, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 18, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 120, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 55, new IntPred(277, 368), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 106, new IntPred(369, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 65, new IntPred(386, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 91, new IntPred(482, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 18, new IntPred(524, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 5, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 45, new IntPred(80, 114), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 72, new IntPred(115, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 57, new IntPred(160, 180), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 20, new IntPred(181, 276), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 50, new IntPred(277, 368), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 28, new IntPred(369, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 85, new IntPred(386, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 23, new IntPred(482, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 6, new IntPred(524, null), 'b'));
return trans;
}

}
