package experiment.Random80States20SigmaE20240826035332;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
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
public class Random80States20SigmaE20240826035347{
public static void main(String[] args){
try{
BooleanAlgebra<IntPred, Integer> ba1 = new BoundedIntegerSolver(0, null);
SymbolicMealyAutomatonLearner<IntPred, Integer, Character> learner = new SymbolicMealyAutomatonLearner<IntPred, Integer, Character>(true);
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
SymbolicMealyAutomaton<IntPred, Integer, Character> example1 = SymbolicMealyAutomaton.MkSMA(trans,init,ba1);
example1 = SymbolicMealyAutomaton.getNormalized(example1,ba1);
example1 = SymbolicMealyAutomaton.getClean(example1,ba1);
example1 = SymbolicMealyAutomaton.getMinimal(example1, ba1);
SymbolicMealyAutomatonOracle<IntPred, Integer, Character> oracle = new SymbolicMealyAutomatonOracle<IntPred, Integer, Character>(example1,ba1);
SymbolicMealyAutomaton<IntPred, Integer, Character> learned = learner.learn(oracle, ba1);
} catch (TimeoutException e) {
}
}
private static List<SFAMove<IntPred, Integer>> createTransitionsState1() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 54, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 45, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 57, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 72, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 32, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 71, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 45, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 61, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 76, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 80, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 48, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 80, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 59, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 69, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 79, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 57, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 55, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 68, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 58, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 46, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 60, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 60, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 77, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 68, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 49, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 77, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 72, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 44, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 55, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 70, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 52, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 78, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 66, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 75, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 57, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 80, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 78, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 47, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 57, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 73, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 55, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 46, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 61, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 78, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 59, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 64, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 76, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 51, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 56, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 77, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 78, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 78, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 68, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 53, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 60, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 63, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 53, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 59, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 73, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 49, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 48, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 69, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 41, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 59, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 62, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 48, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 30, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 53, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 68, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 56, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 66, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 79, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 46, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 76, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 54, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 41, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 72, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 59, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 68, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 63, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 46, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 45, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 48, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 66, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 59, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 39, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 69, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 72, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 56, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 69, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 69, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 48, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 48, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 41, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 77, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 51, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 80, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 65, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 67, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 52, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 24, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 77, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 78, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 55, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 54, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 43, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 51, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 41, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 68, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 73, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 74, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 43, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 72, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 76, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 65, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 60, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 47, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 25, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 78, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 64, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 69, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 30, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 52, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 49, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 66, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 52, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 73, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 54, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 26, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 56, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 75, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 42, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 26, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 45, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 77, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 59, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 61, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 53, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 49, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 52, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 57, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 48, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 51, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 45, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 45, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 48, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 72, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 45, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 45, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 74, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 77, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 65, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 63, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 43, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 69, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 50, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 56, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 70, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 48, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 54, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 77, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 72, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 43, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 64, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 66, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 79, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 41, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 61, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 65, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 77, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 69, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 75, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 51, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 78, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 56, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 72, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 75, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 48, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 62, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 77, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 47, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 51, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 53, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 68, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 41, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 71, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 51, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 29, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 64, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 49, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 55, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 79, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 77, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 42, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 66, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 58, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 71, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 53, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 44, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 63, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 73, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 25, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 69, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 48, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 48, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 76, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 44, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 74, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 71, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 46, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 48, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 57, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 76, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 42, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 53, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 47, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 46, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 52, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 48, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 67, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 71, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 67, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 57, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 47, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 62, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 38, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 49, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 72, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 70, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 52, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 64, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 77, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 52, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 68, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 72, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 50, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 4, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 23, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 47, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 63, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 63, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 53, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 61, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 72, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 70, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 47, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 52, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 38, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 79, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 32, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 77, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 12, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 46, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 65, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 72, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 67, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 63, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 45, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 77, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 37, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 65, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 12, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 58, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 41, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 57, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 50, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 43, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 63, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 42, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 52, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 43, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 44, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 69, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 48, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 57, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 41, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 64, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 12, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 41, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 66, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 38, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 50, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 66, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 47, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 58, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 16, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 76, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 32, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 76, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 74, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 52, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 54, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 60, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 42, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 66, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 41, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 74, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 45, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 50, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 50, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 39, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 43, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 70, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 44, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 48, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 61, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 62, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 69, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 44, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 50, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 73, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 23, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 14, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 18, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 80, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 1, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 63, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 68, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 40, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 58, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 59, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 48, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 74, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 51, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 77, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 75, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 78, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 73, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 59, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 47, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 41, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 24, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 53, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 45, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 57, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 47, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 61, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 49, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 57, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 79, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 44, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 76, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 41, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 75, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 71, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 76, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 76, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 50, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 43, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 44, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 60, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 18, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 69, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 71, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 79, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 51, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 66, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 66, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 50, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 56, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 42, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 64, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 44, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 42, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 48, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 59, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 76, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 67, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 64, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 60, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 43, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 74, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 73, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 70, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 27, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 49, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 60, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 64, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 59, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 45, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 47, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 41, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 78, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 70, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 44, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 41, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 77, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 66, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 42, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 77, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 55, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 77, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 58, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 41, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 32, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 10, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 60, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 63, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 53, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 53, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 77, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 58, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 39, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 80, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 61, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 48, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 46, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 45, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 70, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 74, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 66, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 72, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 1, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 71, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 67, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 72, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 60, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 43, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 23, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 55, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 66, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 71, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 50, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 34, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 73, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 62, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 36, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 39, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 36, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 36, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 37, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 63, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 28, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 12, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 35, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 18, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 46, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 55, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 57, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 55, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 48, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 16, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 58, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 60, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 3, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 76, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 46, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 66, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 59, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 65, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 80, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 2, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 22, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 80, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 32, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 18, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 33, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 13, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 71, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 26, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 71, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 29, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 3, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 6, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 28, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 51, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 43, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 62, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 18, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 68, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 1, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 59, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 12, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 27, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 56, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 14, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 17, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 55, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 6, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 45, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 68, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 18, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 62, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 4, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 70, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 47, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 27, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 12, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 62, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 27, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 56, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 17, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 29, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 53, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 68, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 42, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 7, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 77, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 22, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 48, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 36, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 61, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 63, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 4, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 26, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 51, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 25, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 1, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 72, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 56, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 71, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 45, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 70, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 9, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 20, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 73, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 13, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 39, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 50, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 29, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 30, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 51, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 23, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 11, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 2, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 17, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 51, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 80, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 65, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 24, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 32, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 61, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 41, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 27, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 57, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 60, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 75, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 54, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 16, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 60, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 12, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 1, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 78, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 35, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 56, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 51, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 16, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 35, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 24, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 16, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 76, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 42, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 61, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 64, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 22, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 61, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 42, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 40, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 34, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 72, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 80, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 23, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 36, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 10, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 43, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 51, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 2, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 5, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 1, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 28, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 73, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 17, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 48, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 47, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 30, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 68, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 34, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 64, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 54, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 59, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 18, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 64, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 37, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 8, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 26, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 23, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 59, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 28, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 61, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 67, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 68, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 10, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 33, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 68, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 13, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 41, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 9, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 14, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 79, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 36, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 80, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 77, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 78, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 42, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 67, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 67, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 38, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 14, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 9, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 58, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 18, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 44, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 49, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 51, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 45, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 58, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 63, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 57, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 42, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 8, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 22, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 66, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 8, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 1, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 63, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 76, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 46, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 10, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 65, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 1, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 77, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 80, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 41, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 21, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 76, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 32, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 36, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 4, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 31, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 10, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 55, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 33, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 72, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 13, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 2, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 43, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 52, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 61, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 9, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 7, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 79, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 31, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 76, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 61, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 78, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 15, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 26, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 59, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 79, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 62, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 29, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 44, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 35, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 61, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 37, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 27, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 75, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 61, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 39, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 76, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 49, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 28, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 15, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 24, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 77, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 62, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 42, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 68, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 62, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 70, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 59, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 14, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 16, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 14, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 52, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 60, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 53, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 43, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 29, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 34, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 29, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 43, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 25, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 58, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 16, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 24, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 22, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 11, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 31, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 51, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 26, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 36, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 8, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 8, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 47, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 17, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 38, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 27, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 65, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 74, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 36, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 56, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 6, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 45, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 17, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 46, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 39, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 15, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 2, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 38, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 53, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 30, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 4, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 12, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 2, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 49, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 70, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 3, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 62, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 12, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 34, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 56, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 29, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 17, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 57, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 23, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 23, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 1, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 65, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 52, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 20, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 23, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 75, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 77, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 71, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 47, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 71, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 9, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 48, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 7, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 43, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 67, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 58, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 25, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 21, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 20, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 54, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 7, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 60, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 74, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 16, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 62, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 66, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 78, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 37, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 17, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 39, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 50, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 47, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 32, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 37, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 32, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 59, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 17, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 44, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 51, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 31, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 29, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 53, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 6, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 62, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 47, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 16, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 5, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 61, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 39, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 69, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 55, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 16, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 50, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 34, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 55, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 71, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 77, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 21, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 33, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 23, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 58, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 49, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 80, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 59, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 80, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 33, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 62, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 2, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 58, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 62, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 28, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 63, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 11, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 69, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 20, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 31, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 50, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 70, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 29, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 34, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 77, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 60, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 58, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 1, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 18, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 63, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 69, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 33, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 64, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 5, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 12, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 52, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 73, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 40, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 78, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 79, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 31, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 23, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 39, new IntPred(356, 362), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 18, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 66, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 70, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 4, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 36, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 2, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 74, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 71, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 35, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 41, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 73, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 44, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 41, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 59, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 44, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 33, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 19, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 8, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 55, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 47, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 65, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 41, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 3, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 39, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 45, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 39, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 22, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 78, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 27, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 80, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 27, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 2, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 28, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 64, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 6, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 60, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 2, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 36, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 49, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 5, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 12, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 19, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 24, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 26, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 6, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 57, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 59, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 73, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 2, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 61, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 57, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 38, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 61, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 5, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 54, new IntPred(554, 642), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 57, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 12, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 12, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 38, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 13, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 46, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 26, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 78, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 55, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 25, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 77, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 50, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 47, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 64, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 28, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 53, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 27, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 71, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 41, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 33, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 3, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 79, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 9, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 18, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 5, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 16, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 2, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 27, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 27, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 2, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 60, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 79, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 64, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 77, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 28, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 62, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 80, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 34, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 26, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 10, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 76, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 6, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 38, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 13, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 66, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 26, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 24, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 1, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 69, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 76, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 28, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 20, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 42, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 60, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 15, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 57, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 39, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 18, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 4, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 48, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 42, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 66, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 6, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 32, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 12, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 41, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 43, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 59, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 31, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 46, new IntPred(315, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 20, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 14, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 33, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 24, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 63, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 73, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 68, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 62, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 63, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 22, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 37, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 49, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 8, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 53, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 54, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 27, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 30, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 57, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 47, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 29, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 47, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 66, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 6, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 18, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 53, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 57, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 53, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 65, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 64, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 64, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 70, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 10, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 13, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 3, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 73, new IntPred(73, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 5, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 68, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 11, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 42, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 56, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 3, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 7, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 30, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 48, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 51, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 35, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 4, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 16, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 19, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 37, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 6, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 49, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 70, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 21, new IntPred(73, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 19, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 79, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 69, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 18, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 80, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 62, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 50, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 2, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 29, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 43, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 76, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 6, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 35, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 58, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 71, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 75, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 71, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 77, new IntPred(0, 41), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 22, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 6, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 54, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 29, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 3, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 69, new IntPred(315, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 57, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 48, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 34, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 66, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 48, new IntPred(517, 553), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 19, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 67, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 64, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 8, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 48, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 15, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 14, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 55, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 7, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 8, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 17, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 76, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 5, new IntPred(233, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 75, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 43, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 33, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 49, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 14, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 24, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 59, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 36, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 13, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 38, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 78, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 54, new IntPred(851, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 58, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(982, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 25, new IntPred(42, 72), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 54, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 24, new IntPred(233, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 76, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 7, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 34, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 53, new IntPred(363, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 8, new IntPred(366, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 41, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 39, new IntPred(517, 553), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 57, new IntPred(554, 642), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 32, new IntPred(643, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 3, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 72, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 62, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 32, new IntPred(851, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 40, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 16, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 27, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(42, 72), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 65, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 35, new IntPred(149, 232), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 80, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(311, 314), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 53, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 9, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 27, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 2, new IntPred(458, 516), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 73, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 57, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 6, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 19, new IntPred(715, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 6, new IntPred(799, 834), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 46, new IntPred(835, 850), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 31, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 58, new IntPred(932, 981), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 17, new IntPred(982, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 1, new IntPred(0, 41), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 32, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 68, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 63, new IntPred(149, 232), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 20, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 43, new IntPred(311, 314), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 74, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 33, new IntPred(356, 362), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 3, new IntPred(363, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 45, new IntPred(366, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 28, new IntPred(458, 516), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 16, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 22, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 13, new IntPred(643, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 53, new IntPred(715, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 80, new IntPred(799, 834), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 75, new IntPred(835, 850), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 59, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 76, new IntPred(932, 981), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 31, new IntPred(982, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 61, new IntPred(0, 41), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(42, 72), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 78, new IntPred(73, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 36, new IntPred(149, 232), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 2, new IntPred(233, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 41, new IntPred(311, 314), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 7, new IntPred(315, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(356, 362), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 70, new IntPred(363, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 77, new IntPred(366, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 72, new IntPred(458, 516), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(517, 553), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 2, new IntPred(554, 642), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 22, new IntPred(643, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 47, new IntPred(715, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 32, new IntPred(799, 834), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(835, 850), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 24, new IntPred(851, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(932, 981), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 54, new IntPred(982, null), 'b'));
return trans;
}

}
