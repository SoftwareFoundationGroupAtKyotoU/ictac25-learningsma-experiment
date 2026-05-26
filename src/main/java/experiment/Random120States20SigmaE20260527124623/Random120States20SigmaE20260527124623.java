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
public class Random120States20SigmaE20260527124623{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 83, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 99, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 59, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 49, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 60, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 67, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 90, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 92, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 60, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 77, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 86, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 116, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 47, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 93, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 103, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 90, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 72, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 79, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 89, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 104, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 42, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 49, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 63, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 77, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 109, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 104, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 49, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 114, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 115, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 64, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 48, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 69, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 81, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 60, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 102, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 64, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 107, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 115, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 49, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 79, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 41, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 119, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 71, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 62, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 107, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 28, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 116, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 72, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 51, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 77, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 67, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 55, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 85, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 74, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 80, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 114, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 57, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 80, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 113, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 58, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 108, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 94, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 81, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 101, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 81, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 111, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 55, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 41, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 74, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 51, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 99, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 47, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 80, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 62, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 46, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 72, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 67, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 110, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 102, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 41, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 101, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 92, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 88, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 78, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 108, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 119, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 100, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 89, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 83, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 111, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 47, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 62, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 22, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 65, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 49, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 46, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 119, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 97, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 62, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 60, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 44, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 68, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 45, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 85, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 82, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 63, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 72, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 92, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 99, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 113, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 44, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 95, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 109, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 72, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 105, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 109, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 102, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 116, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 92, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 104, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 120, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 113, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 45, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 59, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 112, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 98, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 76, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 110, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 51, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 53, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 101, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 83, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 51, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 25, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 91, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 60, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 94, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 52, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 67, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 110, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 108, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 99, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 119, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 117, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 102, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 62, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 71, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 84, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 46, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 57, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 47, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 50, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 66, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 57, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 93, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 92, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 33, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 90, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 117, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 95, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 69, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 97, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 85, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 109, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 57, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 21, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 107, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 66, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 114, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 87, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 77, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 103, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 77, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 65, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 21, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 72, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 120, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 90, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 42, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 75, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 41, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 90, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 59, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 111, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 100, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 63, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 95, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 107, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 71, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 102, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 57, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 66, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 82, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 82, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 119, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 63, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 53, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 96, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 69, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 76, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 80, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 46, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 109, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 83, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 107, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 51, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 95, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 118, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 102, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 52, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 41, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 88, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 52, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 89, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 109, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 83, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 119, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 91, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 58, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 90, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 47, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 49, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 72, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 88, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 66, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 117, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 86, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 41, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 44, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 86, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 94, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 81, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 92, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 87, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 109, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 45, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 113, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 119, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 37, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 51, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 109, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 109, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 70, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 108, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 43, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 91, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 93, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 110, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 69, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 79, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 107, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 107, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 117, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 109, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 109, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 75, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 88, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 66, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 104, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 89, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 81, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 80, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 92, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 108, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 109, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 100, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 120, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 90, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 114, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 93, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 41, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 103, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 59, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 95, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 109, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 64, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 67, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 99, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 87, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 55, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 101, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 72, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 51, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 57, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 76, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 74, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 70, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 107, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 59, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 87, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 70, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 116, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 109, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 120, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 70, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 110, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 91, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 120, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 100, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 7, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 108, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 88, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 86, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 66, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 103, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 104, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 75, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 100, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 73, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 9, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 106, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 84, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 79, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 103, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 116, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 70, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 110, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 59, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 44, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 104, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 113, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 104, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 73, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 113, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 19, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 67, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 91, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 68, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 61, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 113, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 54, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 65, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 54, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 81, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 95, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 89, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 95, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 89, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 24, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 42, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 72, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 56, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 45, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 60, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 71, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 107, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 100, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 29, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 82, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 87, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 114, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 116, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 72, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 52, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 79, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 60, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 89, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 109, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 116, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 89, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 65, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 119, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 50, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 96, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 85, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 68, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 97, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 23, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 99, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 72, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 114, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 78, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 48, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 27, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 84, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 26, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 82, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 84, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 27, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 76, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 93, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 95, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 79, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 85, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 76, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 24, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 83, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 108, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 40, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 98, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 117, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 92, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 61, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 67, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 75, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 60, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 58, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 57, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 76, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 69, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 83, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 96, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 52, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 104, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 56, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 59, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 74, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 76, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 88, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 44, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 44, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 66, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 9, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 61, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 93, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 66, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 67, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 106, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 51, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 82, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 62, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 112, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 67, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 78, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 53, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 28, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 100, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 87, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 54, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 96, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 61, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 16, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 68, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 50, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 119, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 43, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 28, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 106, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 55, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 111, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 104, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 73, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 55, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 50, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 79, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 97, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 41, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 112, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 115, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 53, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 108, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 85, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 63, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 75, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 96, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 108, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 56, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 54, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 67, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 58, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 107, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 54, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 110, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 100, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 60, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 119, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 102, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 105, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 54, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 58, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 107, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 69, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 52, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 113, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 68, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 118, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 93, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 101, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 73, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 92, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 55, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 79, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 107, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 87, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 54, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 10, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 63, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 77, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 57, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 80, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 79, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 91, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 57, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 88, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 48, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 80, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 11, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 120, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 100, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 59, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 62, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 30, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 72, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 69, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 22, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 64, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 98, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 85, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 78, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 88, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 117, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 96, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 109, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 95, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 49, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 104, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 67, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 50, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 104, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 87, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 46, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 55, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 110, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 49, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 53, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 57, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 106, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 61, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 85, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 50, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 116, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 84, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 77, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 109, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 90, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 45, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 92, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 108, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 53, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 49, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 53, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 107, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 115, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 71, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 41, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 105, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 43, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 86, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 53, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 110, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 77, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 73, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 53, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 117, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 111, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 70, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 108, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 84, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 85, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 10, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 96, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 64, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 100, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 77, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 118, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 36, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 103, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 79, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 3, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 110, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 10, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 59, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 27, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 69, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 54, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 13, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 96, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 112, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 9, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 96, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 2, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 102, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 15, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 2, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 29, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 83, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 69, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 18, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 6, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 40, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 17, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 47, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 22, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 52, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 7, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 13, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 50, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 39, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 52, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 95, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 91, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 81, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 80, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 50, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 71, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 46, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 82, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 85, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 9, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 1, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 78, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 75, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 77, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 27, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 89, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 42, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 104, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 34, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 19, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 94, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 33, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 10, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 11, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 117, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 28, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 88, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 74, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 21, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 92, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 100, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 105, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 116, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 61, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 82, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 77, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 115, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 35, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 119, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 98, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 52, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 16, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 22, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 84, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 20, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 54, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 62, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 102, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 26, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 4, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 94, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 72, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 65, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 90, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 95, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 25, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 7, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 84, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 34, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 105, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 41, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 115, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 99, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 80, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 68, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 15, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 10, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 78, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 33, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 106, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 22, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 112, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 97, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 112, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 11, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 49, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 119, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 53, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 73, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 65, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 111, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 67, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 57, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 55, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 75, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 12, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 37, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 26, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 86, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 20, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 88, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 77, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 118, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 112, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 114, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 87, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 12, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 21, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 69, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 103, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 82, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 20, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 3, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 102, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 67, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 10, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 16, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 53, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 71, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 119, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 2, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 9, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 5, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 1, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 59, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 95, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 9, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 25, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 13, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 10, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 111, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 86, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 20, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 15, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 46, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 71, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 85, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 87, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 69, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 102, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 103, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 95, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 108, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 17, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 64, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 26, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 5, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 40, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 13, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 37, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 5, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 115, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 45, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 108, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 10, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 93, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 46, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 52, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 47, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 88, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 29, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 55, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 109, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 90, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 99, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 101, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 4, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 67, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 89, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 31, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 23, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 21, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 4, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 70, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 108, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 34, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 57, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 8, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 25, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 105, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 73, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 43, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 16, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 25, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 54, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 64, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 27, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 68, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 44, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 8, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 23, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 117, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 88, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 66, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 5, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 2, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 100, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 75, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 116, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 2, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 120, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 11, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 72, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 118, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 66, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 110, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 102, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 68, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 119, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 24, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 68, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 7, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 15, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 80, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 117, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 80, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 52, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 85, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 88, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 114, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 67, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 43, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 90, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 16, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 95, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 60, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 5, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 110, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 119, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 96, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 101, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 120, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 28, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 65, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 44, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 11, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 21, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 1, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 42, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 95, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 113, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 45, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 18, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 30, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 102, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 95, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 77, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 106, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 42, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 29, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 25, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 88, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 70, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 6, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 42, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 53, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 33, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 24, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 87, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 34, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 15, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 30, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 114, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 104, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 75, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 23, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 65, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 94, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 65, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 15, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 93, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 91, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 66, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 109, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 119, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 38, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 41, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 51, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 36, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 107, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 70, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 8, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 31, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 71, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 89, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 37, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 72, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 79, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 85, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 109, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 61, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 108, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 75, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 115, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 6, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 80, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 62, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 37, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 114, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 1, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 54, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 82, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 9, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 76, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 84, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 55, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 35, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 22, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 81, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 35, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 88, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 43, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 44, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 9, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 83, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 69, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 36, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 12, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 25, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 66, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 106, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 6, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 99, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 100, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 42, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 24, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 61, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 58, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 23, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 16, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 99, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 19, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 111, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 56, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 96, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 25, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 109, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 104, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 49, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 36, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 104, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 47, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 37, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 33, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 105, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 11, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 43, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 114, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 97, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 94, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 116, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 74, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 42, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 54, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 84, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 112, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 1, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 9, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 75, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 66, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 104, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 42, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 110, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 80, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 79, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 96, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 69, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 6, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 115, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 86, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 72, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 74, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 46, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 17, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 92, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 118, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 90, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 8, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 34, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 18, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 39, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 119, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 118, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 11, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 54, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 44, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 60, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 23, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 79, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 23, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 115, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 1, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 1, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 115, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 51, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 26, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 36, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 43, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 30, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 57, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 6, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 21, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 41, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 44, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 74, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 106, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 52, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 100, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 41, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 59, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 85, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 21, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 45, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 37, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 73, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 26, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 25, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 29, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 59, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 93, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 18, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 85, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 98, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 76, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 8, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 37, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 87, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 53, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 109, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 49, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 36, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 34, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 60, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 9, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 5, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 5, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 99, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 116, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 58, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 53, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 57, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 115, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 43, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 70, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 120, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 76, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 18, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 93, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 19, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 12, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 76, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 97, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 96, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 51, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 104, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 99, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 87, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 92, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 77, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 94, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 49, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 65, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 56, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 39, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 26, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 82, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 43, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 29, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 71, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 23, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 41, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 56, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 113, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 2, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 95, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 78, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 93, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 65, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 43, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 70, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 16, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 55, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 29, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 3, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 51, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 3, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 77, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 63, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 120, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 78, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 102, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 34, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 10, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 74, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 81, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 89, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 35, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 100, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 40, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 51, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 49, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 113, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 120, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 100, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 36, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 111, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 113, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 70, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 110, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 116, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 96, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 97, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 12, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 95, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 114, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 36, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 77, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 82, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 7, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 113, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 105, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 14, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 111, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 28, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 97, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 87, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 28, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 118, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 26, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 45, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 120, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 34, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 83, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 71, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 51, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 96, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 30, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 112, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 33, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 41, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 41, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 19, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 23, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 60, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 105, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 5, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 78, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 93, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 10, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 23, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 77, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 72, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 39, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 120, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 15, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 30, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 93, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 90, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 64, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 7, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 65, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 41, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 95, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 88, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 46, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 44, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 51, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 52, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 35, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 72, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 78, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 106, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 45, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 10, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 116, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 81, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 45, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 6, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 106, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 60, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 74, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 29, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 60, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 93, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 56, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 5, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 98, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 105, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 101, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 11, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 46, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 94, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 105, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 87, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 114, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 38, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 82, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 66, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 49, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 82, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 90, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 25, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 106, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 17, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 58, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 87, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 5, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 63, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 11, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 46, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 35, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 22, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 47, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 111, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 65, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 55, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 36, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 44, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 77, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 105, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 8, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 55, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 65, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 53, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 103, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 81, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 40, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 118, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 70, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 111, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 32, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 32, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 116, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 7, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 70, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 98, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 39, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 82, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 73, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 110, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 105, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 11, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 100, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 16, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 64, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 91, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 19, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 93, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 68, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 107, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 66, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 9, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 66, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 68, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 23, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 45, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 2, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 13, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 4, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 81, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 23, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 82, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 78, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 32, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 2, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 64, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 41, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 9, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 111, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 115, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 110, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 22, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 102, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 31, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 23, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 69, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 11, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 106, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 25, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 109, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 52, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 82, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 70, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 56, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 7, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 35, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 93, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 49, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 71, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 118, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 69, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 82, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 10, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 112, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 94, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 82, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 96, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 72, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 33, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 71, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 67, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 62, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 81, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 59, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 88, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 108, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 59, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 26, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 44, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 104, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 110, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 113, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 24, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 95, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 120, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 61, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 14, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 105, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 48, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 110, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 44, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 54, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 110, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 12, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 106, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 54, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 112, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 100, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 43, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 119, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 40, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 7, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 98, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 13, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 2, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 103, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 19, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 82, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 92, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 1, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 110, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 3, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 117, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 91, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 52, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 1, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 9, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 30, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 47, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 12, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 74, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 20, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 118, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 49, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 24, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 98, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 22, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 94, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 82, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 39, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 9, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 104, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 35, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 35, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 99, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 59, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 77, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 16, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 31, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 81, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 8, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 84, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 86, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 65, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 12, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 13, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 103, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 17, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 106, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 34, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 72, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 100, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 62, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 56, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 67, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 101, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 7, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 74, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 65, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 58, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 61, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 88, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 66, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 97, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 58, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 97, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 114, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 61, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 57, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 32, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 22, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 97, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 58, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 41, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 52, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 115, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 51, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 68, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 6, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 74, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 71, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 1, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 63, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 48, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 3, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 19, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 83, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 73, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 59, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 21, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 67, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 10, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 89, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 111, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 118, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 90, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 6, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 9, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 41, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 3, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 15, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 37, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 40, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 65, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 40, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 25, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 74, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 105, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 100, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 10, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 48, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 107, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 34, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 26, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 13, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 41, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 105, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 11, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 55, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 85, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 45, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 113, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 116, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 86, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 22, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 108, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 46, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 83, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 16, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 59, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 87, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 37, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 21, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 105, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 21, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 113, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 12, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 43, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 38, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 100, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 37, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 111, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 5, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 28, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 18, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 6, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 75, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 5, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 32, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 74, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 13, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 25, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 91, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 104, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 36, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 102, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 45, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 39, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 112, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 68, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 78, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 71, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 52, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 52, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 29, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 42, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 53, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 81, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 117, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 22, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 66, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 34, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 112, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 25, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 44, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 118, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 40, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 35, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 7, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 13, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 40, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 55, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 79, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 69, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 46, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 41, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 36, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 51, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 60, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 112, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 94, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 77, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 26, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 85, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 64, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 94, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 21, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 106, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 80, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 58, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 83, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 76, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 5, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 101, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 76, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 49, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 24, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 7, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 10, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 18, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 11, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 66, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 89, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 26, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 36, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 98, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 87, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 68, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 2, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 51, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 84, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 24, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 62, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 71, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 107, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 110, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 99, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 45, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 103, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 88, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 47, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 26, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 110, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 100, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 7, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 115, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 65, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 72, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 6, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 16, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 73, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 52, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 110, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 67, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 27, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 35, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 28, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 118, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 77, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 17, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 48, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 48, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 6, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 101, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 2, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 72, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 33, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 8, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 30, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 112, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 18, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 108, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 72, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 10, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 15, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 54, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 72, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 70, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 47, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 12, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 23, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 74, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 62, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 39, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 56, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 16, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 79, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 50, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 79, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 67, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 112, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 80, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 21, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 73, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 25, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 81, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 41, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 2, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 108, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 93, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 87, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 39, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 118, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 15, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 53, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 51, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 52, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 98, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 17, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 45, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 39, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 79, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 100, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 100, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 96, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 45, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 9, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 33, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 51, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 111, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 109, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 16, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 96, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 105, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 88, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 86, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 77, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 27, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 51, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 75, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 117, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 84, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 40, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 34, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 67, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 95, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 13, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 12, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 63, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 113, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 88, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 96, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 55, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 48, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 99, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 45, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 31, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 61, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 9, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 46, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 113, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 66, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 31, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 4, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 101, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 117, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 83, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 103, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 10, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 115, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 56, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 29, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 98, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 93, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 96, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 73, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 33, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 53, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 104, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 85, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 86, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 113, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 63, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 71, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 89, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 15, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 14, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 39, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 99, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 111, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 112, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 103, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 40, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 44, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 83, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 97, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 79, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 106, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 38, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 84, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 40, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 89, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 104, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 31, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 84, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 72, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 87, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 4, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 65, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 26, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 78, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 78, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 99, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 92, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 76, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 3, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 83, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 76, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 100, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 57, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 36, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 35, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 47, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 4, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 48, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 20, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 75, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 14, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 71, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 50, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 39, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 86, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 87, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 61, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 4, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 58, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 36, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 69, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 21, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 115, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 81, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 29, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 79, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 7, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 93, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 97, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 81, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 42, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 79, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 79, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 37, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 20, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 50, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 17, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 116, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 102, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 17, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 97, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 46, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 12, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 27, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 116, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 111, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 27, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 88, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 95, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 34, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 76, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 17, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 92, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 106, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 15, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 99, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 102, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 3, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 120, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 20, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 80, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 37, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 62, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 68, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 17, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 17, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 94, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 5, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 98, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 105, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 107, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 107, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 5, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 116, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 49, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 93, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 112, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 39, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 93, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 41, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 56, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 108, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 70, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 99, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 62, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 78, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 63, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 118, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 109, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 67, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 2, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 48, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 89, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 64, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 53, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 10, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 72, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 16, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 8, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 94, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 4, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 93, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 45, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 47, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 63, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 45, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 15, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 67, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 30, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 5, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 11, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 44, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 86, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 33, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 9, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 90, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 57, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 114, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 82, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 34, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 82, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 45, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 99, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 82, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 76, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 58, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 9, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 1, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 102, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 82, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 35, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 35, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 57, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 24, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 43, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 99, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 8, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 113, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 60, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 39, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 22, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 91, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 44, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 88, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 67, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 97, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 83, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 78, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 31, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 76, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 42, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 7, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 29, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 43, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 69, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 40, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 57, new IntPred(703, 781), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 4, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 17, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 34, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 106, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 16, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 110, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 110, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 8, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 114, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 93, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 81, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 110, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 64, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 10, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 40, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 24, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 88, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 34, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 60, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 22, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 68, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 6, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 23, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 95, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 62, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 62, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 21, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 14, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 36, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 71, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 84, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 48, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 60, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 77, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 67, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 12, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 104, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 33, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 46, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 89, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 3, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 83, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 104, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 90, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 26, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 32, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 86, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 45, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 60, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 69, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 26, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 111, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 58, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 33, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 118, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 1, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 15, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 54, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 92, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 22, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 88, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 65, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 12, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 114, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 84, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 29, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 78, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 92, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 28, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 3, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 59, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 44, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 36, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 101, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 119, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 77, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 80, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 70, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 10, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 3, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 119, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 35, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 82, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 14, new IntPred(900, 902), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 59, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 76, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 25, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 45, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 111, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 115, new IntPred(243, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 117, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 83, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 87, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 75, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 82, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 45, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 82, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 33, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 2, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 58, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 83, new IntPred(782, 833), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 95, new IntPred(834, 882), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 101, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 113, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 27, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 115, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 64, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 29, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 80, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 12, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 18, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 20, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 9, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 61, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 106, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 91, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 55, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 71, new IntPred(641, 667), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 82, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 91, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 86, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 51, new IntPred(834, 882), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 30, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 95, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 25, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 109, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 13, new IntPred(0, 78), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 11, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 104, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 66, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 22, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 62, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 61, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 66, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 116, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 16, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 98, new IntPred(548, 640), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 14, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 27, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 20, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 4, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 106, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 120, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 95, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 75, new IntPred(903, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 36, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 99, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 70, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 95, new IntPred(164, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 98, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 88, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 44, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 20, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 40, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 89, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 97, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 14, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 63, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 29, new IntPred(668, 702), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 43, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 5, new IntPred(782, 833), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 86, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 4, new IntPred(883, 899), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 56, new IntPred(900, 902), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 2, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 77, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 16, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 2, new IntPred(79, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 104, new IntPred(164, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 93, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 54, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 113, new IntPred(394, 398), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 43, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 24, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 10, new IntPred(462, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 4, new IntPred(545, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 115, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 78, new IntPred(641, 667), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 62, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 32, new IntPred(703, 781), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 50, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 102, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 83, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 46, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 105, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 48, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 77, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 81, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 47, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 10, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 114, new IntPred(294, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 101, new IntPred(394, 398), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 89, new IntPred(399, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 111, new IntPred(451, 461), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 99, new IntPred(462, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 33, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 42, new IntPred(548, 640), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 81, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 50, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 93, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 76, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 111, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 114, new IntPred(883, 899), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 108, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 85, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 31, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 26, new IntPred(0, 78), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 107, new IntPred(79, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 27, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 69, new IntPred(243, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 41, new IntPred(294, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 39, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 71, new IntPred(399, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 81, new IntPred(451, 461), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 59, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 27, new IntPred(545, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 5, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 61, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 74, new IntPred(668, 702), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 55, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 50, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 60, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 37, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 41, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 36, new IntPred(903, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 60, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 76, new IntPred(0, 78), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 47, new IntPred(79, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 45, new IntPred(164, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 116, new IntPred(243, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 105, new IntPred(294, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 35, new IntPred(394, 398), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 24, new IntPred(399, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 38, new IntPred(451, 461), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 120, new IntPred(462, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 61, new IntPred(545, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 82, new IntPred(548, 640), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 109, new IntPred(641, 667), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 103, new IntPred(668, 702), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 68, new IntPred(703, 781), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 42, new IntPred(782, 833), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 32, new IntPred(834, 882), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 62, new IntPred(883, 899), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 45, new IntPred(900, 902), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 112, new IntPred(903, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 69, new IntPred(930, null), 'c'));
return trans;
}

}
