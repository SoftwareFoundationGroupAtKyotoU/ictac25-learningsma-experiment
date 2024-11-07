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
public class Random20States20SigmaE20240820080159{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(0, 10), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(11, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(71, 90), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(91, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(107, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(253, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(353, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(431, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(436, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(524, 545), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(546, 610), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(611, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(693, 739), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 19, new IntPred(740, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(798, 847), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 15, new IntPred(848, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(865, 941), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(942, 1040), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(1041, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 16, new IntPred(0, 10), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(11, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(71, 90), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(91, 106), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(107, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(253, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(353, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(431, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 13, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(524, 545), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 8, new IntPred(546, 610), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(611, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 11, new IntPred(693, 739), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 19, new IntPred(740, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(798, 847), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(848, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(865, 941), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(942, 1040), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(1041, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(0, 10), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(11, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(71, 90), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(91, 106), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(107, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(253, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 11, new IntPred(353, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(431, 435), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(524, 545), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(546, 610), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(611, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(693, 739), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(740, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(798, 847), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(848, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(865, 941), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(1041, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(0, 10), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(11, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(71, 90), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(91, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(107, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(253, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(353, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(431, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(524, 545), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(546, 610), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(611, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(693, 739), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(740, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(798, 847), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(848, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(865, 941), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(1041, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(0, 10), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(11, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(71, 90), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(91, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(107, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 17, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(253, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(353, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(431, 435), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(436, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(524, 545), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 15, new IntPred(546, 610), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 20, new IntPred(611, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(693, 739), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(740, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(798, 847), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(848, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(865, 941), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(1041, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(0, 10), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(11, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(71, 90), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 12, new IntPred(91, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(107, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 11, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(253, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(353, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(431, 435), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(436, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(524, 545), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(546, 610), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(611, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(693, 739), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 13, new IntPred(740, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(798, 847), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(848, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(865, 941), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(1041, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(0, 10), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(11, 70), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(71, 90), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(91, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(107, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(253, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 14, new IntPred(353, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(431, 435), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(524, 545), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(546, 610), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(611, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(693, 739), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 11, new IntPred(740, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(798, 847), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(848, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(865, 941), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(942, 1040), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 18, new IntPred(1041, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 11, new IntPred(0, 10), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(11, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(71, 90), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(91, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(107, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(253, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(353, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(431, 435), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(436, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(524, 545), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(546, 610), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 17, new IntPred(611, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(693, 739), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(740, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(798, 847), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(848, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 15, new IntPred(865, 941), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(1041, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(0, 10), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(11, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(71, 90), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(91, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(107, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 18, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 17, new IntPred(253, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(353, 430), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(431, 435), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(524, 545), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(546, 610), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(611, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(693, 739), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 11, new IntPred(740, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 4, new IntPred(798, 847), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(848, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(865, 941), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 13, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(1041, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(0, 10), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(11, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 19, new IntPred(71, 90), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(91, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(107, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(253, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(353, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(431, 435), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(524, 545), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(546, 610), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(611, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(693, 739), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(740, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(798, 847), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 12, new IntPred(848, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(865, 941), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(1041, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(0, 10), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(11, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(71, 90), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(91, 106), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(107, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(196, 252), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(253, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(353, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(431, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(524, 545), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 15, new IntPred(546, 610), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(611, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(693, 739), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 8, new IntPred(740, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(798, 847), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 14, new IntPred(848, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 6, new IntPred(865, 941), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(942, 1040), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 12, new IntPred(1041, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(0, 10), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 2, new IntPred(11, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 9, new IntPred(71, 90), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(91, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(107, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(253, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(353, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(431, 435), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(524, 545), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 19, new IntPred(546, 610), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(611, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(693, 739), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(740, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 6, new IntPred(798, 847), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 17, new IntPred(848, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(865, 941), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 7, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 3, new IntPred(1041, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(0, 10), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(11, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(71, 90), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 9, new IntPred(91, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(107, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(253, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(353, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(431, 435), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 4, new IntPred(436, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(524, 545), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(546, 610), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 18, new IntPred(611, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(693, 739), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(740, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 6, new IntPred(798, 847), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(848, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 15, new IntPred(865, 941), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 12, new IntPred(942, 1040), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(1041, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 12, new IntPred(0, 10), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(11, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(71, 90), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(91, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(107, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 9, new IntPred(253, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(353, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 19, new IntPred(431, 435), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(436, 523), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(524, 545), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(546, 610), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 16, new IntPred(611, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(693, 739), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(740, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 1, new IntPred(798, 847), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(848, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(865, 941), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(1041, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(0, 10), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(11, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(71, 90), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(91, 106), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(107, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(253, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(353, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(431, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(436, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 14, new IntPred(524, 545), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(546, 610), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 7, new IntPred(611, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(693, 739), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(740, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(798, 847), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 20, new IntPred(848, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(865, 941), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 1, new IntPred(1041, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(0, 10), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 11, new IntPred(11, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(71, 90), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(91, 106), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(107, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(253, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(353, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(431, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(436, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(524, 545), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(546, 610), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 5, new IntPred(611, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 19, new IntPred(693, 739), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(740, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(798, 847), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(848, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(865, 941), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 14, new IntPred(942, 1040), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(1041, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(0, 10), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 18, new IntPred(11, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 2, new IntPred(71, 90), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(91, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(107, 195), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 7, new IntPred(253, 352), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(353, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(431, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(436, 523), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(524, 545), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 14, new IntPred(546, 610), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(611, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(693, 739), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(740, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(798, 847), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(848, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(865, 941), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(1041, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(0, 10), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(11, 70), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(71, 90), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(91, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(107, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 16, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(253, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(353, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(431, 435), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 18, new IntPred(524, 545), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(546, 610), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(611, 692), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(693, 739), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(740, 797), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(798, 847), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(848, 864), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(865, 941), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 3, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(1041, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(0, 10), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(11, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(71, 90), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(91, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 5, new IntPred(107, 195), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(196, 252), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(253, 352), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 15, new IntPred(353, 430), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(431, 435), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(524, 545), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(546, 610), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(611, 692), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(693, 739), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(740, 797), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(798, 847), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 3, new IntPred(848, 864), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 9, new IntPred(865, 941), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(1041, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(0, 10), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(11, 70), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(71, 90), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(91, 106), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(107, 195), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(196, 252), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 10, new IntPred(253, 352), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(353, 430), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(431, 435), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(436, 523), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(524, 545), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(546, 610), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 19, new IntPred(611, 692), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(693, 739), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(740, 797), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(798, 847), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(848, 864), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(865, 941), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(942, 1040), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 16, new IntPred(1041, null), 'b'));
return trans;
}

}
