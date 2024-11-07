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
public class Random80States20SigmaE20240826035337{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 77, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 76, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 60, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 71, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 74, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 43, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 37, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 70, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 44, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 64, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 16, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 35, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 26, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 40, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 38, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 56, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 37, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 61, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 46, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 59, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 57, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 51, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 55, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 41, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 16, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 56, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 8, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 27, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 36, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 25, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 18, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 68, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 62, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 12, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 44, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 52, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 59, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 68, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 80, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 46, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 52, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 68, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 19, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 53, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 60, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 71, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 68, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 56, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 77, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 52, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 51, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 22, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 36, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 45, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 71, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 54, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 28, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 47, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 77, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 44, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 33, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 23, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 39, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 56, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 71, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 68, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 46, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 68, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 45, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 62, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 78, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 49, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 62, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 21, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 69, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 38, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 53, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 79, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 54, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 52, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 39, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 37, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 68, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 38, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 45, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 30, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 47, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 61, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 50, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 19, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 41, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 64, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 65, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 42, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 67, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 80, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 56, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 71, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 46, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 61, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 12, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 53, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 59, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 28, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 48, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 53, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 50, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 62, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 72, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 27, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 64, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 41, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 12, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 76, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 74, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 34, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 31, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 26, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 44, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 72, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 30, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 33, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 59, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 50, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 55, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 64, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 79, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 71, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 74, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 60, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 35, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 43, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 44, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 72, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 70, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 11, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 64, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 66, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 23, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 53, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 78, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 40, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 39, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 41, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 32, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 44, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 76, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 78, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 45, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 2, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 35, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 36, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 46, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 45, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 67, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 43, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 59, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 23, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 78, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 71, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 66, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 26, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 60, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 11, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 42, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 74, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 8, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 39, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 31, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 44, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 27, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 52, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 13, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 69, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 36, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 14, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 62, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 16, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 60, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 32, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 7, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 62, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 70, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 77, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 30, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 13, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 73, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 51, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 61, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 30, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 26, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 36, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 31, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 34, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 35, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 3, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 45, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 10, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 57, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 32, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 18, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 41, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 71, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 78, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 60, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 57, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 34, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 70, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 78, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 80, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 30, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 60, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 37, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 65, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 49, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 68, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 79, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 52, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 41, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 32, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 3, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 31, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 16, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 28, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 29, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 64, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 65, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 69, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 69, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 51, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 76, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 49, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 77, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 29, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 27, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 72, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 65, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 58, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 6, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 15, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 39, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 79, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 30, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 75, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 10, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 77, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 41, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 60, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 57, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 1, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 56, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 12, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 53, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 59, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 56, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 52, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 2, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 75, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 39, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 68, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 23, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 37, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 51, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 45, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 24, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 48, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 61, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 27, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 64, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 48, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 1, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 66, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 23, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 53, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 77, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 76, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 13, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 24, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 75, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 55, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 56, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 14, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 49, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 46, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 17, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 40, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 47, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 51, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 60, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 59, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 11, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 59, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 34, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 79, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 18, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 2, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 22, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 50, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 28, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 27, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 73, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 18, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 50, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 29, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 79, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 16, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 57, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 26, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 77, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 58, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 24, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 34, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 50, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 4, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 23, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 58, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 48, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 2, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 33, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 5, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 27, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 65, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 76, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 24, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 40, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 39, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 63, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 68, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 69, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 18, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 16, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 43, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 57, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 35, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 17, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 78, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 73, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 5, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 25, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 59, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 54, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 57, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 40, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 42, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 64, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 26, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 11, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 76, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 3, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 9, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 2, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 18, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 36, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 72, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 29, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 40, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 31, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 22, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 7, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 17, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 47, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 71, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 63, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 69, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 75, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 73, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 54, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 24, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 52, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 60, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 53, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 45, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 65, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 40, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 6, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 45, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 71, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 21, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 65, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 69, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 70, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 68, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 41, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 26, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 69, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 39, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 38, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 33, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 43, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 59, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 77, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 42, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 78, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 21, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 18, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 65, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 69, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 40, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 44, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 73, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 67, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 24, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 38, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 22, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 43, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 75, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 45, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 16, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 57, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 47, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 31, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 35, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 76, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 77, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 67, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 57, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 14, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 16, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 67, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 8, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 41, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 49, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 66, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 22, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 73, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 28, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 66, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 50, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 52, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 60, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 44, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 7, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 53, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 26, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 62, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 29, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 61, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 68, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 4, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 18, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 74, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 70, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 52, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 69, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 19, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 71, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 55, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 70, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 32, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 31, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 23, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 22, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 45, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 5, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 80, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 30, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 79, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 63, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 51, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 21, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 5, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 34, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 15, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 78, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 58, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 60, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 1, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 30, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 41, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 57, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 52, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 20, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 42, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 13, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 2, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 42, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 11, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 40, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 19, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 65, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 42, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 59, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 36, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 27, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 75, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 4, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 44, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 77, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 35, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 31, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 2, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 64, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 45, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 25, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 51, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 54, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 71, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 22, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 79, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 41, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 46, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 52, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 71, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 75, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 11, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 58, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 65, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 39, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 54, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 2, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 78, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 25, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 67, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 23, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 75, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 9, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 47, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 6, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 47, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 48, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 66, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 80, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 66, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 73, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 73, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 2, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 51, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 28, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 4, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 29, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 80, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 35, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 80, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 6, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 53, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 25, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 5, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 55, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 73, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 46, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 78, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 52, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 6, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 11, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 21, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 9, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 37, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 32, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 39, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 5, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 55, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 35, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 52, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 63, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 57, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 42, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 36, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 7, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 54, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 23, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 33, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 60, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 67, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 80, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 67, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 12, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 79, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 51, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 21, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 22, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 62, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 44, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 77, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 7, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 51, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 44, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 75, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 78, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 49, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 78, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 55, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 25, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 58, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 67, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 40, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 61, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 80, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 13, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 17, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 13, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 41, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 52, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 60, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 44, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 25, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 23, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 64, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 9, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 63, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 66, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 16, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 54, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 54, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 41, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 52, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 31, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 43, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 11, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 44, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 6, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 33, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 34, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 52, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 8, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 44, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 49, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 78, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 18, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 71, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 52, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 78, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 76, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 19, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 45, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 5, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 7, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 33, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 44, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 13, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 48, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 2, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 25, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 40, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 54, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 9, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 28, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 55, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 28, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 57, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 32, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 32, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 4, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 41, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 1, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 75, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 36, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 63, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 78, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 16, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 20, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 8, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 39, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 58, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 46, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 30, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 47, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 22, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 60, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 48, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 10, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 68, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 61, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 77, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 32, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 68, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 65, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 40, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 74, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 71, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 37, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 77, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 27, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 53, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 26, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 28, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 29, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 48, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 79, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 35, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 10, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 79, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 61, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 19, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 13, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 44, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 18, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 79, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 2, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 50, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 75, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 74, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 10, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 63, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 9, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 52, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 35, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 60, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 30, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 5, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 47, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 8, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 17, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 71, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 8, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 73, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 14, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 32, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 15, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 31, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 7, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 2, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 24, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 26, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 55, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 38, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 16, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 45, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 42, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 56, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 68, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 45, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 47, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 5, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 22, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 47, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 55, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 62, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 5, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 13, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 71, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 35, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 40, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 2, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 49, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 25, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 20, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 25, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 4, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 48, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 1, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 56, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 76, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 56, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 27, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 60, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 23, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 60, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 46, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 59, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 33, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 35, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 63, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 52, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 72, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 61, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 49, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 4, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 55, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 31, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 51, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 79, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 25, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 29, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 11, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 13, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 58, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 46, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 12, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 35, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 57, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 60, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 47, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 77, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 54, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 16, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 46, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 55, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 36, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 25, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 52, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 14, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 24, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 38, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 46, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 19, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 55, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 39, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 60, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 23, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 43, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 31, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 80, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 48, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 31, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 36, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 45, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 34, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 78, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 45, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 56, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 23, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 7, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 51, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 74, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 55, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 75, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 32, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 12, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 32, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 45, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 2, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 26, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 30, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 64, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 72, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 64, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 67, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 44, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 3, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 79, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 48, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 74, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 22, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 8, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 9, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 2, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 38, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 63, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 69, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 3, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 27, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 41, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 12, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 27, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 45, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 14, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 54, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 43, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 22, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 23, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 34, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 36, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 54, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 80, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 28, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 27, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 9, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 55, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 36, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 24, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 67, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 74, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 62, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 18, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 4, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 61, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 76, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 68, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 33, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 21, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 75, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 40, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 61, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 17, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 38, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 42, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 73, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 59, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 4, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 20, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 61, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 61, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 57, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 69, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 38, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 22, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 8, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 42, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 33, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 55, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 41, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 5, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 62, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 33, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 20, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 10, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 61, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 24, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 52, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 60, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 36, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 51, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 5, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 36, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 70, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 25, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 22, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 10, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 12, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 68, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 23, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 73, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 33, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 60, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 79, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 77, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 46, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 23, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 10, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 80, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 75, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 65, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 11, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 73, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 41, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 49, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 6, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 42, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 45, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 2, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 80, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 70, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 77, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 65, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 31, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 35, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 33, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 61, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 13, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 72, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 35, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 5, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 69, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 63, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 79, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 29, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 20, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 19, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 35, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 72, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 40, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 51, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 31, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 78, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 4, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 61, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 22, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 72, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 74, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 51, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 11, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 79, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 14, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 25, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 80, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 57, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 4, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 10, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 58, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 4, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 76, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 6, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 13, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 72, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 58, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 37, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 60, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 20, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 37, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 28, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 22, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 74, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 53, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 50, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 48, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 57, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 56, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 9, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 52, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 24, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 34, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 25, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 72, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 60, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 9, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 80, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 35, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 73, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 69, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 60, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 13, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 8, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 47, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 2, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 33, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 21, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 41, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 63, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 1, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 36, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 1, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 67, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 69, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 28, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 76, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 79, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 60, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 80, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 3, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 22, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 41, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 18, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 1, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 77, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 46, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 3, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 75, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 66, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 48, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 21, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 58, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 45, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 59, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 20, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 36, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 53, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 70, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 72, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 48, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 41, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 68, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 4, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 44, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 49, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 56, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 28, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 25, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 47, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 54, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 28, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 40, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 13, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 50, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 9, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 23, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 35, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 63, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 45, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 53, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 42, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 56, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 64, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 65, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 60, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 4, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 16, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 47, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 7, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 47, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 26, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 18, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 43, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 46, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 66, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 7, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 13, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 62, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 24, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 15, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 80, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 78, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 45, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 40, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 21, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 21, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 30, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 26, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 65, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 59, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 42, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 29, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 28, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 41, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 33, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 60, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 75, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 54, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 36, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 6, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 32, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 30, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 53, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 72, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 15, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 63, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 73, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 21, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 17, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 54, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 5, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 16, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 63, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 40, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 30, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 23, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 64, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 70, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 74, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 5, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 19, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 40, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 70, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 60, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 66, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 71, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 15, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 12, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 60, new IntPred(933, 967), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 30, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 52, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 76, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 79, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 43, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 68, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 1, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 27, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 61, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 32, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 55, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 47, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 1, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 16, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 75, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 21, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 66, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 37, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 64, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 26, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 39, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 60, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 77, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 56, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 48, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 32, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 10, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 61, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 32, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 47, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 5, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 69, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 44, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 23, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 26, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 16, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 10, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 58, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 74, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 2, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 18, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 42, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 69, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 29, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 32, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 77, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 79, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 40, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 15, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 9, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 62, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 11, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 14, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 40, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 41, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 80, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 63, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 53, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 10, new IntPred(968, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 19, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 18, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 61, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 29, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 2, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 63, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 46, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 46, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 72, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 12, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 24, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 74, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 70, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 63, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 52, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 29, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 4, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 67, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 72, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 14, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 12, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 29, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 76, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 8, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 30, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 45, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 72, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 17, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 70, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 51, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 35, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 54, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 52, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 61, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 51, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 38, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 54, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 13, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 29, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 17, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 75, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 51, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 60, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 74, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 20, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 24, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 55, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 54, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 38, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 15, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 31, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 70, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 65, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 64, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 42, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 75, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 63, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 58, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 37, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 14, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 27, new IntPred(162, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 33, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 11, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 44, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 70, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 73, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 76, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 2, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 29, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 8, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 57, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 64, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 19, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 72, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 69, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 23, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 45, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 50, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 53, new IntPred(69, 88), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 26, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 33, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 35, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 65, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 80, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 21, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 74, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 48, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 64, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 38, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 39, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 15, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 34, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 13, new IntPred(795, 875), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 78, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 58, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 36, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 59, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 18, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 17, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 3, new IntPred(89, 161), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 14, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 73, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 52, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 61, new IntPred(338, 388), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 9, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 78, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 23, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 69, new IntPred(557, 627), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 64, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 25, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 14, new IntPred(679, 742), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 62, new IntPred(743, 794), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 72, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 25, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 17, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 14, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 75, new IntPred(0, 13), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 74, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 57, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 29, new IntPred(89, 161), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 34, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 63, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 48, new IntPred(261, 337), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 19, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 56, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 56, new IntPred(472, 492), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 69, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 44, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 13, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 28, new IntPred(642, 678), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 53, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 23, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 16, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 65, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 35, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 18, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 30, new IntPred(14, 68), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 16, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 16, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 27, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 15, new IntPred(251, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 50, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 67, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 45, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 32, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 33, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 33, new IntPred(557, 627), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 66, new IntPred(628, 641), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 80, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 53, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 34, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 67, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 32, new IntPred(876, 932), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 73, new IntPred(933, 967), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 15, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 65, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 75, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 53, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 45, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 73, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 73, new IntPred(261, 337), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 68, new IntPred(389, 471), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 30, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 20, new IntPred(493, 556), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 31, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 51, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 56, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 48, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 54, new IntPred(743, 794), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 67, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 34, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 39, new IntPred(968, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 47, new IntPred(0, 13), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 10, new IntPred(14, 68), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 48, new IntPred(69, 88), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 39, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 10, new IntPred(162, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 29, new IntPred(251, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 36, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 47, new IntPred(338, 388), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(389, 471), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 11, new IntPred(472, 492), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 73, new IntPred(493, 556), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 72, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 42, new IntPred(628, 641), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 24, new IntPred(642, 678), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 44, new IntPred(679, 742), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 45, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 9, new IntPred(795, 875), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 72, new IntPred(876, 932), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 27, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 44, new IntPred(968, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 40, new IntPred(0, 13), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 1, new IntPred(14, 68), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 25, new IntPred(69, 88), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 5, new IntPred(89, 161), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 40, new IntPred(162, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 29, new IntPred(251, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 71, new IntPred(261, 337), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 57, new IntPred(338, 388), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 30, new IntPred(389, 471), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 53, new IntPred(472, 492), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 28, new IntPred(493, 556), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 27, new IntPred(557, 627), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 15, new IntPred(628, 641), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 54, new IntPred(642, 678), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 78, new IntPred(679, 742), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(743, 794), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(795, 875), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 31, new IntPred(876, 932), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 70, new IntPred(933, 967), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 53, new IntPred(968, null), 'b'));
return trans;
}

}
