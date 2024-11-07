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
public class Random40States20SigmaE20240822005035{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 34, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(760, 792), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(793, 886), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 34, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 28, new IntPred(0, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(438, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(715, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 29, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(1111, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(1111, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(90, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(560, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(1111, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 27, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 27, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 35, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(438, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 25, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 27, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(560, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 32, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 24, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 24, new IntPred(0, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(90, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(438, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(760, 792), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 35, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(887, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 25, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(90, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 26, new IntPred(715, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 34, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 33, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 28, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 39, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(760, 792), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(887, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(0, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 37, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(560, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 24, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(715, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(90, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 33, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 36, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 23, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 23, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 30, new IntPred(1111, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 28, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(760, 792), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 38, new IntPred(760, 792), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 37, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 27, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 24, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(760, 792), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(887, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 21, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 28, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(0, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(90, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 38, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(0, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 32, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 36, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(560, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(793, 886), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 27, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 27, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 34, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 31, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 32, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 30, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 24, new IntPred(0, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 37, new IntPred(560, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 37, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 28, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 32, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 34, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(715, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(760, 792), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 29, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 33, new IntPred(1111, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 22, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 34, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(887, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 24, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 33, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 15, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 4, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 37, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(887, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 25, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 2, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 12, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 35, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 29, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 37, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 11, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(793, 886), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 15, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 2, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 31, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 37, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 22, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(438, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 30, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(887, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 38, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 20, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(438, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 17, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 21, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 24, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(715, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 24, new IntPred(1111, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 29, new IntPred(0, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 23, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 12, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 4, new IntPred(793, 886), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 8, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 5, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 23, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 34, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 24, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 34, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 33, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 9, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 29, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(90, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 31, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 21, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(438, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(560, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 2, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(793, 886), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 23, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 40, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(438, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 37, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 11, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 25, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 10, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 31, new IntPred(90, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 30, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 10, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 21, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 31, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 13, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 19, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(715, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(760, 792), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 33, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(0, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 22, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 35, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(560, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 13, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(887, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 33, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 11, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(90, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 8, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(438, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 33, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 9, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(793, 886), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 31, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 25, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(0, 89), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 26, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 12, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 8, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(438, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 40, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 31, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 18, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(793, 886), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 33, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 1, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 40, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 5, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 4, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 17, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 15, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 5, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 9, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 34, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 14, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 19, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 31, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 21, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 16, new IntPred(760, 792), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(793, 886), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(887, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 16, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 8, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(1111, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(90, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(560, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(715, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 16, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(1056, 1110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(1111, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 31, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 24, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 12, new IntPred(544, 559), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 8, new IntPred(634, 714), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 24, new IntPred(715, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(887, 917), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(918, 1011), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(1111, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 32, new IntPred(0, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(90, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 31, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 35, new IntPred(235, 305), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(306, 350), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(351, 437), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 8, new IntPred(444, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(511, 543), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 1, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(560, 633), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 12, new IntPred(634, 714), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(715, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(760, 792), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(793, 886), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 36, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 7, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(90, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(162, 234), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(235, 305), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 11, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(351, 437), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(438, 443), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 29, new IntPred(444, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(560, 633), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(715, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 12, new IntPred(793, 886), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(887, 917), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 15, new IntPred(1012, 1055), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(1111, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(0, 89), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 11, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(162, 234), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(306, 350), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(438, 443), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 11, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(511, 543), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(544, 559), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(715, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(760, 792), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(793, 886), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(887, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(918, 1011), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 8, new IntPred(1012, 1055), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(1056, 1110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(1111, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(0, 89), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(90, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(162, 234), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(235, 305), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 35, new IntPred(306, 350), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(351, 437), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(438, 443), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 39, new IntPred(444, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(511, 543), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(544, 559), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(560, 633), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(634, 714), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(715, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 32, new IntPred(760, 792), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(793, 886), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(887, 917), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 39, new IntPred(918, 1011), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(1012, 1055), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(1056, 1110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(1111, null), 'c'));
return trans;
}

}
