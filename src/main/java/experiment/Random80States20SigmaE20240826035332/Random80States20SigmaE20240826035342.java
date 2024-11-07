package experiment.Random80States20SigmaE20240826035332;
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
public class Random80States20SigmaE20240826035342{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 47, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 66, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 53, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 55, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 75, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 75, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 59, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 74, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 39, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 54, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 52, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 73, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 43, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 70, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 23, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 46, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 56, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 52, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 56, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 48, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 72, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 73, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 74, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 41, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 71, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 30, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 50, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 69, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 70, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 66, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 33, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 43, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 67, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 44, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 58, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 48, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 62, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 52, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 75, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 74, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 46, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 68, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 75, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 63, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 60, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 63, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 48, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 57, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 52, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 54, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 70, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 77, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 54, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 66, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 80, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 50, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 73, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 47, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 41, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 42, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 59, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 55, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 78, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 50, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 27, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 29, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 66, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 77, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 68, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 78, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 78, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 66, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 71, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 77, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 22, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 42, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 62, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 47, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 34, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 74, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 54, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 44, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 63, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 48, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 68, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 79, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 52, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 63, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 58, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 59, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 80, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 45, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 52, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 32, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 29, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 50, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 53, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 44, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 42, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 61, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 59, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 76, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 59, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 78, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 41, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 70, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 71, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 77, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 57, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 47, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 79, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 72, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 65, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 71, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 49, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 75, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 74, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 73, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 53, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 30, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 40, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 80, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 58, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 41, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 62, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 73, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 80, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 66, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 45, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 70, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 75, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 43, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 49, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 64, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 69, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 78, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 69, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 54, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 68, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 52, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 49, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 50, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 42, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 68, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 69, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 21, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 76, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 79, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 63, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 45, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 41, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 63, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 64, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 57, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 48, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 53, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 55, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 62, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 53, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 34, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 65, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 43, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 71, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 56, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 37, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 54, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 41, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 31, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 48, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 69, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 48, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 43, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 48, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 72, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 53, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 55, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 53, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 48, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 64, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 42, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 44, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 54, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 51, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 49, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 49, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 75, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 64, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 52, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 50, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 60, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 64, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 57, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 51, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 50, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 50, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 76, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 70, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 78, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 78, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 80, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 61, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 2, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 41, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 67, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 78, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 74, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 17, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 52, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 44, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 31, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 80, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 12, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 71, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 42, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 50, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 72, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 64, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 67, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 77, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 80, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 80, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 59, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 80, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 52, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 68, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 42, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 68, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 61, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 54, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 69, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 44, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 31, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 63, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 44, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 49, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 73, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 49, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 58, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 47, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 46, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 61, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 79, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 20, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 64, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 46, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 67, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 77, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 38, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 66, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 29, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 27, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 23, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 58, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 55, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 74, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 22, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 12, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 33, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 25, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 45, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 52, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 53, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 46, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 63, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 78, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 61, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 77, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 43, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 65, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 73, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 12, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 74, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 47, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 54, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 49, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 62, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 66, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 61, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 65, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 77, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 73, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 72, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 46, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 38, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 74, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 79, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 45, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 69, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 70, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 64, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 61, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 43, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 78, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 65, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 51, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 48, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 62, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 63, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 76, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 66, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 47, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 60, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 79, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 7, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 44, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 76, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 61, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 48, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 63, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 31, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 45, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 59, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 51, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 76, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 68, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 78, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 43, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 52, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 58, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 57, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 58, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 43, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 51, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 66, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 30, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 31, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 42, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 42, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 80, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 25, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 75, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 70, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 77, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 8, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 65, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 24, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 62, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 60, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 76, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 63, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 12, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 79, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 61, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 60, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 15, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 42, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 70, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 7, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 75, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 12, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 64, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 3, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 60, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 78, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 75, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 66, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 44, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 74, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 60, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 49, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 64, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 66, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 45, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 71, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 24, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 49, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 70, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 73, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 60, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 78, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 59, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 57, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 66, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 79, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 52, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 62, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 79, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 41, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 43, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 12, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 53, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 20, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 48, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 69, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 57, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 60, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 16, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 22, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 73, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 58, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 18, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 72, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 44, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 60, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 77, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 53, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 63, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 40, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 66, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 48, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 54, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 48, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 75, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 80, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 62, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 77, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 8, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 14, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 71, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 55, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 11, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 59, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 64, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 19, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 66, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 56, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 45, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 48, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 3, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 79, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 38, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 31, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 68, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 49, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 29, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 11, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 33, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 18, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 52, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 37, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 34, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 19, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 57, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 11, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 23, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 14, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 49, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 3, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 60, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 28, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 39, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 43, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 53, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 39, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 66, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 1, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 19, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 52, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 13, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 28, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 49, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 51, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 10, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 49, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 25, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 17, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 45, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 49, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 30, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 23, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 8, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 48, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 1, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 44, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 14, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 62, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 31, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 16, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 51, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 78, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 58, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 62, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 80, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 7, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 30, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 13, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 44, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 5, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 77, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 62, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 56, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 11, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 38, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 49, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 17, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 70, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 12, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 71, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 4, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 71, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 80, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 20, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 4, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 10, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 11, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 40, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 48, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 30, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 26, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 73, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 39, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 12, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 74, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 65, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 15, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 29, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 11, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 31, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 37, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 69, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 26, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 58, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 18, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 16, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 45, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 38, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 57, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 70, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 36, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 62, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 72, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 56, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 23, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 36, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 50, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 44, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 22, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 47, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 9, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 31, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 1, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 4, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 77, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 73, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 46, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 54, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 69, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 59, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 75, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 70, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 39, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 18, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 47, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 76, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 15, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 50, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 27, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 20, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 8, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 43, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 57, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 47, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 33, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 26, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 29, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 28, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 67, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 50, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 80, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 8, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 37, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 5, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 60, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 24, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 69, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 45, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 42, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 5, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 29, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 48, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 50, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 79, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 70, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 51, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 43, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 12, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 15, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 80, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 27, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 5, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 70, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 27, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 52, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 25, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 46, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 18, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 15, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 67, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 13, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 80, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 25, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 77, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 39, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 57, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 30, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 46, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 11, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 60, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 75, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 70, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 30, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 5, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 11, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 5, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 45, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 48, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 14, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 53, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 31, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 53, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 49, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 74, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 67, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 52, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 8, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 1, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 4, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 71, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 67, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 17, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 38, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 5, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 27, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 30, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 39, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 59, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 19, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 19, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 49, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 67, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 73, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 53, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 30, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 21, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 27, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 69, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 11, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 68, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 32, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 56, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 45, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 8, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 77, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 2, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 8, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 35, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 14, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 50, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 3, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 71, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 33, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 42, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 7, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 68, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 29, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 28, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 39, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 70, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 29, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 36, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 74, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 48, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 32, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 28, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 61, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 67, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 18, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 43, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 21, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 10, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 21, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 2, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 21, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 75, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 72, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 43, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 39, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 68, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 65, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 58, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 64, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 63, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 20, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 77, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 62, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 64, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 75, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 14, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 11, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 29, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 45, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 41, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 16, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 9, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 55, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 21, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 25, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 57, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 68, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 69, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 40, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 18, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 2, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 44, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 67, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 80, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 77, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 67, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 42, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 60, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 72, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 47, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 51, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 47, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 56, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 14, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 20, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 13, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 64, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 53, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 80, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 4, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 30, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 17, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 35, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 23, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 49, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 46, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 48, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 66, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 19, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 65, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 44, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 1, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 41, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 49, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 51, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 35, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 5, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 37, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 18, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 42, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 12, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 27, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 53, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 17, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 61, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 12, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 71, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 28, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 45, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 60, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 16, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 24, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 41, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 12, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 58, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 74, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 6, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 23, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 41, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 67, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 21, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 36, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 27, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 30, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 50, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 17, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 39, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 78, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 50, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 71, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 48, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 3, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 34, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 10, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 34, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 35, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 77, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 8, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 33, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 34, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 68, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 7, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 14, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 28, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 37, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 56, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 35, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 24, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 38, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 72, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 51, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 4, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 56, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 11, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 61, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 77, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 38, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 49, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 40, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 38, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 21, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 4, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 70, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 77, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 20, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 53, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 66, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 11, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 43, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 51, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 67, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 34, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 61, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 21, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 25, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 62, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 7, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 61, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 61, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 55, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 16, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 69, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 50, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 43, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 25, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 51, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 53, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 28, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 70, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 5, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 43, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 15, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 72, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 12, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 57, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 64, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 75, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 40, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 56, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 23, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 62, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 11, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 56, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 71, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 1, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 78, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 48, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 25, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 23, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 39, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 37, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 13, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 54, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 71, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 57, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 10, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 60, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 40, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 5, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 62, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 13, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 15, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 67, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 35, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 38, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 70, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 29, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 50, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 11, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 50, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 57, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 3, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 7, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 69, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 28, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 48, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 76, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 18, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 10, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 69, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 17, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 63, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 73, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 23, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 64, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 72, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 19, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 33, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 58, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 70, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 22, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 23, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 74, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 38, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 23, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 43, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 48, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 68, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 12, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 35, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 75, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 7, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 39, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 38, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 7, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 70, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 23, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 62, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 46, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 64, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 16, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 76, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 48, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 68, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 6, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 13, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 9, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 47, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 73, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 9, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 43, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 4, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 2, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 2, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 38, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 67, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 4, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 52, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 18, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 29, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 36, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 65, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 59, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 67, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 36, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 26, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 42, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 51, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 5, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 75, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 45, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 61, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 32, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 44, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 10, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 72, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 64, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 60, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 57, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 71, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 9, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 5, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 26, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 25, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 10, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 73, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 12, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 70, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 7, new IntPred(570, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 34, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 17, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 17, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 69, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 61, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 38, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 39, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 21, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 39, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 75, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 53, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 50, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 19, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 48, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 58, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 1, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 64, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 32, new IntPred(520, 562), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 3, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 35, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 69, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 52, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 79, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 68, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 77, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 75, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 25, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 40, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 48, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 49, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 32, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 72, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 58, new IntPred(310, 387), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 10, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 9, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 4, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 10, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 50, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 39, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 4, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 79, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 20, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 46, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 40, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 51, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 63, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 67, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 9, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 77, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 46, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 39, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 53, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 33, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 46, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 51, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 6, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 22, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 25, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 79, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 37, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 57, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 23, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 78, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 69, new IntPred(0, 83), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 17, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 7, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 27, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 18, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 1, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 3, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 62, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 52, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 50, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 78, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 70, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 11, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 27, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 54, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 63, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 66, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 11, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 20, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 27, new IntPred(869, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 13, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 26, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 8, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 10, new IntPred(157, 201), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 61, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 45, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 15, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 36, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 56, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 49, new IntPred(455, 459), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 79, new IntPred(460, 519), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 58, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 51, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 29, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 71, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 10, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 58, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 50, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 65, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 42, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 68, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 60, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 2, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 58, new IntPred(157, 201), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 49, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 47, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 22, new IntPred(289, 309), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 4, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 29, new IntPred(388, 454), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 44, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 70, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 61, new IntPred(520, 562), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 44, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 75, new IntPred(570, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 51, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 51, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 14, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 1, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 26, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 14, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 42, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 41, new IntPred(84, 109), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 15, new IntPred(110, 156), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 33, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 4, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 76, new IntPred(283, 288), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 20, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 55, new IntPred(310, 387), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 56, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 75, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 1, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 40, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 46, new IntPred(563, 569), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 49, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 59, new IntPred(600, 687), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 35, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 38, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 67, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 63, new IntPred(867, 868), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 67, new IntPred(869, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 75, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 17, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 5, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 77, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 34, new IntPred(202, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 20, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 63, new IntPred(289, 309), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 77, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 25, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(455, 459), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 25, new IntPred(460, 519), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 58, new IntPred(563, 569), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 17, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 24, new IntPred(600, 687), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 49, new IntPred(688, 747), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 23, new IntPred(748, 804), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 15, new IntPred(805, 866), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 29, new IntPred(867, 868), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 18, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 61, new IntPred(0, 83), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 27, new IntPred(84, 109), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 49, new IntPred(110, 156), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 71, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 3, new IntPred(202, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 50, new IntPred(283, 288), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 40, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 50, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 25, new IntPred(388, 454), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 23, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 64, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 60, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 76, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 58, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 32, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 58, new IntPred(688, 747), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 46, new IntPred(748, 804), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 21, new IntPred(805, 866), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 75, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 74, new IntPred(869, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 79, new IntPred(0, 83), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 74, new IntPred(84, 109), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 44, new IntPred(110, 156), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 36, new IntPred(157, 201), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 73, new IntPred(202, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 8, new IntPred(283, 288), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 58, new IntPred(289, 309), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 74, new IntPred(310, 387), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 77, new IntPred(388, 454), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 21, new IntPred(455, 459), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 3, new IntPred(460, 519), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 58, new IntPred(520, 562), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 56, new IntPred(563, 569), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 52, new IntPred(570, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(600, 687), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 24, new IntPred(688, 747), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 18, new IntPred(748, 804), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 30, new IntPred(805, 866), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 74, new IntPred(867, 868), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 54, new IntPred(869, null), 'b'));
return trans;
}

}
