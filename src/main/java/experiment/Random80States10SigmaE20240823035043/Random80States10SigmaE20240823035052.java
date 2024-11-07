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
public class Random80States10SigmaE20240823035052{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 58, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 51, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 69, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 49, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 52, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 47, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 66, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 50, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 77, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 33, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 61, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 53, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 78, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 58, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 57, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 54, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 72, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 70, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 63, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 44, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 56, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 47, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 67, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 65, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 59, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 59, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 27, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 42, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 57, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 44, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 62, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 47, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 35, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 50, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 64, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 75, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 43, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 53, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 65, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 63, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 75, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 60, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 46, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 63, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 48, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 54, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 63, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 60, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 66, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 64, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 76, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 50, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 64, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 56, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 57, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 41, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 65, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 25, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 67, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 41, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 60, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 77, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 57, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 80, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 53, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 58, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 58, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 52, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 64, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 51, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 73, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 46, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 74, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 40, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 45, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 66, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 43, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 68, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 55, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 56, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 61, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 58, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 78, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 71, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 43, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 44, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 72, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 52, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 50, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 73, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 76, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 68, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 38, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 63, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 51, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 61, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 62, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 44, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 34, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 78, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 65, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 53, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 42, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 62, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 59, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 38, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 25, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 80, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 50, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 68, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 75, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 42, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 40, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 45, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 49, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 50, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 43, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 69, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 51, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 47, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 36, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 7, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 72, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 60, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 67, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 65, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 50, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 74, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 65, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 78, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 55, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 49, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 76, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 69, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 41, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 75, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 61, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 37, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 65, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 59, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 57, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 49, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 44, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 61, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 70, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 63, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 12, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 60, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 54, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 45, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 63, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 1, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 76, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 69, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 62, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 15, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 79, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 77, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 46, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 79, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 52, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 68, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 76, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 46, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 42, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 29, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 79, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 52, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 52, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 63, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 70, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 63, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 79, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 61, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 46, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 75, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 3, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 78, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 58, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 69, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 44, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 50, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 80, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 67, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 55, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 63, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 64, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 47, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 44, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 76, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 61, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 76, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 48, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 61, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 76, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 52, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 42, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 70, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 54, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 51, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 74, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 75, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 60, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 46, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 43, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 61, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 77, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 46, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 69, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 77, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 30, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 15, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 45, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 14, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 6, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 73, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 24, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 39, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 28, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 72, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 55, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 79, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 28, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 23, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 1, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 67, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 12, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 37, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 27, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 10, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 61, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 17, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 63, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 6, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 55, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 32, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 38, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 67, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 78, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 50, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 49, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 5, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 1, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 41, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 27, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 71, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 5, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 4, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 80, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 55, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 49, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 38, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 61, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 19, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 72, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 75, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 47, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 58, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 53, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 40, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 56, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 74, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 33, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 74, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 46, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 29, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 26, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 72, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 60, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 76, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 5, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 62, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 54, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 1, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 72, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 24, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 21, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 25, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 67, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 21, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 45, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 18, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 75, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 23, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 32, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 68, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 16, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 76, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 60, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 32, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 76, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 9, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 55, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 49, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 18, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 46, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 67, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 12, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 64, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 54, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 41, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 17, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 5, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 63, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 41, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 63, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 10, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 52, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 39, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 46, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 12, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 16, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 9, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 16, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 63, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 23, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 38, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 21, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 30, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 36, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 32, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 7, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 31, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 16, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 17, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 43, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 4, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 26, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 15, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 77, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 22, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 73, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 38, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 10, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 47, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 71, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 46, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 46, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 17, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 77, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 25, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 3, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 45, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 16, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 32, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 12, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 22, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 45, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 67, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 40, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 35, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 72, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 35, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 29, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 72, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 16, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 79, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 49, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 18, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 32, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 68, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 37, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 42, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 76, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 21, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 48, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 64, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 67, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 2, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 71, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 1, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 12, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 68, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 71, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 66, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 11, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 76, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 22, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 4, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 27, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 9, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 71, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 32, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 18, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 20, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 58, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 2, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 4, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 68, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 80, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 52, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 52, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 10, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 44, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 18, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 41, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 42, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 72, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 73, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 5, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 19, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 45, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 32, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 31, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 27, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 3, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 79, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 21, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 5, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 78, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 46, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 62, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 9, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 40, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 33, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 9, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 70, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 22, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 39, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 65, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 9, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 71, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 71, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 26, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 6, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 54, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 19, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 50, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 27, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 69, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 38, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 51, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 1, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 50, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 39, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 13, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 60, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 20, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 22, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 40, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 12, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 60, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 43, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 44, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 70, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 76, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 54, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 72, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 39, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 72, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 72, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 30, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 64, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 48, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 13, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 29, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 63, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 46, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 24, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 22, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 46, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 72, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 7, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 53, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 32, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 73, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 4, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 49, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 3, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 42, new IntPred(0, 60), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 26, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 73, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 49, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 76, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 72, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 56, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 72, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 62, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 24, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 9, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 24, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 54, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 64, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 43, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 72, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 56, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 46, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 66, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 78, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 73, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 29, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 79, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 22, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 33, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 26, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 23, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 17, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 17, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 58, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 27, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 49, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 71, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 1, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 80, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 23, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 57, new IntPred(384, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 78, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 66, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 61, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 22, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 73, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 68, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 8, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 24, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 67, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 70, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 23, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 34, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 25, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 46, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 51, new IntPred(189, 246), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 17, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 64, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 1, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 29, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 71, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 9, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 40, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 70, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 41, new IntPred(189, 246), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 20, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 72, new IntPred(281, 357), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 74, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 62, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 68, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 71, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 70, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 19, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 56, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 73, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 9, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 6, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 78, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 48, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 37, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(97, 113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 14, new IntPred(114, 188), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 73, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 67, new IntPred(247, 271), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 60, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 53, new IntPred(281, 357), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 57, new IntPred(358, 383), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 5, new IntPred(384, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 27, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 28, new IntPred(61, 96), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 49, new IntPred(97, 113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 72, new IntPred(114, 188), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 5, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 67, new IntPred(247, 271), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 42, new IntPred(272, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 17, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 49, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 70, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 40, new IntPred(0, 60), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 1, new IntPred(61, 96), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 80, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 73, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 25, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 67, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 28, new IntPred(272, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 61, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 69, new IntPred(358, 383), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 10, new IntPred(384, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 10, new IntPred(0, 60), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 74, new IntPred(61, 96), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 77, new IntPred(97, 113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 54, new IntPred(114, 188), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 74, new IntPred(189, 246), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 37, new IntPred(247, 271), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 61, new IntPred(272, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 13, new IntPred(281, 357), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(358, 383), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 41, new IntPred(384, null), 'c'));
return trans;
}

}
