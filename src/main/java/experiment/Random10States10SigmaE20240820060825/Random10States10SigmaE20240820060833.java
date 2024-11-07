package experiment.Random10States10SigmaE20240820060825;
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
public class Random10States10SigmaE20240820060833{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(49, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(113, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(190, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(237, 261), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(262, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(325, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(356, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(386, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(49, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(113, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(190, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(237, 261), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(262, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(325, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(356, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(386, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(49, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(113, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(190, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(237, 261), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(262, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(325, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(356, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(386, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(49, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(113, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(190, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(237, 261), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(262, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(325, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(356, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(386, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(49, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(113, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(190, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(237, 261), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(262, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(325, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(356, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(386, 465), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(0, 48), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(49, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(113, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(190, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(237, 261), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(262, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(325, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(356, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(386, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(49, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(113, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(190, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(237, 261), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(262, 324), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(325, 355), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(356, 385), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(386, 465), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(466, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(49, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(113, 189), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(190, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(237, 261), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(262, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(325, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(356, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(386, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(466, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(0, 48), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(49, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(113, 189), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(190, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(237, 261), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(262, 324), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(325, 355), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(356, 385), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(386, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(466, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(0, 48), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(49, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(113, 189), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(190, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(237, 261), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(262, 324), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(325, 355), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(356, 385), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(386, 465), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(466, null), 'a'));
return trans;
}

}
