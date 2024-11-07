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
public class Random20States10SigmaE20240820075228{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(21, 106), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(107, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(128, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(157, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(241, 292), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(293, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(384, 402), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(403, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(432, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(21, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(107, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(128, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(157, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(241, 292), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(293, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(384, 402), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(403, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(432, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(21, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(107, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(128, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(157, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(241, 292), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(293, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(384, 402), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(403, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(21, 106), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(107, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(128, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(157, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(241, 292), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(293, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(384, 402), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(403, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(21, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(107, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(128, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(157, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(241, 292), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(293, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(384, 402), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(403, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(21, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(107, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(128, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(157, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(241, 292), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(293, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(384, 402), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(403, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(21, 106), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(107, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(128, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(157, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(241, 292), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(293, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(384, 402), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(403, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(21, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(107, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(128, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(157, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(241, 292), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(293, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(384, 402), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(403, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(21, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(107, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(128, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(157, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(241, 292), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(293, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(384, 402), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(403, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(432, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(21, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(107, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(128, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(157, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(241, 292), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(293, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(384, 402), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(403, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(21, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(107, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(128, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(157, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(241, 292), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(293, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(384, 402), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(403, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(21, 106), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(107, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(128, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(157, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(241, 292), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(293, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(384, 402), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(403, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(21, 106), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(107, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(128, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(157, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(241, 292), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(293, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(384, 402), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(403, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(432, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(21, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(107, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(128, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(157, 240), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(241, 292), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(293, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(384, 402), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(403, 431), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(21, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(107, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(128, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(157, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(241, 292), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(293, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(384, 402), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(403, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(432, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(21, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(107, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(128, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(157, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(241, 292), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(293, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(384, 402), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(403, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(432, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(21, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(107, 127), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(128, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(157, 240), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(241, 292), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(293, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(384, 402), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(403, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(21, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(107, 127), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(128, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(157, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(241, 292), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(293, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(384, 402), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(403, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(21, 106), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(107, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(128, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(157, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(241, 292), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(293, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(384, 402), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(403, 431), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(432, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(21, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(107, 127), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(128, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(157, 240), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(241, 292), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(293, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(384, 402), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(403, 431), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(432, null), 'a'));
return trans;
}

}
