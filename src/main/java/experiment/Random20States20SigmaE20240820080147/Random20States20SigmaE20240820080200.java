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
public class Random20States20SigmaE20240820080200{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(68, 91), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(92, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(192, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(281, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(282, 370), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(371, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(406, 486), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(487, 541), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(542, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(590, 620), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(621, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(666, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(686, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(716, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(779, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(828, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(923, 933), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(934, 988), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(989, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(68, 91), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(92, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(192, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(281, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(282, 370), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(371, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(406, 486), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(487, 541), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(542, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(590, 620), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(621, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(666, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(686, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(716, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(779, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(828, 922), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(923, 933), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(934, 988), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(989, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(68, 91), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(92, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(192, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 17, new IntPred(281, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(282, 370), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(371, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(406, 486), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(487, 541), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(542, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(590, 620), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(621, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(666, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(686, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(716, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(779, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(828, 922), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(923, 933), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(934, 988), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(989, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(68, 91), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(92, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(192, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(281, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(282, 370), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(371, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(406, 486), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(487, 541), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(542, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(590, 620), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(621, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(666, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 13, new IntPred(686, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(716, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(779, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(828, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(923, 933), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(934, 988), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(989, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(68, 91), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(92, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(192, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(281, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(282, 370), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(371, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(406, 486), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(487, 541), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(542, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(590, 620), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(621, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(666, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(686, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(716, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(779, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(828, 922), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(923, 933), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(934, 988), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(989, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(68, 91), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(92, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(192, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(281, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(282, 370), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(371, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(406, 486), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(487, 541), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(542, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(590, 620), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(621, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(666, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(686, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(716, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(779, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(828, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(923, 933), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(934, 988), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(989, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(68, 91), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(92, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(192, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(281, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(282, 370), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(371, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(406, 486), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(487, 541), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(542, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(590, 620), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(621, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(666, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(686, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(716, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(779, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(828, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(923, 933), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(934, 988), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(989, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(68, 91), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(92, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(192, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(281, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(282, 370), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(371, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(406, 486), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(487, 541), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(542, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(590, 620), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(621, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(666, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(686, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(716, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(779, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(828, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(923, 933), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(934, 988), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(989, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(68, 91), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(92, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(192, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(281, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(282, 370), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(371, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(406, 486), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(487, 541), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(542, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(590, 620), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(621, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(666, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(686, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(716, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(779, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(828, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(923, 933), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(934, 988), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(989, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(68, 91), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(92, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(192, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(281, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(282, 370), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(371, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(406, 486), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(487, 541), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(542, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(590, 620), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(621, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(666, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(686, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(716, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(779, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(828, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(923, 933), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(934, 988), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(989, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(68, 91), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(92, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(192, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(281, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(282, 370), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(371, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(406, 486), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(487, 541), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(542, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(590, 620), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 17, new IntPred(621, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(666, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(686, 715), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(716, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(779, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(828, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(923, 933), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 7, new IntPred(934, 988), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(989, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(68, 91), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(92, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(192, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(281, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(282, 370), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(371, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(406, 486), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(487, 541), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(542, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(590, 620), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(621, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(666, 685), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(686, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(716, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(779, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(828, 922), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(923, 933), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(934, 988), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(989, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(68, 91), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(92, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(192, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(281, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(282, 370), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 2, new IntPred(371, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(406, 486), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(487, 541), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(542, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(590, 620), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(621, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(666, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(686, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(716, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(779, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(828, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(923, 933), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(934, 988), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(989, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(68, 91), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(92, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(192, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(281, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(282, 370), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(371, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(406, 486), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(487, 541), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 8, new IntPred(542, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(590, 620), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(621, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(666, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(686, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(716, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(779, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(828, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(923, 933), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(934, 988), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(989, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(68, 91), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(92, 191), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(192, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 17, new IntPred(281, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(282, 370), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(371, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(406, 486), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(487, 541), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(542, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(590, 620), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(621, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(666, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(686, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(716, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(779, 827), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(828, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(923, 933), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(934, 988), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(989, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(68, 91), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(92, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(192, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(281, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(282, 370), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(371, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(406, 486), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(487, 541), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(542, 589), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(590, 620), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(621, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(666, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(686, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(716, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(779, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(828, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(923, 933), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(934, 988), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(989, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(0, 67), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(68, 91), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(92, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(192, 280), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(281, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 4, new IntPred(282, 370), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(371, 405), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(406, 486), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(487, 541), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(542, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(590, 620), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(621, 665), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(666, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(686, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(716, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(779, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(828, 922), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(923, 933), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 8, new IntPred(934, 988), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(989, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(68, 91), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(92, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(192, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(281, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(282, 370), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(371, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(406, 486), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(487, 541), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(542, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(590, 620), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(621, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(666, 685), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(686, 715), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(716, 778), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(779, 827), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(828, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(923, 933), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 9, new IntPred(934, 988), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(989, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(0, 67), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(68, 91), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(92, 191), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(192, 280), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(281, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(282, 370), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(371, 405), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(406, 486), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(487, 541), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(542, 589), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(590, 620), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(621, 665), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(666, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(686, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(716, 778), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(779, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(828, 922), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(923, 933), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(934, 988), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(989, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(0, 67), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(68, 91), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(92, 191), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 6, new IntPred(192, 280), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(281, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(282, 370), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(371, 405), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(406, 486), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(487, 541), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(542, 589), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(590, 620), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(621, 665), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 18, new IntPred(666, 685), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(686, 715), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(716, 778), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(779, 827), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(828, 922), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(923, 933), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(934, 988), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(989, null), 'c'));
return trans;
}

}
