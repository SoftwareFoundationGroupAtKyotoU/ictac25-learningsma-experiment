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
public class Random40States20SigmaE20240822005039{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 32, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 25, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(501, 557), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(632, 720), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(721, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(830, 900), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(501, 557), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(558, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(152, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(501, 557), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(721, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 35, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 21, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(152, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 39, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(241, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(632, 720), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(152, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 35, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(593, 631), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 27, new IntPred(241, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(501, 557), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 27, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(763, 829), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 25, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 40, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(593, 631), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(721, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(152, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 39, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 21, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 30, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(632, 720), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(763, 829), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 30, new IntPred(830, 900), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 29, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(241, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 25, new IntPred(558, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(593, 631), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 32, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(152, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(593, 631), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 22, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 36, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(632, 720), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 30, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 25, new IntPred(364, 432), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 21, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(830, 900), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(241, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(632, 720), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 32, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(501, 557), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 27, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 31, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(830, 900), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 23, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 32, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 30, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(721, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 33, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 38, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(558, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 38, new IntPred(632, 720), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(763, 829), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(364, 432), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(830, 900), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(152, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 26, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(830, 900), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(152, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(241, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(593, 631), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 15, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 7, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(152, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 29, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 40, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 29, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(593, 631), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 15, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(241, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 31, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 12, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(558, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(593, 631), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(763, 829), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 21, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(364, 432), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(501, 557), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(830, 900), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 10, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 22, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(364, 432), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 19, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 7, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(721, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(763, 829), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(241, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 31, new IntPred(593, 631), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(152, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(632, 720), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(0, 92), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 16, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(558, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 32, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 38, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 7, new IntPred(364, 432), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(501, 557), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(593, 631), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(632, 720), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(325, 343), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 31, new IntPred(632, 720), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 31, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 31, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 26, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 26, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(364, 432), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(721, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(763, 829), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 37, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(93, 151), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 19, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 5, new IntPred(763, 829), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(830, 900), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 18, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(344, 363), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(364, 432), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 40, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 34, new IntPred(901, 929), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 11, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 18, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 14, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(433, 500), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 18, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(558, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(593, 631), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(632, 720), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(721, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(763, 829), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 18, new IntPred(930, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(152, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(223, 233), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 10, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 1, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(590, 592), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 12, new IntPred(593, 631), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 7, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(830, 900), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(901, 929), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(152, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(223, 233), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(234, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(241, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 22, new IntPred(364, 432), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(558, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(590, 592), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(721, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(763, 829), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(830, 900), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(930, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(0, 92), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(93, 151), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 36, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(234, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(241, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(325, 343), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 13, new IntPred(344, 363), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(433, 500), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(501, 557), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(632, 720), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(721, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(763, 829), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 11, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(930, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(0, 92), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(93, 151), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(152, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(223, 233), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(234, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(241, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(325, 343), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(344, 363), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(364, 432), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(433, 500), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(501, 557), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(558, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(590, 592), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(593, 631), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 19, new IntPred(632, 720), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(721, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 4, new IntPred(763, 829), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(830, 900), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(901, 929), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(930, null), 'a'));
return trans;
}

}
