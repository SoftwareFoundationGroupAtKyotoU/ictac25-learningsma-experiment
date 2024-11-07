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
public class Random20States10SigmaE20240820075241{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(47, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(110, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(169, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(223, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(263, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(326, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(411, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(47, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(110, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(169, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(223, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(263, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(326, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(411, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(47, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(110, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(169, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(223, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(263, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(411, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(47, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(86, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(110, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(169, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(223, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(263, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(326, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(411, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(47, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(110, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(169, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(223, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(263, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(411, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(47, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(110, 168), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(169, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(223, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(263, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(326, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(411, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(47, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(86, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(110, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(169, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(223, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(263, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(411, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(432, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(47, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(110, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(169, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(223, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(263, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(411, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(47, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(86, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(110, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(169, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(223, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(263, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(411, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(432, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(47, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(110, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(169, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(223, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(263, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(411, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(47, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(86, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(110, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(169, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(223, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(263, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(411, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(47, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(110, 168), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(169, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(223, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(263, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(411, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(0, 46), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(47, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(86, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(110, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(169, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(223, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(263, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(326, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(411, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(432, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(47, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(110, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(169, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(223, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(263, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(411, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(432, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(47, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(86, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(110, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(169, 222), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(223, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(263, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(326, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(411, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(47, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(110, 168), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(169, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(223, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(263, 325), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(326, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(411, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(47, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(86, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(110, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(169, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(223, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(263, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(411, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(47, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(86, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(110, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(169, 222), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(223, 262), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(263, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(326, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(411, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(0, 46), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(47, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(110, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(169, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(223, 262), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(263, 325), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(326, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(411, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(0, 46), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(47, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(86, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(110, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(169, 222), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(223, 262), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(263, 325), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(326, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(411, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(432, null), 'c'));
return trans;
}

}
