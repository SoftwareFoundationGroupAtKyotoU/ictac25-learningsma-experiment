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
public class Random20States10SigmaE20240820075233{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(54, 82), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(86, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(188, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(196, 225), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(226, 241), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(242, 326), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(327, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(54, 82), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(86, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(88, 187), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(188, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(196, 225), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(226, 241), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(242, 326), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(327, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(54, 82), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(83, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(86, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(188, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(196, 225), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(226, 241), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(242, 326), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(54, 82), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(83, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(86, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(88, 187), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(188, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(196, 225), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(226, 241), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(242, 326), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(54, 82), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(83, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(86, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(188, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(196, 225), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(226, 241), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(242, 326), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(54, 82), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(83, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(86, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(188, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(196, 225), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(226, 241), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(242, 326), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(54, 82), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(86, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(188, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(196, 225), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(226, 241), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(242, 326), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(327, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(54, 82), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(86, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(188, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(196, 225), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(226, 241), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(242, 326), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(54, 82), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(86, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(188, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(196, 225), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(226, 241), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(242, 326), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(54, 82), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(86, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(188, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(196, 225), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(226, 241), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(242, 326), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(54, 82), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(86, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(88, 187), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(188, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(196, 225), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(226, 241), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(242, 326), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(54, 82), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(86, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(188, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(196, 225), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(226, 241), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(242, 326), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(54, 82), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(83, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(86, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(188, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(196, 225), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(226, 241), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(242, 326), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(54, 82), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(83, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(86, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(188, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(196, 225), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(226, 241), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(242, 326), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(327, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(54, 82), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(86, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(88, 187), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(188, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(196, 225), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(226, 241), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(242, 326), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(327, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 11, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(54, 82), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(83, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(86, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(88, 187), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(188, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(196, 225), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(226, 241), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 11, new IntPred(242, 326), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(54, 82), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(86, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(88, 187), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(188, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(196, 225), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(226, 241), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(242, 326), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(327, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(54, 82), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(83, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(86, 87), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(88, 187), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(188, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(196, 225), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(226, 241), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(242, 326), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(327, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(54, 82), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(83, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(86, 87), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(88, 187), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(188, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(196, 225), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(226, 241), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(242, 326), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(327, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(54, 82), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(83, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(86, 87), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(88, 187), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(188, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(196, 225), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(226, 241), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(242, 326), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(327, null), 'c'));
return trans;
}

}
