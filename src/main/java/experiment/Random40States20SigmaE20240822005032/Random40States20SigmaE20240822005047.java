package experiment.Random40States20SigmaE20240822005032;
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
public class Random40States20SigmaE20240822005047{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 34, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 34, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(797, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 34, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(423, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(797, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(416, 422), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 25, new IntPred(491, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(531, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 25, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 21, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(531, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 32, new IntPred(540, 575), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(676, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(253, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(345, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(423, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 34, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 27, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(676, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(423, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 38, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 27, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 36, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(416, 422), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 24, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(491, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 22, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(676, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(540, 575), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 24, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 30, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 21, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(345, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(797, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(253, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(345, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(491, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 36, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(540, 575), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(676, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 39, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 40, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(416, 422), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(423, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(540, 575), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 37, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 27, new IntPred(797, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(531, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 29, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 33, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(531, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 37, new IntPred(416, 422), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(423, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 37, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 28, new IntPred(531, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(540, 575), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 37, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 27, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(423, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(491, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 23, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 27, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 34, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 38, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(491, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(676, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(253, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 17, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(491, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(797, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 7, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 2, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 15, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(345, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(491, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 7, new IntPred(416, 422), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 40, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 7, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(540, 575), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(797, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 31, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(253, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 20, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(491, 530), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(676, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 27, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 4, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 40, new IntPred(345, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 32, new IntPred(416, 422), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(540, 575), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(797, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 19, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 19, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(345, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(531, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 12, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 4, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(416, 422), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 38, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(531, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 18, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(797, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(156, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(253, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(531, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(797, 843), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 32, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 28, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(345, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(416, 422), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 13, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 28, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(345, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(534, 539), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(540, 575), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(676, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 36, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(253, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(345, 415), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(531, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 27, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 14, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(416, 422), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(540, 575), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 10, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(253, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(676, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(464, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 11, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(844, 916), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 7, new IntPred(917, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(253, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(423, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(676, 694), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(0, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 12, new IntPred(69, 155), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(253, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 7, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 37, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(531, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(695, 743), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 20, new IntPred(744, 796), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 28, new IntPred(797, 843), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(917, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(156, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(328, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(423, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(540, 575), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(576, 675), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(676, 694), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(695, 743), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 25, new IntPred(844, 916), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(0, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(69, 155), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(253, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(328, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(345, 415), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(416, 422), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(464, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(491, 530), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(531, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(534, 539), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(540, 575), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(576, 675), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 38, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(744, 796), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 36, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(917, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(0, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 19, new IntPred(69, 155), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(156, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(253, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(328, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 8, new IntPred(345, 415), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(416, 422), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(423, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(464, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 39, new IntPred(491, 530), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(531, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(534, 539), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 8, new IntPred(540, 575), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(576, 675), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 19, new IntPred(676, 694), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(695, 743), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 4, new IntPred(744, 796), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 14, new IntPred(797, 843), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(844, 916), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(917, null), 'c'));
return trans;
}

}
