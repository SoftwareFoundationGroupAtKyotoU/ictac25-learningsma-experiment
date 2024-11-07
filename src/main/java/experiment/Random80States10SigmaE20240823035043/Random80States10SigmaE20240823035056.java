package experiment.Random80States10SigmaE20240823035043;
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
public class Random80States10SigmaE20240823035056{
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
trans.addAll(createTransitionsState41());
trans.addAll(createTransitionsState42());
trans.addAll(createTransitionsState43());
trans.addAll(createTransitionsState44());
trans.addAll(createTransitionsState45());
trans.addAll(createTransitionsState46());
trans.addAll(createTransitionsState47());
trans.addAll(createTransitionsState48());
trans.addAll(createTransitionsState49());
trans.addAll(createTransitionsState50());
trans.addAll(createTransitionsState51());
trans.addAll(createTransitionsState52());
trans.addAll(createTransitionsState53());
trans.addAll(createTransitionsState54());
trans.addAll(createTransitionsState55());
trans.addAll(createTransitionsState56());
trans.addAll(createTransitionsState57());
trans.addAll(createTransitionsState58());
trans.addAll(createTransitionsState59());
trans.addAll(createTransitionsState60());
trans.addAll(createTransitionsState61());
trans.addAll(createTransitionsState62());
trans.addAll(createTransitionsState63());
trans.addAll(createTransitionsState64());
trans.addAll(createTransitionsState65());
trans.addAll(createTransitionsState66());
trans.addAll(createTransitionsState67());
trans.addAll(createTransitionsState68());
trans.addAll(createTransitionsState69());
trans.addAll(createTransitionsState70());
trans.addAll(createTransitionsState71());
trans.addAll(createTransitionsState72());
trans.addAll(createTransitionsState73());
trans.addAll(createTransitionsState74());
trans.addAll(createTransitionsState75());
trans.addAll(createTransitionsState76());
trans.addAll(createTransitionsState77());
trans.addAll(createTransitionsState78());
trans.addAll(createTransitionsState79());
trans.addAll(createTransitionsState80());
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 25, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 80, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 52, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 72, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 70, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 44, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 78, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 59, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 70, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 54, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 74, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 50, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 56, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 66, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 32, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 74, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 38, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 47, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 41, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 43, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 77, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 69, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 47, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 70, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 54, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 75, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 59, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 66, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 75, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 46, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 75, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 57, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 51, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 64, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 44, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 63, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 32, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 74, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 51, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 42, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 67, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 67, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 51, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 77, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 67, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 42, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 76, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 55, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 41, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 54, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 47, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 43, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 78, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 79, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 56, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 36, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 53, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 46, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 64, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 42, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 80, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 49, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 46, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 67, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 42, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 41, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 46, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 58, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 47, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 69, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 41, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 79, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 54, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 53, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 69, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 69, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 53, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 51, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 78, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 68, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 44, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 48, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 55, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 47, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 72, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 48, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 49, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 29, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 54, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 65, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 69, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 53, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 49, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 64, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 72, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 79, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 55, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 62, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 24, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 43, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 76, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 74, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 60, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 59, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 71, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 76, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 60, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 55, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 52, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 45, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 72, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 76, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 78, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 55, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 68, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 56, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 54, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 55, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 13, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 61, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 65, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 51, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 43, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 56, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 69, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 69, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 74, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 55, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 31, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 79, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 44, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 19, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 60, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 80, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 38, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 43, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 80, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 47, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 78, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 58, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 55, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 74, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 61, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 75, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 27, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 67, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 49, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 47, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 60, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 75, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 47, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 52, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 68, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 16, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 71, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 50, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 68, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 54, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 62, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 62, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 30, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 16, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 70, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 58, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 61, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 51, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 72, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 54, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 72, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 10, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 61, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 55, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 24, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 66, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 42, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 48, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 75, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 80, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 61, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 80, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 54, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 47, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 61, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 42, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 70, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 72, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 41, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 32, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 71, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 46, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 21, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 61, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 41, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 59, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 38, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 37, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 10, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 57, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 38, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 73, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 51, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 53, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 26, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 56, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 25, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 79, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 17, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 41, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 43, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 43, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 60, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 33, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 51, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 47, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 21, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 29, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 65, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 14, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 62, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 24, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 10, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 67, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 69, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 52, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 69, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 70, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 22, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 3, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 35, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 33, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 76, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 56, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 39, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 4, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 51, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 65, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 33, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 66, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 12, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 71, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 62, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 19, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 79, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 55, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 16, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 51, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 16, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 73, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 62, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 64, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 73, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 53, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 20, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 27, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 35, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 44, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 23, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 49, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 32, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 38, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 71, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 11, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 41, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 1, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 3, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 22, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 13, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 47, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 51, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 4, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 46, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 52, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 50, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 10, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 48, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 55, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 12, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 79, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 57, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 48, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 79, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 44, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 31, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 56, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 77, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 44, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 28, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 59, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 40, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 45, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 13, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 40, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 69, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 78, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 14, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 79, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 57, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 62, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 31, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 1, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 78, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 67, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 49, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 36, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 46, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 48, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 9, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 12, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 54, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 12, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 12, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 18, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 21, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 2, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 17, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 49, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 42, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 75, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 18, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 67, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 56, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 53, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 10, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 71, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 36, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 31, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 23, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 30, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 5, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 26, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 41, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 73, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 57, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 65, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 12, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 41, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 33, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 35, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 14, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 67, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 73, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 3, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 22, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 80, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 11, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 11, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 15, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 16, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 16, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 35, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 54, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 23, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 4, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 38, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 79, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 5, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 79, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 56, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 24, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 11, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 54, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 3, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 60, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 46, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 50, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 61, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 76, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 45, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 50, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 11, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 49, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 71, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 50, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 32, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 13, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 1, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 30, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 18, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 69, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 37, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 46, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 74, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 47, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 70, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 64, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 80, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 26, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 70, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 72, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 26, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 20, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 9, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 57, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 53, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 5, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 9, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 3, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 48, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 1, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 9, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 22, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 8, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 75, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 43, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 65, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 58, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 66, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 44, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 62, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 50, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 68, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 48, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 61, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 28, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 3, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 72, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 15, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 80, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 70, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 24, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 23, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 47, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 51, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 22, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 34, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 40, new IntPred(308, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 70, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 40, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 74, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 56, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 16, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 30, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 20, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 35, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 64, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 40, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 24, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 43, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 70, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 19, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 23, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 51, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 11, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 62, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 72, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 58, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 1, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 69, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 41, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 27, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 58, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 17, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 58, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 30, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 53, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 43, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 78, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 30, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 50, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 4, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 34, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 61, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 9, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 67, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 8, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 20, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 11, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 78, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 66, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 54, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 76, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 37, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 2, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 52, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 51, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 30, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 2, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 77, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 35, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 12, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 38, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 10, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 52, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 8, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 67, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 39, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 71, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 64, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 50, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 60, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 11, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 39, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 79, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 52, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 22, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 33, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 16, new IntPred(0, 12), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 64, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 35, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 55, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 3, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 12, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 79, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 18, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 2, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 44, new IntPred(362, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 61, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 20, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 71, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 69, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 68, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 2, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 67, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 16, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 74, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 24, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 11, new IntPred(13, 36), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 26, new IntPred(37, 44), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 65, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 2, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 41, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 3, new IntPred(201, 236), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 62, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 15, new IntPred(308, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 12, new IntPred(362, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 8, new IntPred(0, 12), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 70, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 49, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 35, new IntPred(45, 104), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 62, new IntPred(105, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 67, new IntPred(162, 200), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 43, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 64, new IntPred(237, 307), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 24, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 65, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 22, new IntPred(13, 36), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 11, new IntPred(37, 44), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 56, new IntPred(45, 104), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 74, new IntPred(105, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 43, new IntPred(162, 200), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 48, new IntPred(201, 236), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 74, new IntPred(237, 307), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 1, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 38, new IntPred(362, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(0, 12), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 55, new IntPred(13, 36), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 63, new IntPred(37, 44), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 49, new IntPred(45, 104), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 75, new IntPred(105, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 2, new IntPred(162, 200), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 50, new IntPred(201, 236), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 55, new IntPred(237, 307), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 59, new IntPred(308, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 30, new IntPred(362, null), 'c'));
return trans;
}

}
