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
public class Random80States10SigmaE20240823035049{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 58, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 72, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 79, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 79, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 42, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 43, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 42, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 66, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 74, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 60, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 48, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 70, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 53, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 42, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 21, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 44, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 77, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 62, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 41, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 62, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 64, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 68, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 67, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 62, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 80, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 55, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 70, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 77, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 44, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 51, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 48, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 43, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 45, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 49, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 72, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 34, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 67, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 55, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 57, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 54, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 52, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 71, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 36, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 73, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 51, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 76, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 56, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 36, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 79, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 53, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 77, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 66, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 54, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 64, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 69, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 65, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 56, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 59, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 63, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 57, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 42, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 54, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 57, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 54, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 58, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 43, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 53, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 59, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 45, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 58, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 51, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 44, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 51, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 62, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 46, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 57, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 62, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 77, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 47, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 62, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 49, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 64, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 50, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 56, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 78, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 68, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 47, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 61, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 21, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 62, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 64, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 56, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 25, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 60, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 17, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 65, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 80, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 61, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 45, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 52, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 38, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 74, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 40, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 80, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 74, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 58, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 23, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 71, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 52, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 70, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 46, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 80, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 70, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 38, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 66, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 1, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 63, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 33, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 72, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 19, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 48, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 13, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 79, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 26, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 79, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 47, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 64, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 67, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 55, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 66, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 43, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 77, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 56, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 45, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 64, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 49, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 65, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 70, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 80, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 22, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 78, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 66, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 61, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 6, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 61, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 75, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 8, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 30, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 60, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 64, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 61, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 58, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 24, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 55, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 45, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 52, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 68, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 21, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 12, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 62, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 12, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 79, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 55, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 3, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 44, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 68, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 22, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 22, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 1, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 73, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 58, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 14, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 79, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 76, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 51, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 7, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 52, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 71, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 60, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 57, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 42, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 50, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 73, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 22, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 43, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 42, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 59, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 75, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 63, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 53, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 46, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 11, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 70, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 65, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 44, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 77, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 8, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 49, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 13, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 66, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 7, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 72, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 33, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 49, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 25, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 57, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 23, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 13, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 63, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 68, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 15, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 65, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 25, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 12, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 31, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 39, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 75, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 6, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 20, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 10, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 52, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 19, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 20, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 38, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 24, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 31, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 27, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 49, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 80, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 31, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 73, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 22, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 49, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 38, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 27, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 54, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 60, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 52, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 22, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 58, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 33, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 73, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 24, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 53, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 46, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 61, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 59, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 21, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 70, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 50, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 49, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 49, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 60, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 52, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 7, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 39, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 58, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 36, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 76, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 13, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 4, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 72, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 75, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 10, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 76, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 15, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 72, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 7, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 7, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 13, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 76, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 5, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 34, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 41, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 1, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 40, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 5, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 14, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 32, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 41, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 26, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 17, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 50, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 78, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 4, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 16, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 41, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 7, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 66, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 14, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 46, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 6, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 80, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 76, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 44, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 54, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 46, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 15, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 72, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 44, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 22, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 58, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 14, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 70, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 25, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 41, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 57, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 71, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 50, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 10, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 22, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 21, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 13, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 12, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 37, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 9, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 69, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 68, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 53, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 78, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 50, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 53, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 38, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 22, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 64, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 40, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 35, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 38, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 49, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 7, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 31, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 28, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 54, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 53, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 80, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 31, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 44, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 4, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 69, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 44, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 50, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 32, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 47, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 2, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 59, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 13, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 65, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 32, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 67, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 45, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 9, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 57, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 73, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 76, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 37, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 36, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 34, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 45, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 32, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 21, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 42, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 79, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 76, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 7, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 44, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 60, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 7, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 47, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 57, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 39, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 24, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 62, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 29, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 75, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 32, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 45, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 64, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 10, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 62, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 39, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 77, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 52, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 22, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 58, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 6, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 18, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 27, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 31, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 12, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 27, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 68, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 13, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 46, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 49, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 78, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 59, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 7, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 11, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 70, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 70, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 33, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 29, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 8, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 55, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 68, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 46, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 36, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 15, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 47, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 48, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 8, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 77, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 12, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 11, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 77, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 18, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 40, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 57, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 35, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 77, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 3, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 29, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 23, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 5, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 53, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 6, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 47, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 14, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 2, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 25, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 11, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 67, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 5, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 56, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 51, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 43, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 54, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 63, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 76, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 5, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 54, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 3, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 21, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 13, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 16, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 35, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 52, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 55, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 24, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 9, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 59, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 17, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 61, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 40, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 23, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 19, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 71, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 12, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 60, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 63, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 75, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 63, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 20, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 64, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 31, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 35, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 73, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 43, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 42, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 49, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 76, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 70, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 10, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 55, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 71, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 79, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 71, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 57, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 78, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 80, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 35, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 70, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 17, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 29, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 74, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 37, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 8, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 67, new IntPred(224, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 66, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 42, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 24, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 74, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 64, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 10, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 47, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 12, new IntPred(162, 223), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 45, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 71, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 19, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 60, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 3, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 16, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 24, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 40, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 75, new IntPred(80, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 16, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 46, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 56, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 41, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 75, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 32, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 45, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 77, new IntPred(566, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 48, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 15, new IntPred(80, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 3, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 62, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 24, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 73, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 80, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 30, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 70, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 70, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 68, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 43, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 38, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 6, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 57, new IntPred(320, 353), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 25, new IntPred(354, 393), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 79, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 54, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 51, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 26, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 3, new IntPred(0, 79), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 26, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 78, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 24, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 44, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 18, new IntPred(354, 393), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 55, new IntPred(458, 498), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 62, new IntPred(499, 565), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 38, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 38, new IntPred(0, 79), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 22, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 57, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 76, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 6, new IntPred(394, 457), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 79, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 23, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 28, new IntPred(566, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 22, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 60, new IntPred(162, 223), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 51, new IntPred(224, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(320, 353), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 37, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(394, 457), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 22, new IntPred(458, 498), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 50, new IntPred(499, 565), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 68, new IntPred(566, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 78, new IntPred(0, 79), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 23, new IntPred(80, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 21, new IntPred(162, 223), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 43, new IntPred(224, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 62, new IntPred(320, 353), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 15, new IntPred(354, 393), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 10, new IntPred(394, 457), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 24, new IntPred(458, 498), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 78, new IntPred(499, 565), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 34, new IntPred(566, null), 'a'));
return trans;
}

}
