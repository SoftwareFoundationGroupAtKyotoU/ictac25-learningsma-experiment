package experiment.Random40States20SigmaE20240822005032;
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
public class Random40States20SigmaE20240822005042{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 27, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 34, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 34, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(519, 535), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(536, 613), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(614, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(54, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(421, 518), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 31, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(253, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 33, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(652, 670), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 34, new IntPred(918, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 25, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 33, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 25, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(387, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(421, 518), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 28, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 32, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(798, 832), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(387, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 28, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(536, 613), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(614, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 25, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 31, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(253, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(387, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(536, 613), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(54, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(253, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 32, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(387, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(614, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(652, 670), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(798, 832), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(918, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(54, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 29, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(421, 518), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 29, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 39, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(918, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 30, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(652, 670), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(421, 518), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(519, 535), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 23, new IntPred(614, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 30, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 27, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 33, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(54, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(421, 518), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(614, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(652, 670), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(798, 832), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(387, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(614, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 27, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(918, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(387, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(421, 518), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(536, 613), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 33, new IntPred(614, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 40, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 27, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 35, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(387, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(614, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(387, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(421, 518), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 25, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 21, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 27, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(387, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(614, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 30, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(918, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(54, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(387, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(614, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 26, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 35, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 21, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(387, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(536, 613), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 2, new IntPred(614, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(253, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 25, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(652, 670), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(798, 832), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(918, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(54, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 33, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 36, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(421, 518), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(519, 535), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 38, new IntPred(614, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(652, 670), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 19, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 15, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(798, 832), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 32, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(54, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 9, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 22, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 40, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 9, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 3, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 10, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 31, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(614, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(798, 832), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 38, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 24, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 4, new IntPred(387, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 24, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 4, new IntPred(536, 613), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(614, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(0, 53), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 2, new IntPred(54, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 12, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 32, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(387, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 27, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(614, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(652, 670), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 10, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 15, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 37, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 31, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 33, new IntPred(798, 832), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 3, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 11, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 35, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(387, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 7, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 12, new IntPred(536, 613), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 24, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 23, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(614, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 30, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 19, new IntPred(798, 832), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(54, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 2, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 10, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 15, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(536, 613), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 6, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 38, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(918, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 22, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 22, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(334, 340), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 13, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(421, 518), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(652, 670), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 21, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 22, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 40, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 35, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 26, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 22, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(253, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 14, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 37, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 29, new IntPred(387, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 23, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(519, 535), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 28, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 10, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 15, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 1, new IntPred(918, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 24, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 20, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 7, new IntPred(387, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(519, 535), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 25, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(614, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 25, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 14, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(798, 832), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(918, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 21, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 10, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(387, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(519, 535), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 5, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 3, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 3, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 31, new IntPred(366, 386), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(421, 518), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(519, 535), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 34, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 1, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 1, new IntPred(833, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 3, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 22, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 37, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 28, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 34, new IntPred(346, 365), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(387, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(519, 535), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 37, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 18, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 22, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 14, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(918, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(109, 153), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(253, 333), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 10, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 3, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(614, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(652, 670), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(671, 744), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 37, new IntPred(745, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(798, 832), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(918, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 28, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(54, 108), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 27, new IntPred(154, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(341, 345), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(387, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 26, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(536, 613), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(614, 651), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(652, 670), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(798, 832), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(833, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(0, 53), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 39, new IntPred(54, 108), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(109, 153), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 20, new IntPred(154, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 27, new IntPred(253, 333), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 5, new IntPred(334, 340), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(341, 345), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(346, 365), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(366, 386), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(387, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(421, 518), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(536, 613), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(614, 651), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 17, new IntPred(652, 670), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(671, 744), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(745, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(918, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(0, 53), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(54, 108), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(109, 153), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(154, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(253, 333), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(334, 340), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(341, 345), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 2, new IntPred(346, 365), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(366, 386), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(387, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(421, 518), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(519, 535), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(536, 613), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(614, 651), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 3, new IntPred(652, 670), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(671, 744), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(745, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(798, 832), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(833, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 4, new IntPred(918, null), 'a'));
return trans;
}

}
