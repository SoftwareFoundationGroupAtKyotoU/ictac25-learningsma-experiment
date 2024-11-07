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
public class Random80States10SigmaE20240823035043{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 72, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 49, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 70, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 66, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 69, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 41, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 58, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 48, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 62, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 73, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 60, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 67, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 68, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 56, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 63, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 79, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 71, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 59, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 74, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 53, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 65, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 48, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 59, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 57, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 45, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 29, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 77, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 54, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 72, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 50, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 78, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 57, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 71, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 46, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 77, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 69, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 52, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 67, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 78, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 67, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 73, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 49, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 79, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 64, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 66, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 42, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 64, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 78, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 52, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 72, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 42, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 73, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 67, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 67, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 74, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 68, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 55, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 63, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 71, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 52, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 51, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 49, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 30, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 32, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 68, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 69, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 41, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 60, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 31, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 63, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 78, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 64, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 44, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 44, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 71, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 61, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 52, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 70, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 54, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 66, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 76, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 55, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 55, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 30, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 41, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 50, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 78, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 47, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 56, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 67, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 77, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 50, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 55, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 27, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 53, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 56, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 69, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 42, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 43, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 78, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 38, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 67, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 76, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 55, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 62, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 64, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 66, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 23, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 48, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 75, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 61, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 47, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 49, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 53, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 60, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 63, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 20, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 75, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 65, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 46, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 67, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 53, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 46, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 56, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 61, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 52, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 23, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 45, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 44, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 12, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 27, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 78, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 48, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 62, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 58, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 56, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 42, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 49, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 56, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 41, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 18, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 42, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 10, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 54, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 53, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 9, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 7, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 58, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 28, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 43, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 46, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 54, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 53, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 77, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 80, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 77, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 54, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 80, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 76, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 76, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 43, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 57, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 57, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 60, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 56, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 48, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 55, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 62, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 54, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 47, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 79, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 44, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 47, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 44, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 48, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 59, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 66, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 62, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 79, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 72, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 80, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 65, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 43, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 43, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 62, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 27, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 20, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 66, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 37, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 80, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 49, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 61, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 58, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 48, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 74, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 61, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 48, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 80, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 65, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 76, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 58, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 55, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 43, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 54, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 73, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 72, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 75, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 46, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 7, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 19, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 9, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 65, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 24, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 51, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 42, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 6, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 44, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 40, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 62, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 24, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 34, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 73, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 77, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 50, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 45, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 71, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 10, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 76, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 71, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 23, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 62, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 6, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 67, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 2, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 56, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 6, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 28, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 28, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 61, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 39, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 58, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 21, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 73, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 79, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 54, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 45, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 7, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 55, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 58, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 43, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 46, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 9, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 43, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 14, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 31, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 75, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 53, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 50, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 36, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 29, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 49, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 43, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 34, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 23, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 1, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 70, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 25, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 61, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 15, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 13, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 16, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 44, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 67, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 27, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 60, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 76, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 47, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 71, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 19, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 30, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 42, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 12, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 77, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 45, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 37, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 61, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 39, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 39, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 51, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 15, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 74, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 32, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 57, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 13, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 54, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 54, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 54, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 25, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 66, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 50, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 49, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 54, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 39, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 80, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 12, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 63, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 61, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 59, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 13, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 19, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 16, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 58, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 52, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 33, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 26, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 62, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 66, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 21, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 5, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 70, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 31, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 34, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 39, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 60, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 40, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 13, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 18, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 37, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 29, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 2, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 70, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 49, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 6, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 71, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 16, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 29, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 42, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 33, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 55, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 25, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 1, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 20, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 64, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 27, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 46, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 46, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 53, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 13, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 10, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 15, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 64, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 19, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 11, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 1, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 66, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 43, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 32, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 55, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 62, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 17, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 26, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 36, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 14, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 1, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 58, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 40, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 46, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 14, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 34, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 33, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 29, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 25, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 16, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 43, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 32, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 15, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 30, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 49, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 77, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 47, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 46, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 73, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 80, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 45, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 69, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 30, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 33, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 62, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 3, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 50, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 8, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 51, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 13, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 43, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 67, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 27, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 36, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 16, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 33, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 38, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 74, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 59, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 14, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 42, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 60, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 55, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 35, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 65, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 23, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 4, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 80, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 56, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 17, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 58, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 50, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 37, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 45, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 77, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 18, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 56, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 71, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 25, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 32, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 54, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 20, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 39, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 46, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 27, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 16, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 62, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 35, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 46, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 56, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 35, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 1, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 79, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 63, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 41, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 31, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 70, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 70, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 8, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 34, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 54, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 19, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 50, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 63, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 20, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 10, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 59, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 16, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 36, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 22, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 35, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 31, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 64, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 60, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 75, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 78, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 13, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 73, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 45, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 55, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 11, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 69, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 28, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 30, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 67, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 2, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 25, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 35, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 40, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 60, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 10, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 79, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 56, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 73, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 2, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 35, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 75, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 8, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 77, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 46, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 19, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 22, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 20, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 62, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 49, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 11, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 44, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 37, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 57, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 38, new IntPred(182, 194), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 17, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 4, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 47, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 60, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 36, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 11, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 6, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 21, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 71, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 27, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 24, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 26, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 26, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 4, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 67, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 28, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 19, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 67, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 49, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 50, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 22, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 68, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 38, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 38, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 74, new IntPred(81, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 14, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 38, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 29, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 23, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 51, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 3, new IntPred(300, 380), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 64, new IntPred(381, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 50, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 6, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 1, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 29, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 32, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 3, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 9, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 61, new IntPred(289, 299), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 13, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 15, new IntPred(381, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 29, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 20, new IntPred(2, 80), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 2, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 59, new IntPred(97, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 57, new IntPred(120, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 30, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 14, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 80, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 20, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 34, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 31, new IntPred(0, 1), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 49, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 62, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(97, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 24, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(182, 194), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 66, new IntPred(195, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 36, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 42, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 77, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 35, new IntPred(0, 1), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 2, new IntPred(2, 80), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 45, new IntPred(81, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 33, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 80, new IntPred(120, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 25, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 5, new IntPred(195, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 5, new IntPred(289, 299), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 33, new IntPred(300, 380), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 35, new IntPred(381, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 15, new IntPred(0, 1), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 47, new IntPred(2, 80), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(81, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 32, new IntPred(97, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(120, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 47, new IntPred(182, 194), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 20, new IntPred(195, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 64, new IntPred(289, 299), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 33, new IntPred(300, 380), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 15, new IntPred(381, null), 'a'));
return trans;
}

}
