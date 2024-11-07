package experiment.Random20States20SigmaE20240820080147;
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
public class Random20States20SigmaE20240820080202{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(0, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(31, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(55, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(63, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(111, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(141, 193), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(194, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(220, 229), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(230, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(274, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(283, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(345, 349), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(350, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(391, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(450, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(508, 605), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(606, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(698, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(0, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(31, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(55, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(63, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(111, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(141, 193), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(194, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(220, 229), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(230, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(274, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(283, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(345, 349), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(350, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(391, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(450, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(508, 605), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(606, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(698, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(0, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(31, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(55, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(63, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(111, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(141, 193), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(194, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(220, 229), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(230, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(274, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(283, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(345, 349), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(350, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(391, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(450, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(508, 605), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(606, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(698, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(789, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(0, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(31, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(55, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(63, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(111, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(141, 193), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(194, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(220, 229), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(230, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(274, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(283, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(345, 349), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(350, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(391, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(450, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(508, 605), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(606, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(698, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(789, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(0, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(31, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(55, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(63, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(111, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(141, 193), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(194, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(220, 229), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(230, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(274, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(283, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(345, 349), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(350, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(391, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(450, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(508, 605), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(606, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(698, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(789, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(0, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(31, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(55, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(63, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(111, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(141, 193), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(194, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(220, 229), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(230, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(274, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(283, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(345, 349), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(350, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(391, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(450, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(508, 605), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(606, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(698, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(0, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(31, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(55, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(63, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(111, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(141, 193), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(194, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(220, 229), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(230, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(274, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(283, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(345, 349), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(350, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(391, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(450, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(508, 605), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(606, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(698, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 19, new IntPred(0, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(31, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(55, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(63, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(111, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(141, 193), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(194, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(220, 229), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(230, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(274, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(283, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(345, 349), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(350, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(391, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(450, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(508, 605), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(606, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(698, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(0, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(31, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(55, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(63, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(111, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(141, 193), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(194, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(220, 229), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(230, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(274, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(283, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(345, 349), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(350, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(391, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(450, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(508, 605), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(606, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(698, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(0, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(31, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(55, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(63, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(111, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(141, 193), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(194, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(220, 229), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(230, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(274, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(283, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(345, 349), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(350, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(391, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(450, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(508, 605), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(606, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(698, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(0, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(31, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(55, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(63, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(111, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(141, 193), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(194, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(220, 229), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(230, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(274, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(283, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(345, 349), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(350, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(391, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(450, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(508, 605), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(606, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(698, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(789, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(0, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(31, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(55, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(63, 110), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(111, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(141, 193), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(194, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(220, 229), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(230, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(274, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(283, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(345, 349), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(350, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(391, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(450, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(508, 605), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(606, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(698, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(0, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(31, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(55, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(63, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(111, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(141, 193), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(194, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(220, 229), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(230, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(274, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(283, 344), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(345, 349), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(350, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(391, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(450, 507), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(508, 605), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(606, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(698, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(0, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(31, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(55, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(63, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(111, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(141, 193), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(194, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(220, 229), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(230, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(274, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(283, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(345, 349), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(350, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(391, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(450, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(508, 605), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(606, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(698, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(0, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(31, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(55, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(63, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(111, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(141, 193), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(194, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(220, 229), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(230, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(274, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(283, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(345, 349), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(350, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(391, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(450, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(508, 605), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(606, 697), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(698, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(789, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 6, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(0, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(31, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(55, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(63, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(111, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(141, 193), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(194, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(220, 229), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(230, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(274, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(283, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 11, new IntPred(345, 349), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(350, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(391, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(450, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(508, 605), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(606, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(698, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(789, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(0, 30), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(31, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(55, 62), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(63, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(111, 140), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(141, 193), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(194, 219), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(220, 229), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(230, 273), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(274, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(283, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(345, 349), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(350, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(391, 449), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 11, new IntPred(450, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(508, 605), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(606, 697), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(698, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(789, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(0, 30), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(31, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(55, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(63, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(111, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(141, 193), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(194, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(220, 229), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(230, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(274, 282), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(283, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(345, 349), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(350, 390), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(391, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(450, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(508, 605), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(606, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(698, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(789, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(0, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(31, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(55, 62), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(63, 110), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(111, 140), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(141, 193), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(194, 219), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(220, 229), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(230, 273), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(274, 282), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(283, 344), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(345, 349), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(350, 390), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(391, 449), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(450, 507), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(508, 605), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(606, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(698, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(789, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(0, 30), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(31, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(55, 62), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(63, 110), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(111, 140), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(141, 193), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(194, 219), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(220, 229), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(230, 273), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(274, 282), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(283, 344), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(345, 349), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(350, 390), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(391, 449), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(450, 507), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(508, 605), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(606, 697), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(698, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(789, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(871, null), 'b'));
return trans;
}

}
