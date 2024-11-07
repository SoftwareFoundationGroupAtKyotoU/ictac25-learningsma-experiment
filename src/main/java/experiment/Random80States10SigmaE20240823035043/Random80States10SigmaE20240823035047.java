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
public class Random80States10SigmaE20240823035047{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 72, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 48, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 52, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 52, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 53, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 46, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 49, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 48, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 64, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 65, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 59, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 80, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 62, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 63, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 43, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 70, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 45, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 21, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 56, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 74, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 47, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 50, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 49, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 61, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 72, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 72, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 67, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 73, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 79, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 56, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 62, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 59, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 70, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 79, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 41, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 77, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 43, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 74, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 47, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 52, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 57, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 56, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 41, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 55, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 79, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 51, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 27, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 75, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 56, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 24, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 63, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 24, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 71, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 48, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 77, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 48, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 72, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 50, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 52, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 50, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 68, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 66, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 74, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 77, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 57, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 47, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 60, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 43, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 41, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 48, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 66, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 65, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 52, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 69, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 71, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 41, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 61, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 51, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 43, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 46, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 55, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 63, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 55, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 75, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 65, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 74, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 62, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 70, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 49, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 44, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 26, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 47, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 65, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 58, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 48, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 57, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 61, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 68, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 76, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 79, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 63, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 55, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 70, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 48, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 11, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 61, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 40, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 56, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 80, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 70, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 62, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 50, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 79, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 62, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 55, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 78, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 55, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 46, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 41, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 52, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 47, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 1, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 54, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 51, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 55, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 63, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 13, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 41, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 42, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 26, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 47, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 42, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 68, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 71, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 49, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 49, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 55, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 78, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 18, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 44, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 69, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 67, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 54, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 63, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 8, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 68, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 65, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 63, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 66, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 68, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 47, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 40, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 76, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 57, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 61, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 79, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 71, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 5, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 73, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 49, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 41, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 46, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 75, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 68, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 72, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 2, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 77, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 51, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 72, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 67, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 80, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 54, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 74, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 57, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 80, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 41, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 56, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 59, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 60, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 47, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 27, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 80, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 48, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 25, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 69, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 44, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 71, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 55, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 65, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 27, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 80, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 75, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 77, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 61, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 50, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 51, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 42, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 45, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 68, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 70, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 37, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 37, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 75, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 31, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 73, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 47, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 21, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 79, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 29, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 64, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 66, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 14, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 54, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 79, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 50, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 17, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 67, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 78, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 33, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 65, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 32, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 19, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 80, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 31, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 19, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 31, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 70, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 2, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 23, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 48, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 44, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 11, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 57, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 42, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 34, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 55, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 67, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 30, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 46, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 79, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 52, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 40, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 17, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 25, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 10, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 64, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 30, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 30, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 64, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 50, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 29, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 25, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 72, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 4, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 2, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 31, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 31, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 10, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 54, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 16, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 75, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 39, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 34, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 2, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 33, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 36, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 74, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 59, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 51, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 45, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 39, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 63, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 10, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 64, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 69, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 28, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 50, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 32, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 35, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 13, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 45, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 69, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 2, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 51, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 76, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 55, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 53, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 31, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 67, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 17, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 68, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 9, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 30, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 73, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 37, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 35, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 53, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 1, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 20, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 13, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 49, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 11, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 77, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 56, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 57, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 63, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 34, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 36, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 26, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 61, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 55, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 17, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 37, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 24, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 70, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 67, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 58, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 37, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 42, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 29, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 8, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 30, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 10, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 5, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 49, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 47, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 71, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 53, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 68, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 26, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 46, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 37, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 25, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 70, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 38, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 8, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 70, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 76, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 79, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 48, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 67, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 15, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 58, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 16, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 39, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 18, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 31, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 17, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 4, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 15, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 21, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 4, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 80, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 31, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 1, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 61, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 30, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 46, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 72, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 3, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 47, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 52, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 79, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 76, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 34, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 18, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 1, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 78, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 55, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 34, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 65, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 66, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 69, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 19, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 54, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 8, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 64, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 77, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 66, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 15, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 55, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 70, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 65, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 4, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 11, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 51, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 73, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 14, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 37, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 12, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 35, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 17, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 35, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 68, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 48, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 28, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 5, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 51, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 15, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 60, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 1, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 53, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 37, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 48, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 57, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 69, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 58, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 20, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 7, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 72, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 48, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 42, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 38, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 47, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 46, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 66, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 11, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 64, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 58, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 34, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 66, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 52, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 46, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 29, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 26, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 10, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 62, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 79, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 79, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 73, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 1, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 71, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 46, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 52, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 55, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 46, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 17, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 12, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 25, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 52, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 63, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 2, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 11, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 36, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 78, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 73, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 22, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 77, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 61, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 18, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 27, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 25, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 28, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 80, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 26, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 21, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 75, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 79, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 10, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 38, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 10, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 18, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 56, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 72, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 8, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 12, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 51, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 36, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 11, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 29, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 66, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 62, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 68, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 72, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 1, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 57, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 34, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 75, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 29, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 25, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 68, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 2, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 39, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 54, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 74, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 13, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 17, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 23, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 14, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 30, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 55, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 49, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 72, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 35, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 63, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 49, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 47, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 74, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 57, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 16, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 68, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 43, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 12, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 15, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 50, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 73, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 51, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 25, new IntPred(0, 23), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 54, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 42, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 62, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 60, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 47, new IntPred(160, 181), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 51, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 30, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 24, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 65, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 45, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 22, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 30, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 80, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 51, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 59, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 66, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 33, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 65, new IntPred(276, 289), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 37, new IntPred(290, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 25, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 44, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 38, new IntPred(61, 107), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 43, new IntPred(108, 112), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 44, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 2, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 58, new IntPred(238, 275), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 17, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 12, new IntPred(290, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 72, new IntPred(0, 23), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 15, new IntPred(24, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 23, new IntPred(61, 107), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 43, new IntPred(108, 112), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 29, new IntPred(113, 159), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 71, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 27, new IntPred(182, 237), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 73, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 54, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 22, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 59, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 7, new IntPred(24, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 78, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 44, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 59, new IntPred(113, 159), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 11, new IntPred(160, 181), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 29, new IntPred(182, 237), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 17, new IntPred(238, 275), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 76, new IntPred(276, 289), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 57, new IntPred(290, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 1, new IntPred(0, 23), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 74, new IntPred(24, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 70, new IntPred(61, 107), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 10, new IntPred(108, 112), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 24, new IntPred(113, 159), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 65, new IntPred(160, 181), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 62, new IntPred(182, 237), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 24, new IntPred(238, 275), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 4, new IntPred(276, 289), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 80, new IntPred(290, null), 'a'));
return trans;
}

}
