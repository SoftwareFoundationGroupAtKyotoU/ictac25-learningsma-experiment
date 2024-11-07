package experiment.Random10States20SigmaE20240820061313;
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
public class Random10States20SigmaE20240820061328{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(89, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(145, 207), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(208, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(261, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(331, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(420, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(461, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(551, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(600, 684), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(685, 782), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(783, 880), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(881, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(932, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(986, 1064), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(1065, 1075), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(1076, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(1093, 1103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(1104, 1113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(1114, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(89, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(145, 207), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(208, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(261, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(331, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(420, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(461, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(551, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(600, 684), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(685, 782), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(783, 880), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(881, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(932, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(986, 1064), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(1065, 1075), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(1076, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(1093, 1103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(1104, 1113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(1114, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(89, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(145, 207), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(208, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(261, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(331, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(420, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(461, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(551, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(600, 684), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(685, 782), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(783, 880), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(881, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(932, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(986, 1064), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(1065, 1075), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(1076, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(1093, 1103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(1104, 1113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(1114, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(89, 144), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(145, 207), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(208, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(261, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(331, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(420, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(461, 550), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(551, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(600, 684), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(685, 782), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(783, 880), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(881, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(932, 985), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(986, 1064), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(1065, 1075), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(1076, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(1093, 1103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(1104, 1113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(1114, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(0, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(89, 144), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(145, 207), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(208, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(261, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(331, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(420, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(461, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(551, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(600, 684), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(685, 782), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(783, 880), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(881, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(932, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(986, 1064), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(1065, 1075), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(1076, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(1093, 1103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(1104, 1113), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(1114, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(0, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(89, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(145, 207), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(208, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(261, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(331, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(420, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(461, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(551, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(600, 684), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(685, 782), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(783, 880), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(881, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(932, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(986, 1064), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(1065, 1075), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(1076, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(1093, 1103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(1104, 1113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(1114, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(89, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(145, 207), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(208, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(261, 330), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(331, 419), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(420, 460), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(461, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(551, 599), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(600, 684), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(685, 782), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(783, 880), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(881, 931), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(932, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(986, 1064), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(1065, 1075), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(1076, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(1093, 1103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(1104, 1113), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(1114, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 5, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(89, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(145, 207), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(208, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(261, 330), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(331, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(420, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(461, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(551, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(600, 684), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(685, 782), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(783, 880), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(881, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(932, 985), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(986, 1064), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(1065, 1075), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(1076, 1092), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(1093, 1103), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(1104, 1113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(1114, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(89, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(145, 207), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(208, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(261, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(331, 419), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(420, 460), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(461, 550), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(551, 599), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(600, 684), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(685, 782), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(783, 880), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(881, 931), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(932, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(986, 1064), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(1065, 1075), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(1076, 1092), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(1093, 1103), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 1, new IntPred(1104, 1113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(1114, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(0, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(89, 144), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(145, 207), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(208, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(261, 330), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(331, 419), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(420, 460), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(461, 550), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(551, 599), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(600, 684), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(685, 782), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(783, 880), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(881, 931), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(932, 985), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(986, 1064), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(1065, 1075), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(1076, 1092), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(1093, 1103), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(1104, 1113), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(1114, null), 'c'));
return trans;
}

}
