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
public class Random40States20SigmaE20240822005037{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 40, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 22, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 32, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 14, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 25, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 36, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 20, new IntPred(791, 818), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 33, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(55, 149), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 22, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(401, 438), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 21, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 27, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 25, new IntPred(713, 761), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 32, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 22, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 37, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(305, 400), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 39, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 40, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 26, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 32, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(762, 790), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 38, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 37, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 27, new IntPred(305, 400), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 24, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 10, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 32, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 29, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 30, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 26, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 22, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 35, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 34, new IntPred(791, 818), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(55, 149), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(305, 400), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 19, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 33, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(548, 570), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 23, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(689, 712), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 30, new IntPred(762, 790), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 22, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 28, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(305, 400), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 40, new IntPred(439, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 36, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 32, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 27, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 34, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 14, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 40, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 36, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 21, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 21, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(55, 149), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 25, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 27, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 22, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 23, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 37, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 29, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 21, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 28, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 29, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 31, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 26, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 21, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 16, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 39, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 36, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 34, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 5, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 38, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 30, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 33, new IntPred(713, 761), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(762, 790), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 23, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 35, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 5, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 31, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 20, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 27, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 32, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 18, new IntPred(791, 818), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 23, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 30, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(548, 570), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 27, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 30, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 29, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 25, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 38, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(401, 438), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(439, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 29, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 20, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 37, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 23, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 22, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 21, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 24, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(305, 400), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 31, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 27, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 19, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 40, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 2, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 38, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(305, 400), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 23, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 12, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 22, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 21, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 39, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 29, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(55, 149), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 24, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(305, 400), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 23, new IntPred(401, 438), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(548, 570), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 22, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 26, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 37, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(689, 712), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 28, new IntPred(55, 149), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(439, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(548, 570), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 30, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 27, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 35, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 23, new IntPred(791, 818), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 31, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(55, 149), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 31, new IntPred(439, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 21, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 40, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 20, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 39, new IntPred(791, 818), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 6, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 40, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 34, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 34, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 21, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 34, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 35, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 38, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 30, new IntPred(689, 712), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 39, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 32, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 25, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(55, 149), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 3, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 9, new IntPred(401, 438), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 1, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 16, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 21, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 8, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 12, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 13, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(791, 818), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 11, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(55, 149), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 8, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 3, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 15, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 19, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 7, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 38, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 17, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 13, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 6, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 12, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 14, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 25, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 21, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 6, new IntPred(401, 438), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 33, new IntPred(439, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 38, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 5, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 13, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 6, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 28, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(713, 761), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 15, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 6, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 7, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 1, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(305, 400), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 39, new IntPred(439, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 34, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 31, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(689, 712), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 12, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 32, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 37, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 16, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 15, new IntPred(55, 149), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 19, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 26, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 27, new IntPred(401, 438), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 33, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 37, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(548, 570), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 38, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 29, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 6, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 18, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 5, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(762, 790), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 32, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 4, new IntPred(55, 149), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 34, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 23, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 22, new IntPred(439, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 19, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 37, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 28, new IntPred(548, 570), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 18, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 32, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 13, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 2, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 16, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(762, 790), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 33, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 27, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 29, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 21, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 37, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 6, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 13, new IntPred(689, 712), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 21, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 14, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 20, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 27, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 17, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 13, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 38, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 26, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 27, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 19, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 18, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 7, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 24, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 19, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 34, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 10, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 23, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 9, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 22, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 7, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 37, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 40, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 14, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 17, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 9, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 3, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 24, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 34, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 29, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(401, 438), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 10, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(548, 570), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 14, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 36, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 2, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(689, 712), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 15, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 38, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 27, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 25, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 13, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(305, 400), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 24, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 37, new IntPred(548, 570), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 13, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 39, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 8, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 10, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 4, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 29, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 31, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 31, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 14, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 29, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 22, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 20, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 25, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 26, new IntPred(670, 688), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 40, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 26, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 16, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 21, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 24, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 29, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 38, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 24, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 18, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 35, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 3, new IntPred(571, 619), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 33, new IntPred(650, 669), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 16, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 1, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(762, 790), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 21, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 21, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 20, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 32, new IntPred(305, 400), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 28, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 15, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 39, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 22, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 26, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 5, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 33, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 37, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 10, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 29, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 40, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(55, 149), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 38, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 21, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 24, new IntPred(468, 525), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(526, 547), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(548, 570), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 3, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 27, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 2, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 23, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 11, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 14, new IntPred(713, 761), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(762, 790), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 13, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 37, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 19, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(150, 245), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(305, 400), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 34, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 29, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 33, new IntPred(620, 649), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 38, new IntPred(689, 712), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 23, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 2, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 17, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(0, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 30, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 14, new IntPred(439, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 29, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 19, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 17, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 16, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 5, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 38, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 6, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 12, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 34, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(871, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 6, new IntPred(0, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 8, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 19, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(246, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 4, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(401, 438), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 2, new IntPred(439, 467), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 10, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(713, 761), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 3, new IntPred(762, 790), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 39, new IntPred(791, 818), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 36, new IntPred(819, 870), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(871, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 14, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(150, 245), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 11, new IntPred(246, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 34, new IntPred(401, 438), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 33, new IntPred(439, 467), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 18, new IntPred(468, 525), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(526, 547), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(548, 570), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 19, new IntPred(571, 619), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 32, new IntPred(620, 649), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(650, 669), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 30, new IntPred(670, 688), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 13, new IntPred(689, 712), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 21, new IntPred(713, 761), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 28, new IntPred(762, 790), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 27, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 12, new IntPred(819, 870), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(871, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 39, new IntPred(0, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 19, new IntPred(55, 149), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(150, 245), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 10, new IntPred(246, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 14, new IntPred(305, 400), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 22, new IntPred(401, 438), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(439, 467), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 11, new IntPred(468, 525), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 5, new IntPred(526, 547), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 14, new IntPred(548, 570), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 36, new IntPred(571, 619), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 28, new IntPred(620, 649), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(650, 669), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 7, new IntPred(670, 688), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(689, 712), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 15, new IntPred(713, 761), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 14, new IntPred(762, 790), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(791, 818), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 11, new IntPred(819, 870), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(871, null), 'b'));
return trans;
}

}
