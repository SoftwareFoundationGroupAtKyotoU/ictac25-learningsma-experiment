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
public class Random80States10SigmaE20240823035044{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 62, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 68, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 51, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 58, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 70, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 45, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 53, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 49, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 51, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 77, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 66, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 76, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 71, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 58, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 69, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 63, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 38, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 78, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 76, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 60, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 68, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 49, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 70, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 67, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 76, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 48, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 53, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 77, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 65, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 66, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 69, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 59, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 66, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 73, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 74, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 48, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 45, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 73, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 45, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 52, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 79, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 72, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 72, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 43, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 57, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 54, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 67, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 79, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 71, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 25, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 56, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 41, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 55, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 57, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 48, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 56, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 63, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 74, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 52, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 74, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 74, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 79, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 67, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 51, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 34, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 57, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 77, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 21, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 61, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 76, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 57, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 56, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 43, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 72, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 73, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 53, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 78, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 69, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 69, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 35, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 69, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 49, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 57, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 73, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 77, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 70, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 51, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 59, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 64, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 74, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 80, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 43, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 34, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 70, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 50, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 62, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 42, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 65, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 42, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 53, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 47, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 60, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 67, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 25, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 56, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 65, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 64, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 22, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 46, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 21, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 43, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 63, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 40, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 51, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 54, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 73, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 58, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 60, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 76, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 58, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 12, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 27, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 49, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 62, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 69, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 64, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 7, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 34, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 51, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 49, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 60, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 48, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 61, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 60, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 44, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 64, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 48, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 61, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 63, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 45, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 44, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 60, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 66, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 56, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 73, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 43, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 78, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 61, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 65, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 16, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 69, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 72, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 32, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 47, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 78, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 56, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 52, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 18, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 16, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 38, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 58, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 50, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 13, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 53, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 52, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 63, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 68, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 66, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 64, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 63, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 58, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 59, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 54, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 59, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 43, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 48, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 55, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 77, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 55, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 74, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 65, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 68, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 16, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 77, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 58, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 2, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 47, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 57, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 52, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 24, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 40, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 58, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 61, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 79, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 25, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 78, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 44, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 58, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 46, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 77, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 44, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 47, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 80, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 62, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 56, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 29, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 23, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 39, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 74, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 51, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 25, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 10, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 72, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 59, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 52, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 70, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 65, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 73, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 74, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 53, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 56, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 42, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 16, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 50, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 69, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 73, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 18, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 24, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 15, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 44, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 70, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 6, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 64, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 27, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 28, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 2, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 48, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 69, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 44, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 66, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 69, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 24, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 61, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 16, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 41, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 19, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 35, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 44, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 27, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 56, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 40, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 58, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 77, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 43, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 70, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 65, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 34, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 58, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 33, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 31, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 5, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 50, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 9, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 29, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 29, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 47, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 68, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 68, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 40, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 20, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 14, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 50, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 35, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 20, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 21, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 18, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 14, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 23, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 43, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 5, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 60, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 53, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 36, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 27, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 24, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 3, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 10, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 47, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 14, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 1, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 68, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 5, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 22, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 54, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 7, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 45, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 61, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 53, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 69, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 9, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 52, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 30, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 75, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 13, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 9, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 31, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 58, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 65, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 61, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 6, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 52, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 28, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 20, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 54, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 28, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 9, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 67, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 51, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 10, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 5, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 32, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 33, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 20, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 78, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 5, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 56, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 22, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 21, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 29, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 66, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 74, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 60, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 21, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 59, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 64, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 60, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 32, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 55, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 2, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 48, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 77, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 76, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 78, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 35, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 71, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 46, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 60, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 66, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 29, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 63, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 32, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 38, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 77, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 40, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 18, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 10, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 55, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 21, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 76, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 41, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 78, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 34, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 24, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 66, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 70, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 62, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 69, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 21, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 59, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 18, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 4, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 27, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 17, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 50, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 20, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 53, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 6, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 77, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 3, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 57, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 2, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 30, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 36, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 3, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 19, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 67, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 49, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 17, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 73, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 5, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 34, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 22, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 31, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 69, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 67, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 70, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 60, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 43, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 61, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 65, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 32, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 27, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 63, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 21, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 46, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 40, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 20, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 73, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 59, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 13, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 45, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 23, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 1, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 25, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 41, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 35, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 2, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 43, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 12, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 51, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 72, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 48, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 44, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 21, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 21, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 21, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 40, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 12, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 62, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 60, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 76, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 7, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 18, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 7, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 23, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 3, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 37, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 70, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 2, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 79, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 19, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 33, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 53, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 6, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 80, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 23, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 80, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 72, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 60, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 79, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 62, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 54, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 46, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 22, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 57, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 58, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 6, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 19, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 3, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 71, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 62, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 25, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 17, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 36, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 68, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 16, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 70, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 38, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 34, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 43, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 13, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 36, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 10, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 80, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 65, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 13, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 66, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 78, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 67, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 9, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 60, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 75, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 59, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 33, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 25, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 30, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 7, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 67, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 58, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 13, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 23, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 75, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 10, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 47, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 4, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 21, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 30, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 27, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 25, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 4, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 16, new IntPred(167, 243), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 77, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 73, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 43, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 51, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 58, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 75, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 29, new IntPred(121, 132), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 45, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 1, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 67, new IntPred(244, 272), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 61, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 55, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 33, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 71, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 56, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 71, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 41, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 52, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 51, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 13, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 20, new IntPred(320, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 2, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 71, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 23, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 26, new IntPred(116, 120), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 72, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 29, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 8, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 70, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 34, new IntPred(273, 319), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 34, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 32, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 22, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 9, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 4, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 20, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 27, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 50, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 44, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 78, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 73, new IntPred(0, 18), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 79, new IntPred(19, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 79, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 26, new IntPred(116, 120), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 19, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 14, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 8, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 34, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 7, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 4, new IntPred(0, 18), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 78, new IntPred(56, 115), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 49, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 65, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 3, new IntPred(133, 166), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 11, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 69, new IntPred(244, 272), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 80, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 80, new IntPred(320, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 32, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 33, new IntPred(19, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 20, new IntPred(56, 115), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 65, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(121, 132), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 18, new IntPred(133, 166), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 65, new IntPred(167, 243), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 52, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(273, 319), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 24, new IntPred(320, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 77, new IntPred(0, 18), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 12, new IntPred(19, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 4, new IntPred(56, 115), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 21, new IntPred(116, 120), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 17, new IntPred(121, 132), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 75, new IntPred(133, 166), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 11, new IntPred(167, 243), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 14, new IntPred(244, 272), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 8, new IntPred(273, 319), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 70, new IntPred(320, null), 'c'));
return trans;
}

}
