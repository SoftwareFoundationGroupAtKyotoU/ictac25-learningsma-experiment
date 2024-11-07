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
public class Random80States20SigmaE20240826035344{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 42, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 58, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 50, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 58, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 71, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 73, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 66, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 80, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 46, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 46, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 43, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 54, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 63, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 50, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 45, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 54, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 77, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 67, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 53, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 78, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 78, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 72, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 55, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 61, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 48, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 24, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 67, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 45, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 46, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 21, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 62, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 64, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 77, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 61, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 70, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 41, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 62, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 68, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 78, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 67, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 33, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 43, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 64, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 79, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 48, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 76, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 70, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 49, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 63, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 41, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 58, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 59, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 67, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 71, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 53, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 51, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 73, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 48, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 35, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 68, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 52, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 71, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 73, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 59, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 80, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 78, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 75, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 74, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 65, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 46, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 65, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 70, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 45, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 48, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 50, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 21, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 68, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 47, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 50, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 65, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 56, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 51, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 42, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 79, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 48, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 61, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 47, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 60, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 59, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 72, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 63, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 70, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 75, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 24, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 36, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 49, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 64, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 73, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 43, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 49, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 68, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 72, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 47, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 56, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 55, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 30, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 72, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 54, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 71, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 52, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 73, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 68, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 71, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 58, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 26, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 78, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 68, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 59, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 41, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 54, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 76, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 66, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 48, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 48, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 37, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 63, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 68, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 47, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 51, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 44, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 49, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 67, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 76, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 52, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 63, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 42, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 68, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 50, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 67, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 59, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 80, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 75, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 56, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 48, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 29, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 62, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 23, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 80, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 72, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 78, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 43, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 54, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 80, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 53, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 80, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 57, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 53, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 44, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 54, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 53, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 51, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 50, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 57, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 63, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 44, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 74, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 77, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 75, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 71, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 55, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 76, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 56, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 43, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 57, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 78, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 59, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 66, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 80, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 79, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 80, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 74, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 41, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 72, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 44, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 61, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 61, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 66, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 67, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 65, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 49, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 49, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 80, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 54, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 69, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 54, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 58, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 44, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 64, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 72, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 57, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 69, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 52, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 79, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 15, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 48, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 75, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 59, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 65, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 41, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 49, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 70, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 50, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 41, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 47, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 47, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 60, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 73, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 60, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 42, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 49, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 70, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 64, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 74, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 61, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 19, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 62, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 50, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 51, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 75, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 21, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 53, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 27, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 44, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 60, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 42, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 58, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 73, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 38, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 43, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 38, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 54, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 50, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 52, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 72, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 24, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 50, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 59, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 80, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 12, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 58, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 65, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 56, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 47, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 41, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 72, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 48, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 57, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 52, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 54, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 63, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 57, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 64, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 12, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 48, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 80, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 52, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 50, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 42, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 57, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 55, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 79, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 49, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 53, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 74, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 77, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 59, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 53, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 78, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 42, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 41, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 58, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 79, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 52, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 75, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 67, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 62, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 56, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 45, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 56, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 55, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 73, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 54, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 71, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 51, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 75, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 53, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 41, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 48, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 49, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 46, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 47, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 67, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 56, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 78, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 74, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 52, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 53, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 67, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 54, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 80, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 44, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 41, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 5, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 79, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 5, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 72, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 71, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 44, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 67, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 47, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 79, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 70, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 63, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 18, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 42, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 34, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 64, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 52, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 74, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 78, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 73, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 76, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 41, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 71, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 43, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 53, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 58, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 80, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 28, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 56, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 42, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 54, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 28, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 57, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 77, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 46, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 43, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 62, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 26, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 69, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 71, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 44, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 45, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 77, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 65, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 75, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 72, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 73, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 57, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 80, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 65, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 19, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 76, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 70, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 66, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 51, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 41, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 45, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 71, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 20, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 62, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 11, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 54, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 20, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 37, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 75, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 61, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 60, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 2, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 1, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 70, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 76, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 51, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 61, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 5, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 33, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 49, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 24, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 54, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 49, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 15, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 52, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 49, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 59, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 56, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 10, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 2, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 29, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 32, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 17, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 12, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 23, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 6, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 19, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 6, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 80, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 49, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 76, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 64, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 79, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 77, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 4, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 74, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 35, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 10, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 50, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 69, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 80, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 65, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 13, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 69, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 34, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 12, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 72, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 47, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 1, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 68, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 55, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 23, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 78, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 51, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 69, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 78, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 12, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 55, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 41, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 20, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 16, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 27, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 16, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 44, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 53, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 43, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 59, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 62, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 9, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 77, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 72, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 11, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 58, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 56, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 77, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 52, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 71, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 15, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 75, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 47, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 39, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 24, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 70, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 58, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 50, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 54, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 19, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 78, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 41, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 40, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 18, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 63, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 72, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 26, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 11, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 37, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 20, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 79, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 40, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 80, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 60, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 46, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 7, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 19, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 37, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 77, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 21, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 16, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 61, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 22, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 26, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 55, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 25, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 74, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 50, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 62, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 38, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 26, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 19, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 35, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 42, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 57, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 63, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 24, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 38, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 40, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 20, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 72, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 54, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 75, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 78, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 17, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 12, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 77, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 69, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 8, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 66, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 1, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 55, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 46, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 78, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 68, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 47, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 48, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 15, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 80, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 51, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 48, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 79, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 79, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 15, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 48, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 78, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 76, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 21, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 51, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 29, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 36, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 24, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 3, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 62, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 26, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 56, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 21, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 29, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 74, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 53, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 19, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 14, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 4, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 56, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 34, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 9, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 39, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 10, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 69, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 1, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 26, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 59, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 76, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 38, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 18, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 56, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 32, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 12, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 23, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 48, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 2, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 30, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 7, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 44, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 42, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 11, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 35, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 24, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 61, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 30, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 77, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 5, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 77, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 59, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 68, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 29, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 68, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 51, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 48, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 5, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 72, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 14, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 2, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 12, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 7, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 32, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 55, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 72, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 57, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 38, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 13, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 72, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 40, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 71, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 16, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 6, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 30, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 76, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 39, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 61, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 12, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 9, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 51, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 2, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 66, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 35, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 3, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 70, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 42, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 60, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 3, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 74, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 6, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 18, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 64, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 9, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 67, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 6, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 5, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 53, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 31, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 77, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 25, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 11, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 65, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 76, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 24, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 12, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 41, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 54, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 23, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 6, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 66, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 51, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 21, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 35, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 47, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 74, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 59, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 35, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 15, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 41, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 46, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 50, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 42, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 9, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 26, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 76, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 32, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 33, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 36, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 25, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 28, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 31, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 66, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 76, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 32, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 44, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 29, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 42, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 71, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 63, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 72, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 37, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 54, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 28, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 51, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 74, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 62, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 79, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 36, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 47, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 3, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 29, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 60, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 37, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 42, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 54, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 42, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 59, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 70, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 37, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 17, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 39, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 49, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 61, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 73, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 49, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 77, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 29, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 6, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 8, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 47, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 7, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 40, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 6, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 25, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 27, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 19, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 51, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 44, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 28, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 79, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 49, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 50, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 74, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 59, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 76, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 47, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 35, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 28, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 60, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 15, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 44, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 50, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 16, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 6, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 67, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 57, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 5, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 19, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 14, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 32, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 64, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 28, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 18, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 70, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 23, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 22, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 52, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 19, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 44, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 63, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 30, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 26, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 74, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 3, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 65, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 34, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 43, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 24, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 32, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 38, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 39, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 42, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 50, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 14, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 49, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 21, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 64, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 37, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 14, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 34, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 44, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 41, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 61, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 54, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 48, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 34, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 7, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 28, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 52, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 3, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 79, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 29, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 22, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 71, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 34, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 42, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 65, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 22, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 69, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 46, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 25, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 31, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 59, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 59, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 29, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 10, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 79, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 5, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 51, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 27, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 23, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 67, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 73, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 21, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 79, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 2, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 7, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 68, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 29, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 66, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 18, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 48, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 31, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 17, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 6, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 10, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 17, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 21, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 42, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 46, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 6, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 30, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 33, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 44, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 54, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 47, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 19, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 11, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 34, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 47, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 12, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 68, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 16, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 15, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 35, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 56, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 59, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 44, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 56, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 37, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 58, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 34, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 51, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 18, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 22, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 42, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 59, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 40, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 2, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 17, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 5, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 22, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 56, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 2, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 51, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 45, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 34, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 52, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 1, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 61, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 64, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 11, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 3, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 52, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 50, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 8, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 47, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 49, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 1, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 24, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 79, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 36, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 2, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 3, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 57, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 52, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 51, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 47, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 45, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 50, new IntPred(509, 532), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 39, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 72, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 37, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 56, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 79, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 56, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 21, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 27, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 3, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 46, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 61, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 59, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 71, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 20, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 16, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 41, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 43, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 76, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 76, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 30, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 23, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 51, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 77, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 10, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 53, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 45, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 39, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 10, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 12, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 17, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 3, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(243, 308), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 80, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 19, new IntPred(332, 369), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 25, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 59, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 60, new IntPred(570, 644), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 1, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 69, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 10, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 42, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 10, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 79, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 3, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 42, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 48, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 50, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 67, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 28, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 57, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 56, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 19, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 8, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 26, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 2, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 31, new IntPred(720, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 60, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 71, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 73, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 11, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 74, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 15, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 2, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 41, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 43, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 17, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 34, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 46, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 16, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 6, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 51, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 37, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 26, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 35, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 74, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 43, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 50, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 34, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 48, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 11, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 26, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 34, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 17, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 31, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 61, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 44, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 13, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 19, new IntPred(370, 450), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 18, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 25, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 53, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 2, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 32, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 79, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 64, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 59, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 5, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 77, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 3, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 26, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 40, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 75, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 26, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 7, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 28, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 77, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 13, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 64, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 78, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 14, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 30, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 68, new IntPred(645, 719), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 7, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 55, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 8, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 77, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 23, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 79, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 40, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 69, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 9, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 35, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 73, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 31, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 19, new IntPred(309, 331), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 78, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 11, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 27, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 19, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 19, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 74, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 47, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 66, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 15, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 12, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 16, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 34, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 42, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 65, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 56, new IntPred(63, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 66, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 20, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 3, new IntPred(234, 242), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 78, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 6, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 73, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 69, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 19, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 17, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 79, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 38, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 49, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 53, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 29, new IntPred(799, 852), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 44, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 30, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 36, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 11, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(108, 135), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 31, new IntPred(136, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 78, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 61, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 23, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 20, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 42, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 77, new IntPred(451, 508), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 25, new IntPred(533, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 63, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 47, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(756, 798), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 72, new IntPred(799, 852), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 27, new IntPred(853, 908), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 16, new IntPred(909, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 39, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 24, new IntPred(22, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 79, new IntPred(63, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 73, new IntPred(108, 135), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 80, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 71, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 66, new IntPred(309, 331), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 27, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 77, new IntPred(370, 450), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 54, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 63, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 17, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 13, new IntPred(570, 644), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 76, new IntPred(645, 719), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 47, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 23, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 71, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 31, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 59, new IntPred(909, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 8, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 17, new IntPred(22, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 19, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 54, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 13, new IntPred(136, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 26, new IntPred(234, 242), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 20, new IntPred(243, 308), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 60, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(332, 369), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 46, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 25, new IntPred(451, 508), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 20, new IntPred(509, 532), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 65, new IntPred(533, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 79, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 65, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 16, new IntPred(720, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 64, new IntPred(756, 798), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 43, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 22, new IntPred(853, 908), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 58, new IntPred(909, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 74, new IntPred(22, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 30, new IntPred(63, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 70, new IntPred(108, 135), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 6, new IntPred(136, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 47, new IntPred(234, 242), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 6, new IntPred(243, 308), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 21, new IntPred(309, 331), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 58, new IntPred(332, 369), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 20, new IntPred(370, 450), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 7, new IntPred(451, 508), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 61, new IntPred(509, 532), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 12, new IntPred(533, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 32, new IntPred(570, 644), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 68, new IntPred(645, 719), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 35, new IntPred(720, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(756, 798), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(799, 852), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 7, new IntPred(853, 908), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 35, new IntPred(909, null), 'b'));
return trans;
}

}
