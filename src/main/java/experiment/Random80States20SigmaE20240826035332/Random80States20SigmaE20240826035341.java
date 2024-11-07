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
public class Random80States20SigmaE20240826035341{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 61, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 74, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 28, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 38, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 32, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 60, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 75, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 56, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 25, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 48, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 55, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 63, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 31, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 29, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 24, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 36, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 44, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 50, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 33, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 66, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 69, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 75, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 30, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 67, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 49, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 69, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 71, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 42, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 42, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 71, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 39, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 44, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 68, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 47, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 50, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 56, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 44, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 60, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 24, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 57, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 31, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 72, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 13, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 67, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 76, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 62, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 28, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 62, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 46, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 78, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 16, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 52, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 49, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 14, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 12, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 34, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 21, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 35, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 31, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 32, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 42, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 41, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 38, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 79, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 24, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 24, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 11, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 21, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 30, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 38, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 25, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 61, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 40, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 26, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 37, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 9, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 75, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 73, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 41, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 46, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 58, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 31, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 76, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 43, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 17, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 56, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 40, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 22, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 71, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 36, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 64, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 57, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 44, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 42, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 31, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 26, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 23, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 17, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 73, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 58, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 31, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 76, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 37, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 67, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 29, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 39, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 52, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 77, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 29, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 76, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 25, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 75, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 37, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 31, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 68, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 75, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 18, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 76, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 24, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 22, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 47, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 79, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 40, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 39, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 69, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 20, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 66, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 79, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 54, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 41, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 78, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 43, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 15, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 46, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 76, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 44, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 19, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 35, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 64, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 25, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 71, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 38, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 49, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 72, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 51, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 51, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 27, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 47, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 63, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 33, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 40, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 34, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 30, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 73, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 26, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 16, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 70, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 46, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 66, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 80, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 41, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 29, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 28, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 60, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 57, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 62, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 59, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 52, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 25, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 10, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 9, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 29, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 15, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 58, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 38, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 37, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 51, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 52, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 47, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 39, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 61, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 22, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 74, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 1, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 44, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 57, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 34, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 54, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 54, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 47, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 73, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 46, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 74, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 66, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 57, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 60, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 19, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 63, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 28, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 21, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 22, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 40, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 33, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 66, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 1, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 77, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 76, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 72, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 4, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 53, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 38, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 62, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 47, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 47, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 74, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 51, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 58, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 78, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 65, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 52, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 21, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 10, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 6, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 46, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 29, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 33, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 73, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 44, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 11, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 9, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 21, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 39, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 61, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 51, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 13, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 73, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 59, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 55, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 16, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 58, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 56, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 8, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 25, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 63, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 50, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 76, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 15, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 56, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 77, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 17, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 1, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 58, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 45, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 72, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 48, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 70, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 57, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 30, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 41, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 77, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 24, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 67, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 17, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 52, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 38, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 47, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 49, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 40, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 25, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 51, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 79, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 61, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 1, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 28, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 37, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 35, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 74, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 12, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 53, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 45, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 19, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 70, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 34, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 63, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 63, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 29, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 58, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 59, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 73, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 6, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 40, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 56, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 10, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 64, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 25, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 53, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 51, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 57, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 22, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 4, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 28, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 48, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 69, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 46, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 44, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 13, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 18, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 32, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 19, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 71, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 74, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 56, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 46, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 43, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 5, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 45, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 36, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 62, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 7, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 33, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 37, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 64, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 72, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 31, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 34, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 2, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 3, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState21() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 78, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 65, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 30, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 43, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 44, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 67, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 75, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 67, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 47, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 66, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 59, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 26, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 14, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 68, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 80, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 32, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 56, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 46, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(21, 72, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState22() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 60, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 39, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 28, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 48, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 44, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 53, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 1, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 10, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 36, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 75, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 58, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 30, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 55, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 25, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 57, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 46, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 69, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 53, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(22, 76, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState23() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 9, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 29, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 58, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 4, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 72, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 43, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 52, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 77, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 32, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 51, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 8, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 54, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 11, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 66, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 26, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 34, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 43, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 14, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(23, 58, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState24() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 14, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 29, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 74, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 51, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 16, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 56, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 48, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 55, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 71, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 77, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 22, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 53, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 15, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 6, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 28, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 53, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 60, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 8, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 10, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(24, 73, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState25() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 43, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 36, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 28, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 38, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 14, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 23, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 78, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 45, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 75, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 80, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 80, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 61, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 80, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 43, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 51, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 68, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 35, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(25, 9, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState26() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 22, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 35, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 8, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 23, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 36, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 37, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 47, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 14, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 1, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 79, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 48, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 62, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 11, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 64, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 17, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 20, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 27, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 64, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 60, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(26, 22, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState27() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 36, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 75, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 51, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 48, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 3, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 30, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 69, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 24, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 42, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 33, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 64, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 10, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 8, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 25, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 66, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 34, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 39, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 21, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(27, 67, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState28() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 51, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 61, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 62, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 4, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 29, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 71, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 41, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 49, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 39, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 80, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 33, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 49, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 3, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 9, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 63, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 66, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 30, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 64, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 36, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(28, 47, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState29() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 46, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 43, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 11, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 76, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 44, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 25, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 5, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 58, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 44, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 15, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 20, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 1, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 36, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 42, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 48, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 42, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 12, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(29, 35, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState30() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 55, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 63, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 70, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 68, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 12, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 3, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 7, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 78, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 9, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 20, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 65, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 26, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 6, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 71, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 49, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 28, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 4, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 62, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 74, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(30, 1, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState31() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 11, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 3, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 60, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 19, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 18, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 60, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 49, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 69, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 23, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 60, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 74, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 46, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 12, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 74, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 49, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 14, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 16, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 2, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(31, 7, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState32() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 34, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 30, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 5, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 64, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 66, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 32, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 31, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 58, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 70, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 39, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 45, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 77, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 78, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 61, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 77, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 38, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(32, 9, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState33() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 44, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 30, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 23, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 69, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 42, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 41, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 13, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 6, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 26, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 79, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 65, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 76, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 72, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 47, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 19, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 49, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 28, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 46, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 79, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(33, 10, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState34() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 30, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 41, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 43, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 58, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 34, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 5, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 71, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 38, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 50, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 18, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 4, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 64, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 13, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 36, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 27, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 35, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 1, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(34, 51, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState35() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 15, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 17, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 36, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 78, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 44, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 22, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 7, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 30, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 41, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 10, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 39, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 72, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 20, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 12, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 8, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 73, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 58, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 57, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 42, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(35, 73, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState36() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 30, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 52, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 22, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 75, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 14, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 45, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 64, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 57, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 77, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 20, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 25, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 15, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 69, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 10, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 76, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 78, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 4, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 19, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(36, 27, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState37() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 55, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 64, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 43, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 58, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 26, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 9, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 71, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 39, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 66, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 11, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 70, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 74, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 2, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 74, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 18, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 68, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 73, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 69, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 45, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(37, 65, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState38() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 64, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 37, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 70, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 72, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 45, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 35, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 61, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 25, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 70, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 25, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 23, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 32, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 59, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 34, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 38, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 52, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 21, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(38, 30, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState39() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 36, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 47, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 4, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 54, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 37, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 78, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 6, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 7, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 55, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 15, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 2, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 59, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 24, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 79, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 10, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 54, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 1, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(39, 79, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState40() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 10, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 66, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 56, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 9, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 12, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 62, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 71, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 78, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 67, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 30, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 79, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 38, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 57, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 1, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 20, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 24, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 64, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(40, 25, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState41() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 53, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 20, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 76, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 65, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 26, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 1, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 58, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 47, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 6, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 35, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 18, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 19, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 69, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 6, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 68, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 7, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 77, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 2, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 61, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(41, 46, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState42() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 46, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 71, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 65, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 54, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 36, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 64, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 48, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 8, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 17, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 34, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 19, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 21, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 11, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 61, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 24, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 72, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 5, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 12, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(42, 24, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState43() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 28, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 18, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 70, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 20, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 61, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 31, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 47, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 55, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 50, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 50, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 47, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 51, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 27, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 46, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 46, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 55, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 18, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 60, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 10, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(43, 59, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState44() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 60, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 33, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 45, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 49, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 55, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 77, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 9, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 67, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 59, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 23, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 77, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 25, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 27, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 3, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 47, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 50, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 67, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 46, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 17, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(44, 39, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState45() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 41, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 30, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 46, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 29, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 77, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 68, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 11, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 49, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 74, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 27, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 72, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 59, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 37, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 40, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 62, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 61, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 75, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 9, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 65, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(45, 67, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState46() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 68, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 56, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 45, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 3, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 4, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 39, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 27, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 60, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 54, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 52, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 10, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 40, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 49, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 4, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 23, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 11, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 37, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 40, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 56, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(46, 51, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState47() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 76, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 77, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 42, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 59, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 5, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 72, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 75, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 64, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 33, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 69, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 24, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 35, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 8, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 14, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 53, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 7, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 46, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 58, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(47, 51, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState48() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 55, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 16, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 43, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 58, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 11, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 68, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 29, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 14, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 2, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 11, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 68, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 78, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 72, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 1, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 15, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 17, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 31, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 41, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 41, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(48, 41, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState49() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 39, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 2, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 20, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 65, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 39, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 6, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 46, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 33, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 51, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 24, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 61, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 6, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 6, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 35, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 36, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 76, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 23, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 79, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 62, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(49, 54, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState50() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 54, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 13, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 15, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 1, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 45, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 71, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 24, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 7, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 80, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 19, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 34, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 7, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 47, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 47, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 31, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 47, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 33, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 35, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 29, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(50, 36, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState51() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 73, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 52, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 36, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 54, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 50, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 77, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 5, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 79, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 68, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 69, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 27, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 66, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 46, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 13, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 27, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 61, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 59, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 65, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 5, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(51, 57, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState52() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 64, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 20, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 50, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 7, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 41, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 22, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 5, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 34, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 1, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 47, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 76, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 17, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 40, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 35, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 46, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 35, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 28, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 45, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 45, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(52, 18, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState53() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 19, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 69, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 51, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 51, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 45, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 28, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 70, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 66, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 68, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 77, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 53, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 24, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 60, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 12, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 58, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 70, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 53, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 8, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 39, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(53, 41, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState54() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 70, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 73, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 43, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 38, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 33, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 36, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 76, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 60, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 4, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 20, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 44, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 23, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 19, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 64, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 23, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 40, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 1, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 58, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 48, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(54, 31, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState55() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 69, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 44, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 57, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 4, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 55, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 42, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 41, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 55, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 2, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 4, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 37, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 37, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 49, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 34, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 74, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 51, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 36, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 24, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 62, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(55, 2, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState56() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 73, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 66, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 4, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 27, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 37, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 70, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 38, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 2, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 74, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 70, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 75, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 5, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 17, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 45, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 80, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 28, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 15, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 63, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 16, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(56, 24, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState57() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 1, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 75, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 30, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 21, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 65, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 42, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 8, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 42, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 48, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 62, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 51, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 53, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 28, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 22, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 3, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 49, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 41, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 38, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 1, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(57, 49, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState58() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 9, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 65, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 52, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 6, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 65, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 59, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 17, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 4, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 58, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 15, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 74, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 50, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 12, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 51, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 42, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 7, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 32, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 21, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(58, 24, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState59() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 38, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 72, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 44, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 36, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 44, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 33, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 57, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 39, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 47, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 49, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 72, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 37, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 78, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 10, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 78, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 59, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 69, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 39, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 58, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(59, 34, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState60() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 55, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 28, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 22, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 44, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 20, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 57, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 20, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 4, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 35, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 53, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 35, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 64, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 38, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 68, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 9, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 32, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 10, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 2, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 8, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(60, 61, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState61() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 70, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 71, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 75, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 13, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 73, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 19, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 39, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 27, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 29, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 32, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 12, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 17, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 40, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 21, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 20, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 15, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 56, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 31, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 32, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(61, 34, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState62() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 52, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 56, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 80, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 32, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 31, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 18, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 9, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 24, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 22, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 26, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 77, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 21, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 30, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 39, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 9, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 9, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 25, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 41, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 64, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(62, 3, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState63() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 79, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 76, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 18, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 27, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 39, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 37, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 73, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 35, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 61, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 17, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 24, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 69, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 27, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 74, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 76, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 57, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 50, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 3, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 45, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(63, 45, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState64() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 31, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 75, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 13, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 9, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 34, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 18, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 26, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 30, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 79, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 72, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 68, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 11, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 43, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 44, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 67, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 3, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 42, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 54, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(64, 23, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState65() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 36, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 45, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 12, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 77, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 7, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 59, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 72, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 58, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 71, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 20, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 31, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 38, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 78, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 80, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 21, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 52, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 39, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 40, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(65, 80, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState66() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 26, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 19, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 16, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 78, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 16, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 44, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 25, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 71, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 61, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 71, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 27, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 12, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 45, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 20, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 75, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 25, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 25, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 10, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 20, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(66, 20, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState67() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 53, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 77, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 29, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 27, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 26, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 45, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 14, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 50, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 55, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 41, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 75, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 27, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 69, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 56, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 80, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 63, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 15, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 58, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(67, 23, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState68() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 20, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 42, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 56, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 1, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 23, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 69, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 69, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 10, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 17, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 72, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 47, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 39, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 36, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 54, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 30, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 72, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 29, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 12, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 33, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(68, 8, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState69() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 33, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 50, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 53, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 74, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 49, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 6, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 79, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 27, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 8, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 54, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 46, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 21, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 57, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 68, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 60, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 55, new IntPred(599, 677), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 19, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 17, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 12, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(69, 31, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState70() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 31, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 52, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 27, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 50, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 30, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 18, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 32, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 64, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 77, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 70, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 61, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 67, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 18, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 55, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 61, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 14, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 13, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 54, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 54, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(70, 63, new IntPred(789, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState71() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 26, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 63, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 6, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 62, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 44, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 5, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 40, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 14, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 33, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 39, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 30, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 73, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 18, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 16, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 69, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 54, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 17, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 64, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 70, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(71, 68, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState72() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 26, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 21, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 49, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 62, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 68, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 7, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 33, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 70, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 63, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 21, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 44, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 43, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 6, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 10, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 34, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 37, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 60, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 76, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 27, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(72, 69, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState73() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 80, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 73, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 75, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 56, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 10, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 73, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 64, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 66, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 45, new IntPred(362, 413), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 17, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 15, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 21, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 69, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 12, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 12, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 73, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 56, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 49, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 80, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(73, 3, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState74() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 71, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 66, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 51, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 48, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 43, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 72, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 49, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 8, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 74, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 58, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 6, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 77, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 17, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 68, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 69, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 11, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 73, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 50, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 41, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(74, 56, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState75() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 51, new IntPred(0, 55), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 36, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 44, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 18, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 14, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 73, new IntPred(191, 260), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 47, new IntPred(261, 265), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 37, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 78, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 54, new IntPred(414, 416), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 12, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 5, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 20, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 61, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 24, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 45, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 26, new IntPred(678, 681), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 9, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 68, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(75, 56, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState76() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 37, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 62, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 70, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 3, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 11, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 19, new IntPred(266, 361), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 44, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 41, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 51, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 5, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 19, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 42, new IntPred(515, 572), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 45, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 45, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 36, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 45, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 25, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(76, 2, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState77() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 37, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 6, new IntPred(56, 97), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 66, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 43, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 23, new IntPred(126, 190), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 40, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 30, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 19, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 19, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 76, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 43, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 68, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 78, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 41, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 19, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 63, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 55, new IntPred(678, 681), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 76, new IntPred(682, 759), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 42, new IntPred(760, 788), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(77, 16, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState78() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 22, new IntPred(0, 55), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 78, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 44, new IntPred(98, 121), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 12, new IntPred(122, 125), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 45, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 67, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 50, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 19, new IntPred(266, 361), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 24, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 39, new IntPred(414, 416), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 75, new IntPred(417, 451), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 32, new IntPred(452, 481), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 14, new IntPred(482, 514), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 80, new IntPred(515, 572), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 68, new IntPred(573, 598), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 38, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 31, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 65, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 3, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(78, 34, new IntPred(789, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState79() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 53, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 67, new IntPred(56, 97), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 69, new IntPred(98, 121), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 61, new IntPred(122, 125), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 21, new IntPred(126, 190), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 43, new IntPred(191, 260), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 5, new IntPred(261, 265), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 41, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 77, new IntPred(362, 413), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 72, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 6, new IntPred(417, 451), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 33, new IntPred(452, 481), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 21, new IntPred(482, 514), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 67, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 21, new IntPred(573, 598), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 11, new IntPred(599, 677), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 64, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 31, new IntPred(682, 759), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 42, new IntPred(760, 788), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(79, 7, new IntPred(789, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState80() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 42, new IntPred(0, 55), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 8, new IntPred(56, 97), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 53, new IntPred(98, 121), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 78, new IntPred(122, 125), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 72, new IntPred(126, 190), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 70, new IntPred(191, 260), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 66, new IntPred(261, 265), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 21, new IntPred(266, 361), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 77, new IntPred(362, 413), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 72, new IntPred(414, 416), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 39, new IntPred(417, 451), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 25, new IntPred(452, 481), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 17, new IntPred(482, 514), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 75, new IntPred(515, 572), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(573, 598), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 51, new IntPred(599, 677), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 25, new IntPred(678, 681), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(682, 759), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 15, new IntPred(760, 788), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(80, 19, new IntPred(789, null), 'b'));
return trans;
}

}
