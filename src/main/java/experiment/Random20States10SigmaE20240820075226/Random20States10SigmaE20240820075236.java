package experiment.Random20States10SigmaE20240820075226;
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
public class Random20States10SigmaE20240820075236{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(0, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(70, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(138, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(144, 230), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(231, 290), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(291, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(321, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(385, 427), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(428, 489), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(490, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(0, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(70, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(138, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(144, 230), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(231, 290), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(291, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(321, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(385, 427), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(428, 489), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(490, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(0, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(70, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(138, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(144, 230), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(231, 290), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(291, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(321, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(385, 427), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(428, 489), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(490, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(0, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(70, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(138, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(144, 230), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(231, 290), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(291, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(321, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(385, 427), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(428, 489), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(490, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(0, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(70, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(138, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(144, 230), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(231, 290), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(291, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(321, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(385, 427), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(428, 489), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(490, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(0, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(70, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(138, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(144, 230), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(231, 290), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(291, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(321, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(385, 427), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(428, 489), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(490, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(0, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(70, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(138, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(144, 230), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(231, 290), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(291, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(321, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(385, 427), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(428, 489), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(490, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(0, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(70, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(138, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(144, 230), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(231, 290), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(291, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(321, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(385, 427), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(428, 489), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(490, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(0, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(70, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(138, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(144, 230), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(231, 290), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(291, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(321, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(385, 427), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(428, 489), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(490, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(0, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(70, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(138, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(144, 230), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(231, 290), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(291, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(321, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(385, 427), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(428, 489), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(490, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(0, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(70, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(138, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(144, 230), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(231, 290), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(291, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(321, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(385, 427), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(428, 489), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(490, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(0, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(70, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(138, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(144, 230), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(231, 290), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(291, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(321, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(385, 427), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(428, 489), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(490, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(0, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(70, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(138, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(144, 230), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(231, 290), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(291, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(321, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(385, 427), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(428, 489), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(490, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(0, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(70, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(138, 143), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(144, 230), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(231, 290), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(291, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(321, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(385, 427), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(428, 489), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(490, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(0, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(70, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(138, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(144, 230), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(231, 290), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(291, 320), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(321, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(385, 427), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(428, 489), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(490, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(0, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(70, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(138, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(144, 230), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(231, 290), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(291, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(321, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(385, 427), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(428, 489), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(490, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(0, 69), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(70, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(138, 143), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(144, 230), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(231, 290), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(291, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(321, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(385, 427), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(428, 489), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(490, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(0, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(70, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(138, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(144, 230), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(231, 290), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(291, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(321, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(385, 427), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(428, 489), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(490, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(0, 69), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(70, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(138, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(144, 230), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(231, 290), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(291, 320), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(321, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(385, 427), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(428, 489), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(490, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(0, 69), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(70, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(138, 143), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(144, 230), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(231, 290), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(291, 320), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(321, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(385, 427), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(428, 489), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(490, null), 'a'));
return trans;
}

}
