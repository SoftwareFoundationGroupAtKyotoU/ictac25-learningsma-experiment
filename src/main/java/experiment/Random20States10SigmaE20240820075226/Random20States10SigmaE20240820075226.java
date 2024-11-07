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
public class Random20States10SigmaE20240820075226{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(57, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(138, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(244, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(290, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(320, 374), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(375, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(408, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(447, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(57, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(138, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(244, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(290, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(320, 374), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(375, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(408, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(447, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(57, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(138, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(244, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(290, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(320, 374), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(375, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(408, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(447, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(57, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(138, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(201, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(244, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(290, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(320, 374), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(375, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(408, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(447, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(57, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(138, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(244, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(290, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(320, 374), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(375, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(408, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(447, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(57, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(138, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(244, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(290, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(320, 374), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(375, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(408, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(447, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(57, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(138, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(244, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(290, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(320, 374), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(375, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(408, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(447, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(57, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(138, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(244, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(290, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(320, 374), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(375, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(408, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(447, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(57, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(138, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(244, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(290, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(320, 374), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(375, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(408, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(447, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(57, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(138, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(201, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(244, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(290, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(320, 374), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(375, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(408, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(447, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(57, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(138, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(244, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(290, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(320, 374), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(375, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(408, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(447, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(57, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(138, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(244, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(290, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(320, 374), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(375, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(408, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(447, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(57, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(138, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(201, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(244, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(290, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(320, 374), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(375, 407), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(408, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(447, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(57, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(138, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(201, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(244, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(290, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(320, 374), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(375, 407), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(408, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(447, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(57, 137), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(138, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(201, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(244, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(290, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(320, 374), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(375, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(408, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(447, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(57, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(138, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(201, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(244, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(290, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(320, 374), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(375, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(408, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(447, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(57, 137), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(138, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(201, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(244, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(290, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(320, 374), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(375, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(408, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(447, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(0, 56), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(57, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(138, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(201, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(244, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(290, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(320, 374), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(375, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(408, 446), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(447, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(0, 56), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(57, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(138, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(201, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(244, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(290, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(320, 374), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(375, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(408, 446), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(447, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(0, 56), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(57, 137), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(138, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(201, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(244, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(290, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(320, 374), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(375, 407), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(408, 446), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(447, null), 'b'));
return trans;
}

}
