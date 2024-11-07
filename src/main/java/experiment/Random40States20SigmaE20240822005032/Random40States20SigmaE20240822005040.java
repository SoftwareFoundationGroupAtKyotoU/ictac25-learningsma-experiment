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
public class Random40States20SigmaE20240822005040{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 24, new IntPred(669, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 23, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 21, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 30, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 34, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(176, 256), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 26, new IntPred(511, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(763, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(861, 885), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(886, 974), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 35, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(1021, 1043), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(491, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 29, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 23, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 21, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(975, 983), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(1021, 1043), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 32, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 40, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 23, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(511, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 29, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 32, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(511, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 33, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(861, 885), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(975, 983), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 35, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 36, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 18, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(257, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(511, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 26, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 22, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 21, new IntPred(669, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(763, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(886, 974), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 25, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 33, new IntPred(1021, 1043), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 32, new IntPred(491, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 38, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(861, 885), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 35, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(1044, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 32, new IntPred(12, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 24, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(975, 983), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(1044, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(669, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 32, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 21, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(12, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 24, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(491, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(511, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 22, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 23, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 33, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 37, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(176, 256), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 25, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(886, 974), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 33, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 30, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 35, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 36, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 24, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(975, 983), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 36, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(1044, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(12, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 40, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 25, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 39, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 21, new IntPred(669, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 39, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 22, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(491, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 36, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 26, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(886, 974), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(975, 983), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 28, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 26, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 37, new IntPred(176, 256), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(257, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(491, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(1021, 1043), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(257, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 33, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(886, 974), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(1021, 1043), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 33, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(491, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 28, new IntPred(763, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 36, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 25, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 38, new IntPred(491, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(511, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 35, new IntPred(669, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(861, 885), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 36, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 30, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(176, 256), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 28, new IntPred(257, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 29, new IntPred(511, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(669, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 27, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 26, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 25, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 2, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 29, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 15, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(511, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 6, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 23, new IntPred(861, 885), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(975, 983), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 35, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 10, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 31, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 35, new IntPred(491, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 29, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 23, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 20, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(1044, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 40, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 31, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 23, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 1, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 6, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 20, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 27, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 19, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 35, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(511, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 13, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 38, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 33, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 20, new IntPred(1021, 1043), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(176, 256), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 39, new IntPred(257, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 23, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 3, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 32, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(669, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 20, new IntPred(763, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 25, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 11, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 30, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 1, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 13, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(257, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 30, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 13, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 10, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(975, 983), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 7, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 5, new IntPred(176, 256), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 15, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 26, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 1, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 31, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 32, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 12, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 19, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 32, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 5, new IntPred(176, 256), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 30, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 28, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 21, new IntPred(886, 974), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(975, 983), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 15, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 2, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 40, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 32, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 8, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 27, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 19, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 34, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 10, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(975, 983), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 39, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 31, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 24, new IntPred(1044, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 13, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(176, 256), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(257, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 37, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(861, 885), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 38, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 8, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 17, new IntPred(1044, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 27, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(257, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 32, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 17, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 31, new IntPred(886, 974), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 38, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 29, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(861, 885), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 3, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 14, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 7, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 6, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 36, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 31, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(491, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 5, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 12, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 32, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(1021, 1043), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 27, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(0, 11), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(12, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 21, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 16, new IntPred(176, 256), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 17, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(491, 510), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 24, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(669, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(763, 860), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 19, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 5, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(1021, 1043), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 11, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(100, 175), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 33, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(511, 533), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 9, new IntPred(763, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 32, new IntPred(975, 983), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 26, new IntPred(984, 1012), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(1044, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 3, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(12, 99), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(335, 425), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 26, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(628, 668), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 14, new IntPred(669, 762), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 24, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(886, 974), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(975, 983), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 37, new IntPred(1021, 1043), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 13, new IntPred(1044, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(0, 11), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 24, new IntPred(12, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(176, 256), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(257, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 4, new IntPred(426, 490), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 13, new IntPred(491, 510), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(763, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 15, new IntPred(861, 885), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(886, 974), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 1, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 10, new IntPred(1013, 1020), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 40, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(1044, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(176, 256), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 33, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 5, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(534, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(628, 668), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(763, 860), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(861, 885), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 14, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 31, new IntPred(1021, 1043), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 9, new IntPred(1044, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 3, new IntPred(12, 99), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(100, 175), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(257, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(335, 425), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(426, 490), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(511, 533), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 13, new IntPred(534, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(669, 762), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 35, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(861, 885), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 22, new IntPred(886, 974), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(984, 1012), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 26, new IntPred(1013, 1020), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(1021, 1043), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 31, new IntPred(1044, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 29, new IntPred(0, 11), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(12, 99), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(100, 175), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(176, 256), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 21, new IntPred(257, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 13, new IntPred(335, 425), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(426, 490), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(491, 510), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(511, 533), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 40, new IntPred(534, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(628, 668), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(669, 762), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(763, 860), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 17, new IntPred(861, 885), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 37, new IntPred(886, 974), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(975, 983), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(984, 1012), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 16, new IntPred(1013, 1020), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 27, new IntPred(1021, 1043), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 26, new IntPred(1044, null), 'b'));
return trans;
}

}
