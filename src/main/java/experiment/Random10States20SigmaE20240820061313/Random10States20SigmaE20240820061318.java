package experiment.Random10States20SigmaE20240820061313;
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
public class Random10States20SigmaE20240820061318{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(0, 7), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(8, 45), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(46, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(76, 84), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(85, 145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(146, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(228, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(297, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(331, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(400, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(417, 417), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(418, 435), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(436, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(470, 509), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(510, 548), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(549, 576), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(577, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(646, 658), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(659, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(757, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(0, 7), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(8, 45), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(46, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(76, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(85, 145), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(146, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(228, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(297, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(331, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(400, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(417, 417), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(418, 435), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(436, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(470, 509), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(510, 548), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(549, 576), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(577, 645), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(646, 658), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(659, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(757, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(0, 7), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(8, 45), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(46, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(76, 84), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(85, 145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(146, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(228, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(297, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(331, 399), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(400, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(417, 417), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(418, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(436, 469), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(470, 509), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(510, 548), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(549, 576), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(577, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(646, 658), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(659, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(757, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(0, 7), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(8, 45), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(46, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(76, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(85, 145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(146, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(228, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(297, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(331, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(400, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(417, 417), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(418, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(436, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(470, 509), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(510, 548), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(549, 576), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(577, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(646, 658), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(659, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(757, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(0, 7), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(8, 45), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(46, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(76, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(85, 145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(146, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(228, 296), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(297, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(331, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(400, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(417, 417), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(418, 435), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(436, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(470, 509), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(510, 548), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(549, 576), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(577, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(646, 658), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(659, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(757, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(0, 7), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(8, 45), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(46, 75), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(76, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(85, 145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(146, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(228, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(297, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(331, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(400, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(417, 417), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(418, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(436, 469), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(470, 509), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(510, 548), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(549, 576), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(577, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(646, 658), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(659, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(757, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(0, 7), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(8, 45), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(46, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(76, 84), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(85, 145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(146, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(228, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(297, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(331, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(400, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(417, 417), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(418, 435), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(436, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(470, 509), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(510, 548), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(549, 576), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(577, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(646, 658), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(659, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(757, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(0, 7), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(8, 45), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(46, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(76, 84), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(85, 145), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(146, 227), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(228, 296), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(297, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(331, 399), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(400, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(417, 417), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(418, 435), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(436, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(470, 509), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(510, 548), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(549, 576), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(577, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(646, 658), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(659, 756), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(757, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(0, 7), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(8, 45), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(46, 75), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(76, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(85, 145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(146, 227), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(228, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(297, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(331, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(400, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(417, 417), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(418, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(436, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(470, 509), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(510, 548), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(549, 576), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(577, 645), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(646, 658), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(659, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(757, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(0, 7), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(8, 45), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(46, 75), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(76, 84), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(85, 145), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(146, 227), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(228, 296), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(297, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(331, 399), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(400, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(417, 417), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(418, 435), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(436, 469), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(470, 509), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(510, 548), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(549, 576), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(577, 645), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(646, 658), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(659, 756), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(757, null), 'c'));
return trans;
}

}
