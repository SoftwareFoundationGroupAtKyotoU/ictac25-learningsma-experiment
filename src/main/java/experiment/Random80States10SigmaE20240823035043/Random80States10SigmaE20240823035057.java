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
public class Random80States10SigmaE20240823035057{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 78, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 58, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 25, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 78, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 53, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 46, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 23, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 43, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 64, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 42, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 74, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 59, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 63, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 57, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 68, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 75, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 68, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 70, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 55, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 39, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 65, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 67, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 75, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 31, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 28, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 50, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 61, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 79, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 65, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 50, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 57, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 60, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 72, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 60, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 70, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 79, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 75, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 41, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 75, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 65, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 77, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 59, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 69, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 56, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 75, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 70, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 61, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 43, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 30, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 55, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 74, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 77, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 47, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 70, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 47, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 30, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 48, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 61, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 62, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 50, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 59, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 53, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 66, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 73, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 32, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 60, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 55, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 37, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 46, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 51, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 57, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 79, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 69, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 70, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 76, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 60, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 46, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 54, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 66, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 73, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 53, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 68, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 53, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 62, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 43, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 69, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 75, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 42, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 45, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 76, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 21, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 59, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 68, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 55, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 63, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 58, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 63, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 50, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 79, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 7, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 64, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 68, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 68, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 64, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 44, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 64, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 47, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 54, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 67, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 44, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 79, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 76, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 19, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 47, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 46, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 60, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 48, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 59, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 71, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 47, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 42, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 21, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 72, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 32, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 29, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 46, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 44, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 22, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 12, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 75, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 47, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 75, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 49, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 43, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 54, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 65, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 74, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 51, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 65, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 30, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 61, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 44, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 60, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 59, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 61, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 43, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 19, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 66, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 51, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 57, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 71, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 53, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 71, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 61, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 44, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 45, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 78, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 60, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 41, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 26, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 14, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 68, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 47, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 53, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 40, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 43, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 69, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 76, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 52, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 61, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 49, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 52, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 58, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 66, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 68, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 42, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 62, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 76, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 79, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 30, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 61, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 54, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 75, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 63, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 20, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 78, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 46, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 53, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 57, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 71, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 62, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 47, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 61, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 59, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 60, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 48, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 32, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 45, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 72, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 45, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 62, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 14, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 45, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 55, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 51, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 67, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 20, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 21, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 5, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 41, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 31, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 50, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 60, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 14, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 23, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 31, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 15, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 4, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 25, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 80, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 28, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 73, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 42, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 28, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 42, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 29, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 27, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 12, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 49, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 56, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 21, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 51, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 21, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 57, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 30, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 49, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 8, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 27, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 42, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 16, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 24, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 14, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 36, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 48, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 33, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 41, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 80, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 63, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 54, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 20, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 47, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 49, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 43, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 27, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 70, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 7, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 54, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 41, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 29, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 24, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 15, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 78, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 61, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 27, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 15, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 57, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 65, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 27, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 68, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 78, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 21, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 1, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 59, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 74, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 77, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 36, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 25, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 31, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 62, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 18, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 45, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 73, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 56, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 74, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 11, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 4, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 60, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 42, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 62, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 67, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 38, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 13, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 74, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 58, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 34, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 20, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 58, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 16, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 73, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 48, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 19, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 7, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 30, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 73, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 31, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 66, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 4, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 3, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 17, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 26, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 19, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 13, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 54, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 12, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 17, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 31, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 13, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 30, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 79, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 51, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 42, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 48, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 25, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 24, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 43, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 66, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 40, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 32, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 30, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 68, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 47, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 66, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 52, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 46, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 60, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 39, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 18, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 56, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 14, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 2, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 15, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 76, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 33, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 23, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 63, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 47, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 50, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 61, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 7, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 9, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 46, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 45, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 30, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 3, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 32, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 31, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 14, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 11, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 22, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 68, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 41, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 14, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 69, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 78, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 64, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 41, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 36, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 6, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 2, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 55, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 4, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 74, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 30, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 12, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 60, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 9, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 43, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 79, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 21, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 16, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 4, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 21, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 39, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 47, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 66, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 57, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 58, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 7, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 60, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 53, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 54, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 76, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 45, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 71, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 76, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 7, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 4, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 55, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 72, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 27, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 21, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 34, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 79, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 26, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 39, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 66, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 73, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 10, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 17, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 7, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 61, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 68, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 46, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 66, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 72, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 63, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 57, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 37, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 6, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 57, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 65, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 52, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 55, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 78, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 70, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 38, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 75, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 46, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 57, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 51, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 38, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 43, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 15, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 55, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 12, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 8, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 46, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 78, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 5, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 27, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 46, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 5, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 42, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 43, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 31, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 21, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 1, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 44, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 45, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 11, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 67, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 68, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 55, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 4, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 16, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 59, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 61, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 45, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 67, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 41, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 59, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 55, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 34, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 26, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 20, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 27, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 33, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 47, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 45, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 73, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 9, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 74, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 22, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 42, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 80, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 8, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 68, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 62, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 77, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 2, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 39, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 6, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 46, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 43, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 2, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 52, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 51, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 9, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 70, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 47, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 31, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 60, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 68, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 37, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 11, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 75, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 77, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 35, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 12, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 33, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 17, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 71, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 5, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 74, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 29, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 72, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 3, new IntPred(367, 373), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 31, new IntPred(374, 424), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 31, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 27, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 68, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 77, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 55, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 23, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 59, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 35, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 72, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 51, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 9, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 4, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 20, new IntPred(0, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 76, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 53, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 50, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 36, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 28, new IntPred(311, 366), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 37, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 19, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 46, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 52, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 66, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 80, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 34, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 48, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 18, new IntPred(425, 468), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 33, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 8, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 18, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 66, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 15, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 20, new IntPred(264, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 14, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 6, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 42, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 17, new IntPred(425, 468), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 8, new IntPred(469, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 52, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 52, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 3, new IntPred(114, 170), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 58, new IntPred(171, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 15, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(367, 373), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(374, 424), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 62, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 4, new IntPred(469, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 63, new IntPred(0, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 74, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 11, new IntPred(114, 170), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(171, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 12, new IntPred(264, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 56, new IntPred(311, 366), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 33, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 51, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 50, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 76, new IntPred(469, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 77, new IntPred(0, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 51, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 15, new IntPred(114, 170), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 27, new IntPred(171, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 30, new IntPred(264, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 22, new IntPred(311, 366), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 3, new IntPred(367, 373), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 76, new IntPred(374, 424), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 69, new IntPred(425, 468), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 10, new IntPred(469, null), 'a'));
return trans;
}

}
