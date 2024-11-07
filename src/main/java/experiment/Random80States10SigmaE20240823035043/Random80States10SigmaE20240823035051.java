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
public class Random80States10SigmaE20240823035051{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 57, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 62, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 51, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 45, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 56, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 75, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 52, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 74, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 79, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 74, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 66, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 75, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 46, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 61, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 63, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 46, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 70, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 60, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 78, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 67, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 59, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 71, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 46, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 74, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 74, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 28, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 57, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 25, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 48, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 39, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 61, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 40, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 49, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 77, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 52, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 70, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 56, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 70, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 76, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 61, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 64, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 64, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 64, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 48, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 43, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 76, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 49, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 50, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 60, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 65, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 73, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 56, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 63, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 68, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 39, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 60, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 71, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 76, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 46, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 72, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 76, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 33, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 42, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 23, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 80, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 48, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 78, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 46, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 77, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 46, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 68, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 60, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 46, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 22, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 60, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 35, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 66, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 66, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 72, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 74, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 47, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 73, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 77, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 5, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 72, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 52, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 77, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 76, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 45, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 77, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 62, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 49, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 29, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 41, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 42, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 79, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 78, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 58, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 47, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 38, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 59, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 70, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 20, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 65, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 47, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 46, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 52, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 29, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 63, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 59, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 34, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 66, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 43, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 65, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 79, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 67, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 59, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 59, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 70, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 6, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 63, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 57, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 69, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 62, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 52, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 58, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 67, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 67, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 68, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 39, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 48, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 7, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 16, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 43, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 16, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 63, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 51, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 80, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 41, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 65, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 44, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 14, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 57, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 17, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 59, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 49, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 69, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 72, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 46, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 55, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 42, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 57, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 15, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 11, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 44, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 79, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 70, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 78, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 57, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 56, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 16, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 72, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 79, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 47, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 66, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 62, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 64, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 63, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 51, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 75, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 74, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 53, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 75, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 49, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 41, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 32, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 80, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 50, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 41, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 57, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 68, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 79, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 13, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 36, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 25, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 27, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 67, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 32, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 78, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 16, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 80, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 51, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 6, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 41, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 80, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 17, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 20, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 11, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 73, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 59, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 61, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 27, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 74, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 51, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 78, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 71, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 42, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 34, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 48, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 72, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 20, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 37, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 58, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 30, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 8, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 58, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 71, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 7, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 61, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 7, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 3, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 72, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 62, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 47, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 44, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 16, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 61, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 12, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 60, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 72, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 4, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 67, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 80, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 6, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 8, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 31, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 24, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 56, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 49, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 5, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 22, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 4, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 38, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 75, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 49, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 13, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 59, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 20, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 78, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 52, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 28, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 70, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 79, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 45, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 65, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 63, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 79, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 69, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 39, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 26, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 79, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 2, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 32, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 20, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 13, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 38, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 20, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 68, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 47, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 28, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 71, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 24, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 39, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 25, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 8, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 29, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 46, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 77, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 14, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 38, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 74, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 2, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 27, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 1, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 58, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 57, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 43, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 72, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 38, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 49, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 67, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 59, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 17, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 34, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 68, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 71, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 9, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 54, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 52, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 67, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 15, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 80, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 17, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 65, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 28, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 7, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 29, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 67, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 4, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 28, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 45, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 71, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 74, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 46, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 63, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 9, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 6, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 59, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 29, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 39, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 69, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 54, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 21, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 52, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 56, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 27, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 72, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 74, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 37, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 49, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 50, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 60, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 61, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 10, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 41, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 8, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 10, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 15, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 12, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 7, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 32, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 70, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 35, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 26, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 61, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 62, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 35, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 60, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 74, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 64, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 73, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 20, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 41, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 29, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 60, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 17, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 7, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 36, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 77, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 46, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 73, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 74, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 55, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 77, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 80, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 65, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 1, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 14, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 23, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 4, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 57, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 71, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 71, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 56, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 58, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 61, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 18, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 4, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 36, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 34, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 4, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 9, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 39, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 71, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 6, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 59, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 51, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 35, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 25, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 18, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 78, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 19, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 57, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 7, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 8, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 43, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 61, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 27, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 35, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 64, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 77, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 36, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 43, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 79, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 13, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 60, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 80, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 51, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 20, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 79, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 40, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 78, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 35, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 4, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 2, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 60, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 57, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 29, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 56, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 52, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 44, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 4, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 23, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 44, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 18, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 45, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 28, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 59, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 56, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 61, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 50, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 13, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 2, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 33, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 40, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 20, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 42, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 46, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 2, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 38, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 5, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 52, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 54, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 62, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 13, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 4, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 75, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 13, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 26, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 79, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 69, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 65, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 23, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 17, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 4, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 49, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 6, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 31, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 35, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 15, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 23, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 7, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 54, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 2, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 2, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 4, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 14, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 73, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 4, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 60, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 68, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 73, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 9, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 59, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 68, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 71, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 24, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 79, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 17, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 68, new IntPred(235, 259), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 1, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 43, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 9, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 74, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 32, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 16, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 3, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 62, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 73, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 54, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 2, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 46, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 27, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 65, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 1, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 66, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 48, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 62, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 70, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 61, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 57, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 5, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 33, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 27, new IntPred(475, 544), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 35, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 54, new IntPred(0, 50), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 75, new IntPred(51, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 34, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 22, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 78, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 73, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 3, new IntPred(288, 384), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 2, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 33, new IntPred(475, 544), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 57, new IntPred(545, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 71, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 66, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(122, 185), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(186, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 19, new IntPred(235, 259), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 42, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 32, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 69, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 70, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 57, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 47, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 56, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(186, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 7, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 38, new IntPred(260, 287), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 11, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 16, new IntPred(385, 474), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 33, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 10, new IntPred(545, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 27, new IntPred(0, 50), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 4, new IntPred(51, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 72, new IntPred(122, 185), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 3, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 79, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 14, new IntPred(260, 287), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 56, new IntPred(288, 384), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 71, new IntPred(385, 474), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 17, new IntPred(545, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 22, new IntPred(0, 50), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(51, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 45, new IntPred(122, 185), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 22, new IntPred(186, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 49, new IntPred(235, 259), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 13, new IntPred(260, 287), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 54, new IntPred(288, 384), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(385, 474), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 50, new IntPred(475, 544), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(545, null), 'b'));
return trans;
}

}
