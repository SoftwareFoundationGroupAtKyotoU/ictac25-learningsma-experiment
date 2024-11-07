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
public class Random20States10SigmaE20240820075238{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(21, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(108, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(182, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(238, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(333, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(373, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(464, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(479, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(21, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(108, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(182, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(238, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(333, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(373, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(479, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(21, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(108, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(182, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(237, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(238, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(333, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(373, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(479, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(21, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(108, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(182, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(238, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(333, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(373, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(479, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(21, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(108, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(182, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(237, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(238, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(333, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(373, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(479, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(21, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(108, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(182, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(237, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(238, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(333, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(373, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(464, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(479, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(21, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(108, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(182, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(238, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(333, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(373, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(479, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(21, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(108, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(182, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(238, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(333, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(373, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(479, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(21, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(108, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(182, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(238, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(333, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(373, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(464, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(479, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(21, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(108, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(182, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(238, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(333, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(373, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(464, 478), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(479, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(21, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(108, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(182, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(237, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(238, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(333, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(373, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(479, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(21, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(108, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(182, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(237, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(238, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(333, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(373, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(479, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(21, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(108, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(182, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(238, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(333, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(373, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(479, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(21, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(108, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(182, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(237, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(238, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(333, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(373, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(464, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(479, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(21, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(108, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(182, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(238, 332), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(333, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(373, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(464, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(479, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(21, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(108, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(182, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(238, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(333, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(373, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(464, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(479, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(0, 20), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(21, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(108, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(182, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(238, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(333, 372), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(373, 463), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(479, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(0, 20), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(21, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(108, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(182, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(237, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(238, 332), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(333, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(373, 463), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(479, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(21, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(108, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(182, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(237, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(238, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(333, 372), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(373, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(464, 478), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(479, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(0, 20), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(21, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(108, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(182, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(237, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(238, 332), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(333, 372), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(373, 463), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(464, 478), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(479, null), 'b'));
return trans;
}

}
