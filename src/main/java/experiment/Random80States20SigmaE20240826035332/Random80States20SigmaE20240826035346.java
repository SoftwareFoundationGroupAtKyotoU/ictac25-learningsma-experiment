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
public class Random80States20SigmaE20240826035346{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 48, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 65, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 79, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 77, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 57, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 77, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 58, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 71, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 32, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 66, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 58, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 65, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 67, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 73, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 54, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 74, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 54, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 46, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 77, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 76, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 41, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 55, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 72, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 70, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 50, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 43, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 65, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 63, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 56, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 65, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 50, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 70, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 68, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 53, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 63, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 55, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 55, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 56, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 55, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 42, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 61, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 66, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 60, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 42, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 68, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 32, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 60, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 65, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 77, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 74, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 28, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 61, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 63, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 47, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 78, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 68, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 58, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 80, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 72, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 80, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 62, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 44, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 79, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 64, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 55, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 52, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 40, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 80, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 74, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 64, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 57, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 65, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 48, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 79, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 45, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 80, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 47, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 73, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 57, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 78, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 51, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 62, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 46, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 77, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 57, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 68, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 77, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 58, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 78, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 69, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 45, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 56, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 80, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 58, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 46, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 49, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 46, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 50, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 69, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 67, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 45, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 73, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 52, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 62, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 68, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 53, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 62, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 78, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 67, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 56, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 51, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 58, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 49, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 65, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 74, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 73, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 75, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 75, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 80, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 25, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 78, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 45, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 30, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 62, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 56, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 68, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 74, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 41, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 60, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 59, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 54, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 65, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 58, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 27, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 58, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 62, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 56, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 47, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 38, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 73, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 62, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 73, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 78, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 80, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 49, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 41, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 75, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 68, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 75, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 65, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 31, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 77, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 78, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 77, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 72, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 56, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 74, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 40, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 52, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 44, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 43, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 66, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 70, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 59, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 66, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 54, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 51, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 55, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 60, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 62, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 36, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 50, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 63, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 60, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 30, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 27, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 48, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 54, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 79, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 43, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 51, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 62, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 43, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 61, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 67, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 58, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 64, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 52, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 59, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 54, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 67, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 79, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 42, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 79, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 77, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 63, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 51, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 70, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 74, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 59, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 60, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 50, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 54, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 69, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 71, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 74, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 50, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 68, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 53, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 20, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 15, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 58, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 74, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 59, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 52, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 77, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 43, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 64, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 79, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 39, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 51, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 11, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 42, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 64, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 58, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 48, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 61, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 68, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 56, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 45, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 35, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 43, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 64, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 6, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 42, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 66, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 52, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 53, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 80, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 31, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 68, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 12, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 79, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 27, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 60, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 43, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 30, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 67, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 78, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 23, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 40, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 52, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 59, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 53, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 69, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 45, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 42, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 41, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 52, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 56, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 49, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 1, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 62, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 50, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 52, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 78, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 45, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 79, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 65, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 50, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 77, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 44, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 57, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 68, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 42, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 58, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 50, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 71, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 80, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 31, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 62, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 44, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 68, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 80, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 48, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 45, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 46, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 19, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 76, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 17, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 60, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 69, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 20, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 45, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 78, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 74, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 62, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 77, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 80, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 75, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 54, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 60, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 49, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 65, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 45, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 69, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 47, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 73, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 43, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 7, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 42, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 52, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 64, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 58, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 53, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 78, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 40, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 13, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 76, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 74, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 70, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 61, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 74, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 68, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 31, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 46, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 55, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 54, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 47, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 55, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 66, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 63, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 23, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 77, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 30, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 51, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 41, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 54, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 46, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 69, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 78, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 53, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 42, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 58, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 49, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 14, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 67, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 63, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 57, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 77, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 68, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 65, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 69, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 53, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 64, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 76, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 54, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 57, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 34, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 71, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 42, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 69, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 62, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 68, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 59, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 63, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 79, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 75, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 58, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 51, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 69, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 69, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 57, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 72, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 46, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 55, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 64, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 57, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 7, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 49, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 50, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 58, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 41, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 75, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 58, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 78, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 59, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 55, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 65, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 1, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 50, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 41, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 76, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 22, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 71, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 73, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 56, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 48, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 56, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 27, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 54, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 74, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 70, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 55, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 32, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 66, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 61, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 50, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 75, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 43, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 68, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 57, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 74, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 73, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 79, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 75, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 48, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 62, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 74, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 39, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 55, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 71, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 59, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 47, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 61, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 48, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 71, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 27, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 38, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 12, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 49, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 1, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 62, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 62, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 61, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 41, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 70, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 45, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 37, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 70, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 21, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 52, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 17, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 10, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 76, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 20, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 22, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 56, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 63, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 54, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 2, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 9, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 66, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 79, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 67, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 53, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 79, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 28, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 57, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 72, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 70, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 39, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 61, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 43, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 46, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 18, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 38, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 36, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 34, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 15, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 65, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 72, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 69, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 19, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 43, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 8, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 17, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 72, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 9, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 10, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 50, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 14, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 57, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 14, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 34, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 3, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 17, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 53, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 12, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 40, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 25, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 76, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 78, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 38, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 24, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 32, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 31, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 66, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 43, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 52, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 16, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 26, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 39, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 5, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 50, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 3, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 25, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 19, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 77, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 77, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 16, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 37, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 33, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 55, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 29, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 78, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 77, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 23, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 29, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 13, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 28, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 79, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 7, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 65, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 69, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 7, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 70, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 76, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 68, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 18, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 53, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 4, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 12, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 40, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 79, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 16, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 35, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 47, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 35, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 72, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 16, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 66, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 2, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 9, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 45, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 30, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 46, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 69, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 16, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 45, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 23, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 23, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 39, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 69, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 7, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 45, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 75, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 37, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 68, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 65, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 38, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 51, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 13, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 22, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 11, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 60, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 10, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 11, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 42, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 74, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 71, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 31, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 24, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 78, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 74, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 53, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 80, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 80, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 37, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 65, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 8, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 45, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 61, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 61, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 33, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 33, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 30, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 42, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 68, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 65, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 43, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 12, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 11, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 10, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 2, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 79, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 79, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 70, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 43, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 45, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 30, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 27, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 59, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 32, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 2, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 72, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 37, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 25, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 56, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 27, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 17, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 55, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 79, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 8, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 23, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 26, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 34, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 18, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 36, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 75, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 64, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 78, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 15, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 73, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 41, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 74, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 56, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 74, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 39, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 55, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 42, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 57, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 8, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 38, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 66, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 16, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 23, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 12, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 16, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 79, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 39, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 17, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 37, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 35, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 40, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 60, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 35, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 63, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 63, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 72, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 16, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 22, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 34, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 18, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 61, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 9, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 25, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 3, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 60, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 78, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 80, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 61, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 63, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 80, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 79, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 20, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 21, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 23, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 73, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 20, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 23, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 70, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 46, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 43, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 47, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 48, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 69, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 45, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 38, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 80, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 34, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 9, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 4, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 6, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 58, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 62, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 17, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 9, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 26, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 44, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 57, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 67, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 60, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 54, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 56, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 14, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 14, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 65, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 29, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 56, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 50, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 18, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 74, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 2, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 56, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 68, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 65, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 77, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 4, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 63, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 24, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 75, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 62, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 17, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 70, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 35, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 29, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 41, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 3, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 45, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 75, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 70, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 43, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 18, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 51, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 12, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 43, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 29, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 69, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 78, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 34, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 60, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 1, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 52, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 33, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 62, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 23, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 71, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 11, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 22, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 13, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 32, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 37, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 22, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 8, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 76, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 54, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 21, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 16, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 58, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 72, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 73, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 65, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 69, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 45, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 4, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 15, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 42, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 12, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 26, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 30, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 70, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 67, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 1, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 44, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 50, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 75, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 68, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 28, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 78, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 14, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 13, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 49, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 47, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 72, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 70, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 58, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 5, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 1, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 16, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 61, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 60, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 72, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 21, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 20, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 30, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 1, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 35, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 59, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 75, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 15, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 41, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 14, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 18, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 59, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 25, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 62, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 69, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 68, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 12, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 57, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 64, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 12, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 3, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 39, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 5, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 67, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 11, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 30, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 75, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 9, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 60, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 48, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 61, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 56, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 49, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 16, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 24, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 74, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 42, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 35, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 68, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 9, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 2, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 4, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 44, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 51, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 42, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 76, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 70, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 31, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 24, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 52, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 3, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 17, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 2, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 49, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 57, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 46, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 17, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 67, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 11, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 71, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 14, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 30, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 8, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 57, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 21, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 41, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 45, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 1, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 72, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 25, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 77, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 63, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 24, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 72, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 4, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 15, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 8, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 51, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 66, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 59, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 64, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 67, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 58, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 43, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 42, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 74, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 76, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 79, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 65, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 3, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 67, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 26, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 3, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 73, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 14, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 17, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 30, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 25, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 44, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 58, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 52, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 67, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 33, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 29, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 7, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 41, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 38, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 29, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 79, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 13, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 64, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 76, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 72, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 3, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 10, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 62, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 79, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 59, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 22, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 30, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 27, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 49, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 53, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 9, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 24, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 4, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 75, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 30, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 50, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 33, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 14, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 16, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 79, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 45, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 27, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 59, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 14, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 11, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 44, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 26, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 38, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 7, new IntPred(609, 652), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 39, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 34, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 14, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 80, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 38, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 75, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 48, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 7, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 18, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 31, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 41, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 61, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 74, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 56, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 23, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 40, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 29, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 5, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 57, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 61, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 27, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 37, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 2, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 7, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 71, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 41, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 54, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 62, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 7, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 54, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 43, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 17, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 18, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 16, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 73, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 60, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 32, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 80, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 74, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 33, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 46, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 79, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 74, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 3, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 23, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 40, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 23, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 54, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 11, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 25, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 49, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 48, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 43, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 18, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 43, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 10, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 19, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 72, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 48, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 13, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 18, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 46, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 60, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 11, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 67, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 6, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 62, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 14, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 45, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 25, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 71, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 80, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 27, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 36, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 56, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 46, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 24, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 4, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 7, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 72, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 1, new IntPred(663, 755), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 10, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 9, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 78, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 7, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 72, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 41, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 68, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 42, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 2, new IntPred(311, 315), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 63, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 78, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 30, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 78, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 74, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 20, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 41, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 35, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 38, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 15, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 66, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 29, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 38, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 73, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 35, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 7, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 10, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 1, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 72, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 47, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 57, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 68, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 30, new IntPred(440, 448), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 37, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 25, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 20, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 36, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 75, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 33, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 5, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 76, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 54, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 61, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 58, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 26, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 43, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 57, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 60, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 51, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 18, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 68, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 51, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 31, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 38, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 63, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 10, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 56, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 19, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 59, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 46, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 72, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 6, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 78, new IntPred(0, 37), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 47, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 78, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 32, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 14, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 78, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 73, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 3, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 3, new IntPred(316, 351), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 45, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 27, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 34, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 57, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 18, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 38, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 21, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 27, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 3, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 18, new IntPred(663, 755), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 18, new IntPred(756, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 58, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 21, new IntPred(86, 122), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 69, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 50, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 66, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 40, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 8, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 42, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 23, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 75, new IntPred(449, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 5, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 74, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 51, new IntPred(562, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(599, 608), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 43, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 54, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 32, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 32, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 44, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 5, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 8, new IntPred(123, 179), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 51, new IntPred(180, 263), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 36, new IntPred(264, 285), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 51, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 76, new IntPred(311, 315), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 47, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 57, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 53, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 3, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 35, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 52, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 18, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 24, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 16, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 33, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 53, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 70, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 71, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 75, new IntPred(38, 85), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 41, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 76, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 46, new IntPred(180, 263), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 4, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 59, new IntPred(286, 310), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 74, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 75, new IntPred(316, 351), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 10, new IntPred(352, 439), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 50, new IntPred(449, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 54, new IntPred(453, 502), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 19, new IntPred(503, 561), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 28, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 23, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 75, new IntPred(609, 652), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 50, new IntPred(653, 662), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 15, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(756, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 5, new IntPred(0, 37), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 62, new IntPred(38, 85), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 27, new IntPred(86, 122), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 69, new IntPred(123, 179), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 20, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 49, new IntPred(264, 285), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 24, new IntPred(286, 310), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 49, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 71, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 22, new IntPred(352, 439), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 14, new IntPred(440, 448), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 30, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 34, new IntPred(453, 502), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 10, new IntPred(503, 561), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 58, new IntPred(562, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 59, new IntPred(599, 608), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 57, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 28, new IntPred(653, 662), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 40, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 25, new IntPred(756, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 67, new IntPred(0, 37), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 29, new IntPred(38, 85), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 58, new IntPred(86, 122), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 73, new IntPred(123, 179), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 39, new IntPred(180, 263), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 32, new IntPred(264, 285), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 79, new IntPred(286, 310), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 15, new IntPred(311, 315), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 17, new IntPred(316, 351), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 26, new IntPred(352, 439), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 60, new IntPred(440, 448), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 34, new IntPred(449, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 62, new IntPred(453, 502), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(503, 561), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 70, new IntPred(562, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 41, new IntPred(599, 608), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 11, new IntPred(609, 652), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 34, new IntPred(653, 662), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 53, new IntPred(663, 755), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 78, new IntPred(756, null), 'c'));
return trans;
}

}
