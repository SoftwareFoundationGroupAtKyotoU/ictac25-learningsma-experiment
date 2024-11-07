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
public class Random20States10SigmaE20240820075235{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(0, 84), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(85, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(120, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(164, 164), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(165, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(260, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(296, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(346, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(406, 423), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(424, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(85, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(120, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(164, 164), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(165, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(260, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(296, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(346, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(406, 423), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(424, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(85, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(120, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(164, 164), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(260, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(296, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(346, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(406, 423), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(424, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(0, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(85, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(120, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(164, 164), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(260, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(296, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(346, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(406, 423), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(424, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(85, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(120, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(164, 164), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(165, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(260, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(296, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(346, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(406, 423), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(424, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(0, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(85, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(120, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(164, 164), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(260, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(296, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(346, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(406, 423), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(424, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(85, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(120, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(164, 164), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(260, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(296, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(346, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(406, 423), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(424, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(0, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(85, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(120, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(164, 164), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(260, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(296, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(346, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(406, 423), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(424, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(0, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(85, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(120, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(164, 164), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(260, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(296, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(346, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(406, 423), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(424, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(85, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(120, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(164, 164), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(165, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(260, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(296, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(346, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(406, 423), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(424, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(85, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(120, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(164, 164), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(260, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(296, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(346, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(406, 423), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(424, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(85, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(120, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(164, 164), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(260, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(296, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(346, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(406, 423), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(424, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(0, 84), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(85, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(120, 163), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(164, 164), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(260, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(296, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(346, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(406, 423), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(424, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(85, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(120, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(164, 164), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(165, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(260, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(296, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(346, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(406, 423), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(424, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(85, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(120, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(164, 164), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(165, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(260, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(296, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(346, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(406, 423), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(424, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(85, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 11, new IntPred(120, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(164, 164), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(260, 295), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(296, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(346, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(406, 423), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(424, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(85, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(120, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(164, 164), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(260, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(296, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(346, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(406, 423), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(424, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(0, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(85, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(120, 163), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(164, 164), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(165, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(260, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(296, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(346, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(406, 423), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(424, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(85, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(120, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(164, 164), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(165, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(260, 295), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(296, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(346, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(406, 423), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(424, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(0, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(85, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(120, 163), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(164, 164), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(165, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(260, 295), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(296, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(346, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(406, 423), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(424, null), 'a'));
return trans;
}

}
