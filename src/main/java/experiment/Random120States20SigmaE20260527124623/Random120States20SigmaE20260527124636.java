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
public class Random120States20SigmaE20260527124636{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 70, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 108, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 73, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 68, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 115, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 60, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 105, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 59, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 58, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 90, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 86, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 25, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 84, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 68, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 63, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 106, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 115, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 41, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 93, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 61, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 83, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 89, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 91, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 97, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 105, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 68, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 67, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 72, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 85, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 70, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 54, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 77, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 114, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 64, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 100, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 108, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 87, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 69, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 114, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 81, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 97, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 77, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 102, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 105, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 101, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 43, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 24, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 93, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 91, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 115, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 45, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 86, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 41, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 78, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 56, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 67, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 119, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 64, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 104, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 56, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 118, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 70, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 117, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 94, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 70, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 109, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 80, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 80, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 62, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 95, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 120, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 51, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 112, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 72, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 74, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 119, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 34, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 99, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 59, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 85, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 49, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 44, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 96, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 75, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 52, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 120, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 50, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 51, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 79, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 66, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 56, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 72, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 90, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 113, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 96, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 76, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 115, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 63, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 46, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 67, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 84, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 116, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 62, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 78, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 88, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 67, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 104, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 44, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 44, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 80, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 86, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 59, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 118, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 48, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 94, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 90, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 86, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 42, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 87, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 82, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 108, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 120, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 92, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 112, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 75, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 89, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 42, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 100, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 103, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 109, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 77, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 46, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 76, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 105, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 107, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 108, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 91, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 91, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 105, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 102, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 98, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 43, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 46, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 100, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 94, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 98, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 48, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 56, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 81, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 77, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 112, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 88, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 50, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 91, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 86, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 106, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 98, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 82, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 52, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 100, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 68, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 61, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 63, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 52, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 44, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 94, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 111, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 111, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 82, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 74, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 95, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 62, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 76, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 71, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 88, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 73, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 74, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 71, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 64, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 119, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 74, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 71, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 44, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 79, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 74, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 54, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 76, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 65, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 103, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 85, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 84, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 53, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 69, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 64, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 119, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 112, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 92, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 105, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 72, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 38, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 58, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 85, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 120, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 95, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 58, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 106, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 47, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 50, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 100, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 103, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 66, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 80, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 107, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 53, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 102, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 95, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 58, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 59, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 115, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 75, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 41, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 87, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 68, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 83, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 83, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 97, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 84, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 112, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 46, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 63, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 79, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 62, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 37, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 115, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 91, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 119, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 79, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 44, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 49, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 66, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 81, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 68, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 107, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 110, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 54, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 50, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 21, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 70, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 117, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 78, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 75, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 53, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 120, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 94, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 104, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 111, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 90, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 75, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 48, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 117, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 118, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 65, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 51, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 56, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 53, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 57, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 41, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 100, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 66, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 105, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 46, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 113, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 85, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 100, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 105, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 116, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 73, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 54, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 95, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 96, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 117, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 94, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 85, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 66, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 42, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 11, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 44, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 65, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 73, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 31, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 62, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 11, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 114, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 59, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 87, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 115, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 42, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 105, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 64, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 103, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 71, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 66, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 7, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 110, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 63, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 61, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 93, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 112, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 54, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 55, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 115, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 116, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 119, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 44, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 78, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 68, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 107, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 117, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 74, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 42, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 91, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 49, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 85, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 101, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 41, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 112, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 44, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 57, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 69, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 108, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 108, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 74, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 57, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 91, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 114, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 54, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 103, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 56, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 63, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 81, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 87, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 68, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 59, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 63, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 83, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 45, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 90, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 91, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 23, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 103, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 107, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 71, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 72, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 107, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 55, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 117, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 60, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 114, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 47, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 92, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 117, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 100, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 62, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 100, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 104, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 51, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 106, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 71, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 49, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 43, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 116, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 81, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 119, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 102, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 78, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 92, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 44, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 61, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 120, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 107, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 93, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 89, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 47, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 15, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 57, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 78, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 64, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 15, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 94, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 79, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 73, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 93, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 107, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 53, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 104, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 64, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 82, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 63, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 80, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 38, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 120, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 48, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 116, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 56, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 82, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 82, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 56, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 72, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 103, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 70, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 45, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 105, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 61, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 93, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 91, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 108, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 108, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 72, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 46, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 31, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 84, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 117, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 113, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 47, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 66, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 72, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 89, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 57, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 73, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 53, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 96, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 55, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 79, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 106, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 87, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 48, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 87, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 65, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 63, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 54, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 101, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 64, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 49, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 113, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 100, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 14, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 75, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 120, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 65, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 42, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 113, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 95, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 116, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 104, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 69, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 90, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 56, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 100, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 69, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 100, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 99, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 109, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 101, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 102, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 75, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 114, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 46, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 109, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 73, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 42, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 58, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 2, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 83, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 86, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 112, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 87, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 68, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 106, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 65, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 52, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 44, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 86, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 97, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 68, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 48, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 52, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 107, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 82, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 113, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 59, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 94, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 116, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 86, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 105, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 69, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 63, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 76, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 80, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 112, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 77, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 110, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 62, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 99, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 120, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 1, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 108, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 105, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 80, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 104, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 52, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 94, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 76, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 104, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 44, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 116, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 118, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 107, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 49, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 57, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 68, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 81, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 84, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 118, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 114, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 3, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 54, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 106, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 73, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 118, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 105, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 62, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 92, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 103, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 45, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 92, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 95, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 59, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 119, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 110, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 83, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 50, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 79, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 96, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 77, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 86, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 117, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 100, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 119, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 92, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 59, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 99, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 83, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 88, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 54, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 57, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 95, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 32, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 93, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 21, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 32, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 76, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 16, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 41, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 62, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 97, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 97, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 50, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 104, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 68, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 99, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 10, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 44, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 53, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 62, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 101, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 61, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 20, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 54, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 2, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 62, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 91, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 110, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 109, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 91, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 118, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 116, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 34, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 4, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 41, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 64, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 47, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 19, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 62, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 12, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 118, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 17, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 20, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 101, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 56, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 44, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 24, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 24, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 74, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 76, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 87, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 13, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 11, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 113, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 105, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 92, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 110, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 96, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 26, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 22, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 81, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 30, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 3, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 71, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 64, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 34, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 75, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 53, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 44, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 107, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 76, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 88, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 17, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 33, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 44, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 68, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 52, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 58, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 84, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 67, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 30, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 45, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 104, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 88, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 46, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 54, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 102, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 48, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 47, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 109, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 106, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 94, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 96, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 118, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 66, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 54, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 88, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 88, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 105, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 8, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 33, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 77, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 56, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 5, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 15, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 54, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 54, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 9, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 89, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 112, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 17, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 32, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 94, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 114, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 74, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 84, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 49, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 69, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 117, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 117, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 22, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 74, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 22, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 111, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 15, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 36, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 119, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 37, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 82, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 1, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 86, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 11, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 107, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 23, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 4, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 102, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 100, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 93, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 77, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 94, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 119, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 33, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 91, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 64, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 17, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 42, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 116, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 35, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 78, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 85, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 103, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 72, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 106, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 5, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 20, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 20, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 9, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 75, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 51, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 82, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 116, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 87, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 14, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 76, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 4, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 10, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 63, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 46, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 43, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 18, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 4, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 113, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 96, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 71, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 119, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 102, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 11, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 70, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 70, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 23, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 80, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 116, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 63, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 36, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 93, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 84, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 95, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 1, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 105, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 46, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 47, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 1, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 62, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 7, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 64, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 88, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 47, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 29, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 97, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 70, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 97, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 32, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 118, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 76, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 93, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 66, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 34, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 12, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 12, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 55, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 86, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 108, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 89, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 38, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 87, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 3, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 26, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 85, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 43, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 115, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 39, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 72, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 44, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 69, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 25, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 18, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 91, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 47, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 113, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 53, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 17, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 78, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 1, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 90, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 83, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 58, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 56, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 39, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 9, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 106, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 67, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 85, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 58, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 84, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 40, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 34, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 59, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 111, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 111, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 46, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 83, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 24, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 48, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 21, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 43, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 25, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 40, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 50, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 44, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 52, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 93, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 42, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 84, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 73, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 7, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 88, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 82, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 98, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 38, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 79, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 104, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 115, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 111, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 4, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 7, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 97, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 26, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 29, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 102, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 91, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 42, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 100, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 26, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 12, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 26, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 10, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 30, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 48, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 93, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 43, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 71, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 76, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 74, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 65, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 15, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 18, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 114, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 107, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 112, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 113, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 95, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 44, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 80, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 34, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 35, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 2, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 111, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 52, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 105, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 81, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 91, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 119, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 27, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 3, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 71, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 79, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 119, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 43, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 27, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 79, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 83, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 95, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 85, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 47, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 97, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 46, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 105, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 31, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 44, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 81, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 114, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 33, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 81, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 14, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 45, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 90, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 7, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 104, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 76, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 64, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 62, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 16, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 89, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 69, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 3, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 23, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 78, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 114, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 82, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 16, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 99, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 44, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 26, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 114, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 15, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 51, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 92, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 76, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 101, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 21, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 92, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 15, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 113, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 62, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 64, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 92, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 41, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 82, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 67, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 119, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 86, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 36, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 4, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 91, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 54, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 102, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 83, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 73, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 6, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 112, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 82, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 51, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 68, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 99, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 27, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 111, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 62, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 107, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 57, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 41, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 35, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 102, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 41, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 72, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 8, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 107, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 48, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 3, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 19, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 75, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 45, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 84, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 17, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 66, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 71, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 66, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 10, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 43, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 29, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 22, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 118, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 71, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 28, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 60, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 65, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 25, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 17, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 71, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 99, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 13, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 25, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 58, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 117, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 110, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 4, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 50, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 68, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 50, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 18, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 4, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 97, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 114, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 47, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 58, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 97, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 88, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 87, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 41, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 90, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 120, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 50, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 86, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 84, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 26, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 40, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 10, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 70, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 62, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 17, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 14, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 70, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 80, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 84, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 55, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 4, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 72, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 78, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 103, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 28, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 51, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 67, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 16, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 92, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 95, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 61, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 107, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 47, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 71, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 102, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 110, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 26, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 83, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 54, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 97, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 31, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 35, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 117, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 67, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 39, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 106, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 92, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 49, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 86, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 41, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 99, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 26, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 41, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 58, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 42, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 42, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 35, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 24, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 8, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 39, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 81, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 66, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 25, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 88, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 3, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 3, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 56, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 91, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 102, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 1, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 14, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 46, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 39, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 25, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 14, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 115, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 54, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 105, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 48, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 85, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 11, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 106, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 41, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 112, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 26, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 59, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 51, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 71, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 60, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 64, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 56, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 47, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 42, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 111, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 40, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 17, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 45, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 20, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 41, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 49, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 56, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 101, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 4, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 94, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 51, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 100, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 101, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 103, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 19, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 67, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 45, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 104, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 89, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 102, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 93, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 100, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 109, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 114, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 82, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 4, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 51, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 19, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 120, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 38, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 111, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 58, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 53, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 84, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 78, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 99, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 52, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 116, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 96, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 101, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 115, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 22, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 51, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 81, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 113, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 88, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 52, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 87, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 120, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 85, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 102, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 32, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 118, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 78, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 24, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 41, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 91, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 92, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 1, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 43, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 103, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 20, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 98, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 54, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 107, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 73, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 52, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 3, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 22, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 31, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 47, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 9, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 47, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 4, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 81, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 52, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 14, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 15, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 44, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 117, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 102, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 41, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 62, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 64, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 46, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 71, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 3, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 33, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 98, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 37, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 21, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 54, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 14, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 60, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 108, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 103, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 35, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 108, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 62, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 33, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 16, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 98, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 95, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 70, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 106, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 27, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 113, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 101, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 51, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 6, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 5, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 120, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 94, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 46, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 120, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 41, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 104, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 69, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 87, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 27, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 97, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 74, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 18, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 7, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 112, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 83, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 60, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 115, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 82, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 120, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 68, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 100, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 69, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 117, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 77, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 12, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 30, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 117, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 43, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 110, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 60, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 109, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 93, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 71, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 99, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 71, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 6, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 28, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 39, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 63, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 30, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 11, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 81, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 109, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 86, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 35, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 65, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 105, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 113, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 78, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 36, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 117, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 43, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 112, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 73, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 102, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 101, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 61, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 110, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 67, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 102, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 86, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 23, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 36, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 42, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 84, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 7, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 3, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 119, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 51, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 69, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 51, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 72, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 8, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 18, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 47, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 11, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 99, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 49, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 46, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 85, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 105, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 45, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 22, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 75, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 25, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 66, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 117, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 48, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 58, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 111, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 12, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 110, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 104, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 45, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 23, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 62, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 93, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 110, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 50, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 56, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 95, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 62, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 74, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 97, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 118, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 75, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 51, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 82, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 59, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 10, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 97, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 111, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 11, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 51, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 14, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 94, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 8, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 28, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 64, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 8, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 65, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 30, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 46, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 85, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 56, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 115, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 3, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 75, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 47, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 50, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 9, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 112, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 73, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 17, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 23, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 11, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 103, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 106, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 115, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 110, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 40, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 46, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 96, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 6, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 78, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 4, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 17, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 1, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 23, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 58, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 59, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 30, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 66, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 34, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 63, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 24, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 30, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 39, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 77, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 75, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 6, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 37, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 9, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 5, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 78, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 3, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 25, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 110, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 14, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 76, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 4, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 55, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 70, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 57, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 4, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 46, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 56, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 32, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 100, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 120, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 17, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 80, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 59, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 30, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 40, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 106, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 71, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 72, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 109, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 49, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 74, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 44, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 2, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 2, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 16, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 63, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 69, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 92, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 102, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 34, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 4, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 97, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 60, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 14, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 103, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 99, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 4, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 72, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 8, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 71, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 56, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 93, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 21, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 76, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 119, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 6, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 101, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 5, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 79, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 85, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 119, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 58, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 76, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 46, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 94, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 11, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 32, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 38, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 62, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 60, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 80, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 55, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 119, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 105, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 21, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 10, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 33, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 92, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 31, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 2, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 110, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 65, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 35, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 15, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 44, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 120, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 86, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 24, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 71, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 50, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 64, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 31, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 10, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 83, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 18, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 97, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 103, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 62, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 39, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 51, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 98, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 84, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 22, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 109, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 89, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 93, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 5, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 42, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 62, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 92, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 55, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 54, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 27, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 38, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 79, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 46, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 92, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 99, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 58, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 83, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 80, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 68, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 65, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 79, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 104, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 50, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 20, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 45, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 118, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 45, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 71, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 60, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 47, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 50, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 72, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 29, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 49, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 99, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 94, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 24, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 29, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 51, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 107, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 27, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 69, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 111, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 75, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 18, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 54, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 69, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 19, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 71, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 15, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 56, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 74, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 99, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 72, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 41, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 26, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 18, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 68, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 15, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 7, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 75, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 110, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 96, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 6, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 13, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 15, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 117, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 119, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 83, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 14, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 17, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 84, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 72, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 110, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 26, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 15, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 43, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 27, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 118, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 79, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 116, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 28, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 39, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 59, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 4, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 66, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 39, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 68, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 81, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 39, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 4, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 39, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 71, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 80, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 76, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 65, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 23, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 35, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 50, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 48, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 51, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 113, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 103, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 24, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 103, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 108, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 113, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 43, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 66, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 18, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 55, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 71, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 10, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 79, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 9, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 100, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 99, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 102, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 20, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 75, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 80, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 97, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 100, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 63, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 56, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 28, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 56, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 119, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 34, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 13, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 98, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 50, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 24, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 46, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 99, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 72, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 87, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 33, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 90, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 63, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 61, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 114, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 78, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 92, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 26, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 33, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 119, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 61, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 103, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 85, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 96, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 101, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 105, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 9, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 47, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 87, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 110, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 106, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 67, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 50, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 94, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 14, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 5, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 11, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 99, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 22, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 39, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 69, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 89, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 68, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 15, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 68, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 118, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 109, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 12, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 116, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 2, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 80, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 8, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 103, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 72, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 85, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 60, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 52, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 35, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 71, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 38, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 24, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 41, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 82, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 77, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 72, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 67, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 36, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 67, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 20, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 2, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 87, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 66, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 94, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 115, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 37, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 95, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 56, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 76, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 90, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 90, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 81, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 60, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 38, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 43, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 56, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 86, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 24, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 102, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 7, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 54, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 11, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 95, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 40, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 25, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 52, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 31, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 91, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 73, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 9, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 76, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 6, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 63, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 91, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 12, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 91, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 23, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 116, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 2, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 29, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 70, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 2, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 79, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 74, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 119, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 113, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 26, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 34, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 1, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 52, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 16, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 70, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 10, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 29, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 116, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 97, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 7, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 48, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 119, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 74, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 72, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 92, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 57, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 120, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 120, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 33, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 29, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 108, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 11, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 97, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 97, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 34, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 94, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 51, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 11, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 55, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 66, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 3, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 68, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 51, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 65, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 59, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 8, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 73, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 23, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 21, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 4, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 42, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 73, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 62, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 46, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 101, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 105, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 52, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 72, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 57, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 31, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 80, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 69, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 9, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 89, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 29, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 26, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 46, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 84, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 118, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 102, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 72, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 56, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 67, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 97, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 13, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 111, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 60, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 48, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 88, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 109, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 36, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 15, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 107, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 57, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 87, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 77, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 36, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 90, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 75, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 99, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 43, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 75, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 43, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 61, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 106, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 40, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 6, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 79, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 91, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 94, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 68, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 104, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 53, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 14, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 33, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 10, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 111, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 105, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 63, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 47, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 59, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 117, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 48, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 13, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 92, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 22, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 97, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 19, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 23, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 109, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 89, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 113, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 29, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 100, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 47, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 3, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 103, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 40, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 94, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 46, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 64, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 37, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 76, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 9, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 111, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 5, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 85, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 13, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 113, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 49, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 21, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 5, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 10, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 85, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 11, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 94, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 5, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 112, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 110, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 63, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 95, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 1, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 12, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 10, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 16, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 3, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 61, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 41, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 33, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 81, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 92, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 1, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 30, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 18, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 45, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 25, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 84, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 45, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 112, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 84, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 12, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 70, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 92, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 66, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 94, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 23, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 44, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 42, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 86, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 7, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 29, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 75, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 98, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 94, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 21, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 22, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 2, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 86, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 13, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 93, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 86, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 27, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 40, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 15, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 115, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 75, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 97, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 49, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 94, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 23, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 32, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 21, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 22, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 104, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 61, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 54, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 30, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 34, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 67, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 106, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 8, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 115, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 102, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 22, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 18, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 20, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 5, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 93, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 28, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 78, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 8, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 73, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 56, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 78, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 66, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 120, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 113, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 26, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 47, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 80, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 116, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 89, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 55, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 58, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 17, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 15, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 57, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 82, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 49, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 22, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 32, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 52, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 81, new IntPred(254, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 44, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 97, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 57, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 46, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 91, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 98, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 72, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 55, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 52, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 12, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 44, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 78, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 27, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 74, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 44, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 94, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 54, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 103, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 85, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 117, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 101, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 91, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 114, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 51, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 11, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 119, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 84, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 65, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 83, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 3, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 18, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 35, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 75, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 102, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 2, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 110, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 68, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 110, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 61, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 82, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 23, new IntPred(315, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 3, new IntPred(341, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 38, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 120, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 57, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 16, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 35, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 12, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 103, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 26, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 98, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 43, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 18, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 94, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 5, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 78, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 68, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 118, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 70, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 13, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 97, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 85, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 67, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 5, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 62, new IntPred(540, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 46, new IntPred(590, 672), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 10, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 58, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 101, new IntPred(828, 907), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 104, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 6, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 68, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 31, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 100, new IntPred(1191, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 32, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 54, new IntPred(49, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 39, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 13, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 13, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 58, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 5, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 118, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 54, new IntPred(390, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 14, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 88, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 7, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 43, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 81, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 114, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 32, new IntPred(908, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 47, new IntPred(986, 1076), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 69, new IntPred(1077, 1107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 112, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 36, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 39, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 111, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 7, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 47, new IntPred(133, 231), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 114, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 34, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 64, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 48, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 9, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 7, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 52, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 119, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 72, new IntPred(673, 740), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 88, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 15, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 87, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 67, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 56, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 104, new IntPred(1108, 1190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 69, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 89, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 36, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 87, new IntPred(89, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 22, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 28, new IntPred(232, 253), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 76, new IntPred(254, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 70, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 20, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 87, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 10, new IntPred(461, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 24, new IntPred(540, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 34, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 22, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 105, new IntPred(741, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 109, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 51, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 81, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 6, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 51, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 6, new IntPred(1191, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 112, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 19, new IntPred(49, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 86, new IntPred(89, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 60, new IntPred(133, 231), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 47, new IntPred(232, 253), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 6, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 40, new IntPred(315, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 96, new IntPred(341, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 68, new IntPred(390, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 6, new IntPred(461, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 41, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 45, new IntPred(590, 672), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 12, new IntPred(673, 740), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 118, new IntPred(741, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 112, new IntPred(828, 907), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 20, new IntPred(908, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 17, new IntPred(986, 1076), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 71, new IntPred(1077, 1107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 111, new IntPred(1108, 1190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 27, new IntPred(1191, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 94, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 34, new IntPred(49, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 26, new IntPred(89, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 94, new IntPred(133, 231), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 8, new IntPred(232, 253), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 35, new IntPred(254, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 40, new IntPred(315, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 9, new IntPred(341, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 110, new IntPred(390, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 23, new IntPred(461, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 120, new IntPred(540, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 42, new IntPred(590, 672), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 58, new IntPred(673, 740), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 102, new IntPred(741, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 45, new IntPred(828, 907), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 76, new IntPred(908, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 110, new IntPred(986, 1076), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 49, new IntPred(1077, 1107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 34, new IntPred(1108, 1190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 7, new IntPred(1191, null), 'b'));
return trans;
}

}
