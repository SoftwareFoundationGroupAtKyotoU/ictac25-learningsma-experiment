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
public class Random120States20SigmaE20260527124626{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 75, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 60, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 46, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 69, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 71, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 106, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 79, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 105, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 115, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 118, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 114, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 80, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 108, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 108, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 102, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 87, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 101, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 100, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 59, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 106, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 23, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 63, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 54, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 119, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 59, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 95, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 46, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 88, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 89, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 106, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 53, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 102, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 49, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 98, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 110, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 104, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 49, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 45, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 42, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 120, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 90, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 89, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 73, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 55, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 73, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 73, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 109, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 60, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 89, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 116, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 119, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 59, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 27, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 115, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 90, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 49, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 96, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 76, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 115, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 27, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 118, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 45, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 83, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 96, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 65, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 62, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 109, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 87, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 105, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 83, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 50, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 76, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 108, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 77, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 49, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 50, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 95, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 63, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 75, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 34, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 110, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 39, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 82, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 75, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 40, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 88, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 113, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 96, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 69, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 103, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 108, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 63, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 90, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 111, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 120, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 105, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 101, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 90, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 112, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 61, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 91, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 114, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 93, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 113, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 64, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 72, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 55, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 50, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 51, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 23, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 68, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 109, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 68, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 44, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 119, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 112, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 94, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 51, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 114, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 82, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 96, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 103, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 50, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 93, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 115, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 113, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 65, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 103, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 54, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 71, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 53, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 103, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 81, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 116, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 114, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 117, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 33, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 92, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 97, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 102, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 23, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 99, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 61, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 101, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 55, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 63, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 114, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 45, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 90, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 72, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 74, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 21, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 86, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 60, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 44, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 28, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 41, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 76, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 88, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 115, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 76, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 43, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 102, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 89, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 81, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 117, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 44, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 119, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 27, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 68, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 80, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 43, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 36, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 39, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 91, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 75, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 99, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 87, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 57, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 102, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 64, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 32, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 109, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 58, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 115, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 117, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 75, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 52, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 100, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 112, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 89, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 71, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 120, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 62, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 46, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 61, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 91, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 99, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 89, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 110, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 60, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 85, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 60, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 64, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 75, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 73, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 65, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 60, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 23, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 93, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 107, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 51, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 79, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 57, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 66, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 61, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 111, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 78, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 63, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 95, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 102, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 74, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 97, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 81, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 51, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 63, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 58, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 114, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 46, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 51, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 22, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 37, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 116, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 41, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 93, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 77, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 86, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 47, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 80, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 71, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 64, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 108, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 119, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 95, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 78, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 111, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 89, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 115, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 62, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 114, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 84, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 42, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 111, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 98, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 66, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 95, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 70, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 87, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 97, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 87, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 64, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 102, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 113, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 51, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 64, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 77, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 59, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 74, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 30, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 89, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 110, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 81, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 55, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 48, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 41, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 67, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 56, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 46, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 92, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 79, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 78, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 117, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 102, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 25, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 95, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 61, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 110, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 69, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 86, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 111, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 94, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 106, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 72, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 65, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 113, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 116, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 97, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 101, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 83, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 114, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 71, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 110, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 64, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 116, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 48, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 74, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 66, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 59, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 107, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 64, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 53, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 104, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 111, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 100, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 68, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 4, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 97, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 95, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 101, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 60, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 109, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 70, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 77, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 41, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 95, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 90, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 44, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 83, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 57, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 48, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 53, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 107, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 79, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 52, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 117, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 60, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 54, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 98, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 68, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 119, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 75, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 101, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 95, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 94, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 82, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 99, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 69, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 112, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 42, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 50, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 120, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 85, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 74, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 119, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 24, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 69, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 107, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 89, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 46, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 117, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 100, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 67, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 107, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 97, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 89, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 120, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 78, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 19, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 56, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 78, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 113, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 106, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 68, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 109, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 103, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 85, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 18, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 105, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 86, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 119, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 68, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 104, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 93, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 112, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 52, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 85, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 42, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 101, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 120, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 56, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 43, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 101, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 90, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 89, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 43, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 60, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 48, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 104, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 119, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 106, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 102, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 110, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 41, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 72, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 72, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 43, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 99, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 47, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 56, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 67, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 99, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 119, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 115, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 97, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 28, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 106, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 50, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 66, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 74, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 107, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 29, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 93, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 65, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 81, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 67, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 52, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 103, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 102, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 76, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 49, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 44, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 93, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 69, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 110, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 111, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 106, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 57, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 92, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 103, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 43, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 86, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 119, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 113, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 49, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 61, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 78, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 110, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 85, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 106, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 52, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 120, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 75, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 41, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 42, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 78, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 99, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 94, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 65, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 16, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 100, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 31, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 58, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 1, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 79, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 83, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 103, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 109, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 90, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 88, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 65, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 120, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 118, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 109, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 79, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 118, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 45, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 53, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 95, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 43, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 63, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 75, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 67, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 75, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 66, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 105, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 117, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 85, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 115, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 66, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 95, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 88, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 99, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 101, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 86, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 52, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 53, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 111, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 87, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 116, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 61, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 7, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 95, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 65, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 27, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 45, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 85, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 66, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 41, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 87, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 68, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 71, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 76, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 108, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 110, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 104, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 54, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 41, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 77, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 55, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 110, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 98, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 104, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 119, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 120, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 84, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 101, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 72, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 73, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 73, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 60, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 100, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 4, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 106, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 68, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 51, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 59, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 114, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 61, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 109, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 114, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 46, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 37, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 24, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 31, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 10, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 69, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 108, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 94, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 23, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 68, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 61, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 20, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 21, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 80, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 33, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 14, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 67, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 114, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 66, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 58, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 51, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 99, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 87, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 10, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 42, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 69, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 25, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 22, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 50, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 8, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 86, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 18, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 105, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 81, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 75, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 59, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 38, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 13, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 55, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 42, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 4, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 71, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 75, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 81, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 86, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 92, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 78, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 102, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 30, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 20, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 97, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 16, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 36, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 50, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 4, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 5, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 73, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 58, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 9, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 103, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 64, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 30, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 93, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 44, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 65, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 34, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 56, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 112, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 65, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 5, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 106, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 76, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 13, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 80, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 15, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 7, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 71, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 109, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 116, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 112, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 62, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 88, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 71, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 49, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 75, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 97, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 2, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 13, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 6, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 72, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 103, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 59, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 68, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 95, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 45, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 23, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 52, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 59, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 49, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 31, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 4, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 107, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 102, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 83, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 48, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 61, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 53, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 100, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 73, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 61, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 30, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 84, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 39, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 95, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 114, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 38, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 66, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 4, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 40, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 85, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 82, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 97, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 103, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 87, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 50, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 12, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 95, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 65, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 83, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 112, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 39, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 92, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 116, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 81, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 88, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 2, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 94, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 113, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 108, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 54, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 71, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 7, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 87, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 112, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 91, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 73, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 38, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 7, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 98, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 33, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 109, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 47, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 4, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 85, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 37, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 97, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 93, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 33, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 82, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 110, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 97, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 117, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 28, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 102, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 11, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 118, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 115, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 95, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 36, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 96, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 85, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 119, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 114, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 34, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 35, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 29, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 37, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 35, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 94, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 69, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 77, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 110, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 22, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 80, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 100, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 108, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 23, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 38, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 60, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 90, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 2, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 33, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 16, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 1, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 85, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 23, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 99, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 114, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 92, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 36, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 7, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 68, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 95, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 72, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 58, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 63, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 5, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 117, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 37, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 119, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 64, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 102, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 90, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 65, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 76, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 19, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 102, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 44, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 29, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 100, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 112, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 25, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 52, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 33, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 104, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 27, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 67, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 56, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 32, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 48, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 46, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 102, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 61, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 21, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 84, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 24, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 84, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 46, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 75, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 101, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 1, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 8, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 24, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 114, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 80, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 7, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 72, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 26, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 113, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 89, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 20, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 13, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 60, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 21, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 86, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 17, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 12, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 34, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 91, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 8, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 51, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 101, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 119, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 37, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 110, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 105, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 99, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 29, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 14, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 31, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 32, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 58, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 76, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 98, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 75, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 59, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 10, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 104, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 93, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 17, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 62, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 47, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 74, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 5, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 120, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 61, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 109, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 26, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 101, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 5, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 60, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 51, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 50, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 10, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 12, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 4, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 63, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 37, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 40, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 87, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 103, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 93, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 34, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 20, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 46, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 93, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 24, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 38, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 33, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 49, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 96, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 85, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 33, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 24, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 27, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 14, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 112, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 59, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 109, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 44, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 33, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 108, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 83, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 34, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 67, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 112, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 75, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 102, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 55, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 21, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 63, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 109, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 116, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 106, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 27, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 15, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 48, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 26, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 29, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 19, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 114, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 21, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 61, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 55, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 111, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 15, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 36, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 83, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 100, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 90, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 25, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 13, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 66, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 66, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 95, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 104, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 61, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 95, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 115, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 56, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 17, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 112, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 37, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 56, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 40, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 80, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 71, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 20, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 62, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 86, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 96, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 27, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 41, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 10, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 12, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 55, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 88, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 46, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 90, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 13, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 10, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 10, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 46, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 25, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 93, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 47, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 73, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 119, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 109, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 82, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 112, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 8, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 29, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 76, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 47, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 62, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 42, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 50, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 5, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 14, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 115, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 2, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 48, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 31, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 57, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 9, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 100, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 97, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 11, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 52, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 23, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 82, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 99, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 71, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 93, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 1, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 85, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 60, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 25, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 61, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 91, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 77, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 5, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 90, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 45, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 88, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 115, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 36, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 111, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 8, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 42, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 73, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 54, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 10, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 96, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 56, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 43, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 14, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 13, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 15, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 61, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 51, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 69, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 34, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 60, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 48, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 104, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 66, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 16, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 36, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 88, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 92, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 86, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 105, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 70, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 113, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 35, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 81, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 18, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 49, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 56, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 64, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 116, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 25, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 120, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 38, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 60, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 85, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 83, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 51, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 64, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 42, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 46, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 95, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 69, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 112, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 87, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 94, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 15, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 22, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 9, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 106, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 99, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 63, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 1, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 80, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 23, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 55, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 95, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 35, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 18, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 110, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 115, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 117, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 47, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 91, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 89, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 74, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 105, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 36, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 104, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 85, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 49, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 3, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 61, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 96, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 119, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 108, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 34, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 19, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 71, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 47, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 94, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 68, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 108, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 18, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 51, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 20, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 45, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 73, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 106, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 15, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 26, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 55, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 106, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 118, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 118, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 3, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 26, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 12, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 62, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 33, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 31, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 26, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 23, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 33, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 22, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 95, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 56, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 83, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 59, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 114, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 97, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 50, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 88, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 95, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 33, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 25, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 99, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 108, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 65, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 82, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 54, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 59, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 65, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 75, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 26, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 21, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 56, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 55, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 79, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 115, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 51, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 120, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 92, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 91, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 52, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 103, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 76, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 117, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 17, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 15, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 84, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 62, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 63, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 114, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 74, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 30, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 3, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 33, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 107, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 96, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 103, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 91, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 89, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 34, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 12, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 30, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 120, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 40, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 101, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 43, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 77, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 47, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 103, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 109, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 112, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 1, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 91, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 118, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 104, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 80, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 107, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 113, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 97, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 36, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 80, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 52, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 1, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 49, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 21, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 106, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 34, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 66, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 11, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 65, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 78, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 59, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 55, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 45, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 34, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 91, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 62, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 71, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 12, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 77, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 65, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 45, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 26, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 4, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 64, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 32, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 112, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 88, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 48, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 8, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 46, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 41, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 99, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 29, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 21, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 55, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 42, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 63, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 40, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 91, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 41, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 89, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 4, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 32, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 95, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 15, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 88, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 45, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 35, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 96, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 77, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 89, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 64, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 20, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 23, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 117, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 89, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 86, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 2, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 85, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 45, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 10, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 110, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 103, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 59, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 11, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 17, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 39, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 119, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 53, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 54, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 99, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 98, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 112, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 82, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 78, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 14, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 76, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 17, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 104, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 89, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 42, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 99, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 115, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 36, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 108, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 91, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 51, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 114, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 88, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 106, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 102, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 22, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 118, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 61, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 80, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 117, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 75, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 33, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 72, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 49, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 14, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 86, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 9, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 71, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 107, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 106, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 15, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 47, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 97, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 102, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 65, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 17, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 6, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 36, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 63, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 104, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 84, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 63, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 36, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 65, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 16, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 45, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 36, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 100, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 110, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 24, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 119, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 98, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 86, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 32, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 84, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 50, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 18, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 78, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 50, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 93, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 67, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 98, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 76, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 69, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 70, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 91, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 112, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 89, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 43, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 115, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 11, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState81() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 100, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 109, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 37, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 57, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 100, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 58, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 64, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 3, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 27, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 105, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 73, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 52, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 81, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 55, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 26, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 39, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 49, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 24, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 38, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(81, 98, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState82() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 7, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 3, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 76, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 22, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 26, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 9, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 3, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 76, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 114, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 117, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 76, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 41, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 90, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 61, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 11, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 2, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 39, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 7, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 30, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(82, 112, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState83() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 6, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 100, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 35, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 29, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 33, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 25, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 30, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 37, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 3, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 32, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 40, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 45, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 39, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 107, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 72, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 119, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 68, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 17, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 46, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(83, 52, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState84() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 35, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 70, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 98, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 23, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 55, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 55, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 73, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 24, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 75, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 83, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 120, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 6, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 7, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 115, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 102, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 108, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 75, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 65, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 110, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(84, 36, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState85() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 34, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 28, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 74, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 38, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 120, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 51, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 80, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 42, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 76, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 37, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 81, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 49, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 94, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 111, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 76, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 15, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 1, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 77, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 111, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(85, 43, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState86() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 18, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 54, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 78, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 37, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 70, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 116, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 9, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 79, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 23, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 17, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 114, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 13, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 104, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 3, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 4, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 60, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 4, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 65, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 13, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(86, 69, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState87() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 2, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 76, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 68, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 3, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 83, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 30, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 91, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 8, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 98, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 45, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 109, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 76, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 90, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 120, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 57, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 78, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 91, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 40, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 68, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(87, 16, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState88() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 30, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 56, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 34, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 38, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 3, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 118, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 6, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 95, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 105, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 31, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 61, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 114, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 102, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 102, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 63, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 42, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 66, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 29, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 45, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(88, 82, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState89() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 17, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 73, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 67, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 9, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 13, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 66, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 79, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 55, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 79, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 48, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 112, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 21, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 46, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 55, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 63, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 113, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 109, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 3, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 81, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(89, 95, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState90() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 89, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 84, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 90, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 72, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 17, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 115, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 114, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 118, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 108, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 74, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 20, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 22, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 45, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 112, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 26, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 100, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 50, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 66, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 90, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(90, 98, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState91() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 72, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 2, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 115, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 8, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 40, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 68, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 16, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 101, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 93, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 75, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 19, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 100, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 75, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 24, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 106, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 79, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 89, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 107, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 30, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(91, 96, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState92() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 111, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 71, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 47, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 58, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 80, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 90, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 16, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 116, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 41, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 98, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 112, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 101, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 48, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 80, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 103, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 56, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 5, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 96, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 36, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(92, 66, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState93() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 91, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 87, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 77, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 118, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 55, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 67, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 103, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 87, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 88, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 78, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 9, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 46, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 53, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 75, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 29, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 111, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 74, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 87, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 71, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(93, 89, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState94() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 74, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 65, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 51, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 18, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 77, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 17, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 66, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 118, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 20, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 12, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 13, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 80, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 39, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 70, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 32, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 86, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 78, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 54, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 32, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(94, 89, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState95() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 93, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 13, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 109, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 26, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 37, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 6, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 56, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 118, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 9, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 7, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 102, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 43, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 22, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 46, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 34, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 88, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 41, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 13, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 46, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(95, 64, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState96() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 36, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 94, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 34, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 7, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 26, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 55, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 35, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 42, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 30, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 15, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 117, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 67, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 63, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 118, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 1, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 107, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 23, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 24, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 31, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(96, 118, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState97() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 94, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 74, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 68, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 66, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 19, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 107, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 117, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 15, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 59, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 84, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 42, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 63, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 39, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 104, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 20, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 79, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 90, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 12, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 78, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(97, 4, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState98() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 72, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 48, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 62, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 63, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 112, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 19, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 21, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 65, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 75, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 106, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 11, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 7, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 66, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 41, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 51, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 94, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 99, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 72, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 21, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(98, 71, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState99() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 51, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 47, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 86, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 68, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 12, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 89, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 17, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 8, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 57, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 100, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 97, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 19, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 93, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 55, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 4, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 107, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 24, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 3, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 65, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(99, 68, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState100() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 113, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 106, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 66, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 105, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 12, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 91, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 26, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 55, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 12, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 51, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 24, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 88, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 105, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 100, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 26, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 13, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 100, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 89, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 98, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(100, 11, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState101() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 22, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 72, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 84, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 31, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 60, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 14, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 109, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 25, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 45, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 30, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 69, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 92, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 17, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 58, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 53, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 4, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 115, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 55, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 66, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(101, 54, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState102() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 72, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 53, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 103, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 67, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 94, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 93, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 118, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 108, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 101, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 88, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 112, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 103, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 88, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 30, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 119, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 24, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 37, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 52, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 75, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(102, 80, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState103() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 96, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 92, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 65, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 42, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 27, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 33, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 5, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 64, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 113, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 71, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 81, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 1, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 110, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 7, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 35, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 22, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 96, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 104, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 11, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(103, 24, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState104() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 48, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 15, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 33, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 51, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 89, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 55, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 59, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 118, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 8, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 81, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 100, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 120, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 34, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 109, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 110, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 84, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 48, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 103, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 105, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(104, 69, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState105() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 45, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 90, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 105, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 82, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 22, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 111, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 107, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 51, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 65, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 39, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 55, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 33, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 54, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 92, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 119, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 105, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 105, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 60, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 22, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(105, 73, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState106() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 53, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 93, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 42, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 26, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 9, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 2, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 26, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 84, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 15, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 51, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 41, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 84, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 15, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 120, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 40, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 96, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 104, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 55, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 23, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(106, 25, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState107() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 95, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 17, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 52, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 31, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 62, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 49, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 97, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 48, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 14, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 52, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 106, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 98, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 100, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 33, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 36, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 116, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 71, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 1, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 31, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(107, 24, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState108() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 95, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 16, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 5, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 91, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 24, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 106, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 48, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 91, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 100, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 14, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 15, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 63, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 44, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 54, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 25, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 83, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 88, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 68, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 39, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(108, 73, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState109() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 57, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 38, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 86, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 95, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 93, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 59, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 2, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 103, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 75, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 52, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 44, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 98, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 10, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 91, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 5, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 84, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 46, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 30, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 120, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(109, 3, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState110() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 35, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 60, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 11, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 71, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 39, new IntPred(252, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 22, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 29, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 11, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 28, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 111, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 25, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 10, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 75, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 28, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 82, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 90, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 105, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 117, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 20, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(110, 52, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState111() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 93, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 89, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 89, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 105, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 47, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 101, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 41, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 22, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 51, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 117, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 120, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 8, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 99, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 9, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 19, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 97, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 80, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 65, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 114, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(111, 41, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState112() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 74, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 105, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 8, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 68, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 50, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 101, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 30, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 66, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 102, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 37, new IntPred(453, 484), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 3, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 66, new IntPred(582, 663), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 37, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 82, new IntPred(695, 728), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 78, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 69, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 62, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 7, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 9, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(112, 81, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState113() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 29, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 8, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 40, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 91, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 94, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 117, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 47, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 107, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 15, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 88, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 72, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 19, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 106, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 82, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 74, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 112, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 88, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 98, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 34, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(113, 79, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState114() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 30, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 109, new IntPred(84, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 85, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 48, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 83, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 6, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 27, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 70, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 88, new IntPred(355, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 23, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 22, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 93, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 14, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 62, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 24, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 98, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 59, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 105, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 64, new IntPred(844, 856), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(114, 14, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState115() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 117, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 65, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 61, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 19, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 60, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 34, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 64, new IntPred(279, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 53, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 76, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 9, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 86, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 33, new IntPred(582, 663), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 96, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 20, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 52, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 24, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 40, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 53, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 113, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(115, 85, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState116() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 99, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 63, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 14, new IntPred(111, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 58, new IntPred(156, 251), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 101, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 71, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 16, new IntPred(279, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 87, new IntPred(286, 354), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 58, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 83, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 13, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 107, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 112, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 86, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 82, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 56, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 97, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 114, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 43, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(116, 82, new IntPred(857, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState117() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 102, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 59, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 67, new IntPred(111, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 112, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 52, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 26, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 30, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 49, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 42, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 111, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 6, new IntPred(485, 581), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 112, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 81, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 62, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 11, new IntPred(729, 764), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 25, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 58, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 91, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 113, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(117, 73, new IntPred(857, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState118() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 115, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 85, new IntPred(84, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 21, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 88, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 114, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 14, new IntPred(261, 278), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 16, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 10, new IntPred(286, 354), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 55, new IntPred(355, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 56, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 82, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 25, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 14, new IntPred(664, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 89, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 7, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 84, new IntPred(765, 787), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 34, new IntPred(788, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 23, new IntPred(799, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 69, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(118, 36, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState119() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 107, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 29, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 60, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 65, new IntPred(156, 251), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 112, new IntPred(252, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 116, new IntPred(261, 278), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 52, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 96, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 85, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 58, new IntPred(453, 484), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 50, new IntPred(485, 581), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 88, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 70, new IntPred(664, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 86, new IntPred(695, 728), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 26, new IntPred(729, 764), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 119, new IntPred(765, 787), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 89, new IntPred(788, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 41, new IntPred(799, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 29, new IntPred(844, 856), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(119, 113, new IntPred(857, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState120() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 32, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 77, new IntPred(84, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 93, new IntPred(111, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 89, new IntPred(156, 251), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 44, new IntPred(252, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 73, new IntPred(261, 278), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 44, new IntPred(279, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 94, new IntPred(286, 354), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 50, new IntPred(355, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 44, new IntPred(453, 484), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 24, new IntPred(485, 581), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 79, new IntPred(582, 663), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 66, new IntPred(664, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 37, new IntPred(695, 728), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 9, new IntPred(729, 764), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 95, new IntPred(765, 787), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 10, new IntPred(788, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 97, new IntPred(799, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 25, new IntPred(844, 856), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(120, 73, new IntPred(857, null), 'b'));
return trans;
}

}
